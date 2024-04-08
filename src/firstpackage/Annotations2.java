package firstpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launch flipkart website");
		System.out.println("Launch flipkart website");
		System.out.println("Launch flipkart website");
		System.out.println("Launch flipkart website");
		System.out.println("Launch flipkart website");
		System.out.println("Launch flipkart website");
		System.out.println("Launch flipkart website");
	}

	@BeforeMethod
	public void verifyHomePage() {
		// TODO Auto-generated method stub
		System.out.println("Verifying home page Title");
	}

	@Test
	public void testCase1() {
		// TODO Auto-generated method stub
		System.out.println("click on Grocery and verify the title");
	}
	@Test
	public void testCase2() {
		// TODO Auto-generated method stub
		System.out.println("click on Mobiles and verify the title");
	}

	@Test
	public void testCase3() {
		// TODO Auto-generated method stub
		System.out.println("click on Fashion and verify the title");
	}
	@AfterMethod
	public void goBacktoHomePage() {
		// TODO Auto-generated method stub
		System.out.println("Go back to the home page");
	}

	@AfterTest
	public void closeBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Close the browser");
	}
}
