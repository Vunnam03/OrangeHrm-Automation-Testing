package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip_KeyFunc {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		
		driver.findElement(By.xpath("//span[@data-cy='defaultFromValue']")).click();
		Thread.sleep(3000);
		
        Actions a=new Actions(driver);
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Thread.sleep(3000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(),'New Delhi, India')]")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		
		driver.findElement(By.xpath("//span[@data-cy='defaultToValue']")).click();
		
		Thread.sleep(3000);
		
        Actions b=new Actions(driver);
		
		b.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();
		
		driver.findElement(By.xpath(" //input[@autocomplete='off']")).click();
		

	}

}
