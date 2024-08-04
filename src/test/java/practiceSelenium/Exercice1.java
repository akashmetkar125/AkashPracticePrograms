package practiceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercice1 {

	 
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver=LaunchUrlChromeDriver.launchUrl("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");	
	// launching url and provided window maximize,wait
	
	 WebElement ele = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	 Select sel =new Select(ele);
	 sel.selectByVisibleText("Python");
	 
	 
	 WebElement ele1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
	 Select sel1 =new Select(ele1);
	List <WebElement> list = sel1.getOptions();
	System.out.println("Option present in drodown 1 are as follows");
	
	for (WebElement opt : list) {
		
	  System.out.println(opt.getText());
	}
	
	 sel1.selectByVisibleText("JUnit");
	 
	 WebElement ele2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
	 Select sel2 =new Select(ele2);
	 sel2.selectByValue("jquery");
	 
	 driver.findElement(By.xpath("//input[@value='option-2']")).click();
	 
	 driver.findElement(By.xpath("//input[@value='orange']")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@value='pumpkin']")).click();
	 
	 WebElement ele3 = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
	 Select sel3 =new Select(ele3);
	 List <WebElement> list2 = sel3.getOptions();
	System.out.println("Option present in drodown 4 are as follows");
		
	for (WebElement opt2 : list2) {
			
		  System.out.println(opt2.getText());
		}
	 sel3.selectByIndex(2);
	 Thread.sleep(2000);
	 
	 
	 
	 driver.quit();

	}
	
	
	}
