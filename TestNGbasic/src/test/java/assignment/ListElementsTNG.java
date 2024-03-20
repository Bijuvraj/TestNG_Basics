package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListElementsTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/check-box-demo.php");
			driver.manage().window().maximize();
		}
	@Test
	public void clickAllcheckBoxes()
	{
		//WebElement clickCheckBoxLabel = driver.findElement(By.xpath("//div[@class='form-check']/input"));
		
		List<WebElement> menuElements=driver.findElements(By.xpath("//div[@class='form-check']/input"));
		for(WebElement c:menuElements)
		{
			c.click();
			System.out.println(c.isSelected());
		}
		
	
		
	}
	

}
