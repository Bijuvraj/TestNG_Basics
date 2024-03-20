package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/jquery-select.php");
			driver.manage().window().maximize();
		}
	@Test
	public void clickStatesDropdown()
	{
		String state = "Oregon";
		
		WebElement statesDrop = driver.findElement(By.xpath("(//span[text()='Alaska'])[1]"));
		statesDrop.click();
		WebElement inputDrop = driver.findElement(By.xpath("//input[@role='searchbox']"));
		inputDrop.sendKeys(state);
		WebElement selectState = driver.findElement(By.xpath("//li[text()='"+state+"']")); //By.xpath("//li[text()='Oregon']")
		selectState.click();
	
	}
	
}
