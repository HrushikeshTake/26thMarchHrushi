package failedTCStudyXML;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedClass {
  @Test
  public void RadioButtonValidate() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
//		if(radioButton.isSelected())
//		{
//			Reporter.log("TC Passed",true);
//		}
//		else
//		{
//			Reporter.log("TC Failed",true);
//		}
		
		
		
  }
}
