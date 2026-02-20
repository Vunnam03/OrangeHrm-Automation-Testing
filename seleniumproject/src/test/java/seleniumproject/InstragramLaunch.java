package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstragramLaunch {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.instagram.com/");
		
		
		String url = driver.getCurrentUrl(); // print o/p URL
		
		System.out.println(url);
		
		String title =driver.getTitle(); //  print title   
		
		System.out.println(title);
		
		String Html =driver.getPageSource(); //  current URlusername
		
		System.out.println(Html);
		
          driver.findElement(By.name("username")).sendKeys("Meee@gmail.com"); //can use any attribute if it works
		
		driver.findElement(By.name("password")).sendKeys("465767");
		
		
		
		

		
			}

}
