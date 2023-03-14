package com.inventsuite.testscript.vendor;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.generics.vendor;
import com.inventsuite.pom.vendorpom;

public class vendortestcase01 extends baseclass{
	@Test(priority = 0)
	public void vendortestcase0101() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
	validlogindata();
	storeclick();
	clickvendor();
		
		vendorpom v= new vendorpom(driver);
		
		
		String expected_url="https://admin.gloify.co/vendor-list";
		String current_url=driver.getCurrentUrl();
		
		Assert.assertEquals(current_url, expected_url);
		
		Assert.assertEquals(v.getVendor_text().getText(), "Vendors");
		
		assert v.getAdd_vendor_btn().isDisplayed();
		
	}
	
	@Test(priority = 1)
	public void vendortestcase0102() throws EncryptedDocumentException, IOException, InterruptedException
	{
		validlogindata();
		storeclick();
		clickvendor();
		vendorpom v= new vendorpom(driver);
		
		v.getAdd_vendor_btn().click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://admin.gloify.co/add-vendor");
		
		Assert.assertEquals(v.getCreate_vendor_details_textbox().getText(), "Create vendor Details");
		
		assert v.getVendor_first_name().isDisplayed();
		assert v.getVendor_last_name().isDisplayed();
		assert v.getNick_name().isDisplayed();
		assert v.getMobile_no_textbox().isDisplayed();
		assert v.getCountry_code().isDisplayed();
		
		Assert.assertEquals(v.getVendor_first_name().getAttribute("value"), "");
		Assert.assertEquals(v.getVendor_last_name().getAttribute("value"), "");
		Assert.assertEquals(v.getNick_name().getAttribute("value"), "");
		Assert.assertEquals(v.getMobile_no_textbox().getAttribute("value"), "");
		Assert.assertEquals(v.getCountry_code().getAttribute("value"), "");
	}
	
	@Test(priority=2)
	public void vendortestcase0103() throws InterruptedException, EncryptedDocumentException, IOException
	{
		validlogindata();
		storeclick();
		clickvendor();
        vendorpom v= new vendorpom(driver);
		
		v.getAdd_vendor_btn().click();
		v.getTag_create_btn().click();
		Thread.sleep(3000);
		Assert.assertEquals(v.getFirst_name_validation().getText(), "First Name Cannot be empty");
		Assert.assertEquals(v.getEmain_tex_validation().getText(), "Email cannot be empty");
		Assert.assertEquals(v.getPhone_no_validation().getText(), "Phone cannot be empty");
	}
	

}
