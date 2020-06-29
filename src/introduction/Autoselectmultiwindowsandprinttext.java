package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoselectmultiwindowsandprinttext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
		
 WebDriver driver = new ChromeDriver();
 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement child = driver.findElement(By.id("gf-BIG"));
		
		//System.out.println(child.findElements(By.tagName("a")).size());  // if they ask only print.
		//WebElement subchild = child.findElement(By.xpath("table/tbody/tr/td[1]/ul"));	// 0r use next xpath.
		
		WebElement subchild = child.findElement(By.xpath("//td[1]//ul[1]"));
		
		System.out.println(subchild.findElements(By.tagName("a")).size());
		
		for (int i = 1; i<subchild.findElements(By.tagName("a")).size(); i++)
		
		{
			 String clickkeys = Keys.chord(Keys.CONTROL, Keys.ENTER);
			subchild.findElements(By.tagName("a")).get(i).sendKeys(clickkeys);
			Thread.sleep(5000);
			
		}
		
		Set <String> allIds =driver.getWindowHandles();
		
		Iterator <String> it = allIds.iterator();
		
		
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();
		}
		
			
		
	}

}
