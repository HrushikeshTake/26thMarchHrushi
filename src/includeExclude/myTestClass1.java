package includeExclude;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class myTestClass1 {

	
	@Test
	  public void d()
	  {
		  Reporter.log("D is Running ",true);
		  
	  }
	  
	  @Test
	  public void a() throws InterruptedException
	  {
		  Reporter.log("A is Running ",true);
		  
		 
	  }
	  
	  @Test
	  public void v()
	  {
		  Reporter.log("V is Running ",true);
	  }
}
