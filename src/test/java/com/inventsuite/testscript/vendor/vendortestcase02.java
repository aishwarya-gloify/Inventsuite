package com.inventsuite.testscript.vendor;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass;
import com.inventsuite.generics.vendor;
import com.inventsuite.pom.vendorpom;

public class vendortestcase02 extends baseclass{
	@Test(priority = 0)
	public void vendortestcase0201() throws EncryptedDocumentException, IOException, InterruptedException
	{
		validlogindata();
		storeclick();
		clickvendor();
		
		vendorpom v= new vendorpom(driver);
		v.getAdd_vendor_btn().click();;
		
		FileLib f= new FileLib();
		String data2= f.getExcelData("vendor", 1, 3);
		String data3= f.getExcelData("vendor", 1, 4);
		String data4= f.getExcelData("vendor", 1, 5);
		String data5= f.getExcelData3("vendor", 1, 5);
		String data6= f.getExcelData3("vendor", 1, 7);
		v.getVendor_last_name().sendKeys(data2);
		v.getNick_name().sendKeys(data3);
		v.getEmail_textbox().sendKeys(data4);
		v.getCountry_code().sendKeys(data5);
		v.getMobile_no_textbox().sendKeys(data6);
		Thread.sleep(2000);
		v.getTag_create_btn().click();
		Thread.sleep(3000);
		assert v.getFirst_name_validation().isDisplayed();
	}
	
//	@Test(priority = 2)
//	public void vendortestcase0202() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		vendorpom v= new vendorpom(driver);
//		FileLib f= new FileLib();
//		Actions a= new Actions(driver);
//		
//		v.getAdd_vendor_btn().click();
//		Thread.sleep(2000);
//		
//		String data1= f.getExcelData("vendor", 2, 2);
//		String data3=f.getExcelData("vendor", 2, 4);
//		String data4= f.getExcelData("vendor", 2, 5);
//		double data5=f.getExcelData2("vendor", 2, 6);
//		double data6=f.getExcelData2("vendor", 2, 7);
//		
//		String t1= Double.toString(data5);
//		String t2=Double.toString(data6);
//		
//		v.getVendor_first_name().sendKeys(data1);
//		v.getNick_name().sendKeys(data3);
//		v.getEmail_textbox().sendKeys(data4);
//		v.getCountry_code().sendKeys(t1);
//		v.getMobile_no_textbox().sendKeys(t2);
//		
//		Thread.sleep(3000);
//		
//		v.getSuccess_ok_btn().click();
//		
//		Thread.sleep(3000);
//		
//		v.getSuccess_ok_btn().click();
//		
//	}

}
