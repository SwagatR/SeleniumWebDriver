package locatingElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14locreatingCheckBox {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.navigate().to("https://www.rediff.com/");
		
		driver.findElement(By.partialLinkText("Create")).click();
		WebElement checkBox = driver.findElement(By.cssSelector("input[name^='chk_altem']"));
		System.out.println("CheckBox selected = " + checkBox.isSelected());
		System.out.println("CheckBox enabled =" + checkBox.isEnabled());
		System.out.println("CheckBox diplayed =" + checkBox.isDisplayed());
		
		checkBox.click();
		System.out.println("CheckBox Selected =" + checkBox.isSelected());

	}

}
