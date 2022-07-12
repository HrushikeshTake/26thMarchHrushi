package practiceMockCombine;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestClass 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rushi\\eclipse-workspace\\HrushiSelenium\\selenium\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		
		
		//Dynamic
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		/*//getSize, print, setSize
		System.out.println("Size ="+driver.manage().window().getSize());
		//-->set
		Dimension d=new Dimension(1350, 700);
		driver.manage().window().setSize(d);
		
		//getposition, print, setposition
		System.out.println("Position = "+driver.manage().window().getPosition());
		Point p=new Point(10, 100);
		driver.manage().window().setPosition(p);*/
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUserId(driver);
		lp.enterPassword(driver);
		Actions act=new Actions(driver);
		lp.ClickloginButton(driver,act);
		
		
		PinPage pp=new PinPage(driver);
		pp.enterpin(driver, act);
		pp.clickContinueButton(driver, act);
		
		KiteHomePage kh=new KiteHomePage(driver);
		
		//kh.countOfImage();
		//Find Count Of image:
		/*List<WebElement> imglist = driver.findElements(By.tagName("img"));
		System.out.println(imglist.size());
		
		for(WebElement imge:imglist)
		{
			String textsrc = imge.getAttribute("src");
			System.out.println(textsrc);
		}*/
		
		//-->Scrolling
		//kh.Scrollpage(driver);
		//kh.ScrollIntoview(driver);
		Thread.sleep(3000);
		kh.explicitWaitcall(driver);
		
		Thread.sleep(5000);
		driver.close();

	}

}
