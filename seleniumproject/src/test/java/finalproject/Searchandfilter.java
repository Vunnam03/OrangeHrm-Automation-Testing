package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchandfilter {

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
	       //User management filter
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();//Admin
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Admin");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();//search
		   System.out.println("search");
		   driver.findElement(By.xpath("//div[@class='oxd-table']")).isDisplayed();
		   System.out.println("Userfilter applied");
		   //Employee list filter
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();//PIM
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("peter");
		      
	       Actions A =new Actions(driver);
	       A.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	       
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[@row-decorator='oxd-table-decorator-card']")).isDisplayed();
	       System.out.println("Employee filter");
	       //Leave list filter
	       Thread.sleep(5000);
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click(); //leave
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).click();
	       Thread.sleep(5000);   
	      WebElement b = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	      b.sendKeys(Keys.CONTROL+"a");
	      b.sendKeys(Keys.DELETE);
	      b.sendKeys("2025-03-20");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      driver.findElement(By.xpath("//div[@row-decorator='oxd-table-decorator-card']")).isDisplayed();
	      System.out.println("Leave filter");
	      driver.quit();


	       

	}

}
