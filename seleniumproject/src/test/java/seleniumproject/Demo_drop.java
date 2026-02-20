package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_drop {

	public static void main(String[] args) {
		
		//drag & drop Topic

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		Actions A =new Actions(driver);
		
		WebElement b= driver.findElement(By.id("draggable"));
		
		WebElement c= driver.findElement(By.id("droppable"));
		
		A.dragAndDrop(b,c).perform();
		
}

}
