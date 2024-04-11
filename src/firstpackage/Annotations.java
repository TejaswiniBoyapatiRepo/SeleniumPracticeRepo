package firstpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Annotations {

	@BeforeTest
	public void launchBrowser()
	{
	System.out.println("Launching Browser");	
	}
	
	@Test
	public void addition()
	{
		System.out.println("Adding 2 numbers");
		Assertion hard = new Assertion();
		hard.assertEquals("test", "tet");
		System.out.println("After the hard assertion");
		System.out.println("git commit scenario");
	}
	@Test
	public void subtraction()
	{
		System.out.println("Subtracting 2 numbers");
		Assertion soft = new SoftAssert();
		soft.assertEquals("test", "tet");
		System.out.println("After the Soft assertion");
		System.out.println("Individual branch creation");
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Closing the Browser");
	}
}
