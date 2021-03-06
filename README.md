OpenText Media Management (OTMM) Event listener which listen the event **Analysis data from Azure is deleted (5006)**.
This event is launched once the Rich Media Analysis (RMA) has finished.  

> NOTE: The data from Azure is deleted regardless of whether the extraction of media analytics succeeded or not.

Once the Analysis data from Azure is deleted the transcription is available (only when the RMA has finished successfully).

This add-on makes a Fraud analysis based on metadata analysis included in a picture.

These are the criteria evaluated: 

   - **No metadata**: The picture doesn't include any metadata
   - **EXIF DateTime before of incident date**
   - **GPS coordinates distinct  Incident coordinates (from address)**
      - Use reverse geocoding to get coordinates from incident address (provided as custom metadata associated with a Crash Picture)
      - Check the distance between coordinates (should be less than 1 km)
   - **Picture edited?** Information in Exif.Image.XMLPacket* field could indicate that the picture has been edited/manipulated
     Exif.Image.XMLPacket	Byte	XMP Metadata (Adobe technote 9-14-02)
   - **Duplicated or similar picture**: Find the same picture in OTMM or one similar, in more than a 98%, means that in a reused/old picture

Each time that a picture match one of the criteria the risk score is increased in 1 unit 

If a picture has a risk score of 4 or higher a task is assigned to an Inspector to review the incident. It�s a potential fraud.

> IMPORTANT: These add-on has been developed and tested on OTMM 20.3

If some bad words are found, It are stored in this custom fields: 

 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.NO.METADATA**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.PREVIOUS.EXIF.DATETIME**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DISTINCT.COORDINATES**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.EDITED**
 * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DUPLICATED**

> NOTE: These custom field must be created from TEAMS administration panel.

# Event handler registration
## Register event listener
1.	Copy this paragraph:

``` 
<!-- Custom event listener (Fraud Media Analysis) -->
<listener>
	<listener-class>com.opentext.otmm.sc.evenlistener.AnalysisDataFromAzureIsDeletedEventListenerRegistration</listener-class>
</listener>
```
 
2.	Open **web.xml** file located at **C:\Apps\MediaManagement\ear\artesia\otmmux\WEB-INF**
3.	Paste the paragraph under the **web-app** label

## log4j.xml

Log4j is a simple and flexible logging framework. The most common configuration options issuing  log4j.xml

Follow these steps:
1.	Copy these text:

``` 
<!-- Custom added by Joaqu�n -->
			
		
<logger name="com.opentext.otmm.sc.evenlistener">
	<level name="DEBUG"/>
	<appender-ref ref="console" />
	<appender-ref ref="file" />
</logger>
			
<logger name="com.opentext.otmm.sc.evenlistener.handler">
	<level name="DEBUG"/>
	<appender-ref ref="console" />
	<appender-ref ref="file" />
</logger>
			
<logger name="com.opentext.otmm.sc.evenlistener.helper">
	<level name="DEBUG"/>
	<appender-ref ref="console" />
	<appender-ref ref="file" />
</logger>
			
<logger name="com.opentext.otmm.sc.evenlistener.util">
	<level name="DEBUG"/>
	<appender-ref ref="console" />
	<appender-ref ref="file" />
</logger>
``` 

2.	Paste the paragraph before the **&lt;/log4j:configuration&gt;** label into **C:\Apps\MediaManagement_TomEE\conf\log4j.xml**


## Deploy event listener classes
1.	Open **Services** Desktop App
2.	Select **Star OpenText MediaManagement Service**
3.	Right click on **Star OpenText MediaManagement Service**
4.	Select **Stop** in order to stop the service
5.	Copy the folder structure under the **&lt;PROJECT_HOME&gt;\bin**
6.	Paste the **com** folder under **C:\Apps\MediaManagement\ear\artesia\otmmux\WEB-INF\classes**
7.	Restart  **Star OpenText MediaManagement Service** from **Services** Desktop App

![Star OpenText MediaManagement Service](images/0050-start-OpenText-Media-Management-Service.png)


# Media Management Administration

In order to store the Fraud Media Analysis (FMA) information you must create some metadata.


## Create a Metadata table: FRAUD_MEDIA_ANALYSIS_TAB

1. Access to TEAMS (<OTMM_SERVER>/teams)
2. Browse to **Metadata > Custom table editor** at the top menu
3. Click on **Metadata tables** at the left menu
4. Click on **New Metadata table** button
5. Create a new table called: **FRAUD_MEDIA_ANALYSIS_TAB**
6. Add two new fields:
   * **NO_METADATA** (CHARACTER) (Nullable)
   * **PREVIOUS_EXIF_DATETIME** (CHARACTER) (Nullable)
   * **DISTINCT_COORDINATES** (CHARACTER) (Nullable)
   * **EDITED** (CHARACTER) (Nullable)
   * **DUPLICATED** (CHARACTER) (Nullable)
7. Click on **Save** button

![New metadata table](images/0000-new-tabular-metadata-table-FRAUD_MEDIA_ANALYSIS_TAB.png)


