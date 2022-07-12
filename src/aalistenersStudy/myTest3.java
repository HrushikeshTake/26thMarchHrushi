package aalistenersStudy;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(aalistenersStudy.Listener.class)
public class myTest3 
{
  @Test (invocationCount = 4)
  public void myMethodForListener() 
  {
	  
  }
  @Test
  public void myMethodForListener2() 
  {
	  System.out.println("/n=================================/n");
  }
  
//  1.onStart Use
//  2.onTestStart use
//  3.Welcome TC Passed TC name is myMethodForListener
//  2.onTestStart use
//  /n=================================/n
//  3.Welcome TC Passed TC name is myMethodForListener2
//  4.onFinish Use
}
