package com.inventsuite.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.inventsuite.pom.LoginPage;

public class storebaseclass {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gloif\\eclipse-workspace\\Inventsuite\\src\\main\\resources\\driver\\chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		
		
		FileLib f=new FileLib();
		
		String data1= f.getExcelData("loginpage", 1, 2);
		String data2=f.getExcelData("loginpage", 1, 3);
		driver.get("https://admin.gloify.co/login");
		
		LoginPage login= new LoginPage(driver);
		
		login.getUntbx().sendKeys(data1);
		login.getPwtbx().sendKeys(data2);
		
		login.getLgbtn().click();
		
	}
	@AfterMethod
	public void logout() {
		
		
	}
}
