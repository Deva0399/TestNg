package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeTest(alwaysRun=true)
	public void BeforeTestMethod() {
		System.out.println("Inside before test");
	}
	@BeforeClass(alwaysRun=true)
	public void BeforeClassM() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("Inside before method");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("Inside after method");
	}
	
	@AfterClass(alwaysRun=true)
	public void AfterClassM() {
		System.out.println("After Class");
	}
	
	@AfterTest(alwaysRun=true)
	public void AfterTestMethod() {
		System.out.println("Inside after test");
	}

}
