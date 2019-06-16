/**
 * 
 */
package com.Theater.pages;

import org.openqa.selenium.WebDriver;

/**
 * @author adithya.machiraju
 *
 */
public class BaseClass1 {
	public static WebDriver driver;
	public static boolean bResult;

	public  BaseClass1(WebDriver driver){
		BaseClass1.driver = driver;
		BaseClass1.bResult = true;
	}

}
