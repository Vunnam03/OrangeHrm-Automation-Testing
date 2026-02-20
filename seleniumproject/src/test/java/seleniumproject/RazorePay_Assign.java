package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RazorePay_Assign {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.razorpay.com/");
		
		driver.findElement(By.name("input-unknown")).sendKeys(" vunsmsfhjehfjh@gmail.com");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	}

}
