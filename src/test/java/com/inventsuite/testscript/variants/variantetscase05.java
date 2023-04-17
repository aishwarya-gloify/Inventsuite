package com.inventsuite.testscript.variants;



import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inventsuite.generics.FileLib;
import com.inventsuite.generics.baseclass2;
import com.inventsuite.pom.variants;


//Need to check this
public class variantetscase05 extends baseclass2{
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
		
		System.out.println(v.getUpload_image().isDisplayed());
		Select s= new Select(v.getMedia_type());
		s.selectByVisibleText("Media not required");
		
		FileLib f= new FileLib();
		String data1= f.getExcelData("variants", 3, 2);
			
			v.getVariant_name_textbox().sendKeys(data1);
	
	v.getCreate_variant_btn().click();
	Thread.sleep(3000);
	assert v.getVariant_created_success_msg().isDisplayed();
	v.getVariant_created_ok_btn().click();
	Thread.sleep(2000);
	clickonvariant();
	List<WebElement> list= driver.findElements(By.xpath("//td[@class='MuiTableCell-root MuiTableCell-body'][2]"));
	
	for(int i=0;i<list.size();i++)
	{
		String text = list.get(i).getText();
		System.out.println(text);
		if(text.equals(data1))
		{
			System.out.println(data1 +" is listed in the variant listing page");
			//a[normalize-space()='testvariant']
			driver.findElement(By.xpath("//a[normalize-space()='"+data1+"']")).click();
			Thread.sleep(3000);
		}
		
	}
	
	WebElement var_name= driver.findElement(By.xpath("//p[normalize-space()='"+data1+"']"));
	System.out.println("variant name "+var_name.getText());
	
	Assert.assertEquals(var_name.getText(), data1);
	
	
	//WebElement image_status= driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6'][2]/child::*[@class='MuiTypography-root jss244 MuiTypography-body1 MuiTypography-colorTextSecondary']"));
	
	WebElement img = driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6']/p)[4]"));
	
	System.out.println(img.getText());
	
	Assert.assertEquals(img.getText(), "Not Required");
	
	//deleting
	
	clickonvariant();
	WebElement dots=driver.findElement(By.xpath("//*[text()='"+data1+"']/../../*[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignRight']/child::button"));
	dots.click();
	
	
	Thread.sleep(2000);
	v.getDelete_btn().click();
	v.getYes_delete_it_btn().click();
	v.getDelete_ok_btn().click();
	
	}

	

	

}
