package aaKiteTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aaKiteBase.KiteBaseClass;
import aaKitePOM.KiteLoginPage;
import aaKitePOM.KiteMainPage;
import aaKitePOM.KitePinpage;
import aaKiteUtility.KiteUtility;

public class ValidateKiteUserID_TestNG  extends KiteBaseClass
{
	KiteLoginPage login;
	KitePinpage pin;
	KiteMainPage home;
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		Reporter.log("Browser Open Successful",true);
		
		login=new aaKitePOM.KiteLoginPage(driver);//Change visibility of driver  to 'Protected'
		pin=new KitePinpage(driver);
		home=new KiteMainPage(driver);	
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(KiteUtility.readDataFromExcel(0, 0));
		login.sendPassword(KiteUtility.readDataFromExcel(0, 1));
		login.clickSubmitButton();
		Reporter.log("UID, Password Enter & Submit Button click ",true);
		
		KiteUtility.callImplicitWait(driver, 2000);

		pin.sendPin(KiteUtility.readDataFromExcel(0, 2));
		pin.clickContinueButton();
		Reporter.log("PIN Enter & Continue Button click",true);	
	}
	
	
	@Test
	public void validateUserID() throws InterruptedException, EncryptedDocumentException, IOException 
	{		
		Assert.assertEquals(home.getActualUserName(),KiteUtility.readDataFromExcel(0, 0),"ActualUID and ExpectedUID not Equal TC Failed");
		Reporter.log("ActualUID and ExpectedUID Equal TC Passed",true);	
		KiteUtility.CaptureScreenshot(driver, "TC01");
	}
	
	@AfterMethod
	public void logoutFromKite() throws InterruptedException
	{
		home.logOut();
		Reporter.log("Logout From Kite Successful",true);
	}
  
  
	@AfterClass
	public void closeBrowser()
	{
		KiteUtility.closeBrowser(driver);
	}
}
