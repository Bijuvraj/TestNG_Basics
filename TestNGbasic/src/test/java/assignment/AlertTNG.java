package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/javascript-alert.php");
			driver.manage().window().maximize();
		}
	@Test
	public void alertHandling()
	{
		WebElement clickClickMeButton = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		clickClickMeButton.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
}
