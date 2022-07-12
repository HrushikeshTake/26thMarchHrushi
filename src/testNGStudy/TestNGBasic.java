package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGBasic
{
  @Test
  public void myTest1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
  }
  
  @Test
  public void myTest2() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
  }
}
