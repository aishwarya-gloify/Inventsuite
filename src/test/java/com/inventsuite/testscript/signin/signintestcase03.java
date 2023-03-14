package com.inventsuite.testscript.signin;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.SignupPage;

public class signintestcase03 extends baseclass
{
 @Test
 
 public void testcase03() throws InterruptedException
 {
	 SignupPage signup= new SignupPage(driver);
	 
	 LoginPage l=new LoginPage(driver);
	 Actions(l.getSignup());
	 Thread.sleep(3000);
	 String email= signup.getEmail().getText();
	 String pwd= signup.getPwd().getText();
	 String conpwd=signup.getConpwd().getText();
	
	 
	 Thread.sleep(2000);
	 Assert.assertEquals(email, "");
	 Assert.assertEquals(pwd, "");
	 Assert.assertEquals(conpwd, "");
	 
 }
}
