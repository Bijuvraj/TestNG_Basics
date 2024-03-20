package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExample {
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
	public void verifyTableHeadings()
	{
		WebElement tableHeadings1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead/tr[1]//th[1]"));
		System.out.println(tableHeadings1.getText());
		WebElement tableHeadings2 = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead/tr[1]//th[2]"));
		System.out.println(tableHeadings2.getText());
		WebElement tableHeadings3 = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead/tr[1]//th[3]"));
		System.out.println(tableHeadings3.getText());
		WebElement tableHeadings = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead/tr[1]//th[4]"));
		System.out.println(tableHeadings.getText());
		
		List<WebElement> allTableHeading=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead/tr[1]//th"));
		for(WebElement c:allTableHeading)
		{
			System.out.println(c.getText());
		}
	}
	@Test
	public void verifyTableBody()
	{
		WebElement tablebody = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr[1]//td[4]"));
		System.out.println(tablebody.getText());
		
		List<WebElement> nameOfAllEmployees=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr//td[1]"));
		for(WebElement c:nameOfAllEmployees)
		{
			System.out.println(c.getText());
		}
		
		List<WebElement> ageOfAllEmployees=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr//td[4]"));
		for(WebElement c:ageOfAllEmployees)
		{
			System.out.println(c.getText());
		}
	}
	@Test
	public void purticularEmployee()
	{
		List<WebElement> EmployeeTiger_NixonDetails=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr[1]//td"));
		for(WebElement c:EmployeeTiger_NixonDetails)
		{
			System.out.println(c.getText());
		}
		
		List<WebElement> EmployeeCedric_KellyDetails=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr[4]//td"));
		for(WebElement c:EmployeeCedric_KellyDetails)
		{
			System.out.println(c.getText());
		}
		
		List<WebElement> EmployeeAshton_CoxDetails=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody/tr[3]//td"));
		for(WebElement c:EmployeeAshton_CoxDetails)
		{
			System.out.println(c.getText());
		}
	}
}
