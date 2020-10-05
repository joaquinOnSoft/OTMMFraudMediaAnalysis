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

/**
 * <strong>Tabular Field:</strong> Speeches
 * <strong>Id:</strong> ARTESIA.TABLE.MEDIA ANALYSIS.VIDEO.SPEECHES
 * <strong>Name:</strong>	Speeches
 * <strong>Database Table:</strong>	OTMM_MA_VIDEO_SPEECHES
 * <strong>Fields:</strong>
 * <ul>
 * 		<li>ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.ID</li>
 * 		<li>ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.TEXT</li>
 * 		<li>ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.END TIME</li>
 * 		<li>ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.START TIME</li>
 * 		<li>ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.TEXTTYPE</li>
 * </ul>
 **/
public interface OTMMField {

	/**
	 * <strong>Id:</strong> ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.ID <br/>
	 * <strong>Name:</strong> SpeechText Id <br/>
	 * <strong>Database table column:</strong> ID <br/>
	 * <strong>Data Type:</strong> INTEGER <br/>
	 * <strong>Data Length:</strong> 40 <br/>
	 */
	public static final String MEDIA_ANALYSIS_VIDEO_SPEECH_ID = "ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.ID";

	/**
	 * <strong>Id:</strong> ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.TEXT <br/>
	 * <strong>Name:</strong> Speech Text <br/>
	 * <strong>Database table column:</strong> TEXT <br/>
	 * <strong>Data Type:</strong> CHAR <br/>
	 * <strong>Data Length:</strong> 1000 <br/>
	 */			
	public static final String MEDIA_ANALYSIS_VIDEO_SPEECH_TEXT = "ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.TEXT";

	/**
	 * <strong>Id:</strong> ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.END TIME <br/>
	 * <strong>Name:</strong> Speech End Time <br/>
	 * <strong>Database table column:</strong> END_TIME <br/>
	 * <strong>Data Type:</strong>CHAR <br/>
	 * <strong>Data Length:</strong> 40 <br/>
	 */
	public static final String MEDIA_ANALYSIS_VIDEO_SPEECH_END_TIME = "ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.END TIME";

	/**
	 * <strong>Id:</strong> ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.START TIME <br/>
	 * <strong>Name:</strong> Speech Start Time <br/>
	 * <strong>Database table column:</strong>START_TIME <br/>
	 * <strong>Data Type:</strong>CHAR <br/>
	 * <strong>Data Length:</strong> 40 <br/>
	 **/
	public static final String MEDIA_ANALYSIS_VIDEO_SPEECH_START_TIME = "ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.START TIME";


	/**
	 * <strong>Id:</strong> ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.TEXTTYPE <br/>
	 * <strong>Name:</strong> Speech Type <br/>
	 * <strong>Database table column:</strong>TEXTTYPE <br/>
	 * <strong>Data Type:</strong>CHAR <br/>
	 * <strong>Data Length:</strong> 40 <br/>
	 */
	public static final String MEDIA_ANALYSIS_VIDEO_SPEECH_TEXT_TYPE = "ARTESIA.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.TEXTTYPE";
	
	public static final String CUSTOM_MEDIA_ANALYSIS_VIDEO_SPEECH_PROFANITY_BAD_WORD = "CUSTOM.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.PROFANITY.BAD_WORD";
	public static final String CUSTOM_MEDIA_ANALYSIS_VIDEO_SPEECH_PROFANITY_START_TIME = "CUSTOM.FIELD.MEDIAANALYSIS.VIDEO.SPEECH.PROFANITY.START.TIME";
}
