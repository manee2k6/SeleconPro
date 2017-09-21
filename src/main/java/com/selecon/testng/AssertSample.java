package com.selecon.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSample {
  @Test
  public void Test1() {
	  System.out.println("First line is executed....");
	  Assert.assertEquals(2>1, 3<1);
	  System.out.println("successfully executed...");
  }
  @Test(dependsOnMethods="Test1")
  public void Test2() {
	  System.out.println("Test2 is executed..");
  }
}
