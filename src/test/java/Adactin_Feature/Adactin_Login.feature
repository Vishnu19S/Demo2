@ad1
Feature: I have to validate the Login credentials
Scenario: Login should be success
Given I am going to Launching the URL
When  I am entering the username
And I am entering the Password
Then click the Login option  


@ad2
Scenario: Successful Hotel Search
 
  When User select the location from the dropdown
    And choose a specific hotel
    And select the room type
    And specify the number of rooms
    And provide the check-in date
    And provide the check-out date
    And select the number of adults per room
    And select the number of children per room
    And click the search button
  Then the search should be successful

  


