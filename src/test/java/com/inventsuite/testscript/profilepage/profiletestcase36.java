package com.inventsuite.testscript.profilepage;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.profile;

public class profiletestcase36 extends profilepage{
	
	@Test
	public void profiletestcase36() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("changepwd", true);
		System.out.println("testing29");
		
		profile p= new profile(driver);
		
		p.getUserimg().click();
	     Thread.sleep(4000);
	     p.getChange_pwd().click();
	     Thread.sleep(4000);
	     
	     FileLib f= new FileLib();
	     String data1=f.getExcelData("changepwd", 11, 2);
		 String data2= f.getExcelData("changepwd", 11, 3);
		 String data3=f.getExcelData("changepwd", 11, 4);
			
			Thread.sleep(3000);
			p.getCurrent_pwd().sendKeys(data1);
			p.getNew_pwd().sendKeys(data2);
			p.getConfirm_pwd().sendKeys(data3);
			
			Thread.sleep(3000);
			
			p.getChange_pwd_btn().click();
			Thread.sleep(5000);
			
			String successful_msg= driver.findElement(By.xpath("//h2[@id='swal2-title']")).getText();
			System.out.println(successful_msg);
			
			//Assert.assertEquals(successful_msg, "Password changed Successfully");
			
			WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
			ok_btn.click();
			Thread.sleep(3000);
			
			String current_url= driver.getCurrentUrl();
			
			String expected_url= "https://admin.gloify.co/login";
			
			Assert.assertEquals(current_url, expected_url);
			
			Thread.sleep(3000);
			
			LoginPage login= new LoginPage(driver);
			
			String data4= f.getExcelData("loginpage", 1, 2);
			//passing old pwd 
			String data5=f.getExcelData("changepwd", 11, 2);
			
			login.getUntbx().sendKeys(data4);
			login.getPwtbx().sendKeys(data5);
			Thread.sleep(3000);
			login.getLgbtn().click();
			Thread.sleep(2000);
			WebElement ok= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
			
			ok.click();
			
			login.getPwtbx().sendKeys(Keys.CONTROL+"a");
			login.getPwtbx().sendKeys(Keys.DELETE);
			
			Thread.sleep(3000);
			
			login.getPwtbx().sendKeys(data2);
			Thread.sleep(2000);
			
			login.getLgbtn().click();
			
			Thread.sleep(2000);
//			 WebElement ul = driver.findElement(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));
//				List<WebElement> listAll = ul.findElements(By.tagName("li"));
//				
//				//listing of all webelements
//				/*for (int i = 0; i < listAll.size(); i++) {
//					String text = listAll.get(i).getText();
//					System.out.println(text);
//
//				}*/
//				Actions a=new Actions(driver);
//				String storename = "Aj";
//				//String searchStore = "zepto";
//				//clicking on particular store
//				for (WebElement option : listAll) {
//					
//					if(option.getText().equals(storename)) 
//					{
//						System.out.println("Located element and clicked");
//						a.moveToElement(option).perform();
//						Thread.sleep(8000);
//						a.moveToElement(option).click().perform();
//						Thread.sleep(3000);
//						break;
//					}
//				}
				
				Thread.sleep(3000);
				p.getUserimg().click();
			     Thread.sleep(4000);
			     p.getChange_pwd().click();
			     Thread.sleep(4000);
			     
			     p.getCurrent_pwd().sendKeys(data2);
			    
			     p.getNew_pwd().sendKeys(data1);
			     p.getConfirm_pwd().sendKeys(data1);
			     
			     Thread.sleep(2000);
			     
			     p.getChange_pwd_btn().click();
			     Thread.sleep(2000);
			     
			     Assert.assertEquals(successful_msg, "Password changed Successfully");
	}

}
