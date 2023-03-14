package com.inventsuite.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	 
	@FindBy(xpath="//body/div[@id='root']/main[1]/div[2]/div[1]/a[1]/img[1]")
	private WebElement logo;
	
	@FindBy(xpath ="//h1[contains(text(),'Create Your Store')]")
	private WebElement text;
	
	@FindBy(xpath = "//body/div[@id='root']/main[1]/div[2]/div[1]/p[1]")
	private WebElement text1;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwd;
	
	@FindBy(xpath = "//input[@id='confirmPassword']")
	private WebElement conpwd;
	
	@FindBy(xpath = "//span[contains(text(),'Create Your Store')]")
	private WebElement create;
	
	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement signin;
	
	@FindBy(xpath="//p[@id='email-text']")
	private WebElement emailvalidation;
	
	@FindBy(xpath = "//p[contains(text(),'Password cannot be empty')]")
	private WebElement pwdvalidation;
	
	@FindBy(xpath ="//p[contains(text(),'Confirm password cannot be empty')]")
	private WebElement conpwdvalidation;
	
	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this) ;
	}

	

	

	public WebElement getLogo() {
		return logo;
	}

	public void setLogo(WebElement logo) {
		this.logo = logo;
	}

	public WebElement getText() {
		return text;
	}

	public void setText(WebElement text) {
		this.text = text;
	}

	public WebElement getText1() {
		return text1;
	}

	public void setText1(WebElement text1) {
		this.text1 = text1;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public void setPwd(WebElement pwd) {
		this.pwd = pwd;
	}

	public WebElement getConpwd() {
		return conpwd;
	}

	public void setConpwd(WebElement conpwd) {
		this.conpwd = conpwd;
	}

	public WebElement getCreate() {
		return create;
	}

	public void setCreate(WebElement create) {
		this.create = create;
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin(WebElement signin) {
		this.signin = signin;
	}

	public WebElement getEmailvalidation() {
		return emailvalidation;
	}

	public void setEmailvalidation(WebElement emailvalidation) {
		this.emailvalidation = emailvalidation;
	}

	public WebElement getPwdvalidation() {
		return pwdvalidation;
	}

	public void setPwdvalidation(WebElement pwdvalidation) {
		this.pwdvalidation = pwdvalidation;
	}

	public WebElement getConpwdvalidation() {
		return conpwdvalidation;
	}

	public void setConpwdvalidation(WebElement conpwdvalidation) {
		this.conpwdvalidation = conpwdvalidation;
	}
	
}
