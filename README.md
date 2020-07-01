# cic2020interns_wk3 - Implementing COVID-19 API
## Java Mini-Challenge
https://api.covid19api.com/

## Scenario
You are a recently hired full stack developer giving the task of completing an API development user story started by a former colleague. You must complete the requirements of the user story and test to ensure all new and existing funtionality of the API.

## User Story 
 > As a React Native COVID-19 mobile developer, I want to use an API that I can receive a list of countries where I have provided the countries and whether they are compared by "Total Confirmed", "Total Deaths", or "Total Recovered" so that I can display the list in the mobile application.

### Sample UI
![Sample User Interface](https://media.github.ibm.com/user/203313/files/8ecc4a00-bb67-11ea-944a-17d4b83d1486)

### Developer's Notes
> "Hey, I pretty much finished everything except the comparison API. Pretty easy and I already created the payload. You just need to implement the getComparison method in Covid19ApiServiceImpl to return a the list of countries sorted by the CompareBy enum."

> "Oh yeah, I left my Postman collection for you to use."

> "Good luck! J!"

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
