package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int j = 0;    // declaring a variable name 'j'.
		
		String[] itemsNeeds = { "Brocolli", "Cucumber", "Beetroot", "Tomato", "Apple", "Corn" }; //array is name itemsNeeds here.
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name")); // give a name to the webElement list - 'P'.

		Thread.sleep(3000);
		
		for (int i = 0; i < Products.size(); i++) {

			String[] name = (Products.get(i).getText()).split("-");  // splitting a data(name/produc) inside a array.
			String formatedNames = name[0].trim();

			                                    
			 List<String> t = Arrays.asList(itemsNeeds);    //array list creation from array
			 
			
			if (t.contains(formatedNames)) 
			
			{
			  j++;
			  
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if ( j==itemsNeeds.length )   //  this statement for looping to stop after all array items founded.
				break;

			}
		}

		
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		WebElement alldesh = driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
		alldesh.click();
		Select country = new Select(alldesh);
		country.selectByValue("Bangladesh");
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		
		
	}

}
