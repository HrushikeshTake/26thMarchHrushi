package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest 
{
  @Test
  public void myTest1() throws InterruptedException
  {
	  System.setProperty("webdriver.edge.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\msedgedriver.exe");
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://courses.letskodeit.com/practice");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(500);
	  
  }
}
