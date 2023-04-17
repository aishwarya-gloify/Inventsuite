package com.inventsuite.testscript.variants;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.generics.baseclass2;

import com.inventsuite.pom.variants;

public class varianttestcase03 extends baseclass2{
	@Test
	public void varianttestcase03() throws InterruptedException, EncryptedDocumentException, IOException
	{
		validlogindata();
		storeclick();
		clickonvariant();
		variants v= new variants(driver);
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		Thread.sleep(3000);
		Assert.assertEquals(v.getVariant_name_textbox().getText(), "");
		//Assert.assertEquals(v.getMedia_type().getText(), "");
		
		WebElement image= driver.findElement(By.xpath("//p[text()='Image Not Available']"));
		
		assert image.isDisplayed();
		Assert.assertEquals(image.getText(), "Image Not Available");
	}

}
