package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScoreBoardCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));


		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		for (int i = 0; i < count - 2; i++)             // -2 for separating extras and actualtotal runs.
		{

		String runs =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int runvalues = Integer.parseInt(runs);         // converting to integer.
		sum=sum+runvalues;
		}
  
    
	String extraruns = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int Extrarun = Integer.parseInt(extraruns);           // converting to integer.
	int Totalsum = sum+Extrarun;
	
	String totalruns =driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	int Actualruns = Integer.parseInt(totalruns);        // converting to integer.
	
	if (Totalsum==Actualruns)                          // validation.
	{
		System.out.println("allGood");
	}                      
	else {
		System.out.println("wrongScript");
	}
	}

}
