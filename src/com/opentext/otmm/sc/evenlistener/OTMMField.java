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
package com.opentext.otmm.sc.evenlistener;

import com.artesia.entity.TeamsIdentifier;

/**
 * <strong>Database Table:</strong>	OTMM_FRAUD_MEDIA_ANALYSIS
 * <strong>Fields:</strong>
 * <ul>
 * 		<li>CUSTOM.FRAUD.MEDIA.ANALYSIS.NO_METADATA</li>
 * 		<li>CUSTOM.FRAUD.MEDIA.ANALYSIS.CREATION_DATE_BEFORE_INCIDENT_DATE</li>
 * 		<li>CUSTOM.FRAUD.MEDIA.ANALYSIS.DISTINCT_GPS_COORDINATES</li>
 * 		<li>CUSTOM.FRAUD.MEDIA.ANALYSIS.EDITED</li>
 * 		<li>CUSTOM.FRAUD.MEDIA.ANALYSIS.DUPLICATED</li>   
 * </ul>
 * 
 * EXIF metadata fields: 
 *    https://en.wikipedia.org/wiki/Exif
 *    https://EXIFool.org/TagNames/EXIF.html
 *    
 * IPTC metadata fields:
 *    http://photometadata.org/node/737 
 *    https://en.wikipedia.org/wiki/IPTC_Information_Interchange_Model
 **/
public interface OTMMField {


	public static final String CUSTOM_FRAUD_MEDIA_ANALYSIS_NO_METADATA = "CUSTOM.FRAUD.MEDIA.ANALYSIS.NO_METADATA";
	public static final String CUSTOM_FRAUD_MEDIA_ANALYSIS_CREATION_DATE_BEFORE_INCIDENT_DATE = "CUSTOM.FRAUD.MEDIA.ANALYSIS.CREATION_DATE_BEFORE_INCIDENT_DATE";
	public static final String CUSTOM_FRAUD_MEDIA_ANALYSIS_DISTINCT_GPS_COORDINATES = "CUSTOM.FRAUD.MEDIA.ANALYSIS.DISTINCT_GPS_COORDINATES";
	public static final String CUSTOM_FRAUD_MEDIA_ANALYSIS_EDITED = "CUSTOM.FRAUD.MEDIA.ANALYSIS.EDITED";
	public static final String CUSTOM_FRAUD_MEDIA_ANALYSIS_DUPLICATED = "CUSTOM.FRAUD.MEDIA.ANALYSIS.DUPLICATED";

	public static final TeamsIdentifier[] CUSTOM_FMA_FIELDS = new TeamsIdentifier[] {	
			new TeamsIdentifier(CUSTOM_FRAUD_MEDIA_ANALYSIS_NO_METADATA),
			new TeamsIdentifier(CUSTOM_FRAUD_MEDIA_ANALYSIS_CREATION_DATE_BEFORE_INCIDENT_DATE),
			new TeamsIdentifier(CUSTOM_FRAUD_MEDIA_ANALYSIS_DISTINCT_GPS_COORDINATES),
			new TeamsIdentifier(CUSTOM_FRAUD_MEDIA_ANALYSIS_EDITED),
			new TeamsIdentifier(CUSTOM_FRAUD_MEDIA_ANALYSIS_DUPLICATED)			
	};
	
	
	// ===================================================================
	// EXIF, IPTC & Embedded metadata fields: 
	// ===================================================================
	
	
	/**
	 * EMBEDDED Tag: Alpha Mode - ARTESIA.EMBEDDED.FIELD.ALPHA_MODE
	 */
	public static final String EMBEDDED_ALPHA_MODE = "ARTESIA.EMBEDDED.FIELD.ALPHA_MODE";
	
	/**
	 * EMBEDDED Tag: Alternate Tape Name - ARTESIA.EMBEDDED.FIELD.ALTERNATE_TAPE_NAME
	 */
	public static final String 	EMBEDDED_ALTERNATE_TAPE_NAME= "ARTESIA.EMBEDDED.FIELD.ALTERNATE_TAPE_NAME";
	
	/**
	 * EMBEDDED Tag: Alternate Timecode - ARTESIA.EMBEDDED.FIELD.ALTERNATE_TIMECODE
	 */
	public static final String EMBEDDED_ALTERNATE_TIMECODE = "ARTESIA.EMBEDDED.FIELD.ALTERNATE_TIMECODE";
	
	/**
	 * <strong>EXIF Tag</strong>: Aperture Value - ARTESIA.EMBEDDED.FIELD.APERTURE VALUE
	 * <ul>
	 *    <li>Tag ID: x9202</li>	
	 *    <li><strong>Tag Name</strong>: ApertureValue</li>	
	 *    <li>Writable: rational64u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: (displayed as an F number, but stored as an APEX value)</li>
	 * </ul> 				 
	 */
	public static final String EXIF_APERTURE_VALUE = "ARTESIA.EMBEDDED.FIELD.APERTURE VALUE";
	
	/**
	 * EXIF Tag: Application - ARTESIA.EMBEDDED.FIELD.APPLICATION
	 * <ul>
	 *    <li>Tag ID: 0x02bc</li>	
	 *    <li><strong>Tag Name</strong>: ApplicationNotes</li>	
	 *    <li>Writable: int8u!</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: XMP Tags</li>
	 * </ul> 	
	 */
	public static final String EXIF_APPLICATION = "ARTESIA.EMBEDDED.FIELD.APPLICATION";
	
	/**
	 * EXIF Tag: Artist	ARTESIA.EMBEDDED.FIELD.ARTIST
	 * <ul>
	 *    <li>Tag ID: 0x013b</li>	
	 *    <li><strong>Tag Name</strong>: Artist</li>	
	 *    <li>Writable: string</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: (becomes a list-type tag when the MWG module is loaded)</li>
	 * </ul> 	
	 */
	public static final String EXIF_ARTIST  = "ARTESIA.EMBEDDED.FIELD.ARTIST";
	
	/**
	 * EXIF Tag: Author	- ARTESIA.EMBEDDED.FIELD.AUTHOR
	 * <ul>
	 *    <li>Tag ID: 0x9c9d</li>	
	 *    <li><strong>Tag Name</strong>: XPAuthor</li>	
	 *    <li>Writable: int8u</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: (ignored by Windows Explorer if Artist exists)</li>
	 * </ul> 	
	 */
	public static final String EXIF_AUTHOR = "ARTESIA.EMBEDDED.FIELD.AUTHOR";
	
	/**
	 * EXIF Tag: Author Title - ARTESIA.EMBEDDED.FIELD.AUTHOR TITLE
	 * <ul>
	 *    <li>Tag ID: 0x9c9b</li>	
	 *    <li><strong>Tag Name</strong>: XPTitle</li>	
	 *    <li>Writable: int8u</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: (tags 0x9c9b-0x9c9f are used by Windows Explorer; 
	 *    special characters in these values are converted to UTF-8 by default, 
	 *    or Windows Latin1 with the -L option. XPTitle is ignored by Windows Explorer 
	 *    if ImageDescription exists)</li>
	 * </ul> 	
	 */	
	public static final String EXIF_AUTHOR_TITLE = "Title	ARTESIA.EMBEDDED.FIELD.AUTHOR TITLE";
	
	/**
	 * EMBEDDED Tag: BMF Time Reference	- ARTESIA.EMBEDDED.FIELD.BMF_TIME_REFERENCE 
	 */
	public static final String EMBEDDED_BMF_TIME_REFERENCE = "ARTESIA.EMBEDDED.FIELD.BMF_TIME_REFERENCE";
	
	/**
	 * EXIF Tag: Camera Focal Length - ARTESIA.EMBEDDED.FIELD.FOCAL LENGTH 
	 * <ul>
	 *    <li>Tag ID: 0x920a</li>	
	 *    <li><strong>Tag Name</strong>: FocalLength</li>	
	 *    <li>Writable: rational64u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 	
	 */	
	public static final String EXIF_CAMERA_FOCAL_LENGTH = "ARTESIA.EMBEDDED.FIELD.FOCAL LENGTH";
	
	/**
	 * EXIF Tag: Camera ISO Speed Ratings	ARTESIA.EMBEDDED.FIELD.ISO SPEED RATINGS
	 * <ul>
	 *    <li>Tag ID: 0x8833</li>	
	 *    <li><strong>Tag Name</strong>: ISOSpeed</li>	
	 *    <li>Writable: int32u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 	
	 */	
	public static final String EXIF_CAMERA_ISO_SPEED_RATINGS = "ARTESIA.EMBEDDED.FIELD.ISO SPEED RATINGS";
	
	/**
	 * EXIF Tag: Camera Lens - ARTESIA.EMBEDDED.FIELD.LENS
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xfdea</li>	
	 *    <li><strong>Tag Name</strong>: Lens</li>	
	 *    <li><strong>Writable</strong>: string/</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 
	 */	
	public static final String EXIF_CAMERA_LENS = "ARTESIA.EMBEDDED.FIELD.LENS";
	
