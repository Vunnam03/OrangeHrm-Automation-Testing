package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginfunctionality {

	public static void main(String[] args) throws InterruptedException {
	
       WebDriverManager.chromedriver().setup();
       
       WebDriver driver=new ChromeDriver();
       
     
       driver.manage().window().maximize();
       
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(3000);
       
       //VALID CREDENTIALS
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(3000);
       System.out.println(" Login Succesfully");
       
       //LOGOUT
       driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
       
       //check whether redirected to login page
       System.out.println("Redirected to Login Page");
       
       //Invalid Credentials
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("1234");
       
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
       
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       System.out.println("invalid credentials");
       
       driver.quit();

       
		
	}

}
