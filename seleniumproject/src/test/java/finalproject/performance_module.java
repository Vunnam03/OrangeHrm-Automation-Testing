package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class performance_module {

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
	       
	       //performance module
	       
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[7]")).click();
	       Thread.sleep(3000);
	       //goal tracking
	       driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")).click(); // configure
	       driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")).click(); //KPI
	       System.out.println("Goal Tracking page opened(KPI)");
	       
	       //Review submission
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
	       driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[2]")).click();
	       System.out.println("MY Review page is opened");
	       
	       // manager evaluation & Review cycle
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();

	       driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[1]")).click();
	       System.out.println("Manger Reviews page is opened");
	       
	       //feedback form validation without filling
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click(); //add
	       driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	       System.out.println("feedback validation working");
	       
	}
	

}
