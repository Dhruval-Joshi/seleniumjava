package seleniumjava;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EndtoEndDeom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement Men= driver.findElement(By.xpath("//div[@class= 'desktop-navLink']/a[text()='Men']"));
		
		Actions actobj = new Actions(driver);
		
		actobj.moveToElement(Men).perform();
		
		driver.findElement(By.linkText("Sweatshirts")).click();
		
		driver.findElement(By.xpath("//img[@class = 'img-responsive']")).click();
		
		String window2 = new ArrayList<String>(driver.getWindowHandles()).get(1);
		
		driver.switchTo().window(window2);
		
		String productTitle = driver.findElement(By.className("pdp-title")).getText();
		
		System.out.println(productTitle);
		
		String productPrice = driver.findElement(By.className("pdp-price")).getText();
		
		System.out.println(productPrice);
		
		List<WebElement> button_size = driver.findElements(By.className("size-buttons-size-button"));
		
		String product_size = "";
		
		for(WebElement button : button_size) {
			
			product_size = button.getText();
			System.out.println(product_size);
			
			if((product_size).equals("M")) {
			 
			button.click();
			break;
			
			}
			//button.click();
			//Thread.sleep(5000);
		
		
		//System.out.println(product_size);
		
		//driver.findElement(By.xpath("//div[text()= 'ADD TO BAG']"));)
				
		
	}
		driver.findElement(By.xpath("//div[text()= 'ADD TO BAG']")).click();
		
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		//driver.switchTo().alert().dismiss();
}}
