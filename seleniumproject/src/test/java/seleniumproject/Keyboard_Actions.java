package seleniumproject;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Actions {

	public static void main(String[] args) {

		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions a=new Actions(driver);
		
		a.sendKeys(Keys.ARROW_LEFT).build().perform();
		
		String A=driver.findElement(By.id("result")).getText();
		System.out.println(A);
		
		


	}

}
