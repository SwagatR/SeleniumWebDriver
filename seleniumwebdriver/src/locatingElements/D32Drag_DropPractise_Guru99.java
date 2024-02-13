package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D32Drag_DropPractise_Guru99 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Debit Side
		
		//driver.switchTo().frame(0);
		WebElement we = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
		WebElement dropPlace = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
		Actions act = new Actions(driver);
		act.dragAndDrop(we, dropPlace).perform();
		
		WebElement we2 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
		WebElement dropPlace2 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(we2, dropPlace2).perform();
		
		//Credit Side
		WebElement we3 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]/a"));
		WebElement dropPlace3 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(we3, dropPlace3).perform();
		
		WebElement we4 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
		WebElement dropPlace4 = driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol/li"));
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(we4, dropPlace4).perform();

		
		
	}

}
