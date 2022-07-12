package kiteUsingTestNG;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteMainPage 
{
	// 1.Data members:
	
	@FindBy (xpath = "//span[@class='user-id']") private WebElement userNameButton;
	@FindBy (xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	// 2.Constructor:
	public KiteMainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods:
	
	public String getActualUserName() throws InterruptedException
	{
		String actualUserName = userNameButton.getText();
		return actualUserName;
	}
	
	public void logOut() throws InterruptedException
	{
		userNameButton.click();
		Thread.sleep(1000);
		logOutButton.click();
		
	}
	
	/*public void implicitTimeOutCall(WebDriver driver,long time)
	{
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}*/
	
	
	

	

}
