package firstpackage;

import org.testng.annotations.Test;

public class firstClass {
	
@Test(priority=3)
public void a()
{
	System.out.println("first method");
}
@Test(priority=2)
public void b()
{
	
	System.out.println("second method");
}
@Test(priority=1)
public void c()
{
	System.out.println("third method ");
}


}
