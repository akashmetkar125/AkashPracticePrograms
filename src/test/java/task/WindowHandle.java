package task;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	WebDriver driver;
	
	@BeforeMethod
	public void initialise() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}		

     @Test(priority=1)
     public void WindowHandle() throws InterruptedException    {
	
		String parentWindowHandle = driver.getWindowHandle();
		
		WebElement ele =driver.findElement(By.xpath("//button[@id='openwindow']"));
		ele.click();
		
		 Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();
	        	        
	        while (iterator.hasNext()) {
	            String windowHandle = iterator.next();
	            	           
	            if (!windowHandle.equals(parentWindowHandle)) {
	                driver.switchTo().window(windowHandle);
	                	                
	                System.out.println("Switched to new window: " + driver.getTitle());
	                driver.findElement(By.xpath("//a[text()='Access all our Courses']")).click();
	                Thread.sleep(2000);	            
	                
	                driver.switchTo().window(parentWindowHandle);
	                System.out.println("Switched back to parent window: " + driver.getTitle());
	                Thread.sleep(2000);	  
	               
	            }
	        }
     }
     
     @Test(priority=2)
     public void TabHandle() throws InterruptedException {
    	 
    	 String parentTabHandle = driver.getWindowHandle();
    	 WebElement ele1 =driver.findElement(By.xpath("//a[@id='opentab']"));
 		 ele1.click();
 		 
 		Set<String> allTabHandles = driver.getWindowHandles();
        Iterator<String> iterator = allTabHandles.iterator();
        	        
        while (iterator.hasNext()) {
            String tabHandle = iterator.next();
            	           
            if (!tabHandle.equals(parentTabHandle)) {
                driver.switchTo().window(tabHandle);
                
                System.out.println("Switched to new tab: " + driver.getTitle());
                driver.findElement(By.xpath("//a[text()='Access all our Courses']")).click();
                Thread.sleep(2000);	            
                
                driver.switchTo().window(parentTabHandle);
                System.out.println("Switched back to parent tab: " + driver.getTitle());
                Thread.sleep(2000);	    
                               
    	 
            }
        }
     }
	        @AfterMethod
			public void tearDown() {
			driver.quit();
	}

}
