package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsUse {
	@Test
	  public void d()
	  {
		  Reporter.log("D is Running ",true);
	  }
	  
	  @Test(dependsOnMethods = {"d"})
	  public void a() throws InterruptedException
	  {
		  Reporter.log("A is Running ",true);
	  }
	  
	  @Test(dependsOnMethods = {"a"})
	  public void v()
	  {
		  Reporter.log("V is Running ",true);
	  }
}
