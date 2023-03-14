package com.inventsuite.testscript.profilepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.profilepage;
import com.inventsuite.pom.profile;
@Listeners(com.inventsuite.generics.Listenerprofile.class)
public class profiletestcase04 extends profilepage{
	@Test
	public void profiletestcase04() throws InterruptedException
	{
		// In profile page phone number is stored without country code
		
		
		profile p= new profile(driver);
		
		p.getUserimg().click();
		Thread.sleep(3000);
		p.getMy_profile_btn().click();
		
		Thread.sleep(3000);
		
		WebElement myprf= driver.findElement(By.xpath("//h6[normalize-space()='My Profile']"));
		
		Assert.assertEquals(myprf.getText(), "My Profile");
		
		String first_name=p.getMyprofile_nametxt().getText();
		String nickname=p.getMyprofile_nicknametxt().getText();
		String phone_no= p.getMyprofile_phonenumber().getText();
		
		Thread.sleep(3000);
		
		p.getMyprofile_editbtn().click();
		
		Thread.sleep(4000);
		
		String current_url= driver.getCurrentUrl();
		
		Assert.assertEquals(current_url, "https://admin.gloify.co/edit-profile");
		
		Thread.sleep(3000);
		
		
		
		
		String concat_first_lastname= p.getFrnametxtbx().getAttribute("value").concat(" ").concat(p.getLast_nametxtbx().getAttribute("value"));
		
		Assert.assertEquals(concat_first_lastname, first_name);
		
		//Assert.assertEquals(p.getMyprofile_nicknametxt().getText(), nickname);
		
		Assert.assertEquals(p.getNick_nametxtbx().getAttribute("value"), nickname);
		
		Assert.assertEquals(p.getPhone_notxtbx().getAttribute("value"), phone_no);
	}

}
