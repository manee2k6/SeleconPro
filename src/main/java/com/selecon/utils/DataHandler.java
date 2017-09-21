package com.selecon.utils;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataHandler {
  @DataProvider(name="userData")
  public Object[][] userData() {
    return new Object[][] {
      new Object[] { "manee2k6", "Test@123" },
      new Object[] { "sdjldsj@#$%^", "@#$%^&*" },
      new Object[] { "", "" },
    };
  }
  
  @DataProvider(name="login")
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "ruma", "Test@123" },
      new Object[] { "sdjldsj@#$%^", "@#$%^&*" },
      new Object[] { "", "" },
    };
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
