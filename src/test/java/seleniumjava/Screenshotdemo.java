package seleniumjava;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://academy.swaroopnadella.com/");
		
		driver.manage().window().maximize();
		
		WebElement display = driver.findElement(By.xpath("//div[@class = 'display']"));
		
	//	TakesScreenshot ts = (TakesScreenshot) driver;
		
	/*	File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		//File targetfile = new File("C:\\Users\\HP\\eclipse-workspace\\seleniumjava\\src\\test\\java\\Screenshot\\fullpage.png");
		
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
		
		sourcefile.renameTo(targetfile);*/
		
       File sourcefile = display.getScreenshotAs(OutputType.FILE);
		
		//File targetfile = new File("C:\\Users\\HP\\eclipse-workspace\\seleniumjava\\src\\test\\java\\Screenshot\\fullpage.png");
		
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\halfpage.png");
		
		sourcefile.renameTo(targetfile);
		
		
	}

}
