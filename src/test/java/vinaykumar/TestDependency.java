package vinaykumar;

import org.testng.annotations.Test;

public class TestDependency {
	int number;
	
	@Test
	public void mallela()
	{
		number=1000;
		System.out.println("Its Mallela and number is "+number);
	}
	
	@Test
	public void vinay()
	{
		System.out.println("Vinay Number is "+ number);
	}
	
	@Test
	public void prasad()
	{
		System.out.println("Prasad number is "+number);
	}

}
