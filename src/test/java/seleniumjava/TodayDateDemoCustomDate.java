package seleniumjava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayDateDemoCustomDate {
	
	static void monthandyear(WebDriver driver, String expectedMonth, String expectedYear) {
		while(true) {
		String currentMonth = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-month']")).getText();
		String currentyear = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-year']")).getText();
		
		if((currentMonth.equals(expectedMonth)) && currentyear.equals(expectedYear)){
			break;
		}
		
		driver.findElement(By.xpath("//span[text() ='Next']")).click();
		}
		}
	
	static void date(WebDriver driver,  String expectedDate) {
	List<WebElement>AllDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td/a"));

	for(WebElement date : AllDates) {
		
		//System.out.println(date.getText());
		if((date.getText()).equals(expectedDate)) {
		date.click();
		break;
	}}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		//String CurrentDate = driver.findElement(null)
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		String expectedYear = "2028";
		String expectedMonth = "January";
		String expectedDate = "30";
		 
		monthandyear(driver,expectedMonth,expectedYear);
		
	    date(driver, expectedDate);
		//driver.findElement(By.xpath("//span[text() = 'previous']")).click();
		
		
	}

}
