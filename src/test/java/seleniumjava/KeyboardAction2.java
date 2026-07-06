package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://academy.swaroopnadella.com/");
		
		driver.manage().window().maximize();
		
		WebElement webinar = driver.findElement(By.linkText("Webinars"));
		
		Actions actobj = new Actions(driver);
		
		actobj.keyDown(Keys.CONTROL).click(webinar).keyUp(Keys.CONTROL).perform();
		
		
		
	}

}
