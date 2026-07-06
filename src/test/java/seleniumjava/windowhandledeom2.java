package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandledeom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://academy.swaroopnadella.com/");
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		String childwindow = driver.getWindowHandle();
		
		
		
		if (driver.getTitle().equals("Google")){
			
			driver.close();
			
		}
		
       driver.switchTo().window(parentwindow);
       System.out.println(driver.getTitle());
	}

}
