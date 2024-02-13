package locatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04openRediff {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		WebElement we = driver.findElement(By.name("srchquery_tbox"));
		we.sendKeys("Cricket",Keys.ENTER);
		
		System.out.println(driver.getCurrentUrl());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();

	}

}
