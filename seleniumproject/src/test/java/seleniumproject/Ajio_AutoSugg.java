package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio_AutoSugg {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/men-jackets-coats/c/830216010");
		
		WebElement a=driver.findElement(By.xpath("//span[@aria-label='MEN']"));
		
		Actions d= new Actions(driver);
		
		d.moveToElement(a).perform();
		
		WebElement b=driver.findElement(By.xpath("//a[contains(text(),'Jackets & Coats')][1]"));
		
		b.click();

	}

}
