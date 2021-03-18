Feature:adding artist in tracked list

  As a user I should be able to add  the artist

  @G21-107



  Scenario Outline:user should be able to add  artist
    Given user is on the landing page
    When user click on the artist
    When user enter  "<artistName>"
    When user click track button
    When user  click artist
    Then user sees the "<expectedArtist>"
    Then user delete added artist
    Examples:
      | expectedArtist | artistName   |
      | adele          | adele        |
      | jay-z          | jay-z        |
      | halsey         | halsey       |
      | drake          | drake        |
      | taylor swift   | taylor swift |
      | eminem         | eminem       |

		
		
		
		
		
		
		