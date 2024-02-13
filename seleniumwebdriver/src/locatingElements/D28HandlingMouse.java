package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D28HandlingMouse {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://demoqa.com/buttons");
		
		//First Button
		WebElement we = driver.findElement(By.id("doubleClickBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(we).perform();
		WebElement msg = driver.findElement(By.id("doubleClickMessage"));
		System.out.println(msg.getText());
		
		//Second Button
		WebElement we2 = driver.findElement(By.id("rightClickBtn"));
		Actions act1 = new Actions(driver);
		act1.contextClick(we2).perform();
		WebElement msg2 = driver.findElement(By.id("rightClickMessage"));
		System.out.println(msg2.getText());
		
		//Third Button/Dynamic click
		WebElement we3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
		we3.click();
		WebElement msg3 = driver.findElement(By.id("dynamicClickMessage"));
		System.out.println(msg3.getText());

	}

}
