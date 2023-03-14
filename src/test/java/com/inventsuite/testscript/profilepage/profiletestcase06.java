package com.inventsuite.testscript.profilepage;



import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;

//Need to check 2nd test case

public class profiletestcase06 extends profilepage{
	@Test (priority = 0)
	public void profiletestcase0601() throws InterruptedException, EncryptedDocumentException, IOException
	{
		profile p= new profile(driver);
		Reporter.log("changepwd", true);
		System.out.println("testing29");
	
		
		p.getUserimg().click();
	     Thread.sleep(4000);
	     FileLib f= new FileLib();
	     
	     Thread.sleep(3000);
			p.getMy_profile_btn().click();
			
			Thread.sleep(3000);
			p.getMyprofile_editbtn().click();
	     p.getName().sendKeys(Keys.CONTROL+"a");
	     p.getName().sendKeys(Keys.DELETE);
	     
	     p.getLast_nametxtbx().sendKeys(Keys.CONTROL+"a");
	     p.getLast_nametxtbx().sendKeys(Keys.DELETE);
	     
	     p.getPhone_notxtbx().sendKeys(Keys.CONTROL+"a");
	     p.getPhone_notxtbx().sendKeys(Keys.DELETE);
	     
	     Thread.sleep(3000);
	     p.getUpdate_btn().click();
	     
	     WebElement warning= driver.findElement(By.xpath("//div[@id='swal2-content']"));// Please provide Last Name , Please provide First Name, Please provide valid phone number
	     WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	     
	     Assert.assertEquals(warning.getText(), "Please provide Last Name");
	     Thread.sleep(3000);
	     ok_btn.click();
	     Thread.sleep(1000);
	     
	     String data1= f.getExcelData("profile", 2, 2);
	     
	     p.getName().sendKeys(data1);
	     Thread.sleep(3000);
	     p.getUpdate_btn().click();
	     
//	     Assert.assertEquals(warning.getText(), "Please provide Last Name");
//	    Actions a= new Actions(driver);
//	    System.out.println("testing1");
//	    a.moveToElement(ok_btn).click().perform();
//	    System.out.println("testing");
//	     Thread.sleep(3000);
//	     
//	     System.out.println("testing2");
	 String warning2= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
	 Assert.assertEquals(warning2, "Please provide Last Name");
	     WebElement ok= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	  ok.click();
	  Thread.sleep(3000);
	  
	     String data2= f.getExcelData("profile", 3, 3);
	     p.getLast_nametxtbx().sendKeys(data2);
	     Thread.sleep(2000);
	     p.getUpdate_btn().click();
	     
	     String warning3= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
	     Assert.assertEquals(warning3, "Please provide valid phone number.");
	     driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	     
	     
	     double data3=f.getExcelData2("profile", 5, 5);
	     
	     String t1= Double.toString(data3);
	     p.getPhone_notxtbx().sendKeys(t1);
	     
	     Thread.sleep(3000);
	     
	     p.getUpdate_btn().click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	     
	     //selecting country
	     Select s= new Select(p.getSelect_country());
	     
	     s.selectByVisibleText("India");
	     Thread.sleep(3000);
	     p.getPhone_notxtbx().sendKeys(t1);
	     Thread.sleep(2000);
	     p.getUpdate_btn().click();
	     
	     Assert.assertEquals(p.getSuccess_msg().getText(), "Profile details updated.");
	     driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	     
	     p.getUserimg().click();
	     Thread.sleep(4000);
	        
	     Thread.sleep(1000);
			p.getMy_profile_btn().click();
			
			Thread.sleep(2000);
			Assert.assertEquals(p.getMyprofile_nametxt().getText(), data1.concat(" ").concat(data2));
			
	}
	
	@Test(priority=1)
	public void profiletestcase0602() throws InterruptedException, EncryptedDocumentException, IOException
	{
		profile p= new profile(driver);
		Reporter.log("changepwd", true);
		System.out.println("testing29");
	
		
		p.getUserimg().click();
	     Thread.sleep(4000);
	     FileLib f= new FileLib();
	     
	     Thread.sleep(3000);
			p.getMy_profile_btn().click();
			p.getMyprofile_editbtn().click();
			Thread.sleep(3000);
			p.getName().sendKeys(Keys.CONTROL+"a");
		     p.getName().sendKeys(Keys.DELETE);
		     
		     p.getLast_nametxtbx().sendKeys(Keys.CONTROL+"a");
		     p.getLast_nametxtbx().sendKeys(Keys.DELETE);
		     
		     p.getPhone_notxtbx().sendKeys(Keys.CONTROL+"a");
		     p.getPhone_notxtbx().sendKeys(Keys.DELETE);
		     
		     p.getNick_nametxtbx().sendKeys(Keys.CONTROL+"a");
		     p.getNick_nametxtbx().sendKeys(Keys.DELETE);
		     
		String data1= f.getExcelData("profile", 6, 2);
		String data2= f.getExcelData("profile", 6, 3);
		String data3=f.getExcelData("profile", 6, 4);
		double data4= f.getExcelData2("profile", 6, 5);
		
		String t1=Double.toString(data4);
		p.getName().sendKeys(data1);
		p.getLast_nametxtbx().sendKeys(data2);
		p.getNick_nametxtbx().sendKeys(data3);
		Select s= new Select(p.getSelect_country());
	     
	     s.selectByVisibleText("China");
	     p.getPhone_notxtbx().sendKeys(t1);
	     Thread.sleep(3000);
	     p.getUpdate_btn().click();
	     Assert.assertEquals(driver.findElement(By.xpath("//div[@id='swal2-content']")).getText(), "Please provide valid phone number.");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	     
	     Thread.sleep(3000);
	     double data6= f.getExcelData2("profile", 7, 5);
			
			String t2=Double.toString(data6);
			p.getPhone_notxtbx().sendKeys(Keys.CONTROL+"a");
		     p.getPhone_notxtbx().sendKeys(Keys.DELETE);
		     s.selectByVisibleText("China");
		     p.getPhone_notxtbx().sendKeys(t2);
		     Thread.sleep(2000);
		     
		     p.getUpdate_btn().click();
		     Assert.assertEquals(driver.findElement(By.xpath("//div[@id='swal2-content']")).getText(), "Please provide valid phone number.");
		     
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		     
			
	}
	
	
	
}
