package StepDefnitions;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Theater.pages.GuestDetails;
import com.Theater.pages.LondonTheaterHP;
import com.Theater.pages.SelectingDate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class VerifyTicketBookingSystem {

	public WebDriver driver;


	@Given ("^I launch the URL$")
	public void LaunchingURL(){	
		driver = Hooks.driver;
		
	}
	
	@When("^i am in HomePage find the search text and enter \"([^\"]*)\" in search and click on Booknow button$")
	public void homepage(String Moviename) throws InterruptedException{
		String title = "Book London Theater Tickets | Get Exclusive Deals & Offers";
		String Title = driver.getTitle();
		System.out.println("Title is "+Title);
		if(Title.equals(title)){
			System.out.println("Titles are equal");
			LondonTheaterHP londonTheaterHP = PageFactory.initElements(driver, LondonTheaterHP.class);
			londonTheaterHP.findingSearch();           // Finding search field on HomePage of London Theater
			londonTheaterHP.enterMovieName(Moviename); // Entering Movie name as "The Lion King " 
			londonTheaterHP.Booknow();                 //Clicking on Book Now button after searching Mvoie now
			Thread.sleep(2000);			
		}
		else{
			System.out.println("Titles are not equal");
			Assert.assertTrue(false);
		}
	}
	
	@Then("^select the date on which tickets available and select the seats$")
	public void selectDate(){
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1)); // switching to second tab which will open after clicking on Book now button
		SelectingDate selectingDate = PageFactory.initElements(driver, SelectingDate.class);
		selectingDate.findAvailability(); // Selecting next month 18th and seat number 
				
	}
	
	@Then("^Enter user and card details$")
	public void UserDetails() throws InterruptedException{
		Thread.sleep(4000);
		GuestDetails guestDetails = PageFactory.initElements(driver, GuestDetails.class);
		guestDetails.enteringUserDetails(); // Entering card details page
		
	}
}


