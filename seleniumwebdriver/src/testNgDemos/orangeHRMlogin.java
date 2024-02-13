package testNgDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class orangeHRMlogin 
{
	WebDriver driver;
	String act_url;
  @Test(dataProvider = "Login")
  public void loginOrangeHRM(String un, String ps)
  {
	  driver.findElement(By.cssSelector("input[name = 'username']")).sendKeys(un);
	  driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys(ps);
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Thiis is a Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
	  String exp_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  act_url = driver.getCurrentUrl();
	  if(exp_url.equals(act_url))
	  {
		  System.out.println("orangeHRM is Logedin");
		  driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		  driver.findElement(By.linkText("Logout")).click();
	  }
	  else
		  System.out.println("You enterd Wrong UserID/Password");
	  
  }


  @DataProvider
  public Object[][] Login() {
    return new Object[][] {
      new Object[] { "Swagat", "Swagat123" },
      new Object[] { "Admin", "admin123" },
      new Object[] { "Bunty", "Bunty150" },
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
