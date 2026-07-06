package seleniumjava;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.java.swing.plaf.windows.resources.windows;

public class PaginatinTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://academy.swaroopnadella.com/");
		 
         driver.manage().window().maximize();
         
         WebElement webinar = driver.findElement(By.linkText("Webinars"));
         
         Actions actionObj = new Actions(driver);
         
         //driver.switchTo().frame(0)
         
         actionObj.keyDown(Keys.CONTROL).keyDown(Keys.TAB).click(webinar).keyUp(Keys.CONTROL).perform();
         
         List<String> window = new ArrayList<String>(driver.getWindowHandles());
         
         driver.switchTo().window(window.get(1));
         
        //driver.switchTo().frame(null)
         
        String text =driver.findElement(By.xpath("//p[text()= 'No webinar scheduled yet. Please check back later']")).getText();
         
        System.out.println(text);
        
        driver.switchTo().window(window.get(0));
        
       System.out.println(driver.getTitle());
		 
		 
	}

}
