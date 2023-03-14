 package com.inventsuite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="email")
	private WebElement untbx;
	@FindBy(id="password")
	private WebElement pwtbx;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement lgbtn;
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	private WebElement psd;
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	private WebElement signup;
	@FindBy(xpath="//body/div[@id='root']/main[1]/div[2]/div[1]/img[1]")
	private WebElement logo;
	@FindBy(xpath="//h1[contains(text(),'Login')]")
	private WebElement Log;
	@FindBy(xpath="//p[contains(text(),'Enter your email and password login to your store')]")
	private WebElement text;
	@FindBy(xpath="//*[@id=\"email-text\"]")
	private WebElement emailvalidation;
	@FindBy(xpath="//p[@id='password-text']")
	private WebElement passwordvalidation;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this) ;

	 
		}
	public WebElement getUntbx() {
		return untbx;
	}
	public WebElement getPwtbx() {
		return pwtbx;
	}
	public WebElement getLgbtn() {
		return lgbtn;
	}
	public WebElement getPsd() {
		return psd;
	}
	public WebElement getSignup() {
		return signup;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLog() {
		return Log;
	}
	public WebElement getText() {
		return text;
	}
	public WebElement getEmailvalidation() {
		return emailvalidation;
	}
	public WebElement getPasswordvalidation() {
		return passwordvalidation;
	}



	
}
