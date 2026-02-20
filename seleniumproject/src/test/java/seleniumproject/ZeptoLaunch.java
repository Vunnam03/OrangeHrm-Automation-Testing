package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZeptoLaunch {

	public static void main(String[] args)throws InterruptedException {
		// Create a program and launch the chromedriver and to open the website of “zepto” along with navigation methods

		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zeptonow.com/");
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		
		String url =driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		String html =driver.getPageSource();
		
		System.out.println(html);
		
		
		

	}

}
