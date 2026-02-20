package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmployeeInfo {

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
	       System.out.println("Login Succesfully");
	     //PIM ACCESS
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();//PIM
	       Thread.sleep(3000);
	       //personal details validation
	       driver.findElement(By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[1]")).click();//edit
	       Thread.sleep(3000);
           driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")).isDisplayed();
           System.out.println(" Personal details");
           //Job details validation
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//a[@class='orangehrm-tabs-item'])[5]")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")).isDisplayed();
           System.out.println("Job details");
           //contact details validation
           driver.findElement(By.xpath("(//a[@class='orangehrm-tabs-item'])[2]")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")).isDisplayed();
           System.out.println("contact details");
           // dependents validation
           driver.findElement(By.xpath("(//a[@class='orangehrm-tabs-item'])[4]")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])[1]")).isDisplayed();
			System.out.println("Dependents validation");
			driver.quit();
	
		}
	
	}
