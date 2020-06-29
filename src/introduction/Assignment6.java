package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\\\Downloads\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement a = driver.findElement(By.id("checkBoxOption2"));
		a.click();
		String t = driver.findElement(By.xpath("//div[@class='right-align']//label[2]")).getText();

		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(t);
		
		driver.findElement(By.id("name")).sendKeys(t);
		driver.findElement(By.id("alertbtn")).click();

		String f = driver.switchTo().alert().getText();
		if (f.contains(t))

		{
			System.out.println("sheikh all good");
		}

		else
		{
			
			System.out.println("wrong code");

		}

	}

}
