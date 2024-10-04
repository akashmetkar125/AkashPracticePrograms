
package task;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.RetryAnalyzer;

public class BrokenLinks {
	
	WebDriver driver;

	@BeforeMethod
	public void initialise() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
	}
		@Test(retryAnalyzer =RetryAnalyzer.class )
		public void BrokenLinkTest() throws MalformedURLException, IOException {
			
			List<WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li']//a"));
			SoftAssert softassert = new SoftAssert();
			for (WebElement link :links) {
				
				String url=link.getAttribute("href");
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
				
				conn.setRequestMethod("HEAD");
				conn.connect();
				
				int statusCode =conn.getResponseCode();
				System.out.println("Status Code of the link: '" +link.getText() +"' is "  +statusCode);
								
				softassert.assertTrue(statusCode<400, "Link: '"+link.getText() +"' is broken with status code "  +statusCode); 
				
		}
			softassert.assertAll();	
						
		}
		
		@AfterMethod
		public void tearDown() {
		driver.quit();
		
	}

}
