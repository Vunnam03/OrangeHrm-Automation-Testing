package seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Zepto_Links {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zeptonow.com/");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size()); // 196
		
		for(WebElement a: Links) {
			
			System.out.println(a.getAttribute("href"));
		}
		


	}

}
