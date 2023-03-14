package com.inventsuite.testscript.brand;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;
import com.inventsuite.pom.fileupload;

public class brandtestcase07 extends brandbaseclass{
	@Test
	public void brandtestcase07() throws InterruptedException, AWTException
	{

		// clicking on close button while uploading image
				brand b= new brand(driver);
				FileLib f= new FileLib();
				
				b.getAdd_brand_btn().click();
				Thread.sleep(3000);
		fileupload file= new fileupload();
				
				b.getImage_upload().click();
				file.uploadfile();
				Thread.sleep(4000);
				
				WebElement close= driver.findElement(By.xpath("//button[@aria-label='close']//span[@class='MuiIconButton-label']//*[name()='svg']"));
				
				close.click();
				Thread.sleep(3000);
				b.getImage_upload().click();
				file.uploadfile();
				Thread.sleep(4000);
				WebElement crop= driver.findElement(By.xpath("//span[normalize-space()='Select without crop']"));
				crop.click();
	}

}
