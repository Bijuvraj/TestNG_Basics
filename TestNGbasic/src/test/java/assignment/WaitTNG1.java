package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTNG1 {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyTheStartButtonisEnambled()
	{
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start Download']"));
		System.out.println(startButton.isEnabled());
	}
	@Test
	public void verifyTheTextOfStartButton()
	{
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start Download']"));
		String expectedResult = "Start Download";
		String actualResult = startButton.getText();
		System.out.println(startButton.getText());
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void clickButtonAndVerifyTheMsg()
	{
		WebElement startButton = driver.findElement(By.xpath("//button[text()='Start Download']"));	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(startButton));
		startButton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
		
		WebElement message = driver.findElement(By.xpath("//div[text()='Complete!']"));
		System.out.println(message.getText());
	}
}
