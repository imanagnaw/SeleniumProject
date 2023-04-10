Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | imy      |    12345 |
      | Ali      |    12345 |
# When user enters "imane" and "12345"