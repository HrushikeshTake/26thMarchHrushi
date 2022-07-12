package kiteUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ValidateKiteAppUserName 
{
	WebDriver driver;
	KiteLoginPage login;
	KitePinpage pin;
	KiteMainPage home;
	Sheet mySheet;
	
	
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--incognito");
		driver=new ChromeDriver(opt);	
		driver.get("https://kite.zerodha.com/");
		Reporter.log("- Browser Launch Successfully ",true);
		
		//home.implicitTimeOutCall(driver, 2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		login=new KiteLoginPage(driver);
		pin=new KitePinpage(driver);
		home=new KiteMainPage(driver);
		
		File myFile=new File("C:\\Users\\rushi\\eclipse-workspace\\HrushiSelenium\\selenium\\ExcelSheet\\ZerodaData.xlsx");
	    mySheet=WorkbookFactory.create(myFile).getSheetAt(0);
		
		
		
	}
	@BeforeMethod
	public void loginToKiteApp()
	{
		String ID = mySheet.getRow(2).getCell(1).getStringCellValue();
	    String PWD = mySheet.getRow(2).getCell(2).getStringCellValue();
	    String PIN = mySheet.getRow(2).getCell(3).getStringCellValue();

		login.sendUserName(ID);
		Reporter.log("- UserID Enter ",true);
		login.sendPassword(PWD);
		Reporter.log("- PassWord Enter ",true);
		login.clickSubmitButton();
		Reporter.log("- Submit Button click ",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		pin.sendPin(PIN);
		Reporter.log("- Pin Enter ",true);
		pin.clickContinueButton();
		Reporter.log("- Continue Button click ",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		
	}
	@Test
	public void validateUserName() throws InterruptedException
	{

		String expectedUN = mySheet.getRow(2).getCell(1).getStringCellValue();
		String actualUn = home.getActualUserName();
		Reporter.log("Validating User ID",true);
		
		Assert.assertEquals(actualUn, expectedUN,"Actual and Expected user ID mismatch TC Fail");
		Reporter.log("Actual and Expected user ID match TC Pass",true);

	}
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{
		Thread.sleep(2000);
		home.logOut();
		Reporter.log("- Kite App Logout Successfully ",true);
	}
	
	@AfterClass
	public void logoutBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.close();
		Reporter.log("- Browser close Successfully ",true);
	}
	
}
