package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	WebDriver driver;
	
@BeforeMethod
public void lunching_Chrome()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
}
@Test
public void verifyTitle()
{
	//System.out.println(driver.getTitle());
	String expectedTitle = "Biju";
	String actualTitle= driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle);
	
}
@Test
public void verifyCurrentUrl()
{
	String expectedUrl = "https://www.amazon.in/";
	String actualUrl = driver.getCurrentUrl();
	Assert.assertEquals(actualUrl, expectedUrl);
}
@Test
public void verifyCartText()
{
	WebElement cart = driver.findElement(By.xpath("//div[@id='nav-cart-text-container']//span[@class='nav-line-2']"));
	String expectedCartText = "Cart";
	String actualCartText = cart.getText();
	System.out.println(actualCartText);
}
}
