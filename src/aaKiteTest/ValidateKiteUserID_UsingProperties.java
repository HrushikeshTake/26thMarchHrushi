package aaKiteTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import aaKiteBase.KiteBase_Prop;
import aaKitePOM.KiteLoginPage;
import aaKitePOM.KiteMainPage;
import aaKitePOM.KitePinpage;
import aaKiteUtility.KiteUtiity_Prop;



public class ValidateKiteUserID_UsingProperties extends KiteBase_Prop
{
	KiteLoginPage login;
	KitePinpage pin;
	KiteMainPage main;

	
	@BeforeClass
	public void launchBrowser() throws IOException 
	{
		openChromeBrowser();
		//openFireFoxBrowser();
		Reporter.log("*Browser Launch Successfully",true);
		
		login=new KiteLoginPage(driver);
		pin=new KitePinpage(driver);
		main=new KiteMainPage(driver);	
		
	}
	
	@BeforeMethod
	public void LoginKite() throws IOException 
	{
		
		login.sendUserName(KiteUtiity_Prop.getDataFromPropertyFile("UID"));
		login.sendPassword(KiteUtiity_Prop.getDataFromPropertyFile("PWD"));
		login.clickSubmitButton();
		Reporter.log("*UID, Password Enter & Submit Button click ",true);
		
		KiteUtiity_Prop.callImplicitWait(driver, 2000);
		
		pin.sendPin(KiteUtiity_Prop.getDataFromPropertyFile("PIN"));
		pin.clickContinueButton();
		Reporter.log("*PIN Enter & Continue Button click",true);	
		
		KiteUtiity_Prop.callImplicitWait(driver, 2000);
		
	}

	@Test
	public void ValidateUserID() throws InterruptedException, IOException 
	{
		
		Assert.assertEquals(main.getActualUserName(), KiteUtiity_Prop.getDataFromPropertyFile("UID"),"*ActualUID and ExpectedUID not Equal TC Failed");
		Reporter.log("*ActualUID and ExpectedUID Equal TC Passed",true);	
	
		
		
		
		
	}
	@AfterMethod
	public void logoutKite() throws InterruptedException 
	{
		
		main.logOut();
		KiteUtiity_Prop.callImplicitWait(driver, 2000);
		Reporter.log("*Logout Kite Successfully",true);
		
	}
	@AfterClass
	public void closeBrowser() 
	{
		
		KiteUtiity_Prop.closeBrowser(driver);
		Reporter.log("*Browser Close Successfully",true);
		
	}
}
