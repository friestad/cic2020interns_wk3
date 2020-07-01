# cic2020interns_wk3

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
