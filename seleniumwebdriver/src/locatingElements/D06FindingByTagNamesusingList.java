package locatingElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06FindingByTagNamesusingList {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.navigate().to("https://www.rediff.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
//		String name = allLinks.get(0).getText();
//		System.out.println("Name of the link is " + name);
		
		for(WebElement link:allLinks)
			System.out.println(link.getText());
		
//		driver.close();
		

	}

}
