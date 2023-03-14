package com.inventsuite.testscript.variants;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.variants;

public class variantestcase07 extends baseclass{
	
	@Test
	public void varianttestcase07() throws EncryptedDocumentException, IOException, InterruptedException
	{
		variants v= new variants(driver);
		validlogindata();
		storeclick();
		clickonvariant();
		Thread.sleep(3000);
		v.getAdd_variant_btn().click();
	}

}
