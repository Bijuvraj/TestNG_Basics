package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseAssignment {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/radio-button-demo.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verify_the_ShowSelectedValue_button_text()
	{
		WebElement showSlectedValueButton = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		String expectedResult ="Show Selected Value";
		String actualResult = showSlectedValueButton.getText();
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void verify_the_radioButton_isSelected()
	{
		WebElement clickRadioButton = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		clickRadioButton.click();
		boolean b = clickRadioButton.isSelected();
		System.out.println(b);
		
	}
}
