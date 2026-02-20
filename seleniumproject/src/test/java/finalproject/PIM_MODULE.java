package finalproject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PIM_MODULE {

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
	       
	       //PIM ACCESS
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();//PIM
	       Thread.sleep(3000);
	       // Add Functionality
	       driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();//add
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gowthami");//first name
	       
	       driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("vunnam");//middle
	       driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("chowdary");// last
	       Thread.sleep(3000);
	    
	      driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']")).click();//profile pic
	      Thread.sleep(5000);
	       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("4");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@type='submit']")).click();//submit
	      Thread.sleep(3000);

	      System.out.println("Employee Added");
	      
	      //search the employee by name in list
	      driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
	      Thread.sleep(3000);
	       driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Gowthami");
	      
	       Actions A =new Actions(driver);
	       A.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	       
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       System.out.println("Record found");
	       Thread.sleep(3000);
	       //edit the employee record
	       driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("s");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]")).click();
	       System.out.println("Updated succesfully");
	       driver.quit();
	      

	}

}
