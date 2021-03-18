
@wip
Feature:Adding  upcoming concerRecordings
  As a user I should be able to look for specific artist concert and record in exel sheet

  Scenario:Recording concert detail on excel
    Given user is on the landing page
    When user search for "halsey" in find concert box
    When user click on the upcoming events
    And user should see all the related result
    Then user should be able to write detail of the concert in exel sheet



