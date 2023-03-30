package com.demo;



import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.inventsuite.pom.LoginPage;
import com.inventsuite.pom.profile;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This is base class
 * @author Aishwarya
 *
 */

public class base{

	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
//		ChromeOptions chromeOptions= new ChromeOptions(); 
//				chromeOptions.setBinary("C:\\Users\\gloif\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"); 
//				driver=new ChromeDriver(chromeOptions);
		//Logger log = LogManager.getLogger(LogExample.class.getName());
	}
	
public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		 //driver = new ChromeDriver();
		ChromeOptions chromeOptions= new ChromeOptions(); 
		chromeOptions.setBinary("C:\\Users\\gloif\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"); 
		driver=new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	@BeforeMethod
	public void login() throws IOException {
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://admin.gloify.co/login");

	}

	


}





