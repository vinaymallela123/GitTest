package hyr;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test1 extends BaseClass{
	
	@Test(groups = {"Smoke","Sanity"})
	public void testGoogle() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void testKeka()
	{
		driver.get("https://www.keka.com/");
		Assert.assertEquals("Keka | The HR Payroll software loved by businesses like yours", driver.getTitle());
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void testOrange()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Assert.assertEquals("OrangeHRM", driver.getTitle());
	}

}
