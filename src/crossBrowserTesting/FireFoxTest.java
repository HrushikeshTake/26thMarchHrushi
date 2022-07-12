package crossBrowserTesting;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void f() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://courses.letskodeit.com/practice");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(500);
	  
  }
}
