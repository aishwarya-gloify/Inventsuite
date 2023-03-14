package com.inventsuite.testscript.brand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.inventsuite.generics.brandbaseclass;
import com.inventsuite.pom.brand;

public class brandtestcase02 extends brandbaseclass{
	@Test
	public void brandtestcase02() throws InterruptedException
	{
		brand b= new brand(driver);
		List<WebElement> brands=driver.findElements(By.xpath("MuiTableBody-root"));
		for(int i=0;i<brands.size();i++)
		{
			WebElement text = brands.get(i);
			System.out.println(text.getText());
		}
		Actions a= new Actions(driver);
		WebElement status= driver.findElement(By.xpath("//div[@class='customReactSelect__placeholder css-1wa3eu0-placeholder']"));
		a.moveToElement(status).click().perform();
		a.moveToElement(status).sendKeys("Active");
		a.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(4000);
		
		
//		status.sendKeys("active");
//		
//		status.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		
		//status.s
	}
}
