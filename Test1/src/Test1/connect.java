package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class connect {
	public static void main(String[] args) throws InterruptedException {
		 // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMSUNG\\Desktop\\selenium\\chromedriver.exe");

		  WebDriver driver= new ChromeDriver();
		  //Select ac,it;
		  Actions act=new Actions(driver);
		  driver.get("https://connect.maveric-systems.com/index.php/site/login");
		  //driver.get("https://www.toolsqa.com/automation-practice-form/");
		  driver.manage().window().maximize();
		  //WebElement username = (WebElement) driver.findElements(By.id("LoginForm_username"));
		  //username.sendKeys("mohamedshakeelt");
		  //username.clear();
		  //WebElement check = driver.findElement(By.id("LoginForm_rememberMe"));
		  //System.out.println(check.isDisplayed());
		  //List<WebElement> username= driver.findElements(By.tagName("input"));
		  //for(WebElement a : username)
		 // {
		  // System.out.println(a);
		   
		 // }
		 
		  //continents.selectByValue("Africa");
		  //continents.selectByIndex(2);
		  driver.findElement(By.id("LoginForm_username")).sendKeys("manjubhargavip");
		  driver.findElement(By.id("LoginForm_password")).sendKeys("Manju3105!");
		  driver.findElement(By.name("yt0")).click();
		  Thread.sleep(5000);
		  act.moveToElement(driver.findElement(By.xpath("//*[@class=\"jqueryslidemenu\"]/ul/li[10]/a"))).build().perform();
		  //driver.findElement(By.linkText("Add Timecard")).click();
		 /* Select week=new Select(driver.findElement(By.id("weekid")));
		  week.selectByVisibleText("02-Sep-2019 To 08-Sep-2019");
		  Thread.sleep(2000);
		  week=new Select(driver.findElement(By.id("countryid")));
		  week.selectByValue("114");
		  Thread.sleep(2000);
		  Select it=new Select(driver.findElement(By.id("projectid")));
		  it.selectByValue("709");
		  Thread.sleep(2000);
		  Select activity=new Select(driver.findElement(By.id("activityid")));
		  activity.selectByValue("451");
		  Select loc=new Select(driver.findElement(By.id("TimesheetItems_project_location")));
		  loc.selectByValue("2");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration")).sendKeys("8");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration2")).sendKeys("0");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration3")).sendKeys("0");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration4")).sendKeys("0");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration5")).sendKeys("0");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration6")).sendKeys("8");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration7")).sendKeys("8");
		  Thread.sleep(2000);
		  driver.findElement(By.name("yt0")).click();
		  Thread.sleep(2000);
		  week=new Select(driver.findElement(By.id("weekid")));
		  week.selectByVisibleText("02-Sep-2019 To 08-Sep-2019");
		  Thread.sleep(3000);
		  week=new Select(driver.findElement(By.id("countryid")));
		  week.selectByValue("114");
		  Thread.sleep(3000);
		  it=new Select(driver.findElement(By.id("projectid")));
		  it.selectByValue("709");
		  Thread.sleep(3000);
		  activity=new Select(driver.findElement(By.id("activityid")));
		  activity.selectByValue("740");
		  loc=new Select(driver.findElement(By.id("TimesheetItems_project_location")));
		  loc.selectByValue("2");
		  Thread.sleep(5000);
		  driver.findElement(By.id("TimesheetItems_duration")).sendKeys("0");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration2")).sendKeys("8");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration3")).sendKeys("8");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration4")).sendKeys("8");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration5")).sendKeys("8");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration6")).sendKeys("0");
		  Thread.sleep(2000);
		  driver.findElement(By.id("TimesheetItems_duration7")).sendKeys("0");
		  Thread.sleep(2000);
		  driver.findElement(By.name("yt0")).click();
		  Thread.sleep(4000);*/
		 // driver.findElement(By.xpath("//*[@id=\"submitweekly\"]")).click();
		  //act.moveToElement(driver.findElement(By.xpath("//*[@class=\"jqueryslidemenu\"]/ul/li[9]/a"))).build().perform();
		 // driver.findElement(By.linkText("My Timecard")).click();
		  Thread.sleep(2000);
		 // driver.findElement(By.xpath("//*[@id=\"ltjqsm37\"]/ul/li[10]/ul/li[2]/a[text()='Logout']"));
		 WebElement we= driver.findElement(By.linkText("Logout"));
		 we.click();
		  Thread.sleep(2000);
		  driver.close();
		 //driver.findElements(By.tagName("input"));
		}

		}


