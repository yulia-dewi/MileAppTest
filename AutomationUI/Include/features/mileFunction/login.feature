Feature: Login Failed

  Scenario Outline: Login failed by wrong username and password
    Given Login page is loaded successfully
    When I input organization name <org_name>
    And I input username <user_email>
    And I input password <password>
    And I click button login
    Then login failed and show warning login_failed

Examples: 
      | org_name		| user_email					| password	|
      | testonboard	| wrong@yopmail.com		| katasandi |
      | testonboard	| correct@yopmail.com	| katasandi	|