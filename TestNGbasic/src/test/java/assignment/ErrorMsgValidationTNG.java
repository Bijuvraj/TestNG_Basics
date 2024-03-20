package assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorMsgValidationTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/form-submit.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyAllErrorMessageValidation()
	{
		List<String> errorMsgList = new ArrayList<String>();
		WebElement clickSubmitButton = driver.findElement(By.xpath("//button[text()='Submit form']"));
		clickSubmitButton.click();
		List<WebElement>errorMessages = driver.findElements(By.xpath("//div[@class='invalid-feedback']"));	
		for(int e = 0; e < errorMessages.size();e ++)
		{
			errorMsgList.add(errorMessages.get(e).getText());
		}
		System.out.println(errorMsgList);
	}
	
}
