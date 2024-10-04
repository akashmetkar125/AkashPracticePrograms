package practiceSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	
	public static void ScrollPage(WebDriver driver, int a, int b) {
		
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(a,b)");
	}
	
	public static void ScrollToElemnt(WebDriver driver,WebElement ele ) {
		
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public static void Action(WebDriver driver,WebElement ele,WebElement ele1) {
		
		Actions act = new Actions(driver);
		act.clickAndHold(ele).moveToElement(ele1).release().build().perform();
		
	}
	
	public static void DragDropByOffsetDist(WebDriver driver,WebElement ele) {
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, 0, 0);
			
	}		
    }


