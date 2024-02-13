package testNgDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01signletest 
{
  @Test
  public void openGmail() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("https://www.google.co.in/");
	  System.out.println(driver.getTitle());
	  driver.close();
  }
}
