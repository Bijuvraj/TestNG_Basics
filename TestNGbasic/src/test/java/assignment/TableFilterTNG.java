package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableFilterTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/table-filter.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyBradley_GreerDetails()
	{
		WebElement nameSearchfield = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		//nameSearchfield.click();
		nameSearchfield.sendKeys("Bradley Greer");
		WebElement getPosition = driver.findElement(By.xpath("//table[@id='example']//tbody//tr[1]/td[2]"));
		System.out.println(getPosition.getText());
		
	}
}
