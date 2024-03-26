package vinaykumar;

import org.testng.annotations.Test;

public class TypesofTests2 {
	
	@Test(groups = {"Smoke"})
	public void test5()
	{
		System.out.println("test5");
	}
	
	@Test(groups= {"Smoke"})
	public void test6()
	{
		System.out.println("test6");
	}
	
	@Test(groups= {"Functional"})
	public void test7()
	{
		System.out.println("test7");
	}
	
	@Test(groups= {"Functional"})
	public void test8()
	{
		System.out.println("test8");
	}


}
