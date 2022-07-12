package assertionStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals_MethodUse {
  @Test
  public void myStudy() 
  {
	  String s1="Pune";
	  String s2="Pune1";
	  
	  //Assert.assertEquals(s1, s2);//-->Default Message
	 
	  //Assert.assertEquals(s1, s2,"Strings are not Equal TC Failed : ");//-->Customize Message
	 // Reporter.log("String are Equals TC Passed",true);
	  
	  Assert.assertNotEquals(s1, s2,"String are equal TC Failed");
	  Reporter.log("Strings are not equal TC Passed",true);
	  
  }
}
