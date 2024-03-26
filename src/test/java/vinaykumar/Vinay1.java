package vinaykumar;

import java.util.List;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vinay1 {

	@Test
	public void testGoogle() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[@class=\"gb_Ba gb_md gb_Od gb_me\"]"))).click().build().perform();
		Thread.sleep(5000);
		driver.findElement(By.className("gLFyf")).sendKeys("HYR TUTORIALS",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		TakesScreenshot srcshot=((TakesScreenshot)driver);
		File srcFile=srcshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(".\\screenshots\\hyr1.jpg");
		Files.copy(srcFile, destFile);
//		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}

}
