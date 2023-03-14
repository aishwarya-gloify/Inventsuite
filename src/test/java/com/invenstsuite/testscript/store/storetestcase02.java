package com.invenstsuite.testscript.store;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;

@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase02 extends storebaseclass{
	

		//Store s= new Store(driver);
	
	@Test (priority = 0)
	public void testcase02() throws InterruptedException
	{
		
		Store s= new Store(driver);
		s.getAddstore().click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		assert (s.getCmpname().isDisplayed()&& s.getDomainname().isDisplayed()&&s.getPermalink().isDisplayed()&&s.getUploadlogo().isDisplayed()&&s.getCreatestore().isDisplayed());
		
		Assert.assertEquals(s.getCmpname().getText(), "");
		Assert.assertEquals(s.getDomainname().getText(), "");
		Assert.assertEquals(s.getPermalink().getText(), "");
	//	Assert.assertEquals(s.getUploadlogo().getText(), "");
		
		String image= driver.findElement(By.xpath("//p[contains(text(),'Image Not Available')]")).getText();
		
		Assert.assertEquals(image, "Image Not Available");
		
		
		
	}

	
		
	
}


