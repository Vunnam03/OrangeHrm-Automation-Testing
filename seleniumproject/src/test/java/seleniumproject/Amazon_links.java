package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Amazon_links {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement a= driver.findElement(By.id("nav-link-accountList"));
		
		Actions h= new Actions(driver);
		
		h.moveToElement(a).perform();
		
		
		//tagname[contains(text),
		WebElement k=driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[1]"));
		
		k.click();
		


		

	}

}
