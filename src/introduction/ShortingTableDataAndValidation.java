package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ShortingTableDataAndValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//driver.findElement(By.xpath("//tr//th[2]")).click(); // manual way of descending order.
		//driver.findElement(By.xpath("//tr//th[2]")).click();  // making ascending order by clicking.
		
		List<WebElement> firstList = driver.findElements(By.xpath("//tr//td[2]"));
		
		ArrayList<String>originalList = new ArrayList<String>();	
		
		for(int i=0; i<firstList.size(); i++)
		{
			originalList.add(firstList.get(i).getText());
		}
		
	    ArrayList<String>copyList= new ArrayList<String>();
		
	    for(int i =0; i<originalList.size() ;i++)
		{
		  copyList.add(originalList.get(i)); 
		}
		
		System.out.println(copyList);    //copy of originalList. that should be same as originalList.
		
		System.out.println("AfterShorting");
		
		Collections.sort(copyList);
		
		       //Collections.reverse(copyList);   // reverse it to descending order.
		
		System.out.println(copyList);
		
		Assert.assertTrue(originalList.equals(copyList));
		
		
	}

	

}
