package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	
	 //WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	   if(  driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed()) {
		   System.out.println("Url is successfully Launched");
	   }
	     driver.close();
		
		
		
	}

}
