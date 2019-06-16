package com.Theater.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.junit.Assert;


public class GuestDetails  extends BaseClass1{

	public GuestDetails(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.CSS,using="[class*='user-details-header'] [class*=' notranslate']")
	WebElement Header;
	
	@FindBy(how=How.CSS,using="[name*='First Name']")
	WebElement FirstName;
	
	@FindBy(how=How.CSS,using="[name*='Last Name']")
	WebElement LastName;
	
	@FindBy(how=How.CSS,using="[name='Email']")
	WebElement Email;
	
	@FindBy(how=How.CSS,using="[name*='Confirm Email']")
	WebElement ConfirmEmail;
	
	@FindBy(how=How.CSS,using="[name*='Phone']")
	WebElement Phonenumber;
	
	@FindBy(how=How.CSS,using="[id*='card-number']")
	WebElement Cardnumber;
	
	@FindBy(how=How.CSS,using="[id*='card-expiry']")
	WebElement ExpiryDate;
	
	@FindBy(how=How.CSS,using="[id*='card-name']")
	WebElement Cvv;
	
	@FindBy(how=How.CSS,using="[id*='card-name']")
	WebElement CardHolderName;
	
	@FindBy(how=How.CSS,using="[class*='product-page-center'] [class*='product-checkout'] [class*=' notranslate']")
	WebElement CompleteMyBooking;

	public void enteringUserDetails(){
		try{
			if((Header.getText()).equals("Enter guest details")){
				System.out.println("user is  on user details page");
				FirstName.sendKeys("Adithya");
				LastName.sendKeys("Machiraju");
				Email.sendKeys("adithya2905@gmail.com");
				ConfirmEmail.sendKeys("adithya2905@gmail.com");
				Phonenumber.sendKeys("7847828976");
				Cardnumber.sendKeys("4375515358077002");
				ExpiryDate.sendKeys("0221");
				Cvv.sendKeys("173");
				CardHolderName.sendKeys("M ADITHYA");
				CompleteMyBooking.click();
				
				
			}
			else{
				System.out.println("Header is "+Header.getText());
				System.out.println("user is not on user details page");
				Assert.assertTrue(false);

			}
		}
		catch(Exception e){
			System.out.println("Error is "+e.getMessage());
			Assert.assertTrue(false);
		}
	}
}
