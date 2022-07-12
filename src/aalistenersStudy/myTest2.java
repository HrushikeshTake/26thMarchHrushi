package aalistenersStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(aalistenersStudy.Listener.class)
public class myTest2 
{
	  @Test
	  public void myMethod4() 
	  {
		  Reporter.log("This is myMethod4 ",true);
	  }
	  
	  @Test
	  public void myMethod5() 
	  {
		  Assert.fail();
		  Reporter.log("This is myMethod5 ",true);
	  }
	  
	  @Test(dependsOnMethods = {"myMethod5"})
	  public void myMethod6() 
	  {
		  Reporter.log("This is myMethod6 ",true);
	  }
	  
	  
	  /***********************    XML File        ************************* 
	  
	  
	  
	  
	  
	   */
	  
	  
	  
	  
}