	/**
	 * EXIF Tag: Camera Light Source - ARTESIA.EMBEDDED.FIELD.LIGHT SOURCE
	 * <ul>
	 *    <li>Tag ID: 0x9208</li>	
	 *    <li><strong>Tag Name</strong>: LightSource</li>	
	 *    <li>Writable: int16u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: EXIF LightSource Values</li>
	 * </ul> 	
	 */	
	public static final String EXIF_CAMERA_LIGHT_SOURCE = "ARTESIA.EMBEDDED.FIELD.LIGHT SOURCE";

	/**
	 * EXIF Tag: Camera Model - ARTESIA.EMBEDDED.FIELD.MODEL
	 * <ul>
	 *    <li>Tag ID: 0xc614</li>	
	 *    <li><strong>Tag Name</strong>: UniqueCameraModel</li>	
	 *    <li>Writable: string</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 	
	 */	
	public static final String EXIF_CAMERA_MODEL = "ARTESIA.EMBEDDED.FIELD.MODEL";

	/**
	 * EXIF Tag: Camera Orientation - ARTESIA.EMBEDDED.FIELD.ORIENTATION
	 * <ul>
	 *    <li>Tag ID: 0x0112</li>	
	 *    <li><strong>Tag Name</strong>: Orientation</li>	
	 *    <li>Writable: int16u</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>:
	 *       <ul>
	 *          <li>1 = Horizontal (normal)</li>
	 *          <li>2 = Mirror horizontal</li>
	 *          <li>3 = Rotate 180</li>
	 *          <li>4 = Mirror vertical</li>
	 *          <li>5 = Mirror horizontal and rotate 270 CW</li>
	 *          <li>6 = Rotate 90 CW</li>
	 *          <li>7 = Mirror horizontal and rotate 90 CW</li>
	 *          <li>8 = Rotate 270 CW</li>
 	 *       <ul>
	 *    </li>
	 * </ul> 	 
	 */
	public static final String EXIF_CAMERA_ORIENTTION = "ARTESIA.EMBEDDED.FIELD.ORIENTATION";
	
	/**
	 * EXIF Tag: Camera Resolution Unit	- ARTESIA.EMBEDDED.FIELD.RESOLUTION_UNIT
	 * <ul>
	 *    <li>Tag ID: 0x0128</li>	
	 *    <li><strong>Tag Name</strong>: ResolutionUnit</li>	
	 *    <li>Writable: int16u:</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: (the value 1 is not standard EXIF)
	 *       <ul>
	 *          <li>1 = None</li>
	 *          <li>2 = inches</li>
	 *          <li>3 = cm</li>
	 *       </li>
	 * </ul> 	
	 */	
	public static final String EXIF_CAMERA_RESOLUTION_UNIT = "ARTESIA.EMBEDDED.FIELD.RESOLUTION_UNIT";

	/**
	 * EMBEDDED Tag: Camera Shutter Speed - ARTESIA.EMBEDDED.FIELD.SHUTTER SPEED
	 * <ul>
	 *    <li>Tag ID: 0x9201</li>	
	 *    <li><strong>Tag Name</strong>: ShutterSpeedValue</li>	
	 *    <li>Writable: rational64s</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: (displayed in seconds, but stored as an APEX value)</li>
	 * </ul> 	
	 */	
	public static final String EMBEDDED_CAMERA_SHUTTER_SPEED = "ARTESIA.EMBEDDED.FIELD.SHUTTER SPEED";

	/**
	 * EMBEDDED Tag: Channels - ARTESIA.EMBEDDED.FIELD.CHANNELS
	 */
	public static final String EMBEDDED_CHANNELS = "ARTESIA.EMBEDDED.FIELD.CHANNELS";
		
	/**
	 * EXIF Tag: Color Space - ARTESIA.EMBEDDED.FIELD.COLOR_SPACE
	 * <ul>
	 *    <li>Tag ID: 0xa001</li>	
	 *    <li><strong>Tag Name</strong>: ColorSpace</li>	
	 *    <li>Writable: int16u:</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: (the value of 0x2 is not standard EXIF. 
	 *    Instead, an Adobe RGB image is indicated by "Uncalibrated" with an 
	 *    InteropIndex of "R03". The values 0xfffd and 0xfffe are also 
	 *    non-standard, and are used by some Sony cameras)
	 *       <ul>
	 *          <li>0x1 = sRGB</li>
	 *          <li>0x2 = Adobe RGB</li>
	 *          <li>0xfffd = Wide Gamut RGB</li>
	 *          <li>0xfffe = ICC Profile</li>
	 *          <li>0xffff = Uncalibrated</li>
	 *       </ul>
	 * </ul> 	
	 */
	public static final String EXIF_COLOR_SPACE = "ARTESIA.EMBEDDED.FIELD.COLOR_SPACE";

	/**
	 * EMBEDDED Tag: Composer- ARTESIA.EMBEDDED.FIELD.COMPOSER
	 */	
	public static final String EMBEDDED_COMPOSER = "ARTESIA.EMBEDDED.FIELD.COMPOSER";
	
	/**
	 * EXIF Tag: Compressed Bits per Pixel- ARTESIA.EMBEDDED.FIELD.COMPRESSED_BITS_PER_PIXEL
	 * <ul>
	 *    <li>Tag ID: 0x9102</li>	
	 *    <li><strong>Tag Name</strong>: CompressedBitsPerPixel</li>	
	 *    <li>Writable: rational64u!</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 	
	 */
	public static final String EXIF_COMPRESSED_BITS_PER_PIXEL = "ARTESIA.EMBEDDED.FIELD.COMPRESSED_BITS_PER_PIXEL";
	
	/**
	 * EMBEDDED Tag: Compressor - ARTESIA.EMBEDDED.FIELD.COMPRESSOR
	 */	
	public static final String EMBEDDED_COMPRESSOR = "ARTESIA.EMBEDDED.FIELD.COMPRESSOR";
	
	/**
	 * IPTC Tag: Contact Country;Territory - ARTESIA.EMBEDDED.FIELD.CONTACT COUNTRY_TERRITORY
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Country (legacy)</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the full name of the country pictured in the photograph. 
	 *    This field is at the first level of a top-down geographical hierarchy. Use a 
	 *    verbal name and not a code; the ISO country code should be placed in the field 
	 *    titled Country Code.
	 *    Note: This field is “shared” with the “Country” field in the Origin panel of the 
	 *    Adobe Photoshop File Info field.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTACT_COUNTRY_TERRITORY = "ARTESIA.EMBEDDED.FIELD.CONTACT COUNTRY_TERRITORY";
	
	/**
	 * IPTC Tag: Contact Creator - ARTESIA.EMBEDDED.FIELD.CONTACT CREATOR
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Creator</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: This field should contain your name or the name 
	 *    of the person who created the photograph. If it is not appropriate 
	 *    to add the name of the photographer (for example, the photographer's 
	 *    identity needs to be protected) use a company or organization name. 
	 *    Once saved, this field should not be changed by anyone. This field 
	 *    does not support the use of a comma or semi-colon as separator.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTACT_CREATOR = "ARTESIA.EMBEDDED.FIELD.CONTACT CREATOR";	

	/**
	 * IPTC Tag: Contact Creator's Job Title	ARTESIA.EMBEDDED.FIELD.CONTACT CREATORS JOB TITLE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Creator’s Job Title</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: This field should list the job title of the photographer. 
	 *    Examples might include: Staff Photographer, Freelance Photographer or 
	 *    Independent Commercial Photographer. Since this is a qualifier for the 
	 *    Creator field, you must also complete the Creator field.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTACT_CREATOR_JOB_TITLE = "ARTESIA.EMBEDDED.FIELD.CONTACT CREATORS JOB TITLE";
	
	/**
	 * IPTC Tag: Contact E-Mails - ARTESIA.EMBEDDED.FIELD.CONTACT EMAILS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Email(s)</li>	
	 *    <li><strong>Group</strong>: (Contact info)</li>	
	 *    <li><strong>Values/Notes</strong>: Enter your business or work email address, 
	 *    such as name@domain.com. Separate multiple email addresses with commas.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTACT_EMAILS = "ARTESIA.EMBEDDED.FIELD.CONTACT EMAILS";
	
	/**
	 * IPTC Tag: Contact Postal Code - ARTESIA.EMBEDDED.FIELD.CONTACT POSTAL CODE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Postal Code</li>	
	 *    <li><strong>Group</strong>: (Contact info)</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the local postal code (such as ZIP code) 
	 *    where your business is located.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTACT_POSTAL_CODE = "ARTESIA.EMBEDDED.FIELD.CONTACT POSTAL CODE";
	
	/**
	 * IPTC Tag: Contact State-Province	- ARTESIA.EMBEDDED.FIELD.CONTACT STATEPROVINCE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: State/Province</li>	
	 *    <li><strong>Group</strong>: (Contact info)</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the name of the State or Province where 
	 *    your business is located. Since the abbreviation for a state or 
	 *    province may be unknown to those viewing your metadata internationally, 
	 *    consider spelling out the name.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTACT_STATE_PROVINCE = "ARTESIA.EMBEDDED.FIELD.CONTACT STATEPROVINCE";
	
	/**
	 * IPTC Tag: Contact Websites	ARTESIA.EMBEDDED.FIELD.CONTACT WEBSITES
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Website(s)</li>	
	 *    <li><strong>Group</strong>: (Contact info)</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the URL or web address for your business. 
	 *    Separate multiple addresses with commas.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTACT_WEBSITE = "ARTESIA.EMBEDDED.FIELD.CONTACT WEBSITES";

	/**
	 * IPTC Tag: Content Description - ARTESIA.EMBEDDED.FIELD.CONTENT DESCRIPTION
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Description</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: The Description field, often referred to as “Caption,” should report 
	 *    the who, what and why of what the photograph depicts. If there is a person or people 
	 *    in the image, this caption might include their names, and/or their roles in any action 
	 *    taking place. If the image depicts a location, then it should describe the location. 
	 *    Don’t forget to also include this same “geographical” information in the appropriate 
	 *    fields (location, city, state/province, country) of the IPTC Core. The amount of 
	 *    detail to include depends on the image and whether it is documentary or conceptual. 
	 *    Typically, editorial images come with complete caption text, while advertising images 
	 *    may not.</li>
	 * </ul> 
	 */	
	public static final String IPTC_CONTENT_DESCRITPTION = "ARTESIA.EMBEDDED.FIELD.CONTENT DESCRIPTION";

