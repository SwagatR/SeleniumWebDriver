package locatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D02usingID {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new EdgeDriver();
		
	    
		driver.get("https://www.google.co.in/");
     //	WebElement we =	driver.findElement(By.id("APjFqb"));
     //	we.sendKeys("Facebook",Keys.ENTER);
     	
		WebElement we = driver.findElement(By.name("q"));
		we.sendKeys("Automation",Keys.ENTER);
		
		System.out.println(driver.getCurrentUrl());
		
     	String title = driver.getTitle();
     	System.out.println(title);
     	
     	
     	
     	driver.close();
		
	}

}
