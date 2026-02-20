package seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_Test {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		//implicitwait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name"));
		
		WebElement textbox= driver.findElement(By.id("name"));
		
		textbox.sendKeys("Dragon");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));//frm1
		Thread.sleep(3000);
		
		System.out.println("switched to frame3");
		
		Select d=new Select(driver.findElement(By.id("course")));
		
		d.selectByVisibleText("Java");
		
		System.out.println(d.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		
		//fluentwait
		Thread.sleep(3000);
		
		WebElement textbox1=driver.findElement(By.id("name"));
		
		textbox.clear();
		
		Thread.sleep(3000);
		
		System.out.println("clear");
		
		textbox1.sendKeys("Virat");
		
		driver.close();
		System.out.println("closed");
		

	}

}
