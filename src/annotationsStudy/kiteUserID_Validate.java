package annotationsStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class kiteUserID_Validate 
{
	public WebDriver driver;
	
	String locationDriver="C:\\Users\\rushi\\eclipse-workspace\\SeleniumDailyPractice\\selenium\\chromedriver.exe";
	String url="https://kite.zerodha.com/";
	 @BeforeClass
	  public void launchbrowser() throws InterruptedException
	  {
		  	
			System.setProperty("webdriver.chrome.driver",locationDriver);
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");		
			driver=new ChromeDriver(option);
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			Reporter.log("Browser Launch Successfully",true);
			
			driver.findElement(By.id("userid")).sendKeys("RUX915");
			
			
			
	  }
	 
	 @BeforeMethod
	  public void loginKite() throws InterruptedException 
	  {
		 driver.findElement(By.id("password")).sendKeys("Hrushi@777");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
		  

		  driver.findElement(By.id("pin")).sendKeys("140697");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(2000);
		  Reporter.log("Login Successfull",true);

	  }
	
  @Test(priority = 1)
  public void validateUserId() throws InterruptedException
  {
	  WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		userName.click();
		Thread.sleep(2000);
		
		String actuaUserlId = userName.getText();
		String expectedUserId = "RUX915";

		Assert.assertEquals(actuaUserlId, expectedUserId,"User ID Miss-Match TC Failed");
		Reporter.log("User ID Match TC Passed",true);
		
  }
  @Test(priority = 2)
  public void validateDashBoard() throws InterruptedException
  {
	  WebElement dashBord = driver.findElement(By.linkText("Dashboard"));	
	  dashBord.click();
	  Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		userName.click();
		 Thread.sleep(2000);
		
		
  }
  

  @AfterMethod
  public void logoutKite()
  {
	  driver.findElement(By.xpath("//a[@target='_self']")).click();
	  
	  Reporter.log("Logout Successfull",true);
  }

 

  @AfterClass
  public void browserclose() 
  {
	 driver.close();
	  Reporter.log("Browser Close Successfully",true);
  }

}
