package com.Theater.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectingDate extends BaseClass1 {

	public SelectingDate(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH,using="//span[contains(text(), '18')]")
	WebElement Date;

	@FindBy(how=How.XPATH,using="//*[@class='month-wrapper'][2]//span[contains(text(), '18')]")
	WebElement NextMonth;

	@FindBy(how = How.CSS,using="[class*='product-booking-header']")
	WebElement Header;

	@FindBy(how=How.CSS,using="[bookable*='true']")
	List<WebElement> AvailableSeats;
	
	@FindBy(how=How.CSS,using="[id*='SE-GRANDCIRCLE-J-32']")
	WebElement seat;
	
	@FindBy(how=How.CSS,using="[class*='next-button selectable']")
	WebElement Next;
	
	@FindBy(how=How.CSS,using="[class*='zoom-increase'] [id*='Capa_1']")
	WebElement Zoomin;
	
	@FindBy(how=How.CSS,using="[style*='border-color: rgb(214, 85, 122);'] [checked='non-checked']")
	WebElement Red;

	public void findAvailability(){
		try{
			Thread.sleep(10000);
			if((Header.getText()).equals("PICK A DATE")){
				System.out.println("Date pickers are displaying");
				NextMonth.click();
				Thread.sleep(10000);
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[frameborder='0']"))); // switch to  iframe
				System.out.print("SWITCHED TO IFRAME");
				
				seat.click(); // hard coded seat number here
				Thread.sleep(3000);
				driver.switchTo().defaultContent();
				Next.click();
				
				
			}
			else{
				System.out.println("Date pickers are Not displaying");
				Assert.assertTrue(false);
			}
		}

		catch(Exception e){
			System.out.println("Error is "+e.getMessage());
			Assert.assertTrue(false);
		}

	}


	/*public void randomSeatClick(List<WebElement> items){
		Random obj = new Random();
		int seat = obj.nextInt(items.size());
		WebElement number = items.get(seat);
		number.click();
	}*/

}

