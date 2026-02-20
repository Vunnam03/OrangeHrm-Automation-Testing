package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Partiallinktext_tc {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup(); // to open any browser
		
		WebDriver driver =new ChromeDriver(); //object
		
		driver.get("https://www.facebook.com/"); // open application
		
		
		driver.manage().window().maximize();
		
         driver.findElement(By.linkText("Forgotten password?")).click();	 // link text (we should write all the word)	
         
		//driver.findElement(By.partialLinkText("Forgotten ")).click(); //partial(we can write any one word)
		

	}

}
