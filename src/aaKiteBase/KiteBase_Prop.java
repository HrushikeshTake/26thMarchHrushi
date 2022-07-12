package aaKiteBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import aaKiteUtility.KiteUtiity_Prop;

public class KiteBase_Prop 
{
	static protected WebDriver driver;
	
	public void openChromeBrowser() throws IOException
	{		
		System.setProperty(KiteUtiity_Prop.getDataFromPropertyFile("chromeKey"),KiteUtiity_Prop.getDataFromPropertyFile("ChromeValue"));
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		
		driver=new  ChromeDriver(opt);
		
		driver.get(KiteUtiity_Prop.getDataFromPropertyFile("URL"));
		
		KiteUtiity_Prop.callImplicitWait(driver, 2000);	
	}
	
	public void openFireFoxBrowser() throws IOException
	{		
		System.setProperty(KiteUtiity_Prop.getDataFromPropertyFile("fireFoxKey"),KiteUtiity_Prop.getDataFromPropertyFile("fireFoxValue"));
		driver=new  FirefoxDriver();
		
		driver.get(KiteUtiity_Prop.getDataFromPropertyFile("URL"));
		
		KiteUtiity_Prop.callImplicitWait(driver, 2000);	
	}

}
