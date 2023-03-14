package com.inventsuite.testscript.dashboard;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class dashboardtestcase01 extends profilepage{
	
	@Test
	public void dashboardtestcase01() throws InterruptedException
	{
		System.out.println("testing started");
		   Actions a=new Actions(driver);
		   profile p= new profile(driver);
		   WebElement list= driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			Thread.sleep(10000);
			a.moveToElement(list).click().perform();
			Thread.sleep(5000);
		   Thread.sleep(3000);
		   
		   WebElement ul = driver.findElement(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));
		 List<WebElement> listAll = ul.findElements(By.tagName("li"));
		 for (int i = 0; i < listAll.size(); i++) {
		  String text = listAll.get(i).getText();
		 System.out.println(text);
		  }
		 String storename1= "zepto";
		 for (WebElement option : listAll) {
				
				
				if(option.getText().equals(storename1)) 
				{
					System.out.println("Located element and clicked");
					a.moveToElement(option).perform();
					Thread.sleep(8000);
					a.moveToElement(option).click().perform();
					System.out.println("clicked on zepto");
					Thread.sleep(8000);
					break;
				}
				
			}
		 
		 
		 WebElement image= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
			
			String image1= image.getText();
			
			System.out.println(image1);
			
		//	boolean txt = image1.equalsIgnoreCase(storename);
			//assertEquals(storename, image1.equalsIgnoreCase(image1));
		//	Assert.assertEquals(storename, image1.equalsIgnoreCase(storename));
			
			
			// Updating first character to upper case
			char first = Character.toUpperCase(storename1.charAt(0));
			Object betterIdea = first + storename1.substring(1);
			
			System.out.println(betterIdea);
			
			Assert.assertEquals(image1, betterIdea);
		}
		 
		 
//		   WebElement ul = driver.findElement(By.xpath("//ul[@class='MuiList-root jss31 MuiList-padding']"));
//			List<WebElement> listAll = ul.findElements(By.tagName("li"));
//			
//			//listing of all webelements
//			/*for (int i = 0; i < listAll.size(); i++) {
//				String text = listAll.get(i).getText();
//				System.out.println(text);
	//
//			}*/
//			Actions a=new Actions(driver);
//			String storename = "Aishwarya1";
//			//String searchStore = "zepto";
//			//clicking on particular store
//			for (WebElement option : listAll) {
//				
//				if(option.getText().equals(storename)) 
//				{
//					System.out.println("Located element and clicked");
//					a.moveToElement(option).perform();
//					Thread.sleep(8000);
//					a.moveToElement(option).click().perform();
//					Thread.sleep(8000);
//					break;
//				}
//			}
			
//			System.out.println(driver.getCurrentUrl());
//			//driver.navigate().refresh();
//			//System.out.println("Refresh implemented");
//			WebElement list= driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//			Thread.sleep(10000);
//			a.moveToElement(list).click().perform();
//			Thread.sleep(5000);
		    //driver.getPageSource();
			//clickOn(By.xpath("(//span[@class='MuiButton-label'])[1])"),driver,10);
			//Actions act= new Actions(driver);
			//act.moveToElement(list).click().perform();
			//list.click();
			/*try
			{
				list.click();
			}
			catch (Exception e) {
				
				WebElement list1= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
				
				list1.click();
			}
			*
			
			list.click();
			 
			 */
			
			/*Thread.sleep(5000);
			WebElement main= driver.findElement(By.xpath("//i[@class='MuiButtonBase-root MuiButton-root MuiButton-contained px-2 jss27']"));
			act.moveToElement(main).perform();
			Thread.sleep(6000);
			WebElement sub= driver.findElement(By.xpath("//i[@class='fa fa-chevron-down ml-2']"));
			act.moveToElement(sub).click().perform();
			*/
		
		//WebElement locator= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
	/*	public void clickOn(By locator, WebDriver driver, int timeout)
		{
		    final WebDriverWait wait = new WebDriverWait(driver, timeout);
		    wait.until(ExpectedConditions.refreshed(
		        ExpectedConditions.elementToBeClickable(locator)));
		    driver.findElement(locator).click();
		}
	*/
}

