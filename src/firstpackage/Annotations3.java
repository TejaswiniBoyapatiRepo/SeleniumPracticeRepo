package firstpackage;

import org.testng.annotations.Test;

public class Annotations3 {


	@Test(groups= {"smoke"})
	public void a() {
		// TODO Auto-generated method stub
System.out.println("Method 1");
System.out.println("Sample test scenario");
	}

	@Test(groups= {"smoke"})
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
		System.out.println("update from system 2");
	}
	@Test(groups= {"functional"})
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("Method 3");
		System.out.println("Method 3");
		System.out.println("Method 3");
	}

	@Test(groups= {"functional"})
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("Method 4");
	}

	@Test(groups= {"regression","smoke"})
	public void e() {
		// TODO Auto-generated method stub
		System.out.println("Method 5");
	}
}
