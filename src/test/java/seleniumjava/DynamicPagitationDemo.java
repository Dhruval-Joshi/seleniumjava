package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagitationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.id("example_info")).getText();
		
		System.out.println(text);
		
        String text2 = text.substring(text.indexOf("to")+3,text.indexOf("of")-1);
        
        System.out.println(text2);
        
        int pageno = Integer.parseInt(text2);
        
        System.out.println(pageno);
        
        
        //Thread.sleep(5000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,800)","");
       // int page = 2;
        //driver.findElement(By.xpath("//ul[@class='pagination']//a[text()='2']")).click();
        
      for(int page=1; page<= pageno; page++) {
        	
        	if(page>1) {
        		driver.findElement(By.xpath("//ul[@class='pagination']//a[text()='"+page+"']")).click();
        	}
        	
        	int row = driver.findElements(By.xpath("//table[@id='example']//tr[1]/td")).size();
        	System.out.println(row);
        	String StudentName = driver.findElement(By.xpath("//table[@id='example']//tr["+page+"]/td[1]")).getText();      
        	System.out.println(StudentName);
        	String Gender = driver.findElement(By.xpath("//table[@id='example']//tr["+page+"]//td[2]")).getText();
         	System.out.println(Gender+" \t"+StudentName);
      }

		//Showing 1 to 3 of 10 entries
	}

}
