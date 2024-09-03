package practiceSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowAuthPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
		String successLogin=driver.findElement(By.xpath("//h3[text()='Basic Auth']/following-sibling::p")).getText();
		System.out.println("Successful Login message is displayed: " +successLogin);
		driver.quit();
		

	}

}
