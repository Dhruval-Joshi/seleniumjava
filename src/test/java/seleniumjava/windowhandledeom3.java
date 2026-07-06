package seleniumjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandledeom3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://academy.swaroopnadella.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com/");
		
		Set<String> window = driver.getWindowHandles();
		
		List<String> window2 = new ArrayList <>(window);
		
		String parentwindow = window2.get(0);
		String childwindow = window2.get(1);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentwindow);
		
		System.out.println(driver.getTitle());
		

	}

}
