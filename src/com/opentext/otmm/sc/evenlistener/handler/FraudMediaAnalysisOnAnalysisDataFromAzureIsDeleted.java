/*
 * (C) Copyright 2020 Joaquín Garzón (http://opentext.com) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *   Joaquín Garzón - initial implementation
 */
package com.opentext.otmm.sc.evenlistener.handler;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.artesia.asset.AssetIdentifier;
import com.artesia.asset.metadata.services.AssetMetadataServices;
import com.artesia.common.exception.BaseTeamsException;
import com.artesia.entity.TeamsIdentifier;
import com.artesia.event.Event;
import com.artesia.metadata.MetadataCollection;
import com.artesia.metadata.MetadataField;
import com.artesia.metadata.MetadataTableField;
import com.artesia.metadata.MetadataValue;
import com.artesia.security.SecuritySession;
import com.opentext.job.Job;
import com.opentext.otmm.sc.evenlistener.OTMMField;
import com.opentext.otmm.sc.evenlistener.helper.JobHelper;
import com.opentext.otmm.sc.evenlistener.helper.MetadataHelper;
import com.opentext.otmm.sc.evenlistener.helper.SecurityHelper;

/**
 * Fraud Media Analysis (FMA) No metadata: The picture doesn’t include any metadata
 */
public class FraudMediaAnalysisOnAnalysisDataFromAzureIsDeleted implements OTMMEventHandler, OTMMField {
	private static final Log log = LogFactory.getLog(FraudMediaAnalysisOnAnalysisDataFromAzureIsDeleted.class);

	@Override
	public boolean handle(Event event) {
		boolean handled = false;
		boolean emptyMetadata = true;

		Job job = JobHelper.retrieveJob(event.getObjectId());
		List<AssetIdentifier> assetIds =job.getAssetIds();

		log.info(assetIds);

		if(assetIds != null && assetIds.size() > 0) {
			AssetIdentifier assetId = assetIds.get(0);

			MetadataCollection assetEmbeddedPictureFields = retrieveMetadataForAsset(assetId, EMBEDDED_PICTURE_FIELDS);
			MetadataCollection assetCustomFMAFields = retrieveMetadataForAsset(assetId, CUSTOM_FMA_FIELDS);		
			
			if(assetEmbeddedPictureFields != null) {
				log.debug("Asset Metadata (size): " + assetEmbeddedPictureFields.size());
				
				int rows = 0;
				MetadataValue fieldValue = null;
				
				for(TeamsIdentifier identifier: EMBEDDED_PICTURE_FIELDS){
					MetadataTableField field = (MetadataTableField) assetEmbeddedPictureFields.findElementById(identifier);
					log.info(field.getName() + " ===================================");
					
					rows = field.getRowCount();
					for(int i=0; i<rows; i++) {
						fieldValue = field.getValueAt(i);
						log.debug("\t" + field.getName() + "[" + i + "]: " + field.getValueAt(i));
						
						if(!fieldValue.isNullValue()) {
							emptyMetadata = false;
						}
					}
				}


				//Recovering Custom metadata
				MetadataTableField fmaNoMetadata = (MetadataTableField) assetCustomFMAFields.findElementById(new TeamsIdentifier(CUSTOM_FRAUD_MEDIA_ANALYSIS_NO_METADATA));
				fmaNoMetadata.setValue(new MetadataValue(emptyMetadata));		
				
				MetadataField[] metadataFields = new MetadataField[] { fmaNoMetadata };
				
				MetadataHelper.lockAsset(assetId);
				MetadataHelper.saveMetadataForAsset(assetId, metadataFields);
				MetadataHelper.unlockAsset(assetId);
				
				handled = true;
				
			}
			else {
				log.info("Assets metadata NOT FOUNd!!!");
			}
		}
		else {
			log.info("Assets list was EMPTY!!!");
		}
		
		return handled;
	}

	/**
	 * Retrieve tabular metadata fields (EXIF & IPTC & embedded) for the asset
	 * @param assetId - Asset unique identifier
	 * @return
	 */
	private MetadataCollection retrieveMetadataForAsset(AssetIdentifier assetId, TeamsIdentifier[] identifiers) {
		log.debug("Asset Id: " + assetId.getId());

		SecuritySession session = SecurityHelper.getAdminSession();

		MetadataCollection assetMetadataCol = null;
		try {
			assetMetadataCol = AssetMetadataServices.getInstance().retrieveMetadataForAsset(assetId, identifiers, session);
		} catch (BaseTeamsException e) {
			log.error("Error retrieving metadata", e);
		}

		return assetMetadataCol;
	}
}