	/**
	 * IPTC Tag: Content Description Writer	- ARTESIA.EMBEDDED.FIELD.CONTENT DESCRIPTION WRITER
	 * <ul>
	 *    <li><strong>Tag Name</strong>: </li>	
	 *    <li><strong>Group</strong>: </li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 		 		 
	 */	
	public static final String IPTC_CONTENT_DESCRIPTION_WRITTER ="ARTESIA.EMBEDDED.FIELD.CONTENT DESCRIPTION WRITER";
	
	/**
	 * IPTC Tag: Content Headline - ARTESIA.EMBEDDED.FIELD.CONTENT HEADLINE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Headline</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: A headline is a brief, publishable synopsis or 
	 *    summary of the contents of the photograph. Like a news story's lead, the Headline 
	 *    should grab attention and summarize the image's content. Headlines must be succinct. 
	 *    Leave any supporting narrative for the Description field. Do not, however, confuse 
	 *    the Headline term with Title.</li>
	 * </ul> 		 
	 */
	public static final String IPTC_CONTENT_HEADLINE = "ARTESIA.EMBEDDED.FIELD.CONTENT HEADLINE";

	/**
	 * IPTC Tag: Content IPTC Subject Code - ARTESIA.EMBEDDED.FIELD.CONTENT IPTC SUBJECT CODE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: IPTC Subject Code</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: This field can specify and categorize the content of 
	 *    a photograph by one or more subjects listed in the IPTC “Subject NewsCode” taxonomy 
	 *    available from http://www.newscodes.org/. Each subject term is represented as an 
	 *    eight-digit numerical string in an unordered list. Only subjects from a controlled 
	 *    vocabulary should populate this field; enter free-choice text in the Keyword field.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTENT_IPTC_SUBJECT_CODE = "ARTESIA.EMBEDDED.FIELD.CONTENT IPTC SUBJECT CODE";
	
	/**
	 * IPTC Tag: Content Keywords - ARTESIA.EMBEDDED.FIELD.CONTENT KEYWORDS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Keywords</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Enter keyword terms or phrases to describe the 
	 *    subject of content in the photograph. Keywords may be free text (i.e., they need 
	 *    not from a controlled vocabulary). You may enter (or paste) any number of keywords, 
	 *    terms or phrases into this field. Each keyword term should be separated by a delimiter, 
	 *    such as a comma, though some software may allow semicolons or line returns 
	 *    (note also that some applications may change the appearance of this delimiter 
	 *    as well, such as Photoshop changing your commas to semicolons). To maintain backward 
	 *    compatibility, no single value should exceed 64 characters. Values from the controlled 
	 *    vocabulary IPTC Subject Codes must be placed into the “Subject Code” field</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_CONTENT_KEYWORDS = "ARTESIA.EMBEDDED.FIELD.CONTENT KEYWORDS";

	/**
	 * IPTC Tag: Copyright Info URL	- ARTESIA.EMBEDDED.FIELD.COPYRIGHT INFO URL
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Copyright URL</li>	
	 *    <li><strong>Group</strong>: Photoshop</li>	
	 *    <li><strong>Values/Notes</strong>: This field is not part of the IPTC Core; 
	 *    it exists only as part of the Photoshop XMP Namespace. Use with caution, 
	 *    as some software programs will not recognize this field.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_COPYRIGHT_INFO_URL = "ARTESIA.EMBEDDED.FIELD.COPYRIGHT INFO URL";

	/**
	 * IPTC Tag: Copyright Notice - ARTESIA.EMBEDDED.FIELD.COPYRIGHT NOTICE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Copyright Notice </li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: The Copyright Notice should include any legal 
	 *    language required to claim intellectual property. It should identify the photograph's 
	 *    current holder(s). If the photographer differs from the copyright holder, enter the 
	 *    photographer's name in the Creator field. Usually, the value for this copyright 
	 *    notice would be the photographer, but if an employee made the image under 
	 *    work-for-hire rules, then list the employing agency or company.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_COPYRIGHT_NOTICE = "ARTESIA.EMBEDDED.FIELD.COPYRIGHT NOTICE";

	/**
	 * IPTC Tag: Copyright Status	ARTESIA.EMBEDDED.FIELD.COPYRIGHT STATUS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Copyright Status</li>	
	 *    <li><strong>Group</strong>: Photoshop</li>	
	 *    <li><strong>Values/Notes</strong>: This field is not part of the IPTC Core; 
	 *    it exists only as part of the Photoshop XMP Namespace. Use with caution, 
	 *    as some software programs will not recognize this field.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_COPYRIGHT_STATUS = "ARTESIA.EMBEDDED.FIELD.COPYRIGHT STATUS";

	/**
	 * IPTC Tag: Created - ARTESIA.EMBEDDED.FIELD.CREATED		 
	 */	
	public static final String IPTC_CREATED	= "ARTESIA.EMBEDDED.FIELD.CREATED";
	
	/**
	 * IPTC Tag: Creation Date - ARTESIA.EMBEDDED.FIELD.CREATION_DATE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Date Created</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Use this field to record the calendar date 
	 *    (and optionally, the time) when the photograph was made - not the date when 
	 *    you scanned or edited the image. If using a digital camera set to the correct 
	 *    time, you can find this information in the image's EXIF data. If no time is 
	 *    given, the value should default to 00:00:00.</li>
	 * </ul> 
	 */	
	public static final String IPTC_CREATION_DATE = "ARTESIA.EMBEDDED.FIELD.CREATION_DATE";
		
	/**
	 * EXIEMBEDDEDF Tag: Date Shot - ARTESIA.EMBEDDED.FIELD.DATE_SHOT
	 */		
	public static final String EMBEDDED_DATE_SHOT = "ARTESIA.EMBEDDED.FIELD.DATE_SHOT";
	
	/**
	 * EMBEDDED Tag: Date Time - ARTESIA.EMBEDDED.FIELD.DATE TIME
	 */	
	public static final String EMBEDDED_DATE_TIME = "ARTESIA.EMBEDDED.FIELD.DATE TIME";
	
	/**
	 * IPTC Tag: Description Writer	- ARTESIA.EMBEDDED.FIELD.DESCRIPTION WRITER
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Description writer</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the name of the person writing, 
	 *    editing or correcting the description of the photograph in this field. 
	 *    If you're an independent photographer, this is typically your own name, 
	 *    since you are entering the image metadata.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_DESCRIPTION_WRITER = "ARTESIA.EMBEDDED.FIELD.DESCRIPTION WRITER";
		
	/**
	 * IPTC Tag: DocumentTitle - ARTESIA.EMBEDDED.FIELD.DOCUMENT TITLE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Document Title</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Alternative label for "Title."</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_DOCUMENT_TITLE = "ARTESIA.EMBEDDED.FIELD.DOCUMENT TITLE";
	
	///**
	// * EXIF Tag: Duration - ARTESIA.EMBEDDED.FIELD.DURATION
	// */	
	//public static final String EXIF_DURATION = "ARTESIA.EMBEDDED.FIELD.DURATION";

