package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sizecount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/"); // URL in the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();

		WebElement Tufail = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));

		Select jamai = new Select(Tufail);
		jamai.selectByValue("3");

		WebElement Prapti = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select jan = new Select(Prapti);
		jan.selectByValue("3");

		WebElement sara = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select babu = new Select(sara);
		babu.selectByValue("2");

		driver.findElement(By.id("divpaxinfo")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult, 3 Child, 2 Infant");

	}

}
