package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basic.Data_Provider;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SixD_Data_Provider {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/form-submit.php");
			driver.manage().window().maximize();
		}
	@Test(dataProvider = "FormSubmit", dataProviderClass = Data_Provider.class)
	public void sixdimensionalData(String name,String lastName ,String userName, String city,String state,String zip)
	{
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstName.sendKeys(name);
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		lastname.sendKeys(lastName);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(userName);
		WebElement citys = driver.findElement(By.xpath("//input[@placeholder='City']"));
		citys.sendKeys(city);
		WebElement states = driver.findElement(By.xpath("//input[@placeholder='State']"));
		states.sendKeys(state);
		WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip']"));
		zipCode.sendKeys(zip);
		System.out.println(name+" "+lastName+" "+userName+" "+city+" "+state+" "+zip);
	}
}
