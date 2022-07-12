package aalistenersStudy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import aaKiteBase.KiteBase_Prop;
import aaKiteUtility.KiteUtility_Listener;

public class Listener extends KiteBase_Prop implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Welcome TC Passed TC name is "+result.getName(),true);
		/*Reporter.log(result.getHost(),true);
		Reporter.log(result.getInstanceName(),true);
		Reporter.log(""+result.getStatus(),true);
		Reporter.log(""+result.getEndMillis(),true);
		Reporter.log(""+result.getStartMillis(),true);
		Reporter.log(""+result.getTestName(),true);
		
		Reporter.log(""+result.hashCode(),true);
		Reporter.log(""+result.getInstance(),true);
		Reporter.log(""+result.isSuccess(),true);
		Reporter.log(""+result.wasRetried(),true);
		Reporter.log(""+result,true);*/

	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{

		String TCName = result.getName();
		try {

			KiteUtility_Listener.CaptureScreenshot(driver,TCName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("== TC Failed ScreenShot Taken, Tc name is "+result.getName(),true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log(" TC Skiped TC name is "+result.getName(),true);
	}
	//***********************************************************************************
	
	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart Use",true);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish Use",true);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("onTestStart use",true);
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage use",true);
	}
	
	
	
	
	
	
	
	
	
	
	
}
