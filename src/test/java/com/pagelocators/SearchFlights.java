package com.pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;

public class SearchFlights extends BaseClass {

	public SearchFlights() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='tgl-btn']")
	public WebElement roundTrip;
	
	@FindBy(xpath = "//input[@id='from1']")
	public WebElement from;
	
	@FindBy(id = "to1")
	public WebElement to;
	
	@FindBy(id = "departs")
	public WebElement dep;
	
	@FindBy(id = "returns")
	public WebElement rtrn;

	@FindBy(id = "options")
	public WebElement passngr;
	
	@FindBy(xpath="//a[text()='Madras, India'")
	public WebElement madras;
	
	@FindBy(xpath="//a[text()='Delhi, India']")
	public WebElement delhi;

	@FindBy(xpath="(//button[@type='button'])[2]")
	public WebElement adults;
	
	@FindBy(xpath="(//input[@id='seniors']/following-sibling::button)[2]")
	public WebElement senoirs;
	
	@FindBy(xpath="(//input[@id='children']/following-sibling::button)[2]")
	public WebElement children;
	
	@FindBy(xpath="(//input[@id='infants']/following-sibling::button)[2]")
	public WebElement infant;
	
	@FindBy(id="cabin")
	public WebElement cabin;
	public String cabinVal = "Y"; 
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement search;
	////////////////////////////////////////////////
	@FindBy(xpath="(//button[@data-trav-type='adults'])[2]")
	public WebElement adults1;
	
	@FindBy(xpath="(//button[@data-trav-type='seniors'])[2]")
	public WebElement senior1;
	
	@FindBy(xpath="(//button[@data-trav-type='children'])[2]")
	public WebElement child1;
	
	@FindBy(xpath="(//button[@data-trav-type='infants'])[2]")
	public WebElement infant1;

}
