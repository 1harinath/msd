package Test1;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import Pom.PageElements;

public class Launch {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMSUNG\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		PageElements page=new PageElements(driver);
		


			/*//alert
		driver.manage().window().maximize();
		String str="Clock Tower Hotel";
		WebElement Test=driver.findElement(By.xpath("//*[contains(text(),'"+str+"')]//following::td[2]"));
		System.out.println(Test.getText());
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\SAMSUNG\\Desktop\\screen\\test.png");
		Files.copy(SrcFile,DestFile);
		
		//driver.findElement(By.id("button1")).click();
		//String MainWindow=driver.getWindowHandle();
		//Set<String>s1=driver.getWindowHandles();
		//Iterator<String>i1=s1.iterator();
		//while(i1.hasNext())*/
		/*{
			String ChildWindow=i1.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		driver.findElement(By.id("button1")).click();
		driver.close();
		driver.manage().window().maximize();
		}*/
		//driver.switchTo().frame("IF1");
		//driver.findElement(By.linkText("Software Testing Tutorial")).click();
		//Thread.sleep(3000);
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[1]/a/span/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"content\"]/p[10]/button")).click();
		//Thread.sleep(1000);
		//Alert alerts= driver.switchTo().alert();
		//String test = alerts.getText();
		//System.out.println(test);
		//Thread.sleep(1000);
		//alerts.accept();
		//alerts.accept();
		//driver.get("https://www.toolsqa.com/automation-practice-form/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		//driver.findElement().sendKeys("mohamedshakeelt");
		//Thread.sleep(1000);
				//web element(s)
		//List<WebElement> username=driver.findElements(By.tagName("Input"));
		//for (WebElement a : username) {
		//	System.out.println("print :"+""+username);
		//}
		//driver.findElement(By.id("LoginForm_rememberMe")).click();
		//Thread.sleep(1000);
		//WebElement check= driver.findElement(By.id("LoginForm_rememberMe"));
		//check.click();
		//boolean tf = check.isSelected();
		//System.out.println("print : "+tf);
		
		//username.clear();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.name("LoginForm[password]")).sendKeys("Msdshaki@8");
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.name("yt0")).click();
		//Actions act= new Actions(driver);
		//act.findElement(By.className("jqueryslidemenu")).build();
		//driver.close();
				//getText
		//WebElement text= driver.findElement(By.xpath("//*[contains(.,'login credentials')]//following::h1"));
		//String innerText= text.getText();
		//System.out.println("Inner text is :"+innerText);
				//logout
		//Actions action=new Actions(driver);
		//action.moveToElement(By.)
				////SELECT
		//Select continent=new Select(driver.findElement(By.id("continents")));
		//continent.selectByIndex(0);
		//continent.selectByVisibleText("Africa");
		//continent.selectByValue("AUS");
		
	}
}

