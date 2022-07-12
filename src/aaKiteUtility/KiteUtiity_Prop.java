
package aaKiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class KiteUtiity_Prop 
{
	//-->ReadFromPropert_File
	public static String getDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fInput=new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\myKiteData.properties");
		prop.load(fInput);
		String value = prop.getProperty(key);
		
		return value;	
	}
	
	//->ScreenShot:
	public static void CaptureScreenshot(WebDriver driver,String TCID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destini=new File("C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\KiteScreeshot\\KiteScreenshot"+TCID+".png");
		FileHandler.copy(source, destini);
	}
	
	//-->Close Browser
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	
	//-->WaitCall
	public static void callImplicitWait(WebDriver driver, long time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	
	
	

}
