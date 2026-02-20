package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class threads_Assign {

	public static void main(String[] args) {
	

		WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.threads.com/login");
	
    driver.findElement(By.xpath("//input[@placeholder='Username, phone or email']")).sendKeys("dhfgjghdjg");
    
    driver.findElement(By.xpath(" //input[@type='password']")).sendKeys("25236274");
    
    driver.findElement(By.xpath("//div[@class='x6s0dn4 xrvj5dj xofrnu2 x1o2pa38 xh8yej3']")).click();
    
	


	}

}
