package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar_Tc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement departure = driver
				.findElement(By.xpath("//div[@class='dateInputWrapper___580edb']"));

		departure.click();
		Thread.sleep(3000);

		WebElement date = driver.findElement(By.xpath(" (//span[contains(text(),'04 Jul, 2025')])"));
		
		Thread.sleep(2000);

		// Click using JavaScript to bypass overlay issue
        JavascriptExecutor A = (JavascriptExecutor) driver;
        A.executeScript("arguments[0].click();",date);

        Thread.sleep(3000);
		date.click();


	}

}
