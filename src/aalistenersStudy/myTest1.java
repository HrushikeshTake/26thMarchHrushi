package aalistenersStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(aalistenersStudy.Listener.class)

public class myTest1
{
  @Test
  public void myMethod1() 
  {
	  Reporter.log("This is myMethod1 ",true);
  }
  
  @Test
  public void myMethod2() 
  {
	  Assert.fail();
	  Reporter.log("This is myMethod2 ",true);
  }
  
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("This is myMethod3 ",true);
  }
  /***********************    XML File        ************************* 
  
  <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<listeners>
		<listener class-name="aalistenersStudy.Listener"></listener>
	</listeners>
  <test thread-count="5" name="Test">
    <classes>
      <class name="aalistenersStudy.myTest1"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

  
  
  
  */
  
}
