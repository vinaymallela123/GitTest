package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listenerss extends TestListenerAdapter {
	
	public void onTestStart(ITestResult itr)
	{
		System.out.println("Test Started");
	}
	
	public void onTestSkipped(ITestResult itr)
	{
		System.out.println("Test Skipped");
	}
	
	public void onTestFailure(ITestResult itr)
	{
		System.out.println("Test Failed");
	}
	
	public void onTestSuccess(ITestResult itr)
	{
		System.out.println("Test success");
	}

}