	/**
	 * IPTC Tag: Embed Contact Address - ARTESIA.EMBEDDED.FIELD.CONTACT ADDRESS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Address</li>	
	 *    <li><strong>Group</strong>: Contact info</li>	
	 *    <li><strong>Values/Notes</strong>: Address is a multi-line field. Enter the 
	 *    copyright holder's company name and all required information to locate the 
	 *    building or post office box where copyright holder receives mail.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_EMBED_CONTACT_ADDRESS = "ARTESIA.EMBEDDED.FIELD.CONTACT ADDRESS";

	/**
	 * IPTC Tag: Embed Contact City - ARTESIA.EMBEDDED.FIELD.CONTACT CITY
	 * <ul>
	 *    <li><strong>Tag Name</strong>: City </li>	
	 *    <li><strong>Group</strong>: (Contact info)</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the name of the city where your business is located.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_EMBED_CONTACT_CITY = "ARTESIA.EMBEDDED.FIELD.CONTACT CITY";

	/**
	 * IPTC Tag: Embed Contact Phones - ARTESIA.EMBEDDED.FIELD.CONTACT PHONES
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Phone(s)  (Contact info)</li>	
	 *    <li><strong>Group</strong>: </li>	
	 *    <li><strong>Values/Notes</strong>: Enter your business or work telephone number 
	 *    here. Separate multiple numbers with commas. Be sure to include the complete 
	 *    international format of a phone number including: 
	 *    <br/>
	 *    +{countrycode} ({regional code}) {phone number} - {extension, if required}
	 *    <br/>
	 *    e.g.: +1 (212) 1234578 - 222</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_EMBED_CONTACT_PHONES = "ARTESIA.EMBEDDED.FIELD.CONTACT PHONES";
	
	/**
	 * IPTC Tag: Embedded Category	ARTESIA.EMBEDDED.FIELD.CATEGORY
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Category</li>	
	 *    <li><strong>Group</strong>: [IPTC IIM]</li>	
	 *    <li><strong>Values/Notes</strong>: This field was deprecated (removed from use) 
	 *    when IPTC Core 1.0 was released in 2005, although it may appear in some 
	 *    applications supporting IPTC IIM. Use at your own risk</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_EMBED_CATEGORY = "ARTESIA.EMBEDDED.FIELD.CATEGORY";
	
	/**
	 * IPTC Tag: Embedded Description - ARTESIA.EMBEDDED.FIELD.DESCRIPTION
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Description</li>	
	 *    <li><strong>Group</strong>:  IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: The Description field, often referred to as 
	 *    “Caption,” should report the who, what and why of what the photograph depicts. 
	 *    If there is a person or people in the image, this caption might include their 
	 *    names, and/or their roles in any action taking place. If the image depicts a 
	 *    location, then it should describe the location. Don’t forget to also include 
	 *    this same “geographical” information in the appropriate fields 
	 *    (location, city, state/province, country) of the IPTC Core. The amount of detail 
	 *    to include depends on the image and whether it is documentary or conceptual. 
	 *    Typically, editorial images come with complete caption text, while advertising 
	 *    images may not.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_EMBEDDED_DESCRIPTION = "ARTESIA.EMBEDDED.FIELD.DESCRIPTION";
	
	/**
	 * EMBEDDED Tag: Engineer - ARTESIA.EMBEDDED.FIELD.ENGINEER
	 */	
	public static final String EMBEDDED_ENGINEER = "ARTESIA.EMBEDDED.FIELD.ENGINEER";
	
	/**
	 * EXIF Tag: Exposure Program - ARTESIA.EMBEDDED.FIELD.EXPOSURE PROGRAM
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xfe51</li>	
	 *    <li><strong>Tag Name</strong>: Exposure</li>	
	 *    <li><strong>Writable</strong>: string/</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 
	 */	
	public static final String EXIF_EXPOSURE_PROGRAM = "ARTESIA.EMBEDDED.FIELD.EXPOSURE PROGRAM";
	
	/**
	 * EXIF Tag: F-Stop - ARTESIA.EMBEDDED.FIELD.FSTOP
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xc772</li>	
	 *    <li><strong>Tag Name</strong>: TStop</li>	
	 *    <li><strong>Writable</strong>: rational64u[n]</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 
	 */	
	public static final String EXIF_F_STOP = "ARTESIA.EMBEDDED.FIELD.FSTOP";
	
	/**
	 * EXIF Tag: Field Order - ARTESIA.EMBEDDED.FIELD.FIELD_ORDER
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x010a</li>	
	 *    <li><strong>Tag Name</strong>: FillOrder</li>	
	 *    <li><strong>Writable</strong>: int16u!</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>:
	 *       <ul>
	 *          <li>1 = Normal</li>
	 *          <li>2 = Reversed</li>
	 *       </ul> 
	 *    </li>
	 * </ul> 
	 */	
	public static final String EXIF_FIELD_ORDER = "ARTESIA.EMBEDDED.FIELD.FIELD_ORDER";
	
	/**
	 * EXIF Tag: File Source - ARTESIA.EMBEDDED.FIELD.FILE_SOURCE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xa300</li>	
	 *    <li><strong>Tag Name</strong>: FileSource</li>	
	 *    <li><strong>Writable</strong>: undef</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: 
	 *       <ul>
	 *          <li>1 = Film Scanner</li>
	 *          <li>2 = Reflection Print Scanner</li>
	 *          <li>3 = Digital Camera</li>
	 *          <li>"\x03\x00\x00\x00" = Sigma Digital Camera</li>
	 *       </ul>
	 *    </li>
	 * </ul> 
	 */	
	public static final String EXIF_FILE_SOURCE  = "ARTESIA.EMBEDDED.FIELD.FILE_SOURCE";
	
	/**
	 * EXIF Tag: Flash - Function Present -- ARTESIA.EMBEDDED.FIELD.FLASH_FUNCTION
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x9209</li>	
	 *    <li><strong>Tag Name</strong>: Flash</li>	
	 *    <li><strong>Writable</strong>: int16u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: <a href="https://exiftool.org/TagNames/EXIF.html#Flash">EXIF Flash Values</a></li>
	 * </ul> 
	 */	
	public static final String EXIF_FLASH_FUNCTION_PRESENT = "ARTESIA.EMBEDDED.FIELD.FLASH_FUNCTION";
	
	/**
	 * EXIF Tag: Flash - Is Fired -- ARTESIA.EMBEDDED.FIELD.FLASH IS FIRED
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x9209</li>	
	 *    <li><strong>Tag Name</strong>: Flash</li>	
	 *    <li><strong>Writable</strong>: int16u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: <a href="https://exiftool.org/TagNames/EXIF.html#Flash">EXIF Flash Values</a></li>
	 * </ul> 
	 */	
	public static final String EXIF_FLASH_IS_PRESENT = "ARTESIA.EMBEDDED.FIELD.FLASH IS FIRED";
	
	/**
	 * EXIF Tag: Flash - Mode -- ARTESIA.EMBEDDED.FIELD.FLASH MODE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x9209</li>	
	 *    <li><strong>Tag Name</strong>: Flash</li>	
	 *    <li><strong>Writable</strong>: int16u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: <a href="https://exiftool.org/TagNames/EXIF.html#Flash">EXIF Flash Values</a></li>
	 * </ul> 
	 */	
	public static final String EXIF_FLASH_MODE = "ARTESIA.EMBEDDED.FIELD.FLASH MODE";
	
	/**
	 * EXIF Tag: Flash - Red Eye Mode -- ARTESIA.EMBEDDED.FIELD.FLASH_RED_EYE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x9209</li>	
	 *    <li><strong>Tag Name</strong>: Flash</li>	
	 *    <li><strong>Writable</strong>: int16u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: <a href="https://exiftool.org/TagNames/EXIF.html#Flash">EXIF Flash Values</a></li>
	 * </ul> 
	 */	
	public static final String EXIF_FLASH_RED_EYE_MODE = "ARTESIA.EMBEDDED.FIELD.FLASH_RED_EYE";
	
	/**
	 * EXIF Tag: Flash - Return	-- ARTESIA.EMBEDDED.FIELD.FLASH_RETURN
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x9209</li>	
	 *    <li><strong>Tag Name</strong>: Flash</li>	
	 *    <li><strong>Writable</strong>: int16u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: <a href="https://exiftool.org/TagNames/EXIF.html#Flash">EXIF Flash Values</a></li>
	 * </ul> 
	 */	
	public static final String EXIF_FLASH_RETRUN = "ARTESIA.EMBEDDED.FIELD.FLASH_RETURN";
	
	/**
	 * EMBEDDED Tag: Format	- ARTESIA.EMBEDDED.FIELD.FORMAT
	 */	
	public static final String EMBEDDED_FORMAT = "ARTESIA.EMBEDDED.FIELD.FORMAT";

	/**
	 * EXIF Tag: Frame Rate	- ARTESIA.EMBEDDED.FIELD.FRAME_RATE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xc764</li>	
	 *    <li><strong>Tag Name</strong>: FrameRate</li>	
	 *    <li><strong>Writable</strong>: rational64s</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 
	 */	
	public static final String EXIF_FRAME_RATE = "ARTESIA.EMBEDDED.FIELD.FRAME_RATE";
	
	/**
	 * EMBEDDED Tag: Genre - ARTESIA.EMBEDDED.FIELD.GENRE
	 */	
	public static final String EMBEDDED_GENRE = "ARTESIA.EMBEDDED.FIELD.GENRE";

	/**
	 * IPTC Tag: Image ISO Country Code	ARTESIA.EMBEDDED.FIELD.IMAGE ISO COUNTRY CODE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Country Code (legacy)</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the Country Code of the country pictured 
	 *    in the photograph. This field is at the top level of a top-down geographical hierarchy. 
	 *    Display country codes as upper-case letters (US not us). They may be either 
	 *    two- or three-letter codes, as defined by the ISO 3166 standard. The 
	 *    two-letter code list (3166-2) is freely available from the International 
	 *    Standards Organization site. The full name of a country should go to the 
	 *    “Country” field.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_IMAGE_ISO_COUNTRY_CODE = "ARTESIA.EMBEDDED.FIELD.IMAGE ISO COUNTRY CODE";
	
	/**
	 * IPTC Tag: Image State Province - ARTESIA.EMBEDDED.FIELD.IMAGE STATE PROVINCE
	 */	
	public static final String IPTC_IMAGE_STATE_PROVINCE = "ARTESIA.EMBEDDED.FIELD.IMAGE STATE PROVINCE";
	
