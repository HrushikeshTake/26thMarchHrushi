package seriesAndParallelExecutionStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myTestClass1 {
	@Test
	public void h()
	{
		Reporter.log("H is Running ( Regression ) ",true);
	}
	
	@Test
	  public void r()
	  {
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
	  }}
