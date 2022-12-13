Feature: Login Failed

  Scenario Outline: Login failed by wrong username and password
    Given Login page is loaded successfully
    When I input organization name <org_name>
    And I input password <password>
    Then login failed and show validation password

Examples: 
      | org_name		| password	|
      | testonboard	| lima			|
      | testonboard	| 349)s			|