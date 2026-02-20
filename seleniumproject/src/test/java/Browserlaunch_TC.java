



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch_TC {

	public static void main(String[] args) throws InterruptedException {
		//STEP1 :: BROWSER LANUCH [CHROME,FIREFOX]

		WebDriverManager.chromedriver().setup(); //download file
		
		WebDriver  driver =new ChromeDriver();  // handle browser
		
		//STEP2 :: TO MAXIMIZE THE WINDOW 
		
			driver.manage().window().maximize();
			
			//STEP3 :: TO OPEN A WEBSITE 
			
			driver.get("https://www.facebook.com/");
			
			//STEP4 :: NAVIGATIONS
			
			driver.navigate().back();
			
			Thread.sleep(4000);//4000(milliseconds) //limit is 5 0r 6 seconds
			
			driver.navigate().forward();
			
			Thread.sleep(4000);
			
			driver.navigate().refresh();			
		

	}

}
