package listeners;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest {
	
	@Test
	public void loginByEmail()
	{
		System.out.println("Login by email");
		Assert.assertEquals("Vinay", "Vinay");
	}

	@Test
	public void loginByFacebook()
	{
		System.out.println("login By Facebook");
		Assert.assertEquals("Vinay", "ramesh");
	}
}
