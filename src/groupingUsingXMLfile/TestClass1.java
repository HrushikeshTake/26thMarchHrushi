package groupingUsingXMLfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1
{
	@Test(groups = {"Regression"})
	public void h()
	{
		Reporter.log("H is Running ( Regression ) ",true);
	}
	
	@Test(groups = {"Sanity"})
	  public void r()
	  {
		  Reporter.log("R is Running ( Sanity ) ",true);
	  }
	@Test(groups = {"Regression"})
	  public void u()
	  {
		  Reporter.log("U is Running ( Regression ) ",true);
	  }
	@Test(groups = {"Sanity"})
	  public void s()
	  {
		  Reporter.log("S is Running ( Sanity ) ",true);
	  }
	@Test
	  public void hi()
	  {
		  Reporter.log("HI is Running ( Regression ) ",true);
	  }
}
