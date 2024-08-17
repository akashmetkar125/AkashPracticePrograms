package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	private static final String OutPutType = null;
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement button = driver.findElement(By.xpath(""));
		button.click();
		
		WebElement elementOnNextPage= driver.findElement(By.xpath(""));
		if (elementOnNextPage.isDisplayed()) {
			System.out.println("Link is working fine");
		}
		else {
			System.out.println("Given link is broken");
		}

	
	WebElement dropDown = driver.findElement(By.xpath(""));
	Select sel = new Select(dropDown);
	sel.selectByVisibleText("Button");
	
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	}
}
	
	
	
	
	
	
	
	
	

