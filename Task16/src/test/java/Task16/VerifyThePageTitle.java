package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyThePageTitle{

	public static void main(String[] args) throws Exception {
		// Q.2 Task16
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.demoblaze.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//getting the actual title
		String actualtitle = (driver.getTitle());
		
		//storing the expected title
		String expectedtitle = ("STORE");
		
		Thread.sleep(3000);
		
		//verifies actual title with expected title
		if (actualtitle.equals(expectedtitle)) {
			
			//prints if actual and expected matches
			System.out.println("Page landed on the correct website");
		} else {
			
			//print if actual and expected is not matches
			System.out.println("Page not landed on the correct website");
		}
			driver.close();
		
	}

}
