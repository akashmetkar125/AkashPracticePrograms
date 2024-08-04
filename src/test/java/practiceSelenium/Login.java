package practiceSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Login {

	@Test(dataProvider="getData")
	public void test(String username,String pass) throws InterruptedException {
		
		
    WebDriver driver =	LaunchUrlChromeDriver.launchUrl("https://webdriveruniversity.com/Login-Portal/index.html");
		
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	
	Alert alert =driver.switchTo().alert();
	System.out.println("Error message displayed for invalid login");
	System.out.println(alert.getText());
	alert.accept();
	driver.quit();
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object [][] data = {{"akash","1234"},{"metkar","1278"},{"divija","88777"}};
		return data;
	}
	
	
	
}
