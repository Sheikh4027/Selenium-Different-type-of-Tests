package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforseCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Tufail");
		driver.findElement(By.cssSelector("input[name='pw'")).sendKeys("Prapti");
		driver.findElement(By.cssSelector("input[id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
