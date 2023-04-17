package com.inventsuite.testscript.variants;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.inventsuite.generics.baseclass2;
import com.inventsuite.pom.variants;

public class varianttestcase02 extends baseclass2{
	
	@Test
	public void varianttestcase02() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		v.getAdd_variant_btn().click();
		Thread.sleep(3000);
		
		String current_url= driver.getCurrentUrl();
		String expected_url= "https://admin.gloify.co/add-Variant";
		
		Assert.assertEquals(current_url, expected_url);
		
		assert v.getCreate_variant_text().isDisplayed();
		assert v.getVariant_details_text().isDisplayed();
		assert v.getVariant_name_textbox().isDisplayed();
		assert v.getMedia_type().isDisplayed();
		assert v.getUpload_image().isDisplayed();
		assert v.getCreate_variant_btn().isDisplayed();
		
		
	}

}
