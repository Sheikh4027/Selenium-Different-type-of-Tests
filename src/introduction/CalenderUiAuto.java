package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUiAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		
		
		   driver.get("https://www.cheapoair.com/");

		    driver.manage().window().maximize();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@id='cal0']")).click();

		    while(!driver.findElement(By.cssSelector("div[class='calendar__single-month active'] [class='calendar__month']")).getText().contains("May 2021"))

		    {

		        driver.findElement(By.xpath("//a[@class='calendar-nav__next icon  rightNav']")).click();

		    }

		    List<WebElement> dates= driver.findElements(By.xpath("//div[@class='calendar__single-month active']//div//a"));

		    int count=dates.size();

		    System.out.println(count);

		    for (int i = 0; i < count; i++)

		    {

		      String text=driver.findElements(By.xpath("//div[@class='calendar__single-month active']//div//a")).get(i).getText();

		  if(text.equals("26"))

		  {

		driver.findElements(By.xpath("//div[@class='calendar__single-month active']//div//a")).get(i).click();

		System.out.println(text);

		break;

		  }

		    }

		}
		
	

}
