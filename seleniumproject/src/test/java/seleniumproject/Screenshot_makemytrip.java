package seleniumproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_makemytrip {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
					
		        WebDriverManager.chromedriver().setup();
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.makemytrip.com/");
				
				File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				                     	
				FileUtils.copyFile(screenshotFile, new File("d:\\test.png")); //will not work in C -drive
		 
				driver.close();
				
				driver.quit();	
				
			}
		}
		
		

		
	
