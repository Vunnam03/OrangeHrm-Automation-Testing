package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Alert {

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
	       
	       //admin
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();//Admin
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();//job
	       driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")).click();// job titles
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
	       
	       //add jobtitles
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(" ");
	       
	       //save without filling
		   driver.findElement(By.xpath("//button[@type='submit']")).click();//save
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).isDisplayed();
	       System.out.println("Error alert msg is displayed");
		   
		    driver.quit();


	}

}
