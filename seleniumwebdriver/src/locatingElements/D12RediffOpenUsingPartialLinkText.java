package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12RediffOpenUsingPartialLinkText {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://www.rediff.com/");
		
		driver.findElement(By.partialLinkText("Sign")).click();

		System.out.println(driver.getCurrentUrl());

	}

}
