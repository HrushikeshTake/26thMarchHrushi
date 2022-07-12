package aaKiteUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class KiteUtility 
{
	//excel
	//screenshot
	//closing
	
	//-->Read Data
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("C:\\Users\\rushi\\eclipse-workspace\\TestNGProject\\Selenium\\ExcelFile\\KiteData.xlsx");
		
		Sheet sheetKite = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		String value = sheetKite.getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}
	
	
	
	//--> For ScreenShot
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
	
	public static void callImplicitWait(WebDriver driver, long time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	

}
