package com.inventsuite.testscript.tags;

import org.testng.annotations.Test;

import com.inventsuite.generics.tagbaseclass;
import com.inventsuite.pom.tags;

public class tagtestcase02 extends tagbaseclass{
	@Test
	public void testcase03()
	{
		tags t= new tags(driver);
		t.getAdd_tag_btn().click();
		
		assert t.getCreate_tag_text().isDisplayed();
		assert t.getTag_name_textbox().isDisplayed();
		assert t.getSlug_textbox().isDisplayed();
		assert t.getDisplayorder_textbox().isDisplayed();
		assert t.getSelect_active_drpdwn().isDisplayed();
		assert t.getSelect_featured_drpdwn().isDisplayed();
		assert t.getSelect_img_size_drpdwn().isDisplayed();
		
		t.getCreate_tag_btn().isDisplayed();
		
		assert t.getTag_name_validation().isDisplayed();
		assert t.getDisplay_order_validation().isDisplayed();
		assert t.getSelect_active_validation().isDisplayed();
		assert t.getSelect_featured_valudation().isDisplayed();
		assert t.getImage_size_validation().isDisplayed();
	}

}
