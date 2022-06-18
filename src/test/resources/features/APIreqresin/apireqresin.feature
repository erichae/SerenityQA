Feature: API reqre.in

  Scenario: GET single user
    When I send GET to Get Single User
    Then The response should be 200
    And The response Body "data.id" should be 3
    And the response Body "data.email" should be "emma.wong@reqres.in"
    And The response Body JSONSchema is "get-single-user.json"