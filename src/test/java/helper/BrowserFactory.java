package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername){
		if(browsername.equalsIgnoreCase("firefox")){
			driver= new FirefoxDriver();		
		}
		else if(browsername.equalsIgnoreCase("chrome")){
			String exePath = "D://personals//Eclipse_mars//chromedriver_win32 (2)//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);	
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("IE")){
			driver= new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

}
