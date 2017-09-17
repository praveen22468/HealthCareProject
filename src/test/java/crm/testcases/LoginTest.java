package crm.testcases;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.testng.annotations.DataProvider;


public class LoginTest {
 
 @Test(dataProvider = "dp")
  
public void f(Integer n, String s) {
	
  
	  

  }

  
@Test
  
public void f2(Integer n, String s) {
	
 
	  Assert.assertEquals("actual", "expected");

 
 }
  
 
 @DataProvider
  public Object[][] dp() 
{
   
 return new Object[][] {
    
  new Object[] { 1, "a" },
   
  new Object[] { 2, "b" },
    
};
  
}
}
