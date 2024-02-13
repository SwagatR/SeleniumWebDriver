package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10UsingLinkText {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Rediffmail")).click();
		
		driver.getCurrentUrl();
		
		String title = driver.getTitle();
		System.out.println(title);
	

	}

}
