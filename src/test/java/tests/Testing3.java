package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softassert = new SoftAssert();
  @Test (priority =1)
  public void CreateUser() {
	  System.out.println("I am in home ttest");
	  System.out.println("Before assertion");
	  Assert.assertTrue(2>3, "I am lost");
	  System.out.println("After assertion");
	  Assert.assertEquals("abc", "abc");
  }
  @Test(priority =2, dependsOnMethods = "CreateUser", groups= {"smoke", "sanity"})
  public void EditUser() {
	  System.out.println("I am in home ttest");
	  System.out.println("Before assertion");
	  softassert.assertTrue(2>3, "I am lost");
	  System.out.println("After assertion");
	  softassert.assertAll();// similar to error collector in junit
  }
  @Test(priority =3, dependsOnMethods = "EditUser" )
  public void Deleteuser() {
	  System.out.println("I am in home ttest");
	  System.out.println("Before assertion");
	  softassert.assertTrue(2>3, "I am lost");
	  System.out.println("After assertion");
	  softassert.assertEquals("abc", "abc1");
	  System.out.println("after seconf assertion");
	  softassert.assertAll();// similar to error collector in junit
  }
}
