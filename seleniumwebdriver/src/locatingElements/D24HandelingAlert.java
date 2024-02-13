package locatingElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D24HandelingAlert {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("Swagat123");
		driver.findElement(By.className("signinbtn")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();

	}

}
