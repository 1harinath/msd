package TestNGxsdgf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest {
	
	WebDriver driver;

	@BeforeMethod
	public void verifyHomepageTitle() {
		String driverpath="C:\\Users\\SAMSUNG\\Desktop\\selenium\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver",driverpath);
		 String baseurl ="https://connect.maveric-systems.com/index.php/site/login";
		 driver= new ChromeDriver();
		 driver.get(baseurl);
		String expectedTitle = "connect";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority = 0)
	public void register() throws InterruptedException{
		driver.findElement(By.id("LoginForm_username")).sendKeys("aravindrajs");
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void support() throws InterruptedException {
		driver.findElement(By.id("LoginForm_password")).sendKeys("Dellwhitecore!98");
		Thread.sleep(5000);

	}

	@AfterMethod
	public void goToHomepage ( ) throws InterruptedException {
		driver.findElement(By.name("yt0")).click();
		Thread.sleep(5000);
	}

}
