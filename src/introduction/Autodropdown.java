package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Autodropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/"); // URL in the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// System.out.println(driver.findElement(By.id("Div1")).isEnabled());

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

			System.out.println("Is enabled");
			Assert.assertTrue(true);

		}

		else

		{
			Assert.assertTrue(false);
		}

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		Thread.sleep(1000);
		s.selectByIndex(3);

		Thread.sleep(2000);

		driver.findElement(By.id("divpaxinfo")).click();
		for (int a = 1; a < 6; a++) {

			driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys(Keys.ARROW_DOWN);
		}

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		// driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys(Keys.DOWN);

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']")).click();

		Thread.sleep(1000);

		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		/*
		 * driver.findElement(By.
		 * xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).
		 * click(); driver.findElement(By.id("ui-datepicker-trigger")).click();
		 * driver.findElement(By.
		 * xpath("//(a[@class='ui-state-default ui-state-highlight ui-state-active']")
		 */

	}

}
