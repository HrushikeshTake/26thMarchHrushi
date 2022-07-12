package practiceMockCombine;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	//1.Variable declare
	
	@FindBy (id = "userid") private WebElement userId;
	@FindBy (id = "password") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;
	
	
	//2.Constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//3.Method
	public void enterUserId(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(userId, "").keyDown(Keys.SHIFT).sendKeys("daa").keyUp(Keys.SHIFT).sendKeys("677").build().perform();;
	}
	
	public void enterPassword(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(password, "").keyDown(Keys.SHIFT).sendKeys("v").keyUp(Keys.SHIFT).sendKeys("elocity@123").build().perform();	
	}
	
	public void ClickloginButton(WebDriver driver,Actions act)
	{
		act.moveToElement(loginButton).click().build().perform();
		
		
	}
	

}
