package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsON {

		WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/check-box-demo.php\r\n");
			driver.manage().window().maximize();
		}
	@Test(enabled = true,dependsOnMethods ="verifyCheckBoxIsEnable" )
	public void verifySingleCheckboxDemo()
	{
		WebElement footer = driver.findElement(By.xpath("//div[contains(text(),'Single Checkbox Demo')]"));
		String expectedText ="Single Checkbox Demo";
		//String expectedText ="Single Checkbox Dem";
		String actualText = footer.getText();
		Assert.assertEquals(actualText, expectedText,"This is Failed due to NoSuchElement");
	}
	
	@Test(enabled = false)
	public void verifyCheckBoxIsEnable()
	{
		WebElement fisrtCheckBox = driver.findElement(By.xpath("//label[contains(text(),'Click on this check box')]//preceding::input[@id='gridCheck']"));
		boolean result = fisrtCheckBox.isEnabled();
		Assert.assertTrue(result);
		//Assert.assertEquals(result, true);
	}

	}



