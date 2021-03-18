

@G21-106
Feature:searching concert in any city and marked them as interested to check them out




  As a user, I should be able to search the concerts taking place in any city and mark them as interested


  Scenario: Searching the concert and mark them them as interested

    Given user is on the landing page
    When  user click  on locations1
    When user click on tracked_location
    When user search city "houston"
    When user click the track_location
   When user click on the traked city
     When user click on the tonight
    Then user sees "Concerts in Houston tonight"

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		