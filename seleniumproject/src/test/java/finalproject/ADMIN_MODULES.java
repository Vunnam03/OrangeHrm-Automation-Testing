package finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ADMIN_MODULES {

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
	    
	       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();//Admin
	       Thread.sleep(3000);
	     //Add functionality
	       
	       driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click(); //add
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
	       Actions a=new Actions(driver);
	       a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		   driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Bruce");
		   Thread.sleep(3000);
		    a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		  //Verified user role assignment, status toggling (Enabled/Disabled)
		  driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click(); //enabled
		  a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		  driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("Vunnam's");
	      driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Manu@123");
		  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Manu@123");
			 
	      driver.findElement(By.xpath("//button[@type='submit']")).click();//save	
	      System.out.println("added");
		  //Thread.sleep(3000);
		  driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
		  driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']")).click();
	
		    // search Functionality
		  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Vunnam's");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
	      Thread.sleep(3000);
		   a.sendKeys(Keys.ARROW_DOWN).build().perform();
	       a.sendKeys(Keys.ARROW_DOWN).build().perform();

		 driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
			  
		 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Bruce");
		Thread.sleep(5000);
			  
		 a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
		 driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
			  
		 a.sendKeys(Keys.ARROW_DOWN).build().perform();
	   driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();
	   driver.findElement(By.xpath("//button[@type='submit']")).click();//search
	   System.out.println("search");
	   
	   // Edit functionality
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("s");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       System.out.println(" Edited");
    // search
       Thread.sleep(3000);
	 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Vunnam");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();//search  
       //delete functionality
       Thread.sleep(3000);
       driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
       driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
       System.out.println("deleted");
       Thread.sleep(3000);
       //admin
       driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();//Admin
       Thread.sleep(3000);
       //Validated error messages for duplicate usernames or incomplete inputs
       Thread.sleep(3000);
       driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click(); //add
       Thread.sleep(3000);
       //save without filling
       driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).isDisplayed();
       Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();//save
	   System.out.println("Required field to show");
	    driver.quit();
	
	   
	      


	}

}
