package com.inventsuite.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.baseclass;
import com.inventsuite.pom.LoginPage;

public class logintestcase09 extends baseclass{
	
	@Test
	public void testcase09()
	{
		// need to check this
		int count=0;
		LoginPage login= new LoginPage(driver);
		login.getUntbx().sendKeys("aishwarya@gloify.com");
		login.getPwtbx().sendKeys("test123");
		
		login.getLgbtn().click();
		
		java.util.List<WebElement> linkElements = driver.findElements(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));

        // Loop through the link elements and print their text
        
      
        	for (WebElement element : linkElements) 
        	{
                System.out.println(element.getText());
                
				count++;
				if(count==0)
	        	{
	        		WebElement records= driver.findElement(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));
	        		String message= records.getText();
	        		
	        		Assert.assertEquals(message, "No records found");
	        	}
                	
	}
        	

	}
}
