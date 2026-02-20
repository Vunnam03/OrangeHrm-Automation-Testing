package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Tc {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // to open any browser
		
		WebDriver driver =new ChromeDriver(); //object
		
		driver.get("https://www.facebook.com/"); // open 

		//driver.findElement(By.id("email")).sendKeys(" vunnamgowthami@gmail.com"); 
		
		//driver.findElement(By.id("pass")).sendKeys(" Manikarnika");
		
		driver.findElement(By.name("email")).sendKeys("vunnamgowthami@gmail.com"); //can use any attribute if it works
		
		driver.findElement(By.name("pass")).sendKeys("Manikarnika");
		
		driver.findElement(By.name("login")).click();
			

	}

}
