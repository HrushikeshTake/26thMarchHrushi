package assertionStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull_MethodUse {
  @Test
  public void myStudy() 
  {
	  String s1=null;
	  String s2="Hrushi";
	  
//	  Assert.assertNull(s2, "Value is Not Null TC Failed");
//	  Reporter.log("Value is null TC Passed",true);
	  
	  Assert.assertNotNull(s1, "Value is Null Tc Failed");
	  Reporter.log("Value is not null TC Passed",true);
	  
	  
  }
}
