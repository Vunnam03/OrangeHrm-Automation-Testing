package seleniumproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_Func {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.swiggy.com/");
		
		driver.findElement(By.xpath("//div[contains(text(),'Careers')]")).click();
		
		//to handle the multiple windows handling
		//syntax: getwindowhandles [if we have more than one window]
		
		Set<String>x =driver.getWindowHandles();
		System.out.println(x); //for each window we have some unique id by using this id 		
		//[C9674491F5160D6C6D16AA91170F5AF7, 54B6B7CCD52833230F6EF7AC13108EB8]
		
			Iterator<String> A = x.iterator();
			
			String window1 =A.next();
			
			String window2 =A.next();
			
			driver.switchTo().window(window2);
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("eytruyuhd");
			
			Thread.sleep(3000);
			
			Select s=new Select(driver.findElement(By.id("ilceler")));
			s.selectByVisibleText("Technology");
			
			System.out.println(s.getFirstSelectedOption().getText());
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='search_btn']")).click();
			
			Thread.sleep(3000);
			
			driver.close();
			
			driver.switchTo().window(window1);
			
			driver.findElement(By.xpath("//img[@alt='Food']")).click();

			
	}

}
