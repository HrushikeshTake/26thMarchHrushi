package practiceMockCombine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage
{

	@FindBy (id = "pin") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement continueButton;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(WebDriver driver,Actions act)
	{
		act.sendKeys(pin, "866918").perform();;
	}
	
	public void clickContinueButton(WebDriver driver,Actions act)
	{
		act.moveToElement(continueButton).click().build().perform();
	}
	
	
	
}
