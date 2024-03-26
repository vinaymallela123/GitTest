package vinaykumar;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider(indices = {0,1})
	public String[] data()
	{
		String[] data1= {"Mallela","Vinay","Kumar"};
		return data1;
	}
}
