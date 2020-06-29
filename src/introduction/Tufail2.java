package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;


public class Tufail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Selenium code-
		//Create driver object for Firefox browser
		
		
		/* Class name = Gecko driver,
		 *  x driver =new x();*/
		
		 //invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ahmad\\Downloads\\Video\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("tufail");
		driver.findElement(By.name("pw")).sendKeys("Prapti");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		driver.close();
		
		
	
	
	
	
	
	
	
	}

}
