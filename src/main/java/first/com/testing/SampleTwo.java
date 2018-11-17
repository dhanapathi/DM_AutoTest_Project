package first.com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTwo {
	  @Test
	  public void f() {
		  System.out.println("f method Class 2");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("before method Class 2");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("after method Class 2");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class Class 2");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class Class 2");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test Class 2");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test Class 2");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("before Suite Class 2");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("after Suite Class 2");
	  }

	  @Test
	  public void normaltest() {
		  System.out.println("sample test Class 2");
	  }
}
