package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
	@Test
	  public void d()
	  {
		  Reporter.log("D is Running ",true);
	  }
	  
	  @Test(enabled = false)
	  public void a()
	  {
		  Reporter.log("A is Running ",true);
	  }
	  
	  @Test
	  public void v()
	  {
		  Reporter.log("V is Running ",true);
	  }
}
