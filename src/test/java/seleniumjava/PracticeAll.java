package seleniumjava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String input =driver.findElement(By.xpath("//label[text()='Name:']")).getText();
		
		System.out.println(input);
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("Dhruval");
		
		WebElement Malen = driver.findElement(By.id("male"));
		
		Malen.click();
		
		System.out.println(Malen.isSelected());
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//driver.get("https://www.google.com");
		
		WebElement option = driver.findElement(By.id("country"));
		
		Select dd1 = new Select(option);
		
		dd1.selectByVisibleText("Canada");
		dd1.selectByIndex(0);
		dd1.selectByValue("uk");
		
		//retrieving all the option in the dropdown
		
		List<WebElement> optionAll = dd1.getOptions();
		
		for(WebElement ele : optionAll) {
			
			String ele2 = ele.getText();
			System.out.println(ele2);
			
			if(ele2.equals("Germany")) {
			 System.out.println("The ele into if loop  "+ele2);
			
			}
		}
	   driver.findElement(By.xpath("//input[@class= 'wikipedia-search-input']")).sendKeys("Selenium");
	     
	   driver.findElement(By.xpath("//input[@class= 'wikipedia-search-button']")).click();
	   
	   List<WebElement> options = driver.findElements(By.xpath("//div[@id = 'wikipedia-search-result-link']/a"));
	   
	   for(int i =0; i < options.size(); i++) {
		   
		   String text = options.get(i).getText();
		   
		   System.out.println(text);
		   
		  if (text.equals("Selenium")) {
			   
			   options.get(i).click();
		   }
	   }
	   
	}

}
