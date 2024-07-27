package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllDropDownOptions {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    WebElement ele =  driver.findElement(By.xpath("//span[@data-name='birthday_wrapper']//select[2]"));
    Thread.sleep(2000);
    Select sel = new Select(ele);
    
    List <WebElement>  allOptions= sel.getOptions();
    
    for (WebElement list : allOptions) {
    	
    	System.out.println(list.getText());
    }
 driver.quit();

	}

}
