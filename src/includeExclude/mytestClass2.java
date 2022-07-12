package includeExclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class mytestClass2 {
	@Test
	  public void x()
	  {
		  Reporter.log("X is Running ",true);
	  }
	  
	  @Test
	  public void y() throws InterruptedException
	  {
		  Reporter.log("Y is Running ",true);
	  }
	  
	  @Test
	  public void z()
	  {
		  Reporter.log("Z is Running ",true);
	  }
}
