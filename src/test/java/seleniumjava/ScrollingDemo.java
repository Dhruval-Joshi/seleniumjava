package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		WebElement nameTextbox = driver.findElement(By.id("name"));
		
		js.executeScript("arguments[0].setAttribute('value','Dhruval')",nameTextbox);
		
		WebElement radiobutton = driver.findElement(By.id("male"));
		
		js.executeScript("arguments[0].click()", radiobutton);
		
		WebElement button = driver.findElement(By.xpath("//button[text()= 'Point Me']"));
		
		js.executeScript("arguments[0].scrollIntoView()", button);
		
		
		

	}

}
