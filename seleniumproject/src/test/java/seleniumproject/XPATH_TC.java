package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATH_TC {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.instagram.com/");
		
        driver.findElement(By.name("username")).sendKeys("Meee@gmail.com"); //can use any attribute if it works
		
		driver.findElement(By.name("password")).sendKeys("465767");

		
		driver.findElement(By.xpath(" //button[@type='submit']")).click(); // you can take this from console(cntrl+f)
		

	}

}
