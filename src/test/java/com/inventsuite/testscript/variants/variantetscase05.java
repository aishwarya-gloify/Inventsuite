package com.inventsuite.testscript.variants;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;

import com.inventsuite.pom.variants;


//Need to check this
public class variantetscase05 extends baseclass{
	@Test
	public void variantestcae05() throws InterruptedException, EncryptedDocumentException, IOException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
		Thread.sleep(3000);
		
		//select(v.getMedia_type(), null, 0, "Media not required");
		Select s= new Select(v.getMedia_type());
		s.selectByVisibleText("Media not required");
	boolean  image= driver.findElement(By.xpath("//p[normalize-space()='Variant Images']")).isDisplayed();
	
	System.out.println("image value "+image);
//		Assert.assertFalse(image);
	
//	if(image)
//	{
//		System.out.println("upload image is displayed");
//		Assert.assertFalse(image);
//	}
//  else
//	{
//		System.out.println("upload image section not displayed");
//	}
//	
	
	
		
	}

	

	

}
