package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudyUse {
		@Test
	  public void d()
	  {
		  Reporter.log("D is Running ",true);
	  }
	  
	  @Test(timeOut = 1000)
	  public void a() throws InterruptedException
	  {
		  Thread.sleep(1000);
		  Reporter.log("A is Running ",true);
	  }
	  
	  @Test
	  public void v()
	  {
		  Reporter.log("V is Running ",true);
	  }
}
