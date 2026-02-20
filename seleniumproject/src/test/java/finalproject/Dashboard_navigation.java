package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Dashboard_navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       Thread.sleep(3000);
	       
	        //Login
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(3000);
	       System.out.println("Login Succesfully");
	       //Dashboard Widget
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item active'])")).click();
	       //Dashboard Breadcrumb
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed();
	       System.out.println("Dashboard page ");
	       driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]")).isDisplayed();
	       System.out.println("visibility of Time at work");
	       driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[4]")).isDisplayed();
	       System.out.println("visibilty of Actions");
	       Thread.sleep(3000);
	       //role based content(admin menu)&navigation
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
	       System.out.println("Navigation to Admin page");
	       driver.quit();
	     	      



	}

}
