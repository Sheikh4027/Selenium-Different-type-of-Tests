package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJetAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	driver.findElement(By.cssSelector("a[text ='Ahmedabad (AMD)']")).click();

 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JDH']")).click();
     driver.findElement(By.cssSelector("a[class*='ui-state-default ui-state-active']")).click();
     
     driver.findElement(By.id("divpaxinfo")).click();
     
     WebElement T = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
     Select a =new Select(T);
     a.selectByValue("5");
     
     WebElement P = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
     Select f = new Select(P);
     f.selectByValue("2");
     
     WebElement S = driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
     Select h =new Select(S);
     h.selectByValue("2");
     
   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
     driver.findElement(By.id("divpaxinfo")).click();
    
  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
     
     
     driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys(Keys.DOWN);
     
     driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
     
     driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
     System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
     Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
     
    
    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    
     
     
     Thread.sleep(1000);
    
    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
    
     
     
    		
	}

}
