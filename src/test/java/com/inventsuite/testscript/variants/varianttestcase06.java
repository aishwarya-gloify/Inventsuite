package com.inventsuite.testscript.variants;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.fileupload;
import com.inventsuite.pom.variants;

// need to change variant name
public class varianttestcase06 extends baseclass{
	@Test(priority = 0)
	public void varianttestcase0601() throws EncryptedDocumentException, IOException, InterruptedException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		
		Thread.sleep(2000);
		FileLib f= new FileLib();
	String data1= f.getExcelData("variants", 1, 2);
		
		v.getVariant_name_textbox().sendKeys(data1);
		//Assert.assertEquals(v.getMedia_type().getAttribute("value"), "Need Media");
		assert driver.findElement(By.xpath("//p[normalize-space()='Variant Images']")).isDisplayed();
		Thread.sleep(2000);
		v.getCreate_variant_btn().click();
		Thread.sleep(3000);
		assert v.getVariant_created_success_msg().isDisplayed();
		v.getVariant_created_ok_btn().click();
		Thread.sleep(2000);
		clickonvariant();
		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
		
		for(int i=0;i<list.size();i++)
		{
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(data1))
			{
				System.out.println(data1 +"is present in the list");
			}
			
		}
		
		WebElement dots=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		dots.click();
		
		v.getEdit_btn().click();
		
		assert v.getEdit_variant_text().isDisplayed();
		
		Assert.assertEquals(v.getVariant_name_textbox().getAttribute("value"), data1);
		
		Assert.assertEquals(v.getMedia_type().getAttribute("value"), "true");
		
		assert driver.findElement(By.xpath("//p[normalize-space()='Variant Images']")).isDisplayed();
	}
	
	@Test(priority = 1)
	public void varianttestcase0602() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		Thread.sleep(3000);
		
		
		
		FileLib f= new FileLib();
	String data1= f.getExcelData("variants", 2, 2);
		
		v.getVariant_name_textbox().sendKeys(data1);
		Thread.sleep(2000);
		Select s= new Select(v.getMedia_type());
		s.selectByVisibleText("Media not required");
		Thread.sleep(2000);
		
		v.getCreate_variant_btn().click();
		v.getVariant_created_ok_btn().click();
		
		clickonvariant();
		
		WebElement dots=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		dots.click();
		
		v.getEdit_btn().click();
		
		Select s1= new Select(v.getMedia_type());
		s1.selectByVisibleText("Need Media");
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//p[normalize-space()='Variant Images']")).isDisplayed();
		
		fileupload upload= new fileupload();
		v.getUpload_image().click();
		Thread.sleep(2000);
		upload.uploadfile();
		// uploading file more than 5mb
		WebElement errormsg= driver.findElement(By.xpath("//div[@class='errorMessage ']"));
		
		errormsg.isDisplayed();
		
		
		v.getUpload_image().click();
		Robot robot = new Robot();
	    StringSelection stringSelection = new StringSelection("\"C:\\Users\\gloif\\Downloads\\image.jpg\"");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	    robot.delay(1000);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    v.getVariant_update_btn().click();
	    
	    v.getVariant_created_ok_btn().click();
		
	    
	    
	}
	
	@Test(dependsOnMethods = {"varianttestcase0602"})
	public void varianttestcase0603() throws EncryptedDocumentException, IOException, InterruptedException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		FileLib f= new FileLib();
		String data1= f.getExcelData("variants", 2, 2);
		WebElement dots=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		dots.click();
		
		v.getEdit_btn().click();
		//assert driver.findElement(By.xpath("//p[normalize-space()='Variant Images']")).isDisplayed();
		
		v.getVariant_name_textbox().sendKeys(Keys.CONTROL+"a");
		v.getVariant_name_textbox().sendKeys(Keys.DELETE);
		
		String data2= f.setExcelData("variants", 2, 2, "testing update3");
		
		String data3= f.getExcelData("variants", 2, 2);
		
		v.getVariant_name_textbox().sendKeys(data3);
		Thread.sleep(2000);
		
		v.getVariant_update_btn().click();
		
		v.getVariant_created_ok_btn().click();
		List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
		
		for(int i=0;i<list.size();i++)
		{
			String text = list.get(i).getText();
			System.out.println(text);
			if(text.equals(data3))
			{
				System.out.println(data1 + "is updated to "+data3 +" and it is present in the list");
			}
			
		}
		
		Thread.sleep(3000);
		
		WebElement dots1=driver.findElement(By.xpath("//*[text()='"+data3+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
		dots1.click();
		Thread.sleep(2000);
		v.getDelete_btn().click();
		Thread.sleep(2000);
		v.getYes_delete_it_btn().click();
		v.getDelete_ok_btn().click();
		
		// after deleting checking the varaint is deleted
		
List<WebElement> list2= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
		
		for(int i=0;i<list2.size();i++)
		{
			String text = list2.get(i).getText();
			System.out.println(text);
			if(text.equals(data3))
			{
				System.out.println(data3 +"is not deleted from the list the list");
			}
			
		}
		System.out.println(data3+" is deleted from the list");
		
	}
	
	
	@Test(priority = 3)
	public void varianttestcase0604() throws EncryptedDocumentException, IOException, InterruptedException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
	
		FileLib f= new FileLib();
	String data1= f.getExcelData("variants", 1, 2);
	WebElement dots=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
	dots.click();
	
	
	Thread.sleep(2000);
	v.getDelete_btn().click();
	v.getYes_delete_it_btn().click();
	v.getDelete_ok_btn().click();
	List<WebElement> list2= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
	
	for(int i=0;i<list2.size();i++)
	{
		String text = list2.get(i).getText();
		System.out.println(text);
		if(text.equals(data1))
		{
			System.out.println(data1 +"is not deleted from the list the list");
		}
		
	}
	System.out.println(data1+" is deleted from the list");
	
}
	}


