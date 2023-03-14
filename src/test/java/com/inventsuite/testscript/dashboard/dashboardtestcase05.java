package com.inventsuite.testscript.dashboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class dashboardtestcase05 extends profilepage{
	
	@Test
	public void dashboardtestcase05() throws InterruptedException, AWTException
	{
		// checking by uploading different image
		Store s= new Store(driver);     
		
		Actions a= new Actions(driver);
		 profile p= new profile(driver);
		// WebElement list= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
		 
		  // Thread.sleep(10000);
		  //  a.moveToElement(list).click().perform();
		 
		 a.moveToElement(s.getStore_name()).click().perform();
		        Thread.sleep(5000);
		    Thread.sleep(3000);

		//clicking on edit button
		//  WebElement edit=driver.findElement(By.xpath("(//div[@class='MuiBox-root jss171 jss32'])[1]"));
//		  a.moveToElement(s.getStore_editicon()).click().perform();
//		  Thread.sleep(4000);
		    a.moveToElement(s.getStore_editicon()).click().perform();
		  
		  
		  s.getUploadlogo().click();
		  // locating text from upload logo
		  WebElement image_upload= driver.findElement(By.xpath("//span[@class='ml-2']"));
		  
		  Thread.sleep(4000);
			Robot robot = new Robot();
		    StringSelection stringSelection = new StringSelection("C:\\Users\\gloif\\Downloads\\nokia.jfif");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		    robot.delay(1000);
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    Thread.sleep(3000);
		    
		    System.out.println(image_upload.getText());
		    Assert.assertEquals(image_upload.getText(), "nokia.jfif");
		
          a.moveToElement(s.getUpdate_btn()).click().perform();
          
          WebElement success= driver.findElement(By.xpath("//div[@id='swal2-content']"));
          WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
          
           Thread.sleep(3000);
           
           Assert.assertEquals(success.getText(), "Company updated successfully");
           
           Thread.sleep(2000);
           
           ok_btn.click();
	}

}
