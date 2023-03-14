package com.inventsuite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profile {

	
	@FindBy(xpath = "//img[contains(@alt,'userImg')]")
	private WebElement userimg;
	
	@FindBy(xpath = "//div[contains(@class,'MuiBox-root jss299 jss43')]//*[name()='svg']")
	private  WebElement edit_icon;
	
	@FindBy(xpath = "//span[normalize-space()='Change Password']")
	private WebElement change_pwd;
	
	@FindBy(xpath = "//span[normalize-space()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath = "//input[@class='form-control' and @placeholder='Enter Name']")
	private WebElement frnametxtbx;
	
	@FindBy (xpath = "//input[@class='form-control' and @placeholder='Enter Last Name']")
	private WebElement last_nametxtbx;
	
	@FindBy(xpath = "//input[@class='form-control' and @placeholder='Enter Nickname']")
	private WebElement nick_nametxtbx;
	
	@FindBy(xpath = "//input[@type='tel' and @class='PhoneInputInput']")
	private WebElement phone_notxtbx;
	
	@FindBy(xpath = "//img[@alt='imageUploadIcon']")
	private WebElement uploadimage_icon;
	
	@FindBy(xpath = "//span[normalize-space()='Update']")
	private WebElement update_btn;
	
	public WebElement getUpdate_btn() {
		return update_btn;
	}

	@FindBy(xpath = "//select[@aria-label='Phone number country']")
	private WebElement select_country;
	
	public WebElement getSelect_country() {
		return select_country;
	}
	
	@FindBy(xpath = "//div[@id='swal2-content']")
	private WebElement success_msg;

	public WebElement getSuccess_msg() {
		return success_msg;
	}

	@FindBy(xpath = "//span[normalize-space()='My Profile']")
	private WebElement my_profile_btn;
	
	
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/child::p)[1]")
	private WebElement myprofile_nametxt;
	
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/child::p)[2]")
	private WebElement myprofile_nicknametxt;
	
	@FindBy (xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/child::p)[3]")
	private WebElement myprofile_emailtxt;
	
	@FindBy(xpath = "(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/child::p)[4]")
	private WebElement myprofile_phonenumber;
	
	@FindBy(xpath = "//input[@id='CurrentPassword']")
	private WebElement current_pwd;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement new_pwd;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement confirm_pwd;
	
	@FindBy(xpath = "//span[normalize-space()='Change Password']")
	private WebElement change_pwd_btn;
	
	@FindBy(xpath = "//span[normalize-space()='Current password cannot be empty']")
	private WebElement current_pwd_validation;
	
	@FindBy(xpath = "//span[normalize-space()='Password cannot be empty']")
	private WebElement new_pwd_validation;
	
	@FindBy(xpath = "//span[normalize-space()='Confirm password cannot be empty']")
	private WebElement confirm_pwd_validation;
	
	@FindBy(xpath = "//span[normalize-space()='New Password and Confirm password not matched']")
	private WebElement not_matched_validation;
	
	public WebElement getNot_matched_validation() {
		return not_matched_validation;
	}

	public WebElement getCurrent_pwd_validation() {
		return current_pwd_validation;
	}

	public WebElement getNew_pwd_validation() {
		return new_pwd_validation;
	}

	public WebElement getConfirm_pwd_validation() {
		return confirm_pwd_validation;
	}

	public WebElement getCurrent_pwd() {
		return current_pwd;
	}

	public WebElement getNew_pwd() {
		return new_pwd;
	}

	public WebElement getConfirm_pwd() {
		return confirm_pwd;
	}

	public WebElement getChange_pwd_btn() {
		return change_pwd_btn;
	}

	public WebElement getMyprofile_nametxt() {
		return myprofile_nametxt;
	}

	public WebElement getMyprofile_emailtxt() {
		return myprofile_emailtxt;
	}


	public WebElement getMyprofile_nicknametxt() {
		return myprofile_nicknametxt;
	}


	public WebElement getMyprofile_phonenumber() {
		return myprofile_phonenumber;
	}


	public WebElement getMyprofile_editbtn() {
		return myprofile_editbtn;
	}

	@FindBy(xpath = "//a[normalize-space()='Edit']")
	private WebElement myprofile_editbtn;

	public WebElement getMy_profile_btn() {
		return my_profile_btn;
	}
	 

	public profile(WebDriver driver) {
		PageFactory.initElements(driver, this) ;
	}

	public WebElement getUserimg() {
		return userimg;
	}

	public WebElement getEdit_icon() {
		return edit_icon;
	}

	public WebElement getChange_pwd() {
		return change_pwd;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getName() {
		return frnametxtbx;
	}

	public WebElement getFrnametxtbx() {
		return frnametxtbx;
	}


	public WebElement getLast_nametxtbx() {
		return last_nametxtbx;
	}


	public WebElement getNick_nametxtbx() {
		return nick_nametxtbx;
	}


	public WebElement getPhone_notxtbx() {
		return phone_notxtbx;
	}



	public WebElement getUploadimage_icon() {
		return uploadimage_icon;
	}
}
