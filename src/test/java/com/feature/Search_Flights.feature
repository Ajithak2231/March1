
Feature: Booking a Trip 
				 

  
  Scenario: Booking a  trip with valid details
    Given Launch the Url of the page
    And   Choose round trip
    When  Entering source and destination of the trip
    And   Choosing the date of the trip
    And   Choose number of the passangers 
    Then  Click Search Flights
    

  

