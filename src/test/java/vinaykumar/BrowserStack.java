package vinaykumar;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BrowserStack {
	
	WebDriver driver;
	
  @SuppressWarnings("deprecation")
@Test(dataProvider="dataa",dataProviderClass =ExcelDataSupplier.class)
//  @Test(dataProvider="dataa")
  public void testLogin(String Username, String Password ) throws InterruptedException {
	  
	  driver.get("https://www.browserstack.com/users/sign_in?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=678917957894&utm_campaign=Search-Brand-APAC-Navigational&utm_campaigncode=Core%209181884&utm_term=e%20browserstack");
	  driver.findElement(By.xpath("//input[@id=\"user_email_login\"]")).sendKeys(Username);
	  driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys(Password);
	  driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Sign me in\"]")).click();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  System.out.println(driver.getTitle()); 
  }
  
//  @DataProvider( name="dataa")
//  public Object[][] loginData()
//  {
//	  Object[][] data=new Object[2][2];
//	  data[0][0]="Vinayreddymallela96529@gmail.com";
//	  data[0][1]="Vnay@96529";
//	  return data;
//  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
