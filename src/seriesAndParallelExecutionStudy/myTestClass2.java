package seriesAndParallelExecutionStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myTestClass2
{
	@Test 
	public void TC1()
	{
		Reporter.log("TC1 is Running ( Regression )",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("TC2 is Running ( Regression )",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("TC3 is Running ( Sanity )",true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("TC4 is Running ( Sanity )",true);
	}
	
	@Test(groups = {"Sanity"})
	public void TC5()
	{
		Reporter.log("TC5 is Running ( Sanity )",true);
	}
	
	@Test(groups = {"Regression"})
	public void TC6()
	{
		Reporter.log("TC1 is Running ( Regression )",true);
	}
}
