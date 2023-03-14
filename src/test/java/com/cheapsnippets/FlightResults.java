package com.cheapsnippets;

import com.basepackage.BaseClass;
import com.pagelocators.FlightResult;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightResults extends FlightResult{

	
	@Given("Check the title of the page to verify it is on Results Page")
	public void check_the_title_of_the_page_to_verify_it_is_on_results_page() {
		FlightResult fr = new FlightResult();
		BaseClass.otherTab();
		
	    if(driver.getTitle().equals(fr.title)) {
	    	BaseClass.click(BaseClass.elementClickable(fr.dealClose));
	    }
		
		
	}

	@When("Sort the ticket price low to high")
	public void sort_the_ticket_price_low_to_high() {
		FlightResult fr = new FlightResult();
		BaseClass.click(fr.sort);
		BaseClass.click(fr.sortbyprice);
	}

	@Then("Choose the lowest price flight for Departure")
	public void choose_the_lowest_price_flight_for_departure() {
		FlightResult fr = new FlightResult();
		BaseClass.click(BaseClass.elementClickable(fr.departFlight));
	}

	@Then("Choose the Return Flight")
	public void choose_the_return_flight() {
		FlightResult fr = new FlightResult();
		BaseClass.click(BaseClass.elementClickable(fr.departFlight));
	}
}
