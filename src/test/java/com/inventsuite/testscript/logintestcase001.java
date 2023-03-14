package com.inventsuite.testscript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;
@Listeners(com.inventsuite.generics.Listener2.class)
public class logintestcase001 extends baseclass {
	@Test
	public void testcase() 
	{
		
		// checking email id and paswword id are blank
	LoginPage login=new LoginPage(driver);
	
    String email= login.getUntbx().getText();
    String pwd= login.getPwtbx().getText();
      Assert.assertEquals(email, "");
      Assert.assertEquals(pwd, "");
      
	
   
    
	
	
		
	}

}
