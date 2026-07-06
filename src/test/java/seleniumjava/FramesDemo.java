package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src ='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.name("mytext3")).sendKeys("Nadella in fram3");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("i21")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
		
		
		
		driver.quit();
		
		
		
	}
	

}
