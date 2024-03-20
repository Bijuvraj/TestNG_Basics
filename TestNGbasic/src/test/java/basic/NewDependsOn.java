package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewDependsOn {

	WebDriver driver;
		
		@BeforeMethod
				public void launchingchrome() {
					WebDriverManager.chromedriver().setup();
								driver=new ChromeDriver();
					driver.get("https://selenium.qabible.in/simple-form-demo.php");
					driver.manage().window().maximize();
				}
		@Test
		public void verifyShowMessageButton() {
			WebElement message = driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
			
			String expectedtext="Show Message";
			String actualtext=message.getText();
		}
	
}
