package Task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchingInWikipedia {

	public static void main(String[] args) throws Exception {
		// Q.3 Task 16
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		//selecting history section from search results and storing it in a variable
		WebElement sectionTitle = driver.findElement(By.id("toc-History"));
		
		//This gets the text content of the located element storing it is a variable
		String sectionTitleText = sectionTitle.getText();
		
		//prints the section title
        System.out.println("Section title is: " + sectionTitleText);
		
		driver.close();
		
	}

}
