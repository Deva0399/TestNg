package testNg;

import org.testng.annotations.Test;

public class Testcase2 extends BaseClass {
	

	@Test(groups= {"sanity"},dependsOnMethods="CCtest")
	public void CreditCardTest() {
		System.out.println("CREDIT CARD LOAN");
         
	}
	
	@Test(groups= {"sanity"})
	public void CCtest() {
		System.out.println("CREDIT CARD LOAN3");
         
	}

}
