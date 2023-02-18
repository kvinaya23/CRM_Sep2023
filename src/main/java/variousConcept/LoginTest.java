package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver ;
   public static void main(String[] args) {
	   
	  init();
	  loginTest();
	  tearDown();
	   
	  init();
	  NegloginTest();
	  tearDown();
	  
	  
	  
	 
	   
   }
	   
	  public static void init() {
		  //set up system property 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulka\\Sep23_Selenium\\crm\\driver\\chromedriver.exe");
		   //object to evoke driver 
		   WebDriver driver =new ChromeDriver();
		   
		   //delete cookies
		   driver.manage().deleteAllCookies();
		   
		   //go to web site 
		   driver.get("https://techfios.com/billing/?ng=login");
		   
		   //maximize
		   driver.manage().window().maximize();  
		  
	  }
	   
	   public static void loginTest() {
		   //insert username
		   driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		   
		   //insert password
		   driver.findElement(By.id("password")).sendKeys("abc123");
		   
		   //click on sign in button 
		   //we didnot find id in DOM so we copies name 
		   driver.findElement(By.name("login")).click();
		    
		   
	   }
	   
	
	  //we are creating negative login test
	 //what if user name or password is incorrect 
	  public static void NegloginTest() {
		   //insert username
		   driver.findElement(By.id("username")).sendKeys("demo@techfios1212.com");
		   
		   //insert password
		   driver.findElement(By.id("password")).sendKeys("abc123");
		   
		   //click on sign in button 
		   //we didnot find id in DOM so we copies name 
		   driver.findElement(By.name("login")).click();
		    
		   
	   }   
	  public static void tearDown()  {
		  //close the web page
		   driver.close();
		   
	 }
	   
	   
	   
}

