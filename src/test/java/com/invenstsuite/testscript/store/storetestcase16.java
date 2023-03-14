package com.invenstsuite.testscript.store;



import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.forgorpwd;
@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase16 extends storebaseclass
{

	@Test
	public void testcase16() throws InterruptedException
	{
		String storename= "zepto";

		Store s= new Store(driver);

		Reporter.log("Store", true);

		Thread.sleep(5000);


		WebElement ul = driver.findElement(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));
		List<WebElement> listAll = ul.findElements(By.tagName("li"));
		
		//listing of all webelements
		for (int i = 0; i < listAll.size(); i++) {
			String text = listAll.get(i).getText();
			System.out.println(text);

		}
		//String searchStore = "zepto";
		//clicking on particular store
		for (WebElement option : listAll) {
			if(option.getText().equals(storename)) 
			{
				Actions a=new Actions(driver);
				a.moveToElement(option).perform();
				Thread.sleep(8000);
				a.moveToElement(option).click().perform();
				Thread.sleep(4000);
			}
		}


		WebElement image= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
		
		String image1= image.getText();
		
		System.out.println(image1);
		
	//	boolean txt = image1.equalsIgnoreCase(storename);
		//assertEquals(storename, image1.equalsIgnoreCase(image1));
	//	Assert.assertEquals(storename, image1.equalsIgnoreCase(storename));
		
		
		// Updating first character to upper case
		char first = Character.toUpperCase(storename.charAt(0));
		Object betterIdea = first + storename.substring(1);
		
		System.out.println(betterIdea);
		
		Assert.assertEquals(image1, betterIdea);
	}
}





