package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapchat_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.snapchat.com/");
		
		driver.findElement(By.name("accountIdentifier")).sendKeys("erydfhj@");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		


	}

}
