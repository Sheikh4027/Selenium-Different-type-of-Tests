package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAutocomplitdropDownboxes2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement FromPlace = driver.findElement(By.id("autocomplete"));
		FromPlace.sendKeys("Ir");
	    Thread.sleep(1000);
	    FromPlace.sendKeys(Keys.ARROW_DOWN);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;  // bringing jscript into action.
   
	    String scripts = "return document.getElementById('autocomplete').value";
		String text =(String) js.executeScript(scripts);
		
	   int i =0;
	   while(!text.equalsIgnoreCase("Iraq"))
	  {
		 i++;
		 FromPlace.sendKeys(Keys.ARROW_DOWN);
		   
		  text =(String) js.executeScript(scripts);
			System.out.println(text);
			
			if (i>7)
				break;
	
	 }	
		
	 FromPlace.sendKeys(Keys.ENTER);
		
	}

}
