$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SingleArticleAPI.feature");
formatter.feature({
  "name": "Single Article Endpoint Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@singlearticle"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I set REST API url",
  "keyword": "Given "
});
formatter.match({
  "location": "com.SkyProject.step_definitions.SkyStepDefinitions.i_set_REST_API_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "get single article",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@singlearticle"
    },
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "I send the request with \"GET\" to \"single_article_endpoint\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.SkyProject.step_definitions.SkyStepDefinitions.i_send_the_request_with_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the single article",
  "keyword": "Then "
});
formatter.match({
  "location": "com.SkyProject.step_definitions.SkyStepDefinitions.i_get_the_single_article()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "status code should be \"200\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.SkyProject.step_definitions.SkyStepDefinitions.statusCodeShouldBe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "content type should be \"application/json\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.SkyProject.step_definitions.SkyStepDefinitions.contentTypeShouldBe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "article \"single\" shouldn\u0027t be empty",
  "keyword": "Then "
});
formatter.match({
  "location": "com.SkyProject.step_definitions.SkyStepDefinitions.articleShouldnTBeEmpty(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});