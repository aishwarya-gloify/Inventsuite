package com.inventsuite.testscript.brand;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;

public class brandtestcase11 extends brandbaseclass{
	
	@Test
	public void brandtestcase11() throws InterruptedException, EncryptedDocumentException, IOException
	{
		brand b= new brand(driver);
		FileLib f= new FileLib();
		
		b.getAdd_brand_btn().click();
		Thread.sleep(3000);
		String data1=f.getExcelData("brand", 3, 2);
		String data2= f.getExcelData("brand", 3, 3);
		
		b.getBrandname_textbox().sendKeys(data1);
		b.getDescription_textbox().sendKeys(data2);
		
		Thread.sleep(3000);
		b.getCreate_brand_btn().click();
		Thread.sleep(3000);
		
		Assert.assertEquals(b.getBrand_created_success_msg().getText(), "Brand details created successfully");
		b.getBrand_created_success_ok_btn().click();
		
		Thread.sleep(4000);
	}

}
