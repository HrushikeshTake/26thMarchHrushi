package testNGStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReport
{
  @Test
  public void reportTest() throws InterruptedException 
  {
	  	System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
	  	WebDriver driver=new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println("Print on Console ");
		Reporter.log("Print in Report Only ");
		Reporter.log("Print in Report & Console ",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Implicit Wait:
		
		driver.findElement(By.id("userid")).sendKeys("RUX915");
		driver.findElement(By.id("password")).sendKeys("Hrushi@777");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("pin")).sendKeys("140697");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement Holdings = driver.findElement(By.linkText("Holdings"));
		
		if(Holdings.getText().equals("Holdings"))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
		
		Holdings.click();
		
		 List<WebElement> HoldingsType = driver.findElements(By.xpath("//div[@class='su-select holdings-selector']//option"));
		 
		 System.out.println("Total Options = "+HoldingsType.size());
		 
		 for(WebElement hElem:HoldingsType)
		 {
			 //System.out.println(hElem.getText());
			 String name = hElem.getText();
			 
			 Reporter.log("#"+name,true);
			 
		 }
		
		 WebElement choice = driver.findElement(By.xpath("//div[@name='holdings-selector']//select"));
		 Select select=new Select(choice);
		 
		 select.selectByIndex(3);
		
  }
}
