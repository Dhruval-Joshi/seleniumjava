package seleniumjava;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossWebBrowserTestingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String browser = sc.next();
		
		WebDriver driver;
		
        switch (browser.toUpperCase()){
        
   
        case "CHROME" :
        driver = new ChromeDriver();
        
        case "FIREFOX" :
        driver = new FirefoxDriver();
        
        default :
        	driver = new ChromeDriver();
        		
		}
		
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
		
	}

}
