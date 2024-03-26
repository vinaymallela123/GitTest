package trail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DriverCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayma\\eclipse-workspace\\vinaykumar\\Resources\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
//		options.addArguments("incognito");
//		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("div a:nth-child(2)#nav-link-accountList"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span"))).click().build().perform();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
