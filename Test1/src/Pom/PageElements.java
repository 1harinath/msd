package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageElements {
	
	
	@FindBy(id="LoginForm_username")
	WebElement uname;
	@FindBy(id="LoginForm_password")
	WebElement password;
	@FindBy(name="yt0")
	WebElement login;
	private WebDriver driver;
	public PageElements(WebDriver driver)
	{
		this.driver = driver;
				PageFactory.initElements(driver, this);
	}
	
}
