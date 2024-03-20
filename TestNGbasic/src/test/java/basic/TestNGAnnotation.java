package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
@BeforeSuite
public void before_suite() {
	System.out.println("executing message");
}
@BeforeTest
public void before_test()
{
	System.out.println("executing message Before Test");
}
@BeforeClass
public void before_class()
{
	System.out.println("executing message Before Class");	
}
@BeforeMethod
public void before_method()
{
	System.out.println("executing message Before method");	
}
@Test
public void test_annottion() {
	System.out.println("executing message TEST");
}
@AfterMethod
public void after_method()
{
	System.out.println("executing message After Method");	
}
@AfterClass
public void after_class()
{
	System.out.println("executing message After Test");	
}
@AfterTest
public void after_Test()
{
	System.out.println("executing message After Test");	
}
@AfterSuite
public void after_suite()
{
	System.out.println("executing message After Suite");	
}
}
