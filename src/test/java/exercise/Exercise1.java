package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver =  Exercise1.ChromeLunch("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8857020738");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1263883]");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	WebElement ele =	driver.findElement(By.xpath("//div[@class='_9ay7']"));
	Thread.sleep(3000);
	
	if(ele.isDisplayed()) {
		
		System.out.println("Email or Pass is Incorrect");
		
	}
	else {
		
		throw new NoSuchElementException ("Incorrect Password message is not displayed");
	}
		
		
	    driver.close();
		
	}
	public static WebDriver ChromeLunch(String url) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	     return driver;
		
	}
}
     
