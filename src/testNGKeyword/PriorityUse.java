package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse
{
  @Test(priority = 2)
  public void d()
  {
	  Reporter.log("D is Running ",true);
  }
  
  @Test
  public void a()
  {
	  Reporter.log("A is Running ",true);
  }
  
  @Test(priority = -2)
  public void v()
  {
	  Reporter.log("V is Running ",true);
  }
}
