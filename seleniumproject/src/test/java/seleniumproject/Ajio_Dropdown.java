package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/men-jackets-coats/c/830216010");
		
		Select  A =new Select(driver.findElement(By.id("sortBy"))); // sort by 
		
		A.selectByIndex(0);
		
		System.out.println(A.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		A.selectByValue("newn");
		
		System.out.println(A.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		A.selectByVisibleText("Discount");
		
		System.out.println(A.getFirstSelectedOption().getText());
		
	}

}
