OpenText Media Management (OTMM) Event listener which listen the event **Analysis data from Azure is deleted (5006)**.
This event is launched once the Rich Media Analysis (RMA) has finished.  

> NOTE: The data from Azure is deleted regardless of whether the extraction of media analytics succeeded or not.

Once the Analysis data from Azure is deleted the transcription is available (only when the RMA has finished successfully).

This add-on makes a Fraud analysis based on metadata analysis included in a picture.

These are the criteria evaluated: 

   - **No metadata**: The picture doesn't include any metadata
   - **EXIF DateTime date before of incident date**
   - **GPS coordinates distinct  Incident coordinates (from address)**
      - Use reverse geocoding to get coordinates from incident address (provided as custom metadata associated with a Crash Picture)
      - Check the distance between coordinates (should be less than 1 km)
   - **Picture edited?** Information in Exif.Image.XMLPacket* field could indicate that the picture has been edited/manipulated
   - **Duplicated or similar picture**: Find the same picture in OTMM or one similar, in more than a 98%, means that in a reused/old picture

> IMPORTANT: These add-on has been developed and tested on OTMM 20.3

If some bad words are found, It are stored in this custom fields: 

 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.NO.METADATA**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.PREVIOUS.EXIF.DATETIME**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DISTINCT.COORDINATES**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.EDITED**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DUPLICATED**

> NOTE: These custom field must be created from TEAMS admin panel.

# Required .jar files

> This section is only included to know the original location of the .jar files used in the project.

Import the indicated set of files to the indicated project folders:

**Set 1**
1. From: **C:\Apps\MediaManagement\jars**
 - artesia-server-tools.jar 
 - commons-httpclient-3.1.jar
 - commons-io-2.6.jar 
 - commons-logging-1.2.jar
 - TEAMS-common.jar
 - TEAMS-mock-services.jar
 - TEAMS-sdk.jar
 - TEAMS-toolkit.jar
 
2. To project folder: **lib**

**Set 2**
1. From: **C:\Apps\MediaManagement_TomEE\lib**
 - servlet-api.jar
 
 2. To project folder: **lib**

**Set 3**
1. From: **C:\Apps\MediaManagement\deploy\commons**
 - commons-collections-3.2.2.jar 
 - commons-collections4-4.3.jar 
 - commons-fileupload-1.3.3.jar 
 - commons-lang-2.4.jar 
2. To project folder: **lib**

**Set 4**
1. From: **C:\Apps\MediaManagement\deploy\artesia**
 - otmm-rest-interfaces.jar
 - otmm-server-ext-api.jar
2. To project folder: **lib**


**Set 4**
1. From: **C:\Apps\MediaManagement\ear\artesia.ear\**
 - artesia-ejb.jar
2. To project folder: **lib**
