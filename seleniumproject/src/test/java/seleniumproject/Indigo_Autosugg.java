package seleniumproject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indigo_Autosugg {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goindigo.in/");
		
		Thread.sleep(5000);
		
		WebElement A = driver.findElement(By.xpath("//div[@class=' booking-widget-field']"));
		
		A.click();
		
        System.out.println("Booking widget is now visible.");
        
        


		
		 //WebElement A =driver.findElement(By.xpath("//img[@class='headerv2__logo-img']"));
		 
		 
           //Actions d= new Actions(driver);
		
		//d.moveToElement(A).perform();
		

		
		//WebElement A=driver.findElement(By.xpath("//div[@role='textbox'][1]"));
		
		//A.click();
		


	}

}
