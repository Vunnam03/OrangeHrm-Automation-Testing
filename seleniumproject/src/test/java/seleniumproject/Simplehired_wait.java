package seleniumproject;




import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Simplehired_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.simplyhired.co.in/");
		
		/*driver.findElement(By.xpath("//p[contains(text(),'Sign in/Create account')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign In or Sign Up')]")).click();
		
		driver.findElement(By.id("ifl-InputFormField-:r0:")).sendKeys("manukarnika246@gmail.com");
		
		driver.findElement(By.xpath("(//span[contains(text(),'Continue')])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Sign up with login code instead')])")).click();
		Thread.sleep(3000);
		
	    driver.findElement(By.id("passcode-input")).click();
	    
	   System.out.println("enter the code in browser");
	    
	   new Scanner(System.in).nextLine();
	  
	   */driver.findElement(By.xpath("(//span[contains(text(),'Create account')])")).click();//signup
		
		driver.findElement(By.id("field-:R6mkt9fbqm:")).sendKeys("Data Analyst");
		
		WebElement A=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		
		A.sendKeys(Keys.CONTROL+"a");
		A.sendKeys(Keys.DELETE);
	
		A.sendKeys("Hyderabad");
		
		//WebElement suggestion=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[contains(@role,'listbox')]//li)[1]")));
		//suggestion.click();
		
		driver.findElement(By.xpath("//button[@id=':R2kt9fbqmH2:']")).click();		
		
		Thread.sleep(3000);
		
		WebElement b=driver.findElement(By.id("menu-button-:rg:"));
		
		Actions a= new Actions(driver);
		a.moveToElement(b).click().perform();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		WebElement c=driver.findElement(By.id("menu-button-:rj:"));
		
		Actions d= new Actions(driver);
		d.moveToElement(c).click().perform();
		d.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
        WebElement C=driver.findElement(By.id("menu-button-:rm:"));
		
		Actions D= new Actions(driver);
		D.moveToElement(C).click().perform();
		D.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		
        WebElement E=driver.findElement(By.id("menu-button-:rm:"));
		
		Actions e= new Actions(driver);
		e.moveToElement(E).click().perform();
		e.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
         WebElement action=driver.findElement(By.id("menu-button-:rp:"));
		
		Actions x= new Actions(driver);
		x.moveToElement(action).click().perform();
		x.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("(//a[@class='chakra-button css-1wzc2gy'])[1]")).click();
		//driver.quit();
		
		

		
		

		

		
		
		




		
	

	    
	    
	
		

		
		

	}

}
