package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yatra_RadioButt {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.yatra.com/social/common/yatra/signin.htm");
		
		driver.findElement(By.xpath("//input[@id='login-input']")).sendKeys("Manikarnika@03gmail.com");
		
		driver.findElement(By.xpath(" //button[@id='login-continue-btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='signup-mobile-number']")).sendKeys("6578493789");	
		
		driver.findElement(By.xpath("//input[@id='signup-password']")).sendKeys("Mani@03");
		
		driver.findElement(By.xpath(" //select[@id='signup-user-designation']")).sendKeys("ms");
	
		driver.findElement(By.xpath(" //input[@id='signup-user-first-name']")).sendKeys("manu");
		
		driver.findElement(By.xpath("//input[@id='signup-user-last-name']")).sendKeys("karnika");
		
		driver.findElement(By.xpath("//label[@for='specialPromoNotif']")).click();
		
		driver.findElement(By.xpath(" //label[@for='whatsAppNotif']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@id='signup-form-continue-btn']")).click();	
		
		driver.findElement(By.xpath("//a[@aria-label='Yatra']")).click();

	}

}
