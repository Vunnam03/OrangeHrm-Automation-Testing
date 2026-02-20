package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownfunc_Tc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); // to open any browser
		
		WebDriver driver =new ChromeDriver(); //object
		
		driver.get("https://www.facebook.com/r.php?entry_point=login"); // open application
		
		driver.manage().window().maximize();
		
		Select d =new Select(driver.findElement(By.id("day")));
		//three types of dropdown choosing
		
		d.selectByIndex(0);
	
		System.out.println(d.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		
		d.deselectByValue("12");
		System.out.println(d.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		
		d.selectByVisibleText("26");
		System.out.println(d.getFirstSelectedOption().getText());
		

	}

}
