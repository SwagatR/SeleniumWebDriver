package locatingElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13CounttheLinkUsingList {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> Alllink = driver.findElements(By.tagName("a"));
		int count = 0;
		for(WebElement link:Alllink)
			count++;
			System.out.println("Total no of link " + count);
		
        driver.close();
	}

}
