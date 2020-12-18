@listofarticles
Feature: List of Article Endpoint Test

  Background:
    Given I set REST API url

  @positive
  Scenario: get list of article
    Then I send the request with "GET" to "list_of_articles_endpoint"
    Then I get the list of Articles
    And  status code should be "200"
    Then content type should be "application/json"
    Then article "list" shouldn't be empty


  @negative
  Scenario Outline: verify list of article endpoint with request <type>
    Then I send the request with "<request_type>" to "list_of_articles_endpoint"
    And status code should be "<status code>"


    Examples:
      | type           | request_type |status code|
      | Post_Request   | POST         |404        |
      | Put_Request    | PUT          |400        |
      | Delete_Request | DELETE       |400        |