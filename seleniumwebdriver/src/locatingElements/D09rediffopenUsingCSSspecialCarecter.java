package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09rediffopenUsingCSSspecialCarecter {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.cssSelector("input[name^='btnchkavail']")).click();
		
		driver.getCurrentUrl();
		

	}

}
