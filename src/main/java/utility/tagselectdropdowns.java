package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inventsuite.pom.tags;


public class tagselectdropdowns {
	public static WebDriver driver;
	
	public void select_classes() throws InterruptedException
	{
		System.out.println("testing select");
		tags t= new tags(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeSelected(t.getSelect_active_drpdwn()));
		Select s= new Select(t.getSelect_active_drpdwn());
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		Select s1= new Select(t.getSelect_featured_drpdwn());
		s1.selectByIndex(1);
		Thread.sleep(3000);
		Select s2= new Select(t.getSelect_img_size_drpdwn());
		s2.selectByIndex(1);
		Thread.sleep(3000);
	}

}
