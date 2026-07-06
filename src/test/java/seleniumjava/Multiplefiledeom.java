package seleniumjava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplefiledeom {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		driver.manage().window().maximize();
		
		WebElement chooseKey = driver.findElement(By.id("filesToUpload"));
	
		String file1 = "C:\\Users\\HP\\Desktop\\Dhruval.txt";
		String file2 = "C:\\Users\\HP\\Desktop\\Dhruval2.txt";
		
		
		chooseKey.sendKeys(file1+"\n"+file2);
		
		List<WebElement> text = driver.findElements(By.xpath("//ul[@id ='fileList']//li"));
		for(WebElement ele : text) {
			System.out.println(ele.getText());
		}
	

	}

}
