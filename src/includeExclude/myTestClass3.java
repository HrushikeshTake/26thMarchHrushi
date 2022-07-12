package includeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class myTestClass3 {
	@Test
	  public void TC1()
	  {
		  Reporter.log("TC1 is Running ",true);
	  }
	  
	  @Test
	  public void TC2() throws InterruptedException
	  {
		  Reporter.log("TC2 is Running ",true);
	  }
	  
	  @Test
	  public void TC3()
	  {
		  Reporter.log("TC3 is Running ",true);
	  }
}
