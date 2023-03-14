
Feature: This is to verify the Flights results page
  
  
  @Depart
  Scenario: Choosing Flight 
    Given Check the title of the page to verify it is on Results Page
    When Sort the ticket price low to high
    Then Choose the lowest price flight for Departure
    And Choose the Return Flight 
    
  
