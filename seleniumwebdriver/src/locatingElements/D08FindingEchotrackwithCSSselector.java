package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08FindingEchotrackwithCSSselector {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.cssSelector("input[id='txtCustomerID'][type='text']")).sendKeys("Swagat Ranjan");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Swagat@123");
		driver.findElement(By.cssSelector("input[name='Butsub'][value='Login']")).click();
		
		driver.getCurrentUrl();
		
		

	}

}
