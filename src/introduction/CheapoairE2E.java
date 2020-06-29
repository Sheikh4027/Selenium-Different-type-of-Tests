package introduction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CheapoairE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.cssSelector("label[for='onewayTrip']")).click();
		driver.findElement(By.cssSelector("div[class='widget__input']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("li[class*='login dropdown']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("li[class*='login dropdown']")).getText());
	
		WebElement source = driver.findElement(By.cssSelector("#from0"));
		source.sendKeys("EWR");
		source.click();
		WebElement destination = driver.findElement(By.id("to0"));
		destination.sendKeys("ACY");
		Thread.sleep(1000);
		destination.sendKeys(Keys.ENTER);

		// Thread.sleep(3000);

		while (!driver.findElement(By.cssSelector("div[class='calendar__single-month active'] [class='calendar__month']")).getText().contains("May 2021"))

		{

			driver.findElement(By.xpath("//a[@class='calendar-nav__next icon  rightNav']")).click();

		}

		List<WebElement> alldays = driver.findElements(By.cssSelector(".month-date.date-space"));
		int count = alldays.size();
		for (int i = 0; i < count; i++) {
			
			String texts = alldays.get(i).getText();
			
			if (texts.equals("17")) {
				alldays.get(i).click();
				System.out.println(texts);
				break;
			
			}

		}

		driver.findElement(By.id("travellerButton")).click();
		driver.findElement(By.id("addadults")).click();
		driver.findElement(By.id("addyouth")).click();
		driver.findElement(By.id("addchild")).click();
		WebElement t = driver.findElement(By.xpath("//select[contains(@name,'ChildrenAge')]"));
		t.click();
		Select ages = new Select(t);
		ages.selectByVisibleText("4");
		t.click();

		Thread.sleep(1000);

		WebElement p = driver.findElement(By.xpath("//select[@id='Class']"));
		Select seats = new Select(p);
		seats.selectByVisibleText("Business");

		driver.findElement(By.id("closeDealDialog")).click();

		driver.findElement(By.id("searchNow")).click();
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.id("hotels")).click();

		WebElement hover = driver.findElement(By.xpath("//a[@class='navigation__link dropdown-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(hover).click().build().perform();
		WebElement alltabs = driver.findElement(By.className("banner"));
		WebElement minilinks = alltabs.findElement(By.xpath("//li[@class='navigation__item mega-menu__dropdown show']//li[1]"));
		System.out.println(minilinks.findElements(By.tagName("a")).size());

		for (int j = 0; j < minilinks.findElements(By.tagName("a")).size(); j++) {
			String keyset = Keys.chord(Keys.CONTROL, Keys.ENTER);
			minilinks.findElements(By.tagName("a")).get(j).sendKeys(keyset);
		}

		Set<String> allwindows = driver.getWindowHandles();

		Iterator<String> it = allwindows.iterator();
		
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		
		

	}

}
