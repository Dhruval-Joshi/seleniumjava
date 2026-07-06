package seleniumjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandledemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		//String mainwindow1 = driver.getWindowHandle();
		
		//System.out.println(mainwindow1);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> handler =  driver.getWindowHandles();
		
		List<String> windowhandle = new ArrayList<String>(handler);
		
		/*for(String ele : windowhandle) {
			
			System.out.println(ele);
		}*/
		
		for(int i =0; i<= windowhandle.size()-1; i++) {
			
			System.out.println(windowhandle.get(i));
			
			driver.switchTo().window(windowhandle.get(i));
			
			System.out.println(driver.getTitle());
			
			
			if((driver.getTitle()).equals("Human Resources Management Software | HRMS | OrangeHRM")){
				
				driver.close();
			}
					
		}
		
		//System.out.println(driver.getTitle());
	
	     }
				/*String wave1 = driver.getTitle();
		
		if(wave1.equals("OrangeHRM"))
		{
			driver.close();
		}
 
		System.out.println(handler);
	}*/

}
