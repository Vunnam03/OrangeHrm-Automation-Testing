package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageSupport {

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
	       
	     //admin
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();//Admin
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[5]")).click(); //configuration
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[3]")).click();//localization
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
	       Actions A =new Actions(driver);
	       A.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	       
	       driver.findElement(By.xpath("//button[@type='submit']")).click();//save
	       System.out.println("Successfully saved");
	       driver.quit();
	       



	}

}
