package seleniumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aleart_popup {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // default syntax for the page to scroll
		js.executeScript("window.scrollBy(0,250)");
		
		WebElement alert =driver.findElement(By.xpath("//Button[@id= 'alertButton']"));
		
		alert.click();
		
		Alert A =driver.switchTo().alert();
		
		A.accept();
		
		System.out.println(" Alert accepted");
	
	}

}