## Create a Lookup Domain Table: FMA_CRITERIA_VALUE	

1. Browse to **Metadata > Custom Metadata editor** at the top menu
2. Click on **Lookup Domain Tables** at the left menu
3. Click on **New Lookup Domain Table** button
4. Create a new Lookup Domain Table called: **FMA_CRITERIA_VALUE**
   * **Name**:	FMA_CRITERIA_VALUE
   * **Domain Values**:	
      * false	|	false	|	false
      * true	|	true		|	true

5. Click on **Save** button

![New Lookup Domain Table FMA_CRITERIA_VALUE](images/0002-new-lookup-domain-table-FMA_CRITERIA_VALUE.png)


## Create a Lookup Domains: FMA.DOMAIN.CRITERIA_VALUE	

1. Browse to **Metadata > Metadata editor** at the top menu
2. Click on **Lookup Domain** at the left menu
3. Click on **New Lookup Domain** button
4. Create a new Lookup Domain called: **FMA.DOMAIN.CRITERIA_VALUE**
   * **Id**:	FMA.DOMAIN.CRITERIA_VALUE
   * **Cacheable**:	Checked
   * **Database Table**: FMA_CRITERIA_VALUE
   * **Id (Join) Column**: ID	
   * **Value (Display) Column**: VALUE
   * **Order By Column**: ID
   * **Query**: SELECT ID,VALUE FROM FMA_CRITERIA_VALUE ORDER BY ID	

5. Click on **Save** button  
    
![New metadata table](images/0004-new-lookup-omain-FMA.DOMAIN.CRITERIA_VALUE.png)


## Create custom Fields

1. Browse to **Metadata > Metadata editor** at the top menu
2. Click on **Fields** at the left menu
3. Click on **New Field** button
4. Create a new tabular field called: **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DISTINCT.COORDINATES**
   * **Id**:	CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DISTINCT.COORDINATES
   * **Name**:	Status
   * **Database Table**: FRAUD_MEDIA_ANALYSIS_TAB
   * **Data Type**: CHAR	
   * **Edit Type**: COMBO
   * **Lookup Domain**: FMA.DOMAIN.CRITERIA_VALUE
   * **Facetable**: Checked	
5. Click on **Save** button
6. Repeat previous steps for the other fields:
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.NO.METADATA**
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DUPLICATED**
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.EDITED**
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.PREVIOUS.EXIF.DATETIME**
      
![New tabular Field](images/0010-new-field-CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DISTINCT.COORDINATES.png)


## Create a Field Group: FMA.CATEGORY.CRITERIA	

1. Browse to **Metadata > Metadata editor** at the top menu
2. Click on **Field Groups** at the left menu
3. Click on **New Field Group** button
4. Create a new tabular Field group called: **FMA.CATEGORY.CRITERIA**
   * **Id**:	FMA.CATEGORY.CRITERIA
   * **Name**: Fraud Media Analysis Criteria
5. Click on **Available Tabular Fields** tab
6. Search **CUSTOM.FIELD.FRAUDANALYSIS** fields
7. Select these fields:
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DISTINCT.COORDINATES**
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.NO.METADATA**
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.DUPLICATED**
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.EDITED**
   * **CUSTOM.FIELD.FRAUDANALYSIS.PICTURE.PREVIOUS.EXIF.DATETIME** 
8. Click on **Add selected** button   
9. Click on **Save** button

![New Field Group](images/0020-new-group-FMA.CATEGORY.CRITERIA.png)


## Create a new Model: Car Crash Insurance Picture (CUSTOM.MODEL.CAR_CRASH_INSURANCE_PICTURE)		

1. Browse to **Metadata > Metadata editor** at the top menu
2. Click on **Models** at the left menu
3. Click on **New Model**
4. Search these fields and add them:
   * **Asset info**
   * **Fraud Media Analysis Criteria**
   * **Rights**
   * **Tag**
   * **Media Analysis**
   * **Embedded description**
   * **Embedded IPTC**
   * **Objects**
   * **Right & Permissions**
   * **Intelligent crop**                         
5. Click on **Add selected** button  
6. Click on **Save** button

![Edit Model](images/0030-edit-model-CUSTOM.MODEL.CAR_CRASH_INSURANCE_PICTURE.png)


## Create a new Property template: Car Crash Insurance Picture			

1. Browse to **Metadata > Property template** at the top menu
2. Click on **New property template**
3. Provide the required information:
   * **Info** Tab 
      * **Name**: Car Crash Insurance Picture 
   * **Properties** Tab
      * **Model**: Car Crash Insurance Picture                             
   * **Security** Tab
      * **Default Asset Policy**: checked
   * **User groups** Tab
      * Everyone       
4. Click on **Save** button

![Edit Model](images/0060-properties-template-OTMM.png)



## Validate and apply changes		

Once we have created all the metadata you must deploy your changes in your OTMM instance.

1. Browse to **Metadata > Metadata editor** at the top menu
2. Click on **Validate** button at the bottom of the screen 
3. Click on **Apply** button at the bottom of the screen

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
