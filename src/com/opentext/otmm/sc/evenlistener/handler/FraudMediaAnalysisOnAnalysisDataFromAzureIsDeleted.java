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
import com.artesia.metadata.MetadataTableField;
import com.artesia.security.SecuritySession;
import com.opentext.job.Job;
import com.opentext.otmm.sc.evenlistener.OTMMField;
import com.opentext.otmm.sc.evenlistener.helper.JobHelper;
import com.opentext.otmm.sc.evenlistener.helper.SecurityHelper;

/**
 * Fraud Media Analysis (FMA) No metadata: The picture doesn’t include any metadata
 */
public class FraudMediaAnalysisOnAnalysisDataFromAzureIsDeleted implements OTMMEventHandler {
	private static final Log log = LogFactory.getLog(FraudMediaAnalysisOnAnalysisDataFromAzureIsDeleted.class);

	@Override
	public boolean handle(Event event) {
		boolean handled = false;

		Job job = JobHelper.retrieveJob(event.getObjectId());
		List<AssetIdentifier> assetIds =job.getAssetIds();

		log.debug(assetIds);

		if(assetIds != null && assetIds.size() > 0) {
			AssetIdentifier assetId = assetIds.get(0);

			MetadataCollection assetMetadataCol = retrieveMetadataForAsset(assetId);

			if(assetMetadataCol != null) {
				log.debug("Asset Metadata (size): " + assetMetadataCol.size());
				
				//Recovering Custom metadata
				
				//MetadataTableField customBadWordField = (MetadataTableField) assetMetadataCol.findElementById(new TeamsIdentifier(OTMMField.CUSTOM_MEDIA_ANALYSIS_VIDEO_SPEECH_PROFANITY_BAD_WORD));
				//MetadataTableField customStartTimeField = (MetadataTableField) assetMetadataCol.findElementById(new TeamsIdentifier(OTMMField.CUSTOM_MEDIA_ANALYSIS_VIDEO_SPEECH_PROFANITY_START_TIME));

				
			}
			else {
				log.debug("Assets metadata NOT FOUNd!!!");
			}
		}
		else {
			log.debug("Assets list was EMPTY!!!");
		}

		return handled;
	}

	private MetadataCollection retrieveMetadataForAsset(AssetIdentifier assetId) {
		log.debug("Asset Id: " + assetId.getId());

		// Retrieve tabular metadata fields for the asset
		TeamsIdentifier[] fieldIds = new TeamsIdentifier[] {
				new TeamsIdentifier(OTMMField.CUSTOM_FRAUD_MEDIA_ANALYSIS_CREATION_DATE_BEFORE_INCIDENT_DATE),
				new TeamsIdentifier(OTMMField.CUSTOM_FRAUD_MEDIA_ANALYSIS_EDITED),
				new TeamsIdentifier(OTMMField.CUSTOM_FRAUD_MEDIA_ANALYSIS_DISTINCT_GPS_COORDINATES),
				new TeamsIdentifier(OTMMField.CUSTOM_FRAUD_MEDIA_ANALYSIS_NO_METADATA),				
				new TeamsIdentifier(OTMMField.CUSTOM_FRAUD_MEDIA_ANALYSIS_DUPLICATED)};

		SecuritySession session = SecurityHelper.getAdminSession();

		MetadataCollection assetMetadataCol = null;
		try {
			assetMetadataCol = AssetMetadataServices.getInstance().retrieveMetadataForAsset(assetId, fieldIds, session);
		} catch (BaseTeamsException e) {
			log.error("Error retrieving metadata", e);
		}

		return assetMetadataCol;
	}

	
}
