package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallel 
{

	@Parameters("browserType")
  @Test
  public void Cross_Browser_Parallel(String name) throws InterruptedException 
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
	  driver.manage().window().maximize();
  }
/* ----------------XML File--------------------------------------------
 
  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">

  <test  name="Test1">
  <parameter name="browserType" value="Edge"></parameter>
  <classes>
  <class name="crossBrowserTesting.CrossBrowserParallel">
  </class>
  </classes>
  </test> <!-- Test -->
  
  <test  name="Test2">
  <parameter name="browserType" value="FireFox"></parameter>
  <classes>
  <class name="crossBrowserTesting.CrossBrowserParallel">
  </class>
  </classes>
  </test>
  
</suite> <!-- Suite -->
  
  
 
 */
	
	
	
	
	
	
	
	
	
	
	
}
