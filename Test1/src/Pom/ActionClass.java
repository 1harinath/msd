package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		PageElements.username(driver).sendKeys("mohamedshakeelt");
		PageElements.password(driver).sendKeys("Msdshaki@8");
		PageElements.login(driver).click();*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMSUNG\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		PageElements page=new PageElements(driver);
		page.uname.sendKeys("mohamedshakeelt");
		page.password.sendKeys("Msdshaki@8");
		page.login.click();
	
		
	}

}
