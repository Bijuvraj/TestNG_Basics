package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableListTNG {
	WebDriver driver;

	@BeforeMethod
	public void launchinigUrl()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://selenium.qabible.in/table-pagination.php");
			driver.manage().window().maximize();
		}
	@Test
	public void verifyAllEmployeesOfficeDetails()
	{
		List<WebElement> allEmployeesOffice=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr/td[3]"));
		for(WebElement office : allEmployeesOffice)
		{
			System.out.println(office.getText());
		}
	}
	@Test
	public void printAllEmployeesAge()
	{
		List<WebElement> allEmployeesAge=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr/td[4]"));
		for(WebElement age : allEmployeesAge)
		{
			System.out.println(age.getText());
		}
	}
	@Test
	public void getPurticularEmployeeallDetails_Ashton_Cox()
	{
		List<WebElement> ashtonCoxDetails=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr[3]/td"));
		for(WebElement age : ashtonCoxDetails)
		{
			System.out.println(age.getText());
		}
	}
}
