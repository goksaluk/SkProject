Sky Task Article API Rest Service Testing Exercise / Instructions
Codes and Tests Prepared by:
Goksal Cavdar o

Test Automation Engineer

gksl.cavdaro@gmail.com

https://www.linkedin.com/in/goksal-cavdar-o

- Build Tool: Maven 
- Dependencies : RestAssured , Cucumber J-Unit, Cucumber Java
- Test Framework: Cucumber BBD (with Junit Assertions)
- Designe Pattern: Page Object Model



Api REST BaseURI :
https://5f99522350d84900163b8737.mockapi.io/

Endpoint for Test:
list_of_articles_endpoint =tech-test/articles
single_article_endpoint =tech-test/articles/2

QA:
Test endpoints return data in JSON format and only support HTTP GET methods.
Attempting a POST, PUT or DELETE request on these endpoints will return a HTTP 404.

Acceptance Criteria:
- Both endpoints should only support HTTP GET methods. 
- Attempting a POST, PUT or DELETE requests, status code should be 404 or 400
- Content type type should be Json
- Payload shouldn't be empty
- End the API Session

System Requirements:
Java 8+ SDK
Test RUN

Notes: 
1-To run all List of article API Scenarios, use @listofarticles , to run positive scenario use {"@listofarticles","@positive"},
  to run negative scenario use {"@listofarticles","@negative"} tag in the CukesRunner class/Cucumber Options
2-To run all List of article API Scenarios, use @singleofarticles , to run positive scenario use {"@singleofarticles","@positive"},
  to run negative scenario use {"@singleofarticles","@negative"} tag in the CukesRunner class/Cucumber Options

Cucumber Test Feature Scenarios for both list of article and single article
Positive Scenarios
1) I set the API BaseURI 
2) I sent the request with "Get" to both the single article and list of articles endpoints
3) I saw that the status codes are 200 
4) Content type is Json
5) Body is not empty

Negative Scenarios
1) I set the API BaseURI 
2) I sent POST, PUT, DELETE HTTP requests to both "list_of_articles_endpoint" and "single_article_endpoint"
3) I verified the status codes should be 400 ( PUT and DELETE for list articles and POST for single article ) 
   and 404 (POST for list articles and PUT and DELETE for single article )
   
Notes: 
1)In general, I use the Page Object Model since it provides convenience to my UI, API and Database tests. In this model, 
  I usually put the assertions and my little codes in the step_definitions package. 
  I put my main codes and implementions in the pages package and call from there. 
2)In my Hooks class I normally have @before and @after methods and screenshoot. Here, it made more sense for me to access
  baseURI from within the pages package.
3)I put all my test scenarios in Features files.
4)I put sensitive url and endpoint in the Configuration.properties
5)I am using ConfigurationReader class to reach my properties file.
6)I added my dependencies in pom.xml file
7)I can easily access my reports from within the Target folder.
8)If I had chosen TestNG, I could have collected all my tests in a single class.    
   
