package com.invenstsuite.testscript.store;

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
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.fileupload;

public class editstoretestcase03 extends storebaseclass{
	@Test
	
	public void edittestcase03() throws InterruptedException, AWTException
	{
         Store s= new Store(driver);
		
		WebElement name_store= driver.findElement(By.xpath("//span[.='Aishwarya1']"));
		Actions act= new Actions(driver);
		act.moveToElement(name_store).perform();
		Thread.sleep(4000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Aishwarya1']/../../*[name()='svg' and @focusable='false']"))).click().perform();
        Thread.sleep(4000);
        
        WebElement image_upload= driver.findElement(By.xpath("//span[@class='ml-2']"));
        s.getUploadlogo().click();
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
	    
	    Thread.sleep(3000);
	    s.getUpdate_btn().click();
	    
        
      
	}

}
