package seleniumproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio_windowfunc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Twitter')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Pinterest')]")).click();
		
		Thread.sleep(3000);
		
		Set<String>x=driver.getWindowHandles();
		System.out.println(x);
		
		Iterator<String> A =x.iterator();
		
		String window1 = A.next();
		
		String window2=A.next();
		
		String window3=A.next();
		
		String window4=A.next();
	
		driver.switchTo().window(window4);
		
		driver.close();
		
		driver.switchTo().window(window3);	
		
		driver.close();
		
		driver.switchTo().window(window2);
		
		driver.close();
		
		driver.switchTo().window(window1);	
		
		//driver.findElement(By.xpath("")).click();
		
		
	}

}
