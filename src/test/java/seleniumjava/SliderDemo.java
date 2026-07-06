package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");
		
		driver.manage().window().maximize();
		
		WebElement minSlider = driver.findElement(By.id("ageInputId"));
		
		WebElement maxSlider = driver.findElement(By.id("ageOutputId"));
		
		System.out.println(minSlider.getLocation());
		
		Actions actObj = new Actions(driver);
		
		actObj.dragAndDropBy(minSlider,20,0).build().perform();
		
		System.out.println(minSlider.getLocation());

	}

}
