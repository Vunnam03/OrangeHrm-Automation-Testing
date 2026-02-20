package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_Tc {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php?entry_point=login\r\n");
	
	//WebElement female = driver.findElement(By.xpath(" (//input[@type='radio'])[1]"));
	
	//female.click();
	
	//WebElement male =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	
   //male.click();
	
	WebElement custom =driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	
	custom.click();


	
	
	


	}

}
