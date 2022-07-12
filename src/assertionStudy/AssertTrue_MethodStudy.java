package assertionStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue_MethodStudy {
  @Test
  public void myStudy()
  {
	  Boolean s1=true;
	  Boolean s2=false;
	  
	  //Assert.assertTrue(s2);//-->Without Message:
	  
//	  Assert.assertTrue(s2, "Value is false TC Failed : ");
//	  Reporter.log("Value is true TC Passed",true);
	  
	  Assert.assertFalse(s1, "Value is true TC Failed");
	  Reporter.log("Value is False TC Passed");
	  
  }
}
