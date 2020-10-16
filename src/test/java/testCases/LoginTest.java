package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
	}
	
	
	@Test
	public void doLogin() {
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tandonapurva@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("darkspectre");
		//driver.findElement(By.name("login")).click();
		
	}

	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
