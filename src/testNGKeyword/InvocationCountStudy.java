package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy 
{
  @Test(invocationCount = 3)
  public void myTest()
  {
	  Reporter.log("Sanjay",true);
	  
  }
  
  @BeforeMethod
  public void beformyTest()
  {
	  Reporter.log("Hrushikesh",true);
  }
  
  @AfterMethod
  public void aftermyTest()
  {
	  Reporter.log("Take",true);
	  System.out.println();
  }
}
