@G21-104
Feature:Songkick login feature




  As a user, I should be able to login with correct credentials


  Scenario: Log in as a user
    Given user is on home page
    And user click on accept all cookies
    When user click on the login button
    When user enters username
    When user enters password
    When user click on the logIn button
    Then user sees "Home – Songkick" in the title
