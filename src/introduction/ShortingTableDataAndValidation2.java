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

public class ShortingTableDataAndValidation2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalList = new ArrayList<String>();

		for (int i = 0; i < firstColList.size(); i++)

		{

			originalList.add(firstColList.get(i).getText());

		}

		ArrayList<String> copiedList = new ArrayList<String>();

		for (int i = 0; i < originalList.size(); i++)

		{

			copiedList.add(originalList.get(i));

		}

		Collections.sort(copiedList);

		// Collections.reverse(copiedList);

		for (String s1 : originalList)

		{

			System.out.println(s1);

		}

		System.out.println("*******************");

		for (String s2 : copiedList)

		{

			System.out.println(s2);

		}

		Assert.assertTrue(originalList.equals(copiedList));

	}

}