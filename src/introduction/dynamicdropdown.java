package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		Thread.sleep(4000);

		// Selection of Adults

		WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

		Select adultsdrp = new Select(Adults);

		adultsdrp.selectByValue("2");

		// Selection of Childs

		WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));

		Select childsdrp = new Select(childs);

		childsdrp.selectByValue("2");

		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());

	}

}
