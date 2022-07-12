package annotationsStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationBasicEg1
{
  @Test
  public void validateUserId() 
  {
	  Reporter.log("User ID Validated ",true);
  }
  
  @Test
  public void validateDashBoard() 
  {
	  Reporter.log("DashBoard Validated ",true);
  }
  
  @BeforeMethod
  public void loginToKiteApp()
  {
	  Reporter.log("Kite Login Successful",true);
  }
  
  @AfterMethod
  public void logoutKiteApp()
  {
	  Reporter.log("Logout Successful",true);
  }
  
}
