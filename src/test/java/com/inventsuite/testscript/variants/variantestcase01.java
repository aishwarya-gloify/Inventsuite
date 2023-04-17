package com.inventsuite.testscript.variants;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.generics.baseclass2;

import com.inventsuite.pom.variants;

public class variantestcase01 extends baseclass2{
	@Test
	public void varianttestcase01() throws InterruptedException, EncryptedDocumentException, IOException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		String current_url= driver.getCurrentUrl();
		String expected_url= "https://admin.gloify.co/variant-list";
		System.out.println(current_url);
		Assert.assertEquals(current_url, expected_url);
		
		assert v.getVariant_text().isDisplayed();
		assert v.getAdd_variant_btn().isDisplayed();
		assert v.getSearch_textbox().isDisplayed();
		assert v.getSearch_btn().isDisplayed();
		
	}

}
