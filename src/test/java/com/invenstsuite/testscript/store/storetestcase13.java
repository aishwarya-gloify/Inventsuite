package com.invenstsuite.testscript.store;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.fileupload;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase13 extends storebaseclass{
	@Test
	
	public void testcase13() throws AWTException, EncryptedDocumentException, IOException, InterruptedException
	{
		// need to rework on scenario
		Store s= new Store(driver);
		fileupload f= new fileupload();
		FileLib f1= new FileLib();
		s.getAddstore().click();
		Thread.sleep(2000);
		System.out.println("testing started");
		String data1= f1.getExcelData("storecreate", 5, 2);
		String data2= f1.getExcelData("storecreate", 5, 3);
		String data3= f1.getExcelData("storecreate", 5, 4);
		
		
		s.getCmpname().sendKeys(data1);
	//System.out.println(s.getCmpname().getText());
	//Reporter.log(s.getCmpname().getText());
		
		//Reporter.log(s.getCmpname().getText(), true);
		s.getDomainname().sendKeys(data2);
		s.getPermalink().sendKeys(data3);
		
		//System.out.println(s.getCmpname().getText());
		s.getUploadlogo().click();
		f.uploadfile();
		Thread.sleep(2000);
		
		WebElement image_upload= driver.findElement(By.xpath("//span[@class='ml-2']"));
		//System.out.println(image_upload.getText());
		
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
	}

}
