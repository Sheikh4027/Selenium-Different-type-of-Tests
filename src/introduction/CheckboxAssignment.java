package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement T = driver.findElement(By.id("Adults"));
		Select t = new Select(T);
		t.selectByValue("3");

		WebElement Child = driver.findElement(By.id("Childrens"));
		Select c = new Select(Child);
		c.selectByValue("2");

		Thread.sleep(1000);

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		driver.findElement(By.id("MoreOptionsDiv")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("JetAir");
		driver.findElement(By.id("SearchBtn")).submit();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