	/**
	 * IPTC Tag: Contact State-Province	-- ARTESIA.EMBEDDED.FIELD.CONTACT STATEPROVINCE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Province/State</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Alternative label, used for "State/Province."</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_IMAGE_CITY = "ARTESIA.EMBEDDED.FIELD.IMAGE CITY";

	/**
	 * IPTC Tag: Image Country Territory	ARTESIA.EMBEDDED.FIELD.IMAGE COUNTRY TERRITORY
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Country (legacy)</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the full name of the country pictured 
	 *    in the photograph. This field is at the first level of a top-down geographical 
	 *    hierarchy. Use a verbal name and not a code; the ISO country code should be 
	 *    placed in the field titled Country Code.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_IMAGE_COUNTRY_TERRITORY = "ARTESIA.EMBEDDED.FIELD.IMAGE COUNTRY TERRITORY";

	/**
	 * IPTC Tag: Image Date Created	- ARTESIA.EMBEDDED.FIELD.IMAGE DATE CREATED
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Date Created</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Use this field to record the calendar date 
	 *    (and optionally, the time) when the photograph was made - not the date when 
	 *    you scanned or edited the image. If using a digital camera set to the correct 
	 *    time, you can find this information in the image's EXIF data. If no time is 
	 *    given, the value should default to 00:00:00.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_IMAGE_DATE_CREATED = "ARTESIA.EMBEDDED.FIELD.IMAGE DATE CREATED";

	/**
	 * IPTC Tag: Image Intellectual Genre - ARTESIA.EMBEDDED.FIELD.IMAGE INTELLACTUAL GENRE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Intellectual Genre</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Use this field to describe the type of 
	 *    use a photograph fulfills, in terms of its intellectual or journalistic 
	 *    characteristics. For example, at a newspaper, Intellectual Genre labels 
	 *    might include terms like daybook, obituary, press release, or transcript. 
	 *    A magazine might use terms such as actuality, interview, background, feature, 
	 *    summary, or wrap-up. For best results, organizations should use a set of terms 
	 *    from a controlled vocabulary. A sample taxonomy of “Intellectual genre” terms 
	 *    developed by the IPTC is available from http://www.newscodes.org/. 
	 *    The PRISM working group of the IDEAlliance has also developed a set 
	 *    of terms.</li>
	 * </ul> 		 

	 */	
	public static final String IPTC_IMAGE_INTELLECTUAL_GENRE = "ARTESIA.EMBEDDED.FIELD.IMAGE INTELLACTUAL GENRE";

	/**
	 * IPTC Tag: Image IPTC Scene - ARTESIA.EMBEDDED.FIELD.IMAGE IPTC SCENE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: IPTC Scene</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Describes what a photograph depicts, using 
	 *    one or more terms from the IPTC "Scene-NewsCodes." You should only enter 
	 *    values from the IPTC Scene controlled vocabulary (available from http://www.newscodes.org/). 
	 *    Each IPTC Scene term is represented as a six-digit numerical 
	 *    string in an unordered list.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_IMAGE_IPTC_SCENE = "ARTESIA.EMBEDDED.FIELD.IMAGE IPTC SCENE";

	/**
	 * IPTC Tag: Image Location - ARTESIA.EMBEDDED.FIELD.IMAGE LOCATION
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Location</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Label introduced in IPTC Core 1.0 schema and 
	 *    replaced with "Sublocation" in IPTC Core 1.1. While replaced by "Sublocation" 
	 *    in IPTC Core 1.1, it may still appear as Location in many applications.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_IMAGE_LOCATION = "ARTESIA.EMBEDDED.FIELD.IMAGE LOCATION";

	/**
	 * IPTC Tag: Instructions - ARTESIA.EMBEDDED.FIELD.INSTRUCTIONS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Instructions</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: This is a simple text field that can 
	 *    include any of a number of instructions from the provider or creator to 
	 *    the receiver of the photograph. Any of the following might be included: 
	 *    embargoes (eg: News Magazines OUT) and other restrictions not covered by 
	 *    the Rights Usage Terms field (or new PLUS rights related fields); information 
	 *    regarding the original means of capture (scanning notes, color profile, etc.) 
	 *    or other specific text information the user may need for accurate reproduction; 
	 *    additional permissions or credits required when publishing.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_INSTRUCTIONS = "ARTESIA.EMBEDDED.FIELD.INSTRUCTIONS";
	
	/**
	 * EMBEDDED Tag: Instrument	ARTESIA.EMBEDDED.FIELD.INSTRUMENT
	 */	
	public static final String EMBEDDED_INSTRUMENT = "ARTESIA.EMBEDDED.FIELD.INSTRUMENT";
	
	/**
	 * EXIF Tag: Key - ARTESIA.EMBEDDED.FIELD.KEY
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x9c9e</li>	
	 *    <li><strong>Tag Name</strong>: XPKeywords</li>	
	 *    <li><strong>Writable</strong>: int8u</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 	
	 */	
	public static final String EXIF_KEY = "ARTESIA.EMBEDDED.FIELD.KEY";
	
	/**
	 * IPTC Tag: Keywords	ARTESIA.EMBEDDED.FIELD.KEYWORDS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Keywords</li>	
	 *    <li><strong>Group</strong>: [IPTC Core]</li>	
	 *    <li><strong>Values/Notes</strong>: Enter keyword terms or phrases to describe the 
	 *    subject of content in the photograph. Keywords may be free text (i.e., they need 
	 *    not from a controlled vocabulary). You may enter (or paste) any number of keywords, 
	 *    terms or phrases into this field. Each keyword term should be separated by a delimiter, 
	 *    such as a comma, though some software may allow semicolons or line returns 
	 *    (note also that some applications may change the appearance of this delimiter 
	 *    as well, such as Photoshop changing your commas to semicolons). To maintain 
	 *    backward compatibility, no single value should exceed 64 characters. Values 
	 *    from the controlled vocabulary IPTC Subject Codes must be placed into the 
	 *    “Subject Code” field.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_KEYWORDS = "ARTESIA.EMBEDDED.FIELD.KEYWORDS";
	
	/**
	 * EMBEDDED Tag: Log Comment - ARTESIA.EMBEDDED.FIELD.LOG_COMMENT
	 */	
	public static final String EMBEDDED_LOG_COMMENT = "ARTESIA.EMBEDDED.FIELD.LOG_COMMENT";
	
	/**
	 * EMBEDDED Tag: Loop - ARTESIA.EMBEDDED.FIELD.LOOP
	 */	
	public static final String EMBEDDED_LOOP = "ARTESIA.EMBEDDED.FIELD.LOOP";
	
	/**
	 * EXIF Tag: Make - ARTESIA.EMBEDDED.FIELD.MAKE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x010f</li>	
	 *    <li><strong>Tag Name</strong>: Make</li>	
	 *    <li><strong>Writable</strong>: string</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 
	 */	
	public static final String EXIF_MAKE = "ARTESIA.EMBEDDED.FIELD.MAKE";
	
	/**
	 * EXIF Tag: Max Aperture Value - ARTESIA.EMBEDDED.FIELD.MAX APERTURE VALUE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x9202</li>	
	 *    <li><strong>Tag Name</strong>: ApertureValue</li>	
	 *    <li><strong>Writable</strong>: rational64u</li>
	 *    <li><strong>Group</strong>: ExifIFD</li>	
	 *    <li><strong>Values/Notes</strong>: (displayed as an F number, but stored as an APEX value)</li>
	 * </ul> 
	 */	
	public static final String EXIF_MAX_APERTURE_VALUE = "ARTESIA.EMBEDDED.FIELD.MAX APERTURE VALUE";
	
	/**
	 * EMBEDDED Tag: Modified - ARTESIA.EMBEDDED.FIELD.MODIFIED
	 */	
	public static final String EMBEDDED_MODIFIED = "ARTESIA.EMBEDDED.FIELD.MODIFIED";
	
	/**
	 * EMBEDDED Tag: Number of Beats - ARTESIA.EMBEDDED.FIELD.NUMBER_OF_BEATS
	 */	
	public static final String EMBEDDED_NUMBER_OF_BEATS = "ARTESIA.EMBEDDED.FIELD.NUMBER_OF_BEATS";
	
