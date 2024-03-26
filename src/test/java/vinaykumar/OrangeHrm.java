package vinaykumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OrangeHrm {
	
	WebDriver driver;
	
	@BeforeTest
	public void initBrowswer()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void launchApp() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	
	@Test
	public void enterLoginDetails() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void navigateToMyInfo() throws InterruptedException
	{
		driver.findElement(By.className("oxd-main-menu-item")).click();
		Thread.sleep(2000);
		
		
	}
	
	@Test
	public void verifyMyinfo()
	{
		System.out.println(driver.findElement(By.xpath("//img[@class=\"employee-image\"]")).isDisplayed());
		System.out.println("My info verified");
	}
	
	@Test
	public void verifyLogin()
	{
		String actualTitle="OrangeHRM";
		String expectedTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Login verified");
			
	}
	
	
	

}
;