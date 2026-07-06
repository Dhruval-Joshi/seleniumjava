package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement Account = driver.findElement(By.xpath("//button[@class = 'nav-flyout-button nav-icon nav-arrow']"));
		
        WebElement ReuturnedOrdered = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 icp-link-style-2']"));
		
		Actions actionobj = new Actions(driver);
		
		actionobj.moveToElement(Account).build().perform();
		
		actionobj.moveToElement(ReuturnedOrdered).build().perform();
		
		
	}

}
