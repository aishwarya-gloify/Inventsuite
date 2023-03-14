package com.invenstsuite.testscript.store;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inventsuite.generics.storebaseclass;
import com.inventsuite.pom.Store;

@Listeners(com.inventsuite.generics.Listenerstore.class)
public class storetestcase01 extends storebaseclass{
	
	@Test
	public void testcase01()
	{
		Store s= new Store(driver);
		s.getSelectstoretext().isDisplayed();
		s.getAddstore().isDisplayed();
		
		Assert.assertEquals(s.getSelectstoretext().getText(), "Select Store*");
	}

}
