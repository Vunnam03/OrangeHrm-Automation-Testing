package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstprgm {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // to open any browser
		
		WebDriver driver =new ChromeDriver(); //object
		
		driver.get("https://www.facebook.com/"); // open application
		
		
	
	}

}
