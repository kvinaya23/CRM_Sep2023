package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {

	WebDriver driver;// created globar driver

	@Before
	public void init() {
		// set up system property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kulka\\Sep23_Selenium\\crm\\driver\\chromedriver.exe");

		 driver = new ChromeDriver(); // object to evoke driver
		driver.manage().deleteAllCookies();// delete cookies
		driver.get("https://techfios.com/billing/?ng=login");// go to web site
		driver.manage().window().maximize(); // maximize
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//we created wait time 20 seconds for all elements 
	}

	@Test
	public void loginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com"); // insert username
		driver.findElement(By.id("password")).sendKeys("abc123"); // insert password
		driver.findElement(By.name("login")).click(); // click on sign in button
		

	}

	// we are creating negative login test
	// what if user name or password is incorrect

	//@Test
	public void NegloginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios1212.com"); // insert username
		driver.findElement(By.id("password")).sendKeys("abc123"); // insert password
		driver.findElement(By.name("login")).click(); // we didnot find id in DOM so we copies name

	}

	@After
	public void tearDown() {

		driver.close();// close the web page

	}

}
