package locatingElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01openBrowser {

	public static void main(String[] args)
	{
		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		driver.close();
		

	}

}
