package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11googlePageImagesopenUsingLinkText {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://www.google.co.in/");
		
		driver.findElement(By.linkText("Images")).click();
		
		System.out.println(driver.getCurrentUrl());
		

	}

}
