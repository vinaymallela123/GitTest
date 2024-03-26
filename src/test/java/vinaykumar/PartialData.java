package vinaykumar;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PartialData {
	
	@Test(dataProvider="data",dataProviderClass= DataSupplier.class)
	public void print(String s)
	{
		System.out.println(s);
	}
	
	

}
