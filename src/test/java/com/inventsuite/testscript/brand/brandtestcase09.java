package com.inventsuite.testscript.brand;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;
import com.inventsuite.pom.fileupload;

public class brandtestcase09 extends brandbaseclass{
	@Test
	public void brandtestcase09() throws InterruptedException, AWTException
	{
		// upload one image, and try to upload same image
		brand b= new brand(driver);
		FileLib f= new FileLib();
		Actions act= new Actions(driver);
		
		b.getAdd_brand_btn().click();
		Thread.sleep(3000);
        fileupload file= new fileupload();
		
		b.getImage_upload().click();
		file.uploadfile();
		Thread.sleep(4000);
		WebElement withput_crop= driver.findElement(By.xpath("//span[normalize-space()='Select without crop']"));
		withput_crop.click();
		Thread.sleep(3000);
		b.getImage_upload().click();
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
	    StringSelection stringSelection = new StringSelection("\"C:\\Users\\gloif\\Downloads\\nokia.jfif\"");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	    robot.delay(1000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(3000);
	    
	    WebElement cropping=driver.findElement(By.xpath("//span[normalize-space()='Crop Selection']"));
	    
	    cropping.click();
	    Thread.sleep(3000);
	    
	    String crop_text= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
	    WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
	    
	    Assert.assertEquals(crop_text, "Please crop the image according to Your requirement.");
	    ok_btn.click();
	    Thread.sleep(2000);
//	    System.out.println("test1");
//	   act.moveToElement(withput_crop).perform();
//	   act.moveToElement(withput_crop).click().perform();
	    WebElement without_crop= driver.findElement(By.xpath("//span[normalize-space()='Select without crop']"));
		without_crop.click();
	    Thread.sleep(2000);
	    System.out.println("test2");
	    b.getCreate_brand_btn().click();
	  // Assert.assertFalse(b.getImage_not_availabletext().isDisplayed());
	}

}
