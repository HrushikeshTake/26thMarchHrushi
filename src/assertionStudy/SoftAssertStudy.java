package assertionStudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy 
{
  @Test
  public void myTest1() 
  {  
	  String s1="Hrushi";
	  String s2="Hrushi";
	  String s3=null;
	
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertNull(s1, "Value is not Null TC Failed : ");
	  
	  soft.assertNotNull(s3, "Value is null TC Failed : ");
	  
	  //soft.assertAll();
	  
  }
  
  @Test
  public void myTest2() 
  {
	  boolean s4=true;
	  boolean s5=false;
	  
	  
	  SoftAssert soft=new SoftAssert();
	  
	  soft.assertTrue(s5, "Value is false TC Failed : ");
	  
	  soft.assertFalse(s4,"Value is true TC Failed : ");

	  
	 // soft.assertAll();
	  
  }
  
  
  
  
  
  
  
  
}
