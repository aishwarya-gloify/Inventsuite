package com.inventsuite.testscript.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class dashboardtestcase03 extends profilepage{
	
	@Test
	public void dashboardtestcase03() throws InterruptedException
	{
		
		//clearing compay name
		Store s= new Store(driver);
        Actions a=new Actions(driver);



     profile p= new profile(driver);
 WebElement list= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
   Thread.sleep(10000);
    a.moveToElement(list).click().perform();
        Thread.sleep(5000);
    Thread.sleep(3000);

//clicking on edit button
  WebElement edit=driver.findElement(By.xpath("(//div[@class='MuiBox-root jss171 jss32'])[1]"));
  a.moveToElement(edit).click().perform();
    Thread.sleep(4000);
    
//    // s.getCmpname().clear();
//     Thread.sleep(5000);
//     System.out.println("message"+s.getCmpname().getAttribute("value"));
//       Thread.sleep(3000);
//    //s.getUpdate_btn().click();
    
    Thread.sleep(5000);
   //  Assert.assertEquals(s.getCompanynamevalidation().getText(), "Name Cannot be empty" );
    
//     s.getCmpname().clear();
     Thread.sleep(4000);
    s.getCmpname().sendKeys(Keys.CONTROL+"a");
    s.getCmpname().sendKeys(Keys.DELETE);
//   // s.getCmpname().sendKeys(" ");
    
   System.out.println("message"+ s.getCmpname().getAttribute("value")+"end");
//    
    Thread.sleep(4000);
//    
    a.moveToElement(s.getUpdate_btn()).click().perform();
  //s.getUpdate_btn().click();
  Thread.sleep(8000);
    Assert.assertEquals(s.getCompanynamevalidation().getText(), "Name Cannot be empty" );
    
    
//   WebElement cmpname= driver.findElement(By.xpath("//input[@placeholder='Enter Company Name']"));
//   cmpname.clear();
//   
//   Thread.sleep(3000);
//   WebElement update= driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text submitBtn px-3 ml-3']"));
//   update.click();
//   
//   Thread.sleep(4000);
//  s.getCmpname().clear();
//  Thread.sleep(2000);
//  
//  //clicking on update button
//  
//  s.getUpdate_btn().click();
//  Thread.sleep(2000);
//  
//  Assert.assertEquals(s.getCompanynamevalidation().getText(), "Name Cannot be empty");
	}

}
