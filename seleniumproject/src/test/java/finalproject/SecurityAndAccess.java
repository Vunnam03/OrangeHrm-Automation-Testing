package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecurityAndAccess {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	       
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       Thread.sleep(3000);
	       
	     // Login as admin
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(3000);
	       System.out.println(" Login ");
	       //Admin access page directly
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"); 
	       Thread.sleep(3000);
	       System.out.println("Accessed as Admin");
	       //logout
	       driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();

	       System.out.println("Successfully Logout");
	       //Again login as Employee
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Manukarnika");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Manu@123");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(3000);
	       System.out.println("Login as employee");
	       //Access admin as employee
	       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	       Thread.sleep(3000);
	       System.out.println("Access denied");
	       driver.quit();
	       

	       
		
	}

}
