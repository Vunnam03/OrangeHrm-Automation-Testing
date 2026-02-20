package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github_Assign {

	public static void main(String[] args) { 
		
		WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(" https://github.com/login");
	
	driver.findElement(By.name("login")).sendKeys(" mani@43gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("manu");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();


	}

}
