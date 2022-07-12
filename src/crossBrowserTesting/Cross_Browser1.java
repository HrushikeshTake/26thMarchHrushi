package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser1 
{
	@Parameters("browserType")
	
  @Test
  public void myTest(String name) throws InterruptedException 
  {
		WebDriver driver = null;
		
	  if(name.equals("FireFox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if(name.equals("Edge"))
	  {
	  
		  System.setProperty("webdriver.edge.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\msedgedriver.exe");
		  driver=new EdgeDriver();	  
	  }

	  driver.get("https://courses.letskodeit.com/practice");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(500);
	  
	  /* ----------------XML File--------------------------------------------
		
		<?xml version="1.0" encoding="UTF-8"?>
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
		<suite name="Suite">
  		<test thread-count="5" name="Test">
  		
  		<!--<parameter name="browserType" value="FireFox"></parameter>-->
  		<parameter name="browserType" value="Edge"></parameter>
  		
  		<classes>
  		<class name="crossBrowserTesting.Cross_Browser1">
  		</class>
  		</classes>
  		</test> <!-- Test -->
		</suite> <!-- Suite -->
   
	   */
	  
	  
  }
}
