package introduction;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parenandchildwindowgetter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.manage().window().maximize();
   
   driver.get("https://accounts.google.com/signup");
   // System.out.println(driver.getTitle());
   driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click(); 
   Set<String> ids = driver.getWindowHandles();

   Iterator<String> it = ids.iterator();
   String baapId = it.next();
   String cheleId=it.next();
   driver.switchTo().window(cheleId);
 
   
   driver.findElement(By.xpath("//a[contains(text(),'Archived versions')]")).click(); // second child window.
   System.out.println(driver.getTitle());
   System.out.println("Script Written by Sheikh");
   
   
   driver.switchTo().window(cheleId);      // switching back to 1st child window.
   System.out.println(driver.getTitle());
   
   
   driver.switchTo().window(baapId);   // to parent window.
   
   System.out.println(driver.getTitle());
	
	
  //driver.quit(); // closing all windows.
	
		
		
	}

}
