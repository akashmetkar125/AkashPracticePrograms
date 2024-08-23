package practiceSelenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginBaseClass{
	
	  static WebDriver driver;
	
	@BeforeMethod
	public void launchUrl() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}
	@Test(priority=0)
	public void testLogin() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("akash");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("akash@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		Alert alert =driver.switchTo().alert();
		System.out.println("Error message displayed for invalid login");
		System.out.println(alert.getText());
		String expectedText="validation failed";
		if(expectedText.equalsIgnoreCase("validation failed")) {
			System.out.println("Correct error message Displayed");
		}else {
			System.out.println("Incorrect error message displayed");
		}
		
		alert.accept();
		
		
	}
	
	@Test(priority=1)
	public void UrlValidateTest() {
		
		String actUrl=driver.getCurrentUrl();
		System.out.println(actUrl);
		assertEquals(actUrl, "https://webdriveruniversity.com/Login-Portal/index.html");
		
	
	}
	
	@AfterMethod
	public static void tearDown() {
		
		driver.quit();
		
		
	}
}
