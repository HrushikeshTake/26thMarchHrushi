package failedTCStudyXML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass1 
{
	@Test
	public void h()
	{
		Assert.fail();
		Reporter.log("H is Running ( Regression ) ",true);
	}
	
	@Test
	  public void r()
	  {
		Assert.fail();
		  Reporter.log("R is Running ( Sanity ) ",true);
	  }
	@Test
	  public void u()
	  {
		  Reporter.log("U is Running ( Regression ) ",true);
	  }
	@Test
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
