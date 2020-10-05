/*
 * (C) Copyright 2019 Joaquín Garzón (http://opentext.com) and others.
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
package com.opentext.otmm.sc.evenlistener;

public interface OTMMEvent {
	/**
	 * <strong>EVENT_ID</strong>: 5006	
	 * <strong>DESCR</strong>: Analysis data from Azure is deleted	
	 * <strong>PUBLICATION_KEY</strong>: TEAMS.MEDIA_ANALYSIS
	 * <strong>MESSAGE</strong>: All the analysis data corresponding to media analysis job is deleted
	 * <strong>NOTE</strong>: Event stored at table: mm.EVENT_CTXTS
	 * <strong>IMPORTANT</strong> 
	 * The data from Azure is deleted regardless of whether the 
	 * extraction of media analytics succeeded or not. 
	 */
	public static final String ANALYSIS_DATA_FROM_AZURE_IS_DELETED = "5006";

	/**
	 * <strong>EVENT_ID</strong>: 2229145	
	 * <strong>DESCR</strong>: Asset Import	
	 * <strong>PUBLICATION_KEY</strong>: TEAMS.IMPORT
	 * <strong>MESSAGE</strong>: An asset was created
	 * <strong>NOTE</strong>: Event stored at table: mm.EVENT_CTXTS
	 */
	public static final String ASSET_CREATED = "2229145";

	/**
	 * <strong>EVENT_ID</strong>: 2229148	
	 * <strong>DESCR</strong>: Asset Import	
	 * <strong>PUBLICATION_KEY</strong>: TEAMS.IMPORT
	 * <strong>MESSAGE</strong>: Ending import job
	 * <strong>NOTE</strong>: Event stored at table: mm.EVENT_CTXTS
	 */
	public static final String IMPORT_JOB_ENDED = "2229148";

}
