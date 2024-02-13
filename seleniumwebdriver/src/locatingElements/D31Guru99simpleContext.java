package locatingElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D31Guru99simpleContext {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Right CLick Button
		WebElement we = driver.findElement(By.xpath("/html/body/span"));
		Actions act = new Actions(driver);
		act.contextClick(we).perform();
		
		List<WebElement> WeMenu = driver.findElements(By.xpath("/html/body/ul/li"));
	
		for(WebElement wl : WeMenu)
			System.out.println(wl.getText());
		
		WebElement clkbtton = driver.findElement(By.xpath("/html/body/ul/li[1]"));
		clkbtton.click();
		
		Alert at = driver.switchTo().alert();
		System.out.println(at.getText());
		at.accept();
		
		//Double Click
		WebElement we2 = driver.findElement(By.xpath("/html/body/button"));
		act = new Actions(driver);
		act.doubleClick(we2).perform();
		Alert at2 = driver.switchTo().alert();
		System.out.println(at2.getText());
		at2.accept();

	}

}
