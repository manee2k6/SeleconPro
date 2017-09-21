package com.selecon.testng;

import org.testng.annotations.Test;
import com.selecon.utils.DataHandler;


public class TestDataValidation {
  @Test(dataProviderClass=DataHandler.class, dataProvider = "login")
  public void login(String username, String pwd) {
	  System.out.println("UserName: "+username + "-----"+"Password: "+pwd);
  }

  /*@DataProvider
  public Object[][] userData() {
    return new Object[][] {
      new Object[] { "manee2k6", "Test@123" },
      new Object[] { "sdjldsj@#$%^", "@#$%^&*" },
      new Object[] { "", "" },
    };
  }*/
}
