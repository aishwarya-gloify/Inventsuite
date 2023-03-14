package com.invenstsuite.testscript.store;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.fileupload;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase09 extends storebaseclass{
	
	@Test
	public void testcase09() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		//Checking by adding new data
		
				Reporter.log("Store", true);
				Store s= new Store(driver);
				Thread.sleep(3000);
				s.getAddstore().click();
				Thread.sleep(3000);
				
				FileLib f= new FileLib();
				
				String data1= f.getExcelData("storecreate", 5, 2);
				String data2= f.getExcelData("storecreate", 5, 3);
				String data3= f.getExcelData("storecreate", 5, 4);
				
				// passing data to text box
				
				s.getCmpname().sendKeys(data1);
				s.getDomainname().sendKeys(data2);
				s.getPermalink().sendKeys(data3);
				
				
				  String nameelement=s.getCmpname().getText();
				Thread.sleep(2000);
				
				//click on upload image button
				s.getUploadlogo().click();
				Thread.sleep(3000);
				
				// uploading image from system
				
				fileupload upload= new fileupload();
				upload.uploadfile();
				
				Thread.sleep(4000);
				s.getCreate_btn().click();
				
				Thread.sleep(3000);
				
				String successmsg= driver.findElement(By.xpath("//h2[@id='swal2-title']")).getText();
				
				String createdmsg= driver.findElement(By.xpath("//div[@id='swal2-content']")).getText();
				
				WebElement ok_btn= driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
				
				Assert.assertEquals(successmsg, "Success");
				Assert.assertEquals(createdmsg, "Company created successfully");
				ok_btn.click();
				
				java.util.List<WebElement> linkElements = driver.findElements(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));

		        // Loop through the link elements and print their text
		        
		      
		        	for (WebElement element : linkElements) 
		        	{
		                System.out.println(element.getText());
		                if(element.getText().equals(data1))
		                {
		                	//System.out.println(element);
		                	element.click();
		                }
		                	
		        }
				
	}

}
