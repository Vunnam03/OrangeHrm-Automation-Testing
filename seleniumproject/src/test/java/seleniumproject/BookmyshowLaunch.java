package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookmyshowLaunch {

	public static void main(String[] args) throws InterruptedException{
		// Create a program and launch the chromedriver and to open the website of “bookmyshow” along with navigation methods

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://in.bookmyshow.com/");
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
        String url =driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		String html =driver.getPageSource();
		
		System.out.println(html);


	}

}
