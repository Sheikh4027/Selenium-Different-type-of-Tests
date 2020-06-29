package introduction;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiw {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   //driver.manage().window().maximize();
		   
		   driver.get("https://the-internet.herokuapp.com/");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		  
		   String Paa = driver.getWindowHandle();
		   
		   Thread.sleep(1000);
		   driver.findElement(By.cssSelector("a[target='_blank']")).click();
		   
		   Set<String> ids = driver.getWindowHandles();

		   Iterator<String> it = ids.iterator();
		   String cId=it.next();
		 
		   String sub= it.next();
		   
		   Thread.sleep(2000);
		   driver.switchTo().window(cId);
		  // System.out.println(driver.getTitle());
		  
		   driver.switchTo().window(sub);
		   
		   driver.findElement(By.cssSelector("div[class='example']"));
		   
		   System.out.println(driver.getTitle());
		  driver.close();
		   Thread.sleep(2000);
		   
		  
		   
		   driver.switchTo().window(cId);
		   System.out.println("tuf");
		  System.out.println(driver.getCurrentUrl());
		  
		  Thread.sleep(2000);
		  
		  driver.switchTo().window(Paa);
		  System.out.println(driver.getTitle());
		  driver.quit();
		   
		
		
		
		
	}

}
