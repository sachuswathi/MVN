package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {

	@Test(priority=1)
	public void test()
	{
	System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Priority of 1");
		driver.close();
		}
	@Test(priority=0)
	public void test0()
	{
	System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Priority of 0");
		driver.close();}
	@Test(priority=-1)
	public void test1()
	{
	System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Priority of -1");
		driver.close();}
	@Test
	public void test2()
	{
	System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	System.out.println("Without Priority");
	driver.close();}
	@Test(priority=2)
	public void test3()
	{
	System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Priority of 2");
		driver.close();}
		
		@Test(priority=-2)
		public void test4()
		{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			System.out.println("Priority of -2");
			driver.close();}
			
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * 
	 * }
	 */
}
