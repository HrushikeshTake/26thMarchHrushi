package kiteUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinpage 
{
	// 1. Data Members:
	
	@FindBy (id = "pin") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement continueButton;
	
	
	// 2. Constructor:
	
	public KitePinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3.Methods:
	
	public void sendPin(String pinUser )
	{
		pin.sendKeys(pinUser);
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	
	
	
	
	
	
	
}
