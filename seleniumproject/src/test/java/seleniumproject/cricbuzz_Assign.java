package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricbuzz_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
		
		driver.findElement(By.id("cb-user-email-input")).sendKeys("vunsdmdjijdkf@gmail.com");

		
		driver.findElement(By.xpath(" //button[@class='cb-col-100 cb-more-btn cb-font-14 cb-continue-button']")).click();
	}
	
		

}
