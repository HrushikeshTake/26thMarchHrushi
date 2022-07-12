package annotationsStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationBasicEg2 {
  @Test
  public void recharge() 
  {
	  Reporter.log("Airtel Rechange Successful",true);
  }
  @BeforeMethod
  public void loginToRechargePortal() 
  {
	  Reporter.log("Login to Paytm Successful",true);
	  
  }

  @AfterMethod
  public void logoutFromRechargePortal() 
  {
	  Reporter.log("Logout to Paytm Successful",true);
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Launch Chrome Browser",true);
	  
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("launch FireFox Browser",true);
	  
  }

}
