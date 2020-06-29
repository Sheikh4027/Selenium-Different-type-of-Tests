package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScoreCardCountTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	WebElement table =	driver.findElement(By.id("product"));
	System.out.println( table.findElements(By.xpath("//tbody//tr")).size());
	System.out.println(table.findElements(By.xpath("//body//tr//th")).size());	
	
	// or this- System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

     //List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	
	
	List<WebElement> columList = table.findElements(By.xpath("//tr[3]//td"));
	System.out.println(columList.get(0).getText());
	System.out.println(columList.get(1).getText());
	System.out.println(columList.get(2).getText());
	
	
	}

}
