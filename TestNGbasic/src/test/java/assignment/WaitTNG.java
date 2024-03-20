package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/dynamic-load.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyGetNewUserButtonText()
	{
		WebElement GetNewUserButtonText = driver.findElement(By.xpath("//button[text()='Get New User']"));
		String expectedResult ="Get New User";
		String actualResult = GetNewUserButtonText.getText();
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void verifyTheButtonColor()
	{
		WebElement getNewUserButtoncolor = driver.findElement(By.xpath("//button[text()='Get New User']"));
		String expectedResult =getNewUserButtoncolor.getCssValue("color");
		String actualResult = getNewUserButtoncolor.getCssValue("color");
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void VerifytheImageOfPersonIsDisplayedOrNot() throws InterruptedException
	{
		WebElement clickGetNewUserButton = driver.findElement(By.xpath("//button[text()='Get New User']"));
		clickGetNewUserButton.click();
		Thread.sleep(5000);
		WebElement checkImage = driver.findElement(By.xpath("//div[@id='loading']"));
		System.out.println(checkImage.isDisplayed());
	}
}
