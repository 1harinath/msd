package TestNGxsdgf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 
public class Login {

 public String baseurl ="https://connect.maveric-systems.com/index.php/site/login";
 String driverpath="C:\\Users\\SAMSUNG\\Desktop\\selenium\\chromedriver.exe";
 public WebDriver driver;
 
 public String expected = null;
    public String actual = null;

@BeforeTest
public void launchBrowser() {
        //System.out.println("");
        System.setProperty("webdriver.chrome.driver",driverpath);
        driver= new ChromeDriver();
        driver.get("https://connect.maveric-systems.com/index.php/site/login");
        //driver.get(baseurl);
}

/*@BeforeMethod
    public void verifyHomepageTitle() {
        String expectedTitle = "connect";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }*/

@Test
@Parameters({"sUsername","sPassword"})
    public void register(String sUsername,String sPassword) throws InterruptedException{
        driver.findElement(By.id("LoginForm_username")).sendKeys(sUsername);
        driver.findElement(By.id("LoginForm_password")).sendKeys(sPassword);
        Thread.sleep(5000);
     }

/*@Test(priority = 1)
    public void support() throws InterruptedException {
          driver.findElement(By.id("LoginForm_password")).sendKeys("Dellwhitecore!98");
          Thread.sleep(5000);
         
    }

@AfterMethod
    public void goToHomepage ( ) throws InterruptedException {
          driver.findElement(By.name("yt0")).click();
          Thread.sleep(5000);
    }


@AfterTest
    public void terminateBrowser(){
 
        driver.close();
    }*/
	/*WebDriver driver;
	@Test(priority=1)
	public void openBrowser()
	{
		String driverpath="C:\\Users\\DELL\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
        driver= new ChromeDriver();
	}
	@Test(priority=2)
	public void launchGoogle()
	{
		driver.get("C:\\Users\\DELL\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
	}*/
}
	
