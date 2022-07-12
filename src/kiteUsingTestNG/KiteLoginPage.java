package kiteUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	
	//1.Data Member:
	
	@FindBy (id = "userid") private WebElement userName;
	@FindBy (id = "password") private WebElement passWord;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submitButton;
	
	
	//2.Constructor:
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods:
	public void sendUserName(String userId)
	{
		userName.sendKeys(userId);
	}
	
	public void sendPassword(String passwordUser)
	{
		passWord.sendKeys(passwordUser);
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}

}
