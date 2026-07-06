package seleniumjava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
	    int column = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
	    
	    System.out.println("Column "+column);
	    
	    int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	    
	    System.out.println(rows);
	    
	    List<WebElement> data = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td"));
	    		
		for(int i =2; i<= rows; i++) {
			
		    for(int j=1; j<=column; j++) {
		    	
		       String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]")).getText();
		       System.out.print(text+"  ");
		    }
		   System.out.println();
		    
		}
		
	}

}
