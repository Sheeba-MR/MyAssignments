package week5.day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationAssignment {

	public class Annotat {
		  @Test
		  public void testcase1() {
			  System.out.println("Testcase passed");
		  }
		  @Test
		  public void testcase2() {
			  System.out.println("Testcase passed");
		  }
		  @BeforeMethod
		  public void beforeMethod() {
			  System.out.println("Before method");
		  }

		  @AfterMethod
		  public void afterMethod() {
			  System.out.println("After method");
		  }

		  @BeforeClass
		  public void beforeClass() {
			  System.out.println("Before class");
		  }

		  @AfterClass
		  public void afterClass() {
			  System.out.println("After class");
		  }

		  @BeforeTest
		  public void beforeTest() {
			  System.out.println("Before test");
		  }

		  @AfterTest
		  public void afterTest() {
			  System.out.println("After test");
		  }

		  @BeforeSuite
		  public void beforeSuite() {
			  System.out.println("Before suite");
		  }

		  @AfterSuite
		  public void afterSuite() {
			  System.out.println("After suite");
		  }
	}

}
	
	
