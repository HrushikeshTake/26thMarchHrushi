package assertionStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyRadioButton 
{
  @Test
  public void myStudy() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://courses.letskodeit.com/practice");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(500);
	  
	  WebElement BMWElement = driver.findElement(By.id("bmwradio"));
	  
	  if(BMWElement.isSelected())
	  {
		  Reporter.log("Element is selected",true);
	  }
	  else
	  {
		  Reporter.log("Element is not selected",true);
	  }
	  
	  //-->Using Assertion:
	  
	  Assert.assertTrue( BMWElement.isSelected(),"Element is not selected TC Failed");
	  Reporter.log("Element is selected TC Passed",true);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  Thread.sleep(5000);
	  driver.close();
  }
}
