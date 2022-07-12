package aaKiteTest;

public class XML_File 
{
	/*/-->For parameter
	
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite">
	  <test thread-count="5" name="Test">
	  
	  <parameter name="browserType" value="chrome"></parameter>
	  
	    <classes>
	      <class name="aaKiteTest.ValidateKiteUserId_Parameter"/>
	    </classes>
	  </test> <!-- Test -->
	</suite> <!-- Suite -->
	
	------------------------------------------------------------------------------------------------------------------*/
	
	/*/-->For parameter & Listener
	
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite">

	<listeners>
	<listener class-name="aalistenersStudy.Listener"></listener>
	</listeners>  

	<test thread-count="5" name="Test">
	  
	  <parameter name="browserType" value="chrome"></parameter>
	  
	    <classes>
	      <class name="aaKiteTest.ValidateKiteUserId_Parameter"/>
	    </classes>
	  </test> <!-- Test -->
	</suite> <!-- Suite -->
	
	
	/*------------------------------------------------------------------------------------------------------------------*/
	
	/*/-->For serial 
	
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite">

	<listeners>
	<listener class-name="aalistenersStudy.Listener"></listener>
	</listeners>  

	<test thread-count="5" name="Test1"> 
	  <parameter name="browserType" value="chrome"></parameter> 
	    <classes>
	      <class name="aaKiteTest.ValidateKiteUserId_Parameter"/>
	    </classes>
	  </test> <!-- Test -->
	  
	 <test thread-count="5" name="Test2">  
	  <parameter name="browserType" value="fireFox"></parameter>  
	    <classes>
	      <class name="aaKiteTest.ValidateKiteUserId_Parameter"/>
	    </classes>
	 </test> <!-- Test -->
	 
	</suite> <!-- Suite -->
	
	/*-------------------------------------------------------------------------------------------------------*/

	/*------------------------------------------------------------------------------------------------------------------*/
	/*/-->For Parallel
	
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite" parallel="tests">

	<listeners>
	<listener class-name="aalistenersStudy.Listener"></listener>
	</listeners>  

	<test  name="Test1"> 
	  <parameter name="browserType" value="chrome"></parameter> 
	    <classes>
	      <class name="aaKiteTest.ValidateKiteUserId_Parameter"/>
	    </classes>
	  </test> <!-- Test -->
	  
	 <test  name="Test2">  
	  <parameter name="browserType" value="fireFox"></parameter>  
	    <classes>
	      <class name="aaKiteTest.ValidateKiteUserId_Parameter"/>
	    </classes>
	 </test> <!-- Test -->
	 
	</suite> <!-- Suite -->
	
	/*----------------------------------------------------------------------------------------------------------------*/
	
	/*--> Include Exclude for 1 class:
	 
	 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
 <test thread-count="5" name="Test">
   <classes>
     <class name="includeExclude.myTestClass1">
     	<methods>
     		<!-- <include name="a"></include>-->
     		<exclude name="v"></exclude>
     	</methods>
     </class>
   </classes>
 </test> <!-- Test -->
</suite> <!-- Suite -->
	-->2. Classes
	
	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
 <test thread-count="5" name="Test">
   <classes>
     <class name="includeExclude.mytestClass2">
    	 <methods>
    	 	<include name="x"></include>
    	 	<include name="y"></include>
    	 </methods>
     </class>
     <class name="includeExclude.myTestClass1">
     	 <methods>
     	 	<exclude name="a"></exclude>
     	 </methods>   
     </class>
   </classes>
 </test> <!-- Test -->
</suite> <!-- Suite -->

/*----------------------------------------------------------------------------------------------------------------*/
/*--> Grouping 
 	<?xml version="1.0" encoding="UTF-8"?>

	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite">
	  <test thread-count="5" name="Test">
	  
	  	<groups>
	 		<run>
	 			 <include name="Sanity"></include>
	 		 </run>
	 	 </groups>
	 	 
	    <classes>
	      <class name="groupingUsingXMLfile.TestClass1"/>
	      <class name="groupingUsingXMLfile.TestClass2"/>
	    </classes>
	  </test> <!-- Test -->
	</suite> <!-- Suite -->
*/


}
