package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricTracker_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
				
				WebDriver driver =new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get(" https://www.crictracker.com/sign-in/");
				
				 driver.findElement(By.id("emailPhone")).sendKeys("vfryurtrije@gmail.com");
				 
				 driver.findElement(By.id("password")).sendKeys("fhuurjurtjhgjhghj");
				 
				 driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
