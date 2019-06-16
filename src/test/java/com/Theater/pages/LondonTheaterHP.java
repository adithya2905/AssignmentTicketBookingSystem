package com.Theater.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LondonTheaterHP extends BaseClass1{

	public LondonTheaterHP(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.CSS,using="[id*='search-form']")
	WebElement  Search;

	@FindBy(how=How.CSS,using="[class*='card tabbed active']")
	WebElement FirstBox;

	@FindBy(how= How.CSS,using="[class*='title spacer-l-30']")
	WebElement displayingTitle;
	
	@FindBy(how=How.CSS,using="[class*='cta'] [class*='button']")
	WebElement BookNow;
	
	@FindBy(how=How.CSS,using="[placeholder*='Search']")
	WebElement PlaceholderSearch;
	

	public void findingSearch(){
		try{
			if(Search.isDisplayed()){
				System.out.println("Search field is displaying");
			}
			else{
				System.out.println("Search Field is not displaying");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e){
			System.out.println("Error is "+e.getMessage());
		}
	}

	public void enterMovieName(String Movie){
		try{
			PlaceholderSearch.sendKeys(Movie);
			PlaceholderSearch.sendKeys(Keys.ENTER);	
			Thread.sleep(500);
		}
		catch(Exception e){
			System.out.println("Error message is "+e.getMessage());
			Assert.assertTrue(false);
		}
	}
	
	public void Booknow(){
		try{
			if((displayingTitle.getText()).equals("The Lion King")){
				System.out.println("Valid movie name is displaying");
				Thread.sleep(2000);
				BookNow.click();
				
			}
			else{
				System.out.println("Valid movie name is displaying");
				Assert.assertTrue(false);				
			}
		}
		
		catch(Exception e){
			System.out.println("Error message is "+e.getMessage());
			Assert.assertTrue(false);
		}
	}
}
