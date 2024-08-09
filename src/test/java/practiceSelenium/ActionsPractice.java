package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPractice extends CommonMethods {
	

 static WebDriver driver;

   @BeforeMethod
	public void launchUrl() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://webdriveruniversity.com/Actions/index.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}	
		
		
		@Test(priority=1)
		public void DragTest() throws InterruptedException {
				
		WebElement ele=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele1=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		Action(driver, ele, ele1);
		Thread.sleep(2000);
		WebElement dropped=driver.findElement(By.xpath("//b[text()='Dropped!']"));
		if(dropped.isDisplayed()) {
			System.out.println("Element 1 is drgged to element 2");
		}
		else {
			System.out.println("Something went wrong while drgging");
		}
		
		}
		
		@Test(priority=2)
		public void Hover() throws InterruptedException {
		WebElement hover1 =driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement hover2 =driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']"));
		WebElement hover3 =driver.findElement(By.xpath("//button[text()='Hover Over Me Third!']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(hover1).build().perform();
		Thread.sleep(2000);
	
		act.moveToElement(hover2).build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(hover3).build().perform();
		Thread.sleep(2000);
		
		if(hover3.isEnabled()){
			System.out.println("Mouse is successfully Hower on Hover3");
		}
		else {
			System.out.println("Mouse hower is failed");
		}
		}
		
		@Test(priority=2)
		public void ClickAndHold() {
			
		
			JavascriptExecutor  js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,500)");
		
	    WebElement cd=driver.findElement(By.xpath("//p[text()='Click and Hold!']"));
	    Actions act = new Actions(driver);
		act.clickAndHold(cd).build().perform();
		WebElement cd1=driver.findElement(By.xpath("//div[text()='Well done! keep holding that click now.....']"));
		String text =cd1.getText();
		if(cd1.isDisplayed()) {
			
			System.out.printf("Correct text is displayed after click and hold");
			System.out.println(text);
			
		}else {
			System.out.println("Click and hold is failed");
		}
		}	
		
		@AfterMethod
		public void tearDown() {
		driver.quit();
		
		
		}


	}

