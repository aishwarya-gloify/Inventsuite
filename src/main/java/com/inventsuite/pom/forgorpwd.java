package com.inventsuite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgorpwd {
	@FindBy(xpath = "//body/div[@id='root']/main[1]/div[2]/div[1]/img[1]")
	private WebElement logo;
	
	
	@FindBy(xpath = "//h1[contains(text(),'Reset password')]")
	private WebElement text1;
	
	@FindBy(xpath = "//body/div[@id='root']/main[1]/div[2]/div[1]/p[1]")
	private WebElement text2;
	
	@FindBy(xpath ="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//span[contains(text(),'Get verification link')]")
	private WebElement verify;
	
	@FindBy(xpath = "//a[contains(text(),'Wait,I remember my password')]")
	private WebElement navlogin;
    
	@FindBy(xpath = "//p[@id='email-text']")
	private WebElement validation;
	
	public WebElement getValidation() {
		return validation;
	}

	public void setValidation(WebElement validation) {
		this.validation = validation;
	}

	public forgorpwd(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogo() {
		return logo;
	}

	public void setLogo(WebElement logo) {
		this.logo = logo;
	}

	public WebElement getText1() {
		return text1;
	}

	public void setText1(WebElement text1) {
		this.text1 = text1;
	}

	public WebElement getText2() {
		return text2;
	}

	public void setText2(WebElement text2) {
		this.text2 = text2;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getVerify() {
		return verify;
	}

	public void setVerify(WebElement verify) {
		this.verify = verify;
	}

	public WebElement getNavlogin() {
		return navlogin;
	}

	public void setNavlogin(WebElement navlogin) {
		this.navlogin = navlogin;
	}
	
	

}
