package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyGreenKarttest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
			
		String[] itemsNeeded =  {"Cucumber", "Beetroot", "Tomato", "Apple", "Corn" };
		addItems(driver,itemsNeeded );
		
		/*  MyGreenKarttest b= new MyGreenKarttest();  // this if public is not static. calling base.
		b.addItems(driver, itemsNeeded); */
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.cssSelector("input.PromoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
		
		
	}
	
public static void addItems (WebDriver driver, String[] itemsNeeded) throws InterruptedException
	// TODO Auto-generated method stub
{
	
	
	
	
	
	List<WebElement> finder = driver.findElements(By.cssSelector("h4.product-name"));
	
	int j = 0;
	for (int t = 0; t<finder.size(); t++){
		
	String [] p =(finder.get(t).getText().split("-"));
	String s= p[0].trim();

	List q = Arrays.asList(itemsNeeded);
		
	if (q.contains(s))

	{
		j++;
		
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(t).click();
		if (j==itemsNeeded.length )
		   break;
	
	}
	
				
	}


	// Thread.sleep(3000);
	/*
	 WebElement deshes = driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
	deshes.click();
	Select countries = new Select (deshes);
			
	countries.selectByVisibleText("Bangladesh");
	
	
	driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	
	*/
}	
	
}
