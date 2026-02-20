package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio_RadioButt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.ajio.com/men-jackets-coats/c/830216010");
	
	WebElement filter=driver.findElement(By.xpath("(//span[@class='facet-left-pane-label'])[10]"));
	
	filter.click();
	
	Thread.sleep(4000);
	
	WebElement Rating1 =driver.findElement(By.xpath(" //input[@type='radio'and @value ='1 star & above']"));
	
	Rating1.click();
	
	Thread.sleep(4000);
	
	WebElement Rating2 =driver.findElement(By.xpath("//input[@type='radio' and @ value='2 star & above']"));
	
	Rating2.click();
	
	Thread.sleep(4000);
	
	WebElement Rating3 =driver.findElement(By.xpath("//input[@type='radio' and @ value='3 star & above']"));
	
	Rating3.click();
	
	Thread.sleep(4000);
	
	WebElement Rating4 =driver.findElement(By.xpath("//input[@type='radio' and @value='4 star & above']"));
	
	Rating4.click();

	}

}
