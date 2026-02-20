package finalproject;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leave_Module {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	       
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       Thread.sleep(3000);
	       
	     // Login
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(3000);
	       System.out.println(" Login Succesfully");
	       Thread.sleep(3000);
		
		//Leave Module
	       
	      driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[3]")).click(); //leave
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).click();
	       Thread.sleep(3000);
	       
	      WebElement A = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	      A.sendKeys(Keys.CONTROL +"a");
	      A.sendKeys(Keys.DELETE);
	      A.sendKeys("2025-03-20");
	     Thread.sleep(3000);
	      WebElement B = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
	      B.sendKeys(Keys.CONTROL+"a");
	      B.sendKeys(Keys.DELETE);
	      B.sendKeys("2025-04-12");
	      
	      //driver.findElement(By.xpath("")).
	       
	
		
	}

}