	/**
	 * IPTC Tag: Origin City	ARTESIA.EMBEDDED.FIELD.CITY
	 * <ul>
	 *    <li><strong>Tag Name</strong>: City (legacy)</li>
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the name of the city where the 
	 *    image was captured. If there is no city, you can use the Sublocation 
	 *    field alone to specify where the photograph was made. City is at the 
	 *    third level of a top-down geographical hierarchy.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_ORIGIN_CITY = "ARTESIA.EMBEDDED.FIELD.CITY";
	
	/**
	 * IPTC Tag: Origin Country Territory - ARTESIA.EMBEDDED.FIELD.ORIGIN_COUNTRY_TERRITORY
	 */	
	public static final String IPTC_ORIGIN_COUNTRY_TERRITORY = "ARTESIA.EMBEDDED.FIELD.ORIGIN_COUNTRY_TERRITORY";
	
	/**
	 * IPTC Tag: Origin Credit - ARTESIA.EMBEDDED.FIELD.CREDIT
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Credit Line</li>	
	 *    <li><strong>Group</strong>: [IPTC Core]</li>	
	 *    <li><strong>Values/Notes</strong>: The Credit Line is a free-text field 
	 *    that specifies how to acknowledge the supplying person(s) and/or 
	 *    organization(s) when publishing the image. Indicate more formal 
	 *    identifications of the image's creator or the copyright holder 
	 *    in other rights-specific fields - such as Creator and Copyright Notice. 
	 *    The older IIM metadata schema called this property "Credit." 
	 *    It was renamed to "Provider" in IPTC Core 1.0. It has been renamed 
	 *    to “Credit Line” in the latest version of the IPTC Core 1.1 to 
	 *    acknowledge how it is most widely used.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_ORIGIN_CREDIT = "ARTESIA.EMBEDDED.FIELD.CREDIT";
	
	/**
	 * IPTC Tag: Origin Date Created - ARTESIA.EMBEDDED.FIELD.DATE_CREATED
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Date Created</li>	
	 *    <li><strong>Group</strong>: [IPTC Core]</li>	
	 *    <li><strong>Values/Notes</strong>: Use this field to record the calendar date 
	 *    (and optionally, the time) when the photograph was made - not the date when 
	 *    you scanned or edited the image. If using a digital camera set to the correct 
	 *    time, you can find this information in the image's EXIF data. If no time is 
	 *    given, the value should default to 00:00:00.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_ORIGIN_DATE_CREATED = "ARTESIA.EMBEDDED.FIELD.DATE_CREATED";
	
	/**
	 * IPTC Tag: Origin Headline - ARTESIA.EMBEDDED.FIELD.ORIGIN_HEADLINE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Headline</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>:A headline is a brief, publishable synopsis 
	 *    or summary of the contents of the photograph. Like a news story's lead, the 
	 *    Headline should grab attention and summarize the image's content. Headlines 
	 *    must be succinct. Leave any supporting narrative for the Description field. 
	 *    Do not, however, confuse the Headline term with Title.</li>
	 * </ul> 		 
	 */	
	public static final String IPTC_ORIGIN_HEADLINE = "ARTESIA.EMBEDDED.FIELD.ORIGIN_HEADLINE";
	
	/**
	 * IPTC Tag: Origin Source - ARTESIA.EMBEDDED.FIELD.SOURCE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Source</li>	
	 *    <li><strong>Group</strong>: [IPTC Core]</li>	
	 *    <li><strong>Values/Notes</strong>: The Source field should identify the 
	 *    original owner or copyright holder of the photograph. The value of this 
	 *    field should never be changed after the information is first entered. 
	 *    While not yet enforced by the custom panels, you should consider this to 
	 *    be a “write-once” field. The source could be an individual, an agency or 
	 *    a member of an agency. To aid in later searches, separate any slashes “/” 
	 *    with a blank space. Use the form “photographer / agency” rather than 
	 *    “photographer/agency.” Source may also be different from Creator and 
	 *    from the names listed in the Copyright Notice.</li>
	 * </ul> 		  
	 */	
	public static final String IPTC_ORIGIN_SOURCE = "ARTESIA.EMBEDDED.FIELD.SOURCE";
	
	/**
	 * EMBEDDED Tag: Pixel Aspect Ratio	ARTESIA.EMBEDDED.FIELD.PIXEL_ASPECT_RATIO
	 */	
	public static final String EMBEDDED_PIXEL_ASPECT_RATIO = "ARTESIA.EMBEDDED.FIELD.PIXEL_ASPECT_RATIO";
	
	/**
	 * EMBEDDED Tag: Pixel Dimension X - ARTESIA.EMBEDDED.FIELD.PIXEL_DIMENTION_X
	 */	
	public static final String EMBEDDED_PIXEL_DIMENSION_X = "ARTESIA.EMBEDDED.FIELD.PIXEL_DIMENTION_X";
	
	/**
	 * EMBEDDED Tag: Pixel Dimension Y - ARTESIA.EMBEDDED.FIELD.PIXEL_DIMENTION_Y
	 */	
	public static final String EMBEDDED_PIXEL_DIMENSION_Y = "ARTESIA.EMBEDDED.FIELD.PIXEL_DIMENTION_Y";
	
	/**
	 * EXIF Tag: Rating	- ARTESIA.EMBEDDED.FIELD.RATING
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0x4746</li>	
	 *    <li><strong>Tag Name</strong>: Rating</li>	
	 *    <li><strong>Writable</strong>: int16u/</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 	
	 */	
	public static final String EXIF_RATING = "ARTESIA.EMBEDDED.FIELD.RATING";
	
	/**
	 * EXIF Tag: Release Date - ARTESIA.EMBEDDED.FIELD.RELEASE_DATE
	 */	
	public static final String EXIF_RELEASE_DATE = "ARTESIA.EMBEDDED.FIELD.RELEASE_DATE";
	
	/**
	 * EMBEDDED Tag: Resolution X - ARTESIA.EMBEDDED.FIELD.RESOLUTION_X
	 */	
	public static final String EMBEDDED_RESOLUTION_X = "ARTESIA.EMBEDDED.FIELD.RESOLUTION_X";
	
	/**
	 * EMBEDDED Tag: Resolution Y - ARTESIA.EMBEDDED.FIELD.RESOLUTION_Y
	 */	
	public static final String EMBEDDED_RESOLUTION_y = "ARTESIA.EMBEDDED.FIELD.RESOLUTION_Y";
	
	/**
	 * EXIF Tag: Sample Rate - ARTESIA.EMBEDDED.FIELD.SAMPLE_RATE
	 */	
	public static final String EXIF_SAMPLE_RATE = "ARTESIA.EMBEDDED.FIELD.SAMPLE_RATE";
	
	/**
	 * EXIF Tag: Scene - ARTESIA.EMBEDDED.FIELD.SCENE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xa301</li>	
	 *    <li><strong>Tag Name</strong>: SceneType</li>	
	 *    <li><strong>Writable</strong>: undef</li>
	 *    <li><strong>Group</strong>: ExifIFD	</li>	
	 *    <li><strong>Values/Notes</strong>: 1 = Directly photographed</li>
	 * </ul> 	
	 */	
	public static final String EXIF_SCENE = "ARTESIA.EMBEDDED.FIELD.SCENE";
	
	/**
	 * EXIF Tag: Shot Take - ARTESIA.EMBEDDED.FIELD.SHOT_TAKE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xc68f</li>	
	 *    <li><strong>Tag Name</strong>: AsShotICCProfile</li>	
	 *    <li><strong>Writable</strong>: undef!</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: <a href="https://exiftool.org/TagNames/ICC_Profile.html">ICC_Profile Tags</a></li>
	 * </ul> 	
	 */	
	public static final String EXIF_SHOT_TAKE = "ARTESIA.EMBEDDED.FIELD.SHOT_TAKE";
	
	/**
	 * EXIF Tag: Software Package - ARTESIA.EMBEDDED.FIELD.SOFTWARE_PACKAGE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xc68f</li>	
	 *    <li><strong>Tag Name</strong>: AsShotICCProfile</li>	
	 *    <li><strong>Writable</strong>: undef!</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: <a href="https://exiftool.org/TagNames/ICC_Profile.html">ICC_Profile Tags</a></li>
	 * </ul> 
	 */	
	public static final String EXIF_SOFTWARE_PACKAGE = "ARTESIA.EMBEDDED.FIELD.SOFTWARE_PACKAGE";
	
	/**
	 * EXIF Tag: Start Timecode	- ARTESIA.EMBEDDED.FIELD.START_TIMECODE
	 * <ul>
	 *    <li><strong>Tag ID</strong>: 0xc763</li>	
	 *    <li><strong>Tag Name</strong>: TimeCodes</li>	
	 *    <li><strong>Writable</strong>: int8u[n]</li>
	 *    <li><strong>Group</strong>: IFD0</li>	
	 *    <li><strong>Values/Notes</strong>: </li>
	 * </ul> 	
	 */	
	public static final String EXIF_START_TIMECODE = "ARTESIA.EMBEDDED.FIELD.START_TIMECODE";
	
