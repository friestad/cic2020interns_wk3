# cic2020interns_wk3 - Implementing COVID-19 API
## Java Mini-Challenge
https://api.covid19api.com/

## User Story
 
 > As a React Native COVID-19 mobile developer, I want to use an API that I can receive a list of countries where I have provided the countries and whether they are compared by "Total Confirmed", "Total Deaths", or "Total Recovered" so that I can display the list in the mobile application.

![Sample User Interface](https://media.github.ibm.com/user/203313/files/d7373800-bb66-11ea-971c-46ae01b014a3)

## Project Directory Structure 
```
C:.
+---java
¦   +---com
¦       +---ibm
¦           +---br
¦               +---cic
¦                   +---internship
¦                       +---covid             -- root package
¦                           +---api           -- for endpoints  
¦                           ¦   +---payload   -- for request payloads
¦                           +---model         -- for data models
¦                           +---service       -- for business functionality
+---resources                                 -- property and yaml files
```

## Project Files
```
C:.
+---java
¦   +---com
¦       +---ibm
¦           +---br
¦               +---cic
¦                   +---internship
¦                       +---covid
¦                           ¦   Covid19Application.java           -- starting point of application
¦                           ¦
¦                           +---api
¦                           ¦   ¦   ComparisonController.java     -- rest controller for comparison endpoint
¦                           ¦   ¦   SummaryController.java        -- rest controller for summary endpoint
¦                           ¦   ¦
¦                           ¦   +---payload
¦                           ¦           ComparisonPayload.java    -- request payload for comparison endpoint
¦                           ¦
¦                           +---model
¦                           ¦       CompareBy.java                -- enum of comparison by fields
¦                           ¦       Comparison.java               -- data model
¦                           ¦       Country.java                  -- data model
¦                           ¦       Global.java                   -- data model
¦                           ¦       Summary.java                  -- data model
¦                           ¦
¦                           +---service
¦                                   Covid19ApiService.java        -- service interface
¦                                   Covid19ApiServiceImpl.java    -- service implementation
¦
+---resources
    ¦   application.properties                                    -- application properties
```
