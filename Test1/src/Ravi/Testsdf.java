package Ravi;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testsdf {
WebDriver driver;
String value="http://localhost:4444/wd/hub";

/*@BeforeTest
public void beforeTest() throws MalformedURLException
{
DesiredCapabilities ds=DesiredCapabilities.chrome();
ds.setPlatform(Platform.ANY);
driver=new RemoteWebDriver(new URL(value),ds);
driver.manage().window().maximize();
driver.get("https://connect.maveric-systems.com/index.php/site/login");

}*/
@BeforeTest
public void launchBrowser() {
        //System.out.println("");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMSUNG\\Desktop\\selenium\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://connect.maveric-systems.com/index.php/site/login");
        //driver.get(baseurl);
}
@AfterTest
public void afterTest()
{
driver.close();
}

@Test
public void register() throws InterruptedException{
    driver.findElement(By.id("LoginForm_username")).sendKeys("kesavans");
    driver.findElement(By.id("LoginForm_password")).sendKeys("8825929978");
    Thread.sleep(5000);
 }

}

