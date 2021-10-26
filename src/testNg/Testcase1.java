package testNg;


import org.testng.annotations.Test;

public class Testcase1 extends BaseClass {
	

	@Test(priority=0,description="This test case is to test the home loan functionality")
	public void HomeloanTest() {
		System.out.println("INSIDE HOME LOAN");
         
	}
	
	@Test(priority=1,description="This test case is to test the home loan functionality")
	public void HomeloanTest1() {
		System.out.println("INSIDE HOME LOAN1");
         
	}
	
	@Test(priority=1,groups= {"sanity"},description="This test case is to test the car loan functionality")
	public void CarLoanTest() {
		System.out.println("INSIDE CAR LOAN");
	}
	

}
