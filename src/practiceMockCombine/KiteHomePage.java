package practiceMockCombine;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KiteHomePage
{
	
	@FindBy (tagName ="img") private WebElement image;
	@FindBy (xpath = "(//h2[@class='secondary-title'])[1]") private WebElement viewScroll;
	@FindBy (xpath = "(//h2[@class='secondary-title'])[2]") private WebElement explicitWait;
	
	
	public KiteHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void countOfImage()
	{
		String text = image.getAttribute("alt");
		System.out.println(text);
	}
	
	public void Scrollpage(WebDriver driver)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
	}
	
	public void ScrollIntoview(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true);",viewScroll);
		
		
	}
	
	public void explicitWaitcall(WebDriver driver)
	{
		WebDriverWait wdw=new WebDriverWait(driver, Duration.ofMillis(5000));
		wdw.until(ExpectedConditions.visibilityOf(explicitWait));
	}
	
	
	
	
	

}
