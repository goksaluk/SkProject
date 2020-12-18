@singlearticle
Feature: Single Article Endpoint Test

  Background:
    Given I set REST API url

  @positive
  Scenario: get single article
    Then I send the request with "GET" to "single_article_endpoint"
    Then I get the single article
    And  status code should be "200"
    Then content type should be "application/json"
    Then article "single" shouldn't be empty



  @negative
  Scenario Outline: verify single article endpoint with below request <type>
    Then I send the request with "<request_type>" to "single_article_endpoint"
    And  status code should be "<status code>"

    Examples:
      | type           | request_type |status code|
      | Post_Request   | POST         |400        |
      | Put_Request    | PUT          |404        |
      | Delete_Request | DELETE       |404        |