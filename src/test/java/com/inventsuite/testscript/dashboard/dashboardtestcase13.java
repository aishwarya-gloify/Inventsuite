package com.inventsuite.testscript.dashboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;
import com.inventsuite.pom.profile;

@Listeners(com.inventsuite.generics.Listenerstore.class)
public class dashboardtestcase13 extends storebaseclass{
	@Test
	public void dashboardtestcase13() throws InterruptedException, AWTException
	{
Store s= new Store(driver);     
		
		Actions a= new Actions(driver);
		 profile p= new profile(driver);
		

		    Thread.sleep(3000);
// Implementing the profilebaseclass here 
		    Thread.sleep(2000);
		    
			 WebElement ul = driver.findElement(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));
				List<WebElement> listAll = ul.findElements(By.tagName("li"));
				
				//listing of all webelements
				/*for (int i = 0; i < listAll.size(); i++) {
					String text = listAll.get(i).getText();
					System.out.println(text);

				}*/
				//Actions a=new Actions(driver);
				String storename = "chetan13";
				//String searchStore = "zepto";
				//clicking on particular store
				for (WebElement option : listAll) {
					
					if(option.getText().equals(storename)) 
					{
						System.out.println("Located element and clicked");
						a.moveToElement(option).perform();
						Thread.sleep(8000);
						a.moveToElement(option).click().perform();
						Thread.sleep(3000);
						break;
					}
				}
				
				// completed
				
				//clicking on Dunzo edit option
                 a.moveToElement(s.getStore_name()).click().perform();
				
				Thread.sleep(5000);
				
				WebElement str= driver.findElement(By.xpath("//span[text()='Med store']"));
				WebElement icon_edit= driver.findElement(By.xpath("//span[text()='Med store']/../../*[name()='svg' and @focusable='false']"));
		       a.moveToElement(str).perform();
		       Thread.sleep(5000);
				a.moveToElement(icon_edit).click().perform();
				
				Thread.sleep(4000);
				
				s.getUploadlogo().click();
				  // locating text from upload logo
				  WebElement image_upload= driver.findElement(By.xpath("//span[@class='ml-2']"));
				  
				  Thread.sleep(4000);
					Robot robot = new Robot();
				    StringSelection stringSelection = new StringSelection("C:\\Users\\gloif\\Downloads\\nokia.jfif");
				    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				    robot.delay(1000);
				    robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_V);
				    robot.keyRelease(KeyEvent.VK_V);
				    robot.keyRelease(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_ENTER);
				    robot.keyRelease(KeyEvent.VK_ENTER);
				    Thread.sleep(3000);
				    
				    System.out.println(image_upload.getText());
				    Assert.assertEquals(image_upload.getText(), "nokia.jfif");
				
		          a.moveToElement(s.getUpdate_btn()).click().perform();
		          
		          WebElement success= driver.findElement(By.xpath("//div[@id='swal2-content']"));
		          WebElement ok_btn= driver.findElement(By.xpath("//button[normalize-space()='OK']"));
		          
		           Thread.sleep(3000);
		           
		           Assert.assertEquals(success.getText(), "Company updated successfully");
		           
		           Thread.sleep(2000);
		           
		           ok_btn.click();
	}

}
