package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		int rownumber =driver.findElements(By.xpath("//table[@name= 'BookTable']//tr")).size();
		
		int columnnumber = driver.findElements(By.xpath("//table[@name= 'BookTable']//tr[2]/td")).size();
		
		System.out.println(columnnumber);
		System.out.println(rownumber);
		
		for(int i =2; i<=rownumber; i++) {
			
			for(int j =1; j<=columnnumber; j++) {
				
			   String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
			   if (value.equals("Amit")) {
				  String bookName =  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[1]")).getText();
				  System.out.println(bookName);
				  
			   }
			   //System.out.println(value);
			}
		} 
		
		//print the book name given by Amit
		
	driver.quit();
			
	}
	
	

}
