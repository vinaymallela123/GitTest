package vinaykumar;

import org.testng.annotations.Test;

public class TypesofTests {
	
	@Test(groups = {"Smoke"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"Smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"Functional"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups= {"Functional"})
	public void test4()
	{
		System.out.println("test4");
	}

}