	/**
	 * IPTC Tag: State-Province	- ARTESIA.EMBEDDED.FIELD.STATE_PROVINCE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: State/Province (legacy)</li>	
	 *    <li><strong>Group</strong>: [IPTC Core]</li>	
	 *    <li><strong>Values/Notes</strong>: Enter the name of the subregion of a country 
	 *    - usually referred to as either a State or Province - pictured in the image. 
	 *    Since the abbreviation for a State or Province may be unknown to those viewing 
	 *    your metadata internationally, consider using the full spelling of the name. 
	 *    Province/State is at the second level of a top-down geographical hierarchy.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATE_PROVINCE = "ARTESIA.EMBEDDED.FIELD.STATE_PROVINCE";
	
	/**
	 * IPTC Tag: Status Copyright Notice -ARTESIA.EMBEDDED.FIELD.STATUS COPYRIGHT NOTICE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Copyright Notice</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: The Copyright Notice should include any legal 
	 *    language required to claim intellectual property. It should identify the photograph's 
	 *    current holder(s). If the photographer differs from the copyright holder, enter the 
	 *    photographer's name in the Creator field. Usually, the value for this copyright 
	 *    notice would be the photographer, but if an employee made the image under 
	 *    work-for-hire rules, then list the employing agency or company.
	 *    Use the form of notice appropriate to your country.
	 *    </li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATUS_COPYRIGHT_NOTICE = "ARTESIA.EMBEDDED.FIELD.STATUS COPYRIGHT NOTICE";
	
	/**
	 * IPTC Tag: Status Instructions - ARTESIA.EMBEDDED.FIELD.STATUS INSTRUCTIONS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Copyright Status</li>	
	 *    <li><strong>Group</strong>: Photoshop</li>	
	 *    <li><strong>Values/Notes</strong>: This field is not part of the IPTC Core; 
	 *    it exists only as part of the Photoshop XMP Namespace. Use with caution, as 
	 *    some software programs will not recognize this field.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATUS_INSTRUCTIONS = "ARTESIA.EMBEDDED.FIELD.STATUS INSTRUCTIONS";
	
	/**
	 * IPTC Tag: Status Job Identifier - ARTESIA.EMBEDDED.FIELD.STATUS JOB IDENTIFIER
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Job Identifier</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: You can enter a number or identifier 
	 *    created or issued to improve workflow handling and image tracking. Typically, 
	 *    the creator or image provider creates this code for transmission and routing 
	 *    purposes, relating it to the job for which the item is supplied.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATUS_JOB_IDENTIFIER = "ARTESIA.EMBEDDED.FIELD.STATUS JOB IDENTIFIER";
	
	/**
	 * IPTC Tag: Status Provider - ARTESIA.EMBEDDED.FIELD.STATUS PROVIDER
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Provider</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: Label introduced in IPTC Core 1.0 schema 
	 *    and replaced with "Credit Line" in IPTC Core 1.1. This field is “shared” 
	 *    with the “Credit” field in the Origin panel of the Adobe Photoshop File Info 
	 *    dialogue. While replaced by "Credit Line" in IPTC Core 1.1, it may still 
	 *    appear as Provider in many applications.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATUS_PROVIDER = "ARTESIA.EMBEDDED.FIELD.STATUS PROVIDER";
	
	/**
	 * IPTC Tag: Status Rights Usage Terms - ARTESIA.EMBEDDED.FIELD.STATUS RIGHTS USAGE TERMS
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Rights Usage Terms</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: The Rights Usage Terms field should include 
	 *    free-text instructions on how the photograph can be legally used. If submitting 
	 *    the image(s) for consideration only, you can indicate that, and stipulate no 
	 *    reproduction is allowed without first negotiating permission. Use the PLUS 
	 *    [link to PLUS website, or PLUS page within the PhotoMetadata Website] fields 
	 *    of the IPTC Extension in parallel to express the license in more controlled 
	 *    terms. It is strongly encouraged that you use a standardized set of terms or 
	 *    controlled vocabulary when populating this field.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATUS_RIGHTS_USAGE_TERMS = "ARTESIA.EMBEDDED.FIELD.STATUS RIGHTS USAGE TERMS";
	
	/**
	 * IPTC Tag: Status Source - ARTESIA.EMBEDDED.FIELD.STATUS SOURCE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Source</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: The Source field should identify the 
	 *    original owner or copyright holder of the photograph. The value of this field 
	 *    should never be changed after the information is first entered. While not 
	 *    yet enforced by the custom panels, you should consider this to be a “write-once” 
	 *    field. The source could be an individual, an agency or a member of an agency. 
	 *    To aid in later searches, separate any slashes “/” with a blank space. Use the 
	 *    form “photographer / agency” rather than “photographer/agency.” Source may also 
	 *    be different from Creator and from the names listed in the Copyright Notice.
	 *    Note: This field is “shared” with the “Source” field in the Origin panel of 
	 *    the Adobe Photoshop File Info dialogue.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATUS_SOURCE = "ARTESIA.EMBEDDED.FIELD.STATUS SOURCE";
	
	/**
	 * IPTC Tag: status Title - ARTESIA.EMBEDDED.FIELD.STATUS TITLE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Title</li>	
	 *    <li><strong>Group</strong>: IPTC Core</li>	
	 *    <li><strong>Values/Notes</strong>: This field can include a shorthand reference 
	 *    for the image or “photograph” - primarily for identification. The title of an 
	 *    image should be a short, human-readable name - text and/or numeric reference - 
	 *    and may take several forms. For photographers, this might be the filename of 
	 *    their original scan or digital camera file. For news organizations it might be 
	 *    the name of a story it accompanies. The Title term should not be confused with 
	 *    the Headline term, which is a short synopsis of the photograph's content.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_STATUS_TITLE = "ARTESIA.EMBEDDED.FIELD.STATUS TITLE";
	
	/**
	 * EMBEDDED Tag: Stretch Method	- ARTESIA.EMBEDDED.FIELD.STRETCH_METHOD
	 */	
	public static final String EMBEDDED_STRETCH_METHOD = "ARTESIA.EMBEDDED.FIELD.STRETCH_METHOD";
	
	/**
	 * IPTC Tag: Supplemental Categories - ARTESIA.EMBEDDED.FIELD.SUPPLEMENTAL_CATEGORIES
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Supplemental Categories</li>	
	 *    <li><strong>Group</strong>: IPTC IIM</li>	
	 *    <li><strong>Values/Notes</strong>: This field was deprecated (removed from use) 
	 *    when IPTC Core 1.0 was released in 2005, although it may appear in some applications 
	 *    supporting IPTC IIM. Use with caution.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_SUPPLEMENTAL_CATEGORIES = "ARTESIA.EMBEDDED.FIELD.SUPPLEMENTAL_CATEGORIES";
	
	/**
	 * EMBEDDED Tag: Tape Name	- ARTESIA.EMBEDDED.FIELD.TAPE_NAME
	 */	
	public static final String EMBEDDED_TAPE_NAME = "ARTESIA.EMBEDDED.FIELD.TAPE_NAME";
	
	/**
	 * EMBEDDED Tag: Tempo - ARTESIA.EMBEDDED.FIELD.TEMPO
	 */	
	public static final String EMBEDDED_TEMPO = "ARTESIA.EMBEDDED.FIELD.TEMPO";
	
	/**
	 * EMBEDDED Tag: Track Number - ARTESIA.EMBEDDED.FIELD.TRACK_NUMBER
	 */	
	public static final String EMBEDDED_TRACK_NUMBER = "ARTESIA.EMBEDDED.FIELD.TRACK_NUMBER";
	
	/**
	 * IPTC Tag: Transmission Reference	- ARTESIA.EMBEDDED.FIELD.TRANSMISSION_REFERENCE
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Original Transmission Reference</li>	
	 *    <li><strong>Group</strong>: IPTC IIM</li>	
	 *    <li><strong>Values/Notes</strong>: Alternative label from older IPTC IIM schema; used for "Job Identifier."</li>
	 * </ul> 	
	 */	
	public static final String IPTC_TRANSMISSION_REFERENCE = "ARTESIA.EMBEDDED.FIELD.TRANSMISSION_REFERENCE";
	
	/**
	 * IPTC Tag: Urgency - ARTESIA.EMBEDDED.FIELD.URGENCY
	 * <ul>
	 *    <li><strong>Tag Name</strong>: Urgency</li>	
	 *    <li><strong>Group</strong>: IPTC IIM</li>	
	 *    <li><strong>Values/Notes</strong>: This field was deprecated (removed from use) when IPTC Core 1.0 was released in 2005, although it may appear in some applications supporting IPTC IIM. Use with caution.</li>
	 * </ul> 	
	 */	
	public static final String IPTC_URGENCY = "ARTESIA.EMBEDDED.FIELD.URGENCY";
	
