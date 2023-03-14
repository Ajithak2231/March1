package com.cheapsnippets;

import com.basepackage.BaseClass;
import com.pagelocators.SearchFlights;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First_Search_Flights extends SearchFlights {

	@Given("Launch the Url of the page")
	public void launch_the_url_of_the_page() {
		try {
			BaseClass.launchBrowser();
			BaseClass.launchUrl(BaseClass.prop("Url"));
		} catch (Exception e) {
			BaseClass.log.error("Url not Launched " + e.getMessage());
		}
	}

	@Given("Choose round trip")
	public void choose_round_trip() {
		SearchFlights sf = new SearchFlights();
		try {
//	    	BaseClass.radioButton(sf.roundTrip);
		} catch (Exception e) {
//			BaseClass.log.error("Round Trip not Selected "+ e.getMessage());
		}
	}

	@When("Entering source and destination of the trip")
	public void entering_source_and_destination_of_the_trip() {

		try {
			SearchFlights sf = new SearchFlights();
			BaseClass.expWait(sf.from);
			BaseClass.clear(sf.from);
			BaseClass.textBox(sf.from, prop("From"));
			BaseClass.textBox(sf.to, prop("To"));
			BaseClass.jsClick(BaseClass.elementClickable(sf.delhi));
		} catch (Exception e) {
			BaseClass.log.error("Source and Destination Failed " + e.getMessage());
		}
	}

	@When("Choosing the date of the trip")
	public void choosing_the_date_of_the_trip() {

		try {
			SearchFlights sf = new SearchFlights();
			BaseClass.textBox(sf.dep, prop("Depart"));
			BaseClass.textBox(sf.rtrn, prop("Return"));
		} catch (Exception e) {
			BaseClass.log.error("Choosing the date of the trip Failed " + e.getMessage());
		}
	}

	@When("Choose number of the passangers")
	public void choose_number_of_the_passangers() {
		SearchFlights sf = new SearchFlights();
		BaseClass.click(sf.passngr);
		for (int i = 0; i < 5; i++) {
			BaseClass.click(BaseClass.elementClickable(sf.adults));
		}
		for (int i = 0; i < 1; i++) {
			BaseClass.click(BaseClass.elementClickable(sf.senior1));
		}

		for (int i = 0; i < 1; i++) {
			BaseClass.click(BaseClass.elementClickable(sf.child1));
		}
		for (int i = 0; i < 1; i++) {
			BaseClass.click(BaseClass.elementClickable(sf.infant1));
		}

		
	}

	@Then("Click Search Flights")
	public void click_search_flights() {
		SearchFlights sf = new SearchFlights();
		try {
			BaseClass.click(sf.search);
		} catch (Exception e) {
			BaseClass.log.error("Error on choosing SearchFlights " + e.getMessage());
		}
	}

}
