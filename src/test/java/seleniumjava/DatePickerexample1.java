package seleniumjava;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement dateInput = driver.findElement(By.id("datepicker"));
		
		dateInput.click();
		
		String exdate = "15";
		String exmonth = "July";
		String exyear = "2026";
		
	String currentmonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(currentmonth);
		System.out.println(currentyear);
		
		   if((!currentmonth.equals(exmonth)) && (!currentyear.equals(exmonth))){
        	
        	driver.findElement(By.xpath("//span[text()='Next']")).click();
        	
        }
		   
		List<WebElement> currentdat1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement ele : currentdat1) {
			 String currentdat2 = ele.getText();
			  System.out.println(currentdat2);
			  if((currentdat2.equals(exdate))) {
				  ele.click();
				  break;
			
		}
		 
	

}}}