	/**
	 * Array of embedded metadata fields included in a picture.
	 * There are three types of metadata:
	 * <ul>
	 *    <li><strong>EMBEDDED</strong>: Embedded fields that I couldn't identify as EXIF or IPTC</li>
	 *    <li><strong>EXIF</strong>: EXIF stands for "Exchangeable Image File Format". 
	 *    This type of information is formatted according to the TIFF specification, 
	 *    and may be found in JPG, TIFF, PNG, JP2, PGF, MIFF, HDP, PSP and XCF images, 
	 *    as well as many TIFF-based RAW images, and even some AVI and MOV videos.</li>
	 *    <li><strong>IPTC</strong>: The Information Interchange Model (IIM) is a file structure and set 
	 *    of metadata attributes that can be applied to text, images and other media types. 
	 *    It was developed in the early 1990s by the International Press Telecommunications Council (IPTC) to expedite the international exchange of news among newspapers and news agencies.</li>
	 * </ul>
	 */
	public static final TeamsIdentifier[] EMBEDDED_PICTURE_FIELDS = new TeamsIdentifier[] {			
			new TeamsIdentifier(EMBEDDED_ALPHA_MODE),
			new TeamsIdentifier(EMBEDDED_ALTERNATE_TAPE_NAME),
			new TeamsIdentifier(EMBEDDED_ALTERNATE_TIMECODE),
			new TeamsIdentifier(EMBEDDED_BMF_TIME_REFERENCE),
			new TeamsIdentifier(EMBEDDED_CAMERA_SHUTTER_SPEED),
			new TeamsIdentifier(EMBEDDED_CHANNELS),
			new TeamsIdentifier(EMBEDDED_COMPOSER),
			new TeamsIdentifier(EMBEDDED_COMPRESSOR),
			new TeamsIdentifier(EMBEDDED_DATE_SHOT),
			new TeamsIdentifier(EMBEDDED_DATE_TIME),
			new TeamsIdentifier(EMBEDDED_ENGINEER),
			new TeamsIdentifier(EMBEDDED_FORMAT),
			new TeamsIdentifier(EMBEDDED_GENRE),
			new TeamsIdentifier(EMBEDDED_INSTRUMENT),
			new TeamsIdentifier(EMBEDDED_LOG_COMMENT),
			new TeamsIdentifier(EMBEDDED_LOOP),
			new TeamsIdentifier(EMBEDDED_MODIFIED),
			new TeamsIdentifier(EMBEDDED_NUMBER_OF_BEATS),
			new TeamsIdentifier(EMBEDDED_PIXEL_ASPECT_RATIO),
			new TeamsIdentifier(EMBEDDED_PIXEL_DIMENSION_X),
			new TeamsIdentifier(EMBEDDED_PIXEL_DIMENSION_Y),
			new TeamsIdentifier(EMBEDDED_RESOLUTION_X),
			new TeamsIdentifier(EMBEDDED_RESOLUTION_y),
			new TeamsIdentifier(EMBEDDED_STRETCH_METHOD),
			new TeamsIdentifier(EMBEDDED_TAPE_NAME),
			new TeamsIdentifier(EMBEDDED_TEMPO),
			new TeamsIdentifier(EMBEDDED_TRACK_NUMBER),
			
			new TeamsIdentifier(EXIF_APERTURE_VALUE),
			new TeamsIdentifier(EXIF_APPLICATION),
			new TeamsIdentifier(EXIF_ARTIST),
			new TeamsIdentifier(EXIF_AUTHOR),
			new TeamsIdentifier(EXIF_AUTHOR_TITLE),
			new TeamsIdentifier(EXIF_CAMERA_FOCAL_LENGTH),
			new TeamsIdentifier(EXIF_CAMERA_ISO_SPEED_RATINGS),
			new TeamsIdentifier(EXIF_CAMERA_LENS),
			new TeamsIdentifier(EXIF_CAMERA_LIGHT_SOURCE),
			new TeamsIdentifier(EXIF_CAMERA_MODEL),
			new TeamsIdentifier(EXIF_CAMERA_ORIENTTION),
			new TeamsIdentifier(EXIF_CAMERA_RESOLUTION_UNIT),
			new TeamsIdentifier(EXIF_COLOR_SPACE),
			new TeamsIdentifier(EXIF_COMPRESSED_BITS_PER_PIXEL),
			new TeamsIdentifier(EXIF_EXPOSURE_PROGRAM),
			new TeamsIdentifier(EXIF_FIELD_ORDER),
			new TeamsIdentifier(EXIF_FILE_SOURCE),
			new TeamsIdentifier(EXIF_FLASH_FUNCTION_PRESENT),
			new TeamsIdentifier(EXIF_FLASH_IS_PRESENT),
			new TeamsIdentifier(EXIF_FLASH_MODE),
			new TeamsIdentifier(EXIF_FLASH_RED_EYE_MODE),
			new TeamsIdentifier(EXIF_FLASH_RETRUN),
			new TeamsIdentifier(EXIF_FRAME_RATE),
			new TeamsIdentifier(EXIF_F_STOP),
			new TeamsIdentifier(EXIF_KEY),
			new TeamsIdentifier(EXIF_MAKE),
			new TeamsIdentifier(EXIF_MAX_APERTURE_VALUE),
			new TeamsIdentifier(EXIF_RATING),
			new TeamsIdentifier(EXIF_RELEASE_DATE),
			new TeamsIdentifier(EXIF_SAMPLE_RATE),
			new TeamsIdentifier(EXIF_SCENE),
			new TeamsIdentifier(EXIF_SHOT_TAKE),
			new TeamsIdentifier(EXIF_SOFTWARE_PACKAGE),
			new TeamsIdentifier(EXIF_START_TIMECODE),
			
			new TeamsIdentifier(IPTC_CONTACT_COUNTRY_TERRITORY),
			new TeamsIdentifier(IPTC_CONTACT_CREATOR),
			new TeamsIdentifier(IPTC_CONTACT_CREATOR_JOB_TITLE),
			new TeamsIdentifier(IPTC_CONTACT_EMAILS),
			new TeamsIdentifier(IPTC_CONTACT_POSTAL_CODE),
			new TeamsIdentifier(IPTC_CONTACT_STATE_PROVINCE),
			new TeamsIdentifier(IPTC_CONTACT_WEBSITE),
			new TeamsIdentifier(IPTC_CONTENT_DESCRIPTION_WRITTER),
			new TeamsIdentifier(IPTC_CONTENT_DESCRITPTION),
			new TeamsIdentifier(IPTC_CONTENT_HEADLINE),
			new TeamsIdentifier(IPTC_CONTENT_IPTC_SUBJECT_CODE),
			new TeamsIdentifier(IPTC_CONTENT_KEYWORDS),
			new TeamsIdentifier(IPTC_COPYRIGHT_INFO_URL),
			new TeamsIdentifier(IPTC_COPYRIGHT_NOTICE),
			new TeamsIdentifier(IPTC_COPYRIGHT_STATUS),
			new TeamsIdentifier(IPTC_CREATED),
			new TeamsIdentifier(IPTC_CREATION_DATE),
			new TeamsIdentifier(IPTC_DESCRIPTION_WRITER),
			new TeamsIdentifier(IPTC_DOCUMENT_TITLE),
			new TeamsIdentifier(IPTC_EMBEDDED_DESCRIPTION),
			new TeamsIdentifier(IPTC_EMBED_CATEGORY),
			new TeamsIdentifier(IPTC_EMBED_CONTACT_ADDRESS),
			new TeamsIdentifier(IPTC_EMBED_CONTACT_CITY),
			new TeamsIdentifier(IPTC_EMBED_CONTACT_PHONES),
			new TeamsIdentifier(IPTC_IMAGE_CITY),
			new TeamsIdentifier(IPTC_IMAGE_COUNTRY_TERRITORY),
			new TeamsIdentifier(IPTC_IMAGE_DATE_CREATED),
			new TeamsIdentifier(IPTC_IMAGE_INTELLECTUAL_GENRE),
			new TeamsIdentifier(IPTC_IMAGE_IPTC_SCENE),
			new TeamsIdentifier(IPTC_IMAGE_ISO_COUNTRY_CODE),
			new TeamsIdentifier(IPTC_IMAGE_LOCATION),
			new TeamsIdentifier(IPTC_IMAGE_STATE_PROVINCE),
			new TeamsIdentifier(IPTC_INSTRUCTIONS),
			new TeamsIdentifier(IPTC_KEYWORDS),
			new TeamsIdentifier(IPTC_ORIGIN_CITY),
			new TeamsIdentifier(IPTC_ORIGIN_COUNTRY_TERRITORY),
			new TeamsIdentifier(IPTC_ORIGIN_CREDIT),
			new TeamsIdentifier(IPTC_ORIGIN_DATE_CREATED),
			new TeamsIdentifier(IPTC_ORIGIN_HEADLINE),
			new TeamsIdentifier(IPTC_ORIGIN_SOURCE),
			new TeamsIdentifier(IPTC_STATE_PROVINCE),
			new TeamsIdentifier(IPTC_STATUS_COPYRIGHT_NOTICE),
			new TeamsIdentifier(IPTC_STATUS_INSTRUCTIONS),
			new TeamsIdentifier(IPTC_STATUS_JOB_IDENTIFIER),
			new TeamsIdentifier(IPTC_STATUS_PROVIDER),
			new TeamsIdentifier(IPTC_STATUS_RIGHTS_USAGE_TERMS),
			new TeamsIdentifier(IPTC_STATUS_SOURCE),
			new TeamsIdentifier(IPTC_STATUS_TITLE),
			new TeamsIdentifier(IPTC_SUPPLEMENTAL_CATEGORIES),
			new TeamsIdentifier(IPTC_TRANSMISSION_REFERENCE),
			new TeamsIdentifier(IPTC_URGENCY)
	};
}
