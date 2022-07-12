package aaKiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class KiteBaseClass 
{
	//Launching Step
	 protected WebDriver driver;
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\chromedriver.exe");
	
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--start-maximized");
		
		driver=new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		
		Reporter.log("Browser launch SuccessFully : ",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
