package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlltypesOfFrameTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
	
	/*	WebElement slid =	driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions a = new Actions(driver);
		a.moveToElement(slid).dragAndDropBy(slid, 300, 0).build().perform();
		*/
	
	WebElement Drag = 	driver.findElement(By.id("draggable"));
	WebElement drop= driver.findElement(By.id("droppable"));
	Actions a = new Actions(driver);
	a.dragAndDrop(Drag, drop).build().perform();
	driver.switchTo().defaultContent();
	
	
	/*
	driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
	driver.switchTo().frame(0);
	WebElement resizer = driver.findElement(By.id("resizable"));                 // another type of frame action.
	Actions a = new Actions(driver);
	a.moveToElement(resizer).dragAndDropBy(resizer, 250, 300).build().perform();
    
    */
		
		
		
		
	
	}

}
