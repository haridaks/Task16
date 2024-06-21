package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxProgram {

	public static void main(String[] args) throws Exception {
		// Q.1 Task16
		
		//To setup the webdriver manager(firefox driver)
		WebDriverManager.firefoxdriver().setup();
		
		//To launch the firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//launching google
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		//Accepting cookies
		driver.findElement(By.xpath("//div[contains(text(), 'Accept all')]/ancestor::button")).click();
		
		//printing the webpage current URL
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		//refresh the current page
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		//terminates the  current page
		driver.close();

	}

}
