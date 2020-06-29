package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tautomationapage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spirit.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		
		WebElement source = driver.findElement(By.id("flight-OriginStationCode"));
		
		source.clear();

		source.click();
		source.sendKeys("LGA");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("flight-DestinationStationCode")).sendKeys("LAX");
		
				
		Thread.sleep(1000);
		
		driver.findElement(By.id("passengers")).click();
		
		for(int i =1; i<6; i++)
	
		{
		
			driver.findElement(By.cssSelector("i[class*='icon-add-circle']")).click();
		
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[class*='col-sm']")).submit();
		
		
		
		
		
		
		
	}

	
	}


