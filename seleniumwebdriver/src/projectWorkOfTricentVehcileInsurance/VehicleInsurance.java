package projectWorkOfTricentVehcileInsurance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VehicleInsurance {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.navigate().to("https://sampleapp.tricentis.com/101/");

		//Insurance for AutoMobile 

		driver.findElement(By.id("nav_automobile")).click();

		//Entered Vehicle Data                       

		WebElement slctMake = driver.findElement(By.id("make"));
		Select drp = new Select(slctMake);
		drp.selectByValue("BMW");

		driver.findElement(By.id("engineperformance")).sendKeys("650");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("07/16/2023");

		WebElement slctSeats = driver.findElement(By.id("numberofseats"));
		drp = new Select(slctSeats);
		drp.selectByVisibleText("4");

		WebElement slctFuel = driver.findElement(By.id("fuel"));
		drp = new Select(slctFuel);
		drp.selectByValue("Petrol");

		driver.findElement(By.id("listprice")).sendKeys("10000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("od05as2983");
		driver.findElement(By.id("annualmileage")).sendKeys("15000");
		driver.findElement(By.id("nextenterinsurantdata")).click();

		//Entered Insurance Data                                                           

		driver.findElement(By.id("firstname")).sendKeys("Swagat");
		driver.findElement(By.id("lastname")).sendKeys("Sahoo");
		driver.findElement(By.id("birthdate")).sendKeys("07/16/1997");

		WebElement gendrRbutton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
		if(! gendrRbutton.isSelected())
			gendrRbutton.click();
		driver.findElement(By.id("streetaddress")).sendKeys("Mohannager,Pune,Maharashtra");
		WebElement slctCountry = driver.findElement(By.id("country"));
		drp = new Select(slctCountry);
		drp.selectByValue("India");
		driver.findElement(By.id("zipcode")).sendKeys("753009");
		driver.findElement(By.id("city")).sendKeys("Pune");
		WebElement slctOccupetion = driver.findElement(By.id("occupation"));
		drp = new Select(slctOccupetion);
		drp.selectByVisibleText("Selfemployed");
		WebElement selctHubbyButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span"));
		if(! selctHubbyButton.isSelected())
			selctHubbyButton.click();
		driver.findElement(By.id("website")).sendKeys("www.Google.com");
		driver.findElement(By.id("nextenterproductdata")).click();

		//Entered Product Data

		driver.findElement(By.id("startdate")).sendKeys("07/16/2025");
		WebElement slctInsuranceSum = driver.findElement(By.id("insurancesum"));
		drp = new Select(slctInsuranceSum);
		drp.selectByValue("10000000");

		WebElement slctmeritRating = driver.findElement(By.id("meritrating"));
		drp = new Select(slctmeritRating);
		drp.selectByValue("Malus 14");

		WebElement slctdamageInsurance = driver.findElement(By.id("damageinsurance"));
		drp = new Select(slctdamageInsurance);
		drp.selectByValue("Full Coverage");

		WebElement slctoptionalPrdct = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span"));
		if(! slctoptionalPrdct.isSelected())
			slctoptionalPrdct.click();

		WebElement slctcurtesyCar = driver.findElement(By.id("courtesycar"));
		drp = new Select(slctcurtesyCar);
		drp.selectByValue("Yes");

		driver.findElement(By.id("nextselectpriceoption")).click();

		//Entered Prise Options

		WebElement slctPriseOptions = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span"));
		if(! slctPriseOptions.isSelected())
			slctPriseOptions.click();

		driver.findElement(By.id("nextsendquote")).click();

		//Enter Send Quote

		driver.findElement(By.id("email")).sendKeys("swagatranjanb1607@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8917666241");
		driver.findElement(By.id("username")).sendKeys("Swagat1607.com");
		driver.findElement(By.id("password")).sendKeys("Swagat@1607");
		driver.findElement(By.id("confirmpassword")).sendKeys("Swagat@1607");
		driver.findElement(By.id("Comments")).sendKeys("I am done My Vehicle Insurance.");
		driver.findElement(By.id("sendemail")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a")).click();
		System.out.println(driver.getTitle());

		//Insurance for Truck

		driver.findElement(By.linkText("Truck")).click();
		System.out.println(driver.getTitle());

		//Enter Truck Vehicle Data

		WebElement slctmake = driver.findElement(By.id("make"));
		drp = new Select(slctmake);
		drp.selectByValue("Toyota");

		driver.findElement(By.id("engineperformance")).sendKeys("850");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("06/01/2023");
		WebElement weSeatnumber = driver.findElement(By.id("numberofseats"));
		drp = new Select(weSeatnumber);
		drp.selectByValue("5");
		WebElement weslctFuel = driver.findElement(By.id("fuel"));
		drp = new Select(weslctFuel);
		drp.selectByValue("Diesel");
		driver.findElement(By.id("payload")).sendKeys("500");
		driver.findElement(By.id("totalweight")).sendKeys("30000");
		driver.findElement(By.id("listprice")).sendKeys("90000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("OD05as1601");
		driver.findElement(By.id("annualmileage")).sendKeys("80000");
		driver.findElement(By.id("nextenterinsurantdata")).click();

		//Enter Truck Insurance Data

		driver.findElement(By.id("firstname")).sendKeys("Susmita");
		driver.findElement(By.id("lastname")).sendKeys("Paul");
		driver.findElement(By.id("birthdate")).sendKeys("06/01/1999");
		WebElement genderButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span"));
		if(!genderButton.isSelected())
			genderButton.click();
		driver.findElement(By.id("streetaddress")).sendKeys("Mohan Nagar,Pune");
		WebElement weslctCountry = driver.findElement(By.id("country"));
		drp = new Select(weslctCountry);
		drp.selectByVisibleText("India");
		driver.findElement(By.id("zipcode")).sendKeys("753009");
		driver.findElement(By.id("city")).sendKeys("Cuttack");
		WebElement weOccupetion = driver.findElement(By.id("occupation"));
		drp = new Select(weOccupetion);
		drp.selectByValue("Selfemployed");
		WebElement weslctHubby = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span"));
		if(! weslctHubby.isSelected())
			weslctHubby.click();
		driver.findElement(By.id("website")).sendKeys("www.google.com");
		driver.findElement(By.id("nextenterproductdata")).click();

		//Enter Product Data

		driver.findElement(By.id("startdate")).sendKeys("06/01/2025");
		WebElement weinsuranceSum = driver.findElement(By.id("insurancesum"));
		drp = new Select(weinsuranceSum);
		drp.selectByValue("20000000");
		WebElement wedamageInsurance = driver.findElement(By.id("damageinsurance"));
		drp = new Select(wedamageInsurance);
		drp.selectByValue("No Coverage");
		WebElement weoptionalProduct =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span"));
		if(! weoptionalProduct.isSelected())
			weoptionalProduct.click();
		driver.findElement(By.id("nextselectpriceoption")).click();

		//Enter Price Option

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span")).click();
		driver.findElement(By.id("nextsendquote")).click();

		//Entered Send Quote 

		driver.findElement(By.id("email")).sendKeys("swagatranjanb1607@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8917666241");
		driver.findElement(By.id("username")).sendKeys("Swagat1607");
		driver.findElement(By.id("password")).sendKeys("Swagat@143");
		driver.findElement(By.id("confirmpassword")).sendKeys("Swagat@143");
		driver.findElement(By.id("Comments")).sendKeys("I am Done My Truck Insurance");
		driver.findElement(By.id("sendemail")).click();
		driver.findElement(By.className("confirm")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a")).click();
		System.out.println(driver.getTitle());

		//Insurance for MotorCycle

		driver.findElement(By.linkText("Motorcycle")).click();
		System.out.println(driver.getTitle());

		//Enter MotorCycle Vehicle Data

		WebElement slctMotoMake = driver.findElement(By.id("make"));
		drp = new Select(slctMotoMake);
		drp.selectByValue("Honda");

		WebElement slctMotoModel = driver.findElement(By.id("model"));
		drp = new Select(slctMotoModel);
		drp.selectByVisibleText("Motorcycle");

		driver.findElement(By.id("cylindercapacity")).sendKeys("650");
		driver.findElement(By.id("engineperformance")).sendKeys("500");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("12/21/2023");
		WebElement slctMotoSeat = driver.findElement(By.id("numberofseatsmotorcycle"));
		drp = new Select(slctMotoSeat);
		drp.selectByValue("2");
		driver.findElement(By.id("listprice")).sendKeys("90000");
		driver.findElement(By.id("annualmileage")).sendKeys("50000");
		driver.findElement(By.id("nextenterinsurantdata")).click();

		//Enter MotorCycle Insurance Data

		driver.findElement(By.id("firstname")).sendKeys("Bhagyashree");
		driver.findElement(By.id("lastname")).sendKeys("Sahoo");
		driver.findElement(By.id("birthdate")).sendKeys("12/21/1995");

		WebElement motorCycleGenderBtn = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
		if(!motorCycleGenderBtn.isSelected())
			motorCycleGenderBtn.click();

		driver.findElement(By.id("streetaddress")).sendKeys("Nagpur,Maharashtra");
		WebElement slctMotoCountry = driver.findElement(By.id("country"));
		drp = new Select(slctMotoCountry);
		drp.selectByVisibleText("India");

		driver.findElement(By.id("zipcode")).sendKeys("411044");
		driver.findElement(By.id("city")).sendKeys("Nagpur");
		WebElement slctMotoOccupetion = driver.findElement(By.id("occupation"));
		drp = new Select(slctMotoOccupetion);
		drp.selectByValue("Employee");
		WebElement MotoSelctHobbies =driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span"));
		if(!MotoSelctHobbies.isSelected())
			MotoSelctHobbies.click();
		driver.findElement(By.id("website")).sendKeys("www.Yahoo.com");
		driver.findElement(By.id("nextenterproductdata")).click();

		//Enter MotorCycle Product Data

		driver.findElement(By.id("startdate")).sendKeys("12/21/2025");
		WebElement motoSlctSum = driver.findElement(By.id("insurancesum"));
		drp = new Select(motoSlctSum);
		drp.selectByValue("25000000");
		WebElement motoslctDamage = driver.findElement(By.id("damageinsurance"));
		drp = new Select(motoslctDamage);
		drp.selectByValue("Full Coverage");
		WebElement motoslctOpoduct = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[2]/span"));
		if(!motoslctOpoduct.isSelected())
			motoslctOpoduct.click();
		driver.findElement(By.id("nextselectpriceoption")).click();

		//Enter MotorCycle Price Option

		WebElement MotoSlctPrise =driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span"));
		if(!MotoSlctPrise.isSelected())
			MotoSlctPrise.click();
		driver.findElement(By.id("nextsendquote")).click();

		//Enter MotorCycle Quote

		driver.findElement(By.id("email")).sendKeys("sahoobhagyashree005@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8917555341");
		driver.findElement(By.id("username")).sendKeys("Bhagyashree143");
		driver.findElement(By.id("password")).sendKeys("Gudiaa341");
		driver.findElement(By.id("confirmpassword")).sendKeys("Gudiaa341");
		driver.findElement(By.id("Comments")).sendKeys("I am done my Motor Cycle Insurance");
		driver.findElement(By.id("sendemail")).click();

		driver.findElement(By.className("confirm")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"backmain\"]")).click();
		System.out.println(driver.getTitle());

		//Insurance for Camper

		driver.findElement(By.linkText("Camper")).click();
		System.out.println(driver.getTitle());

		//Enter Camper Vehicle Data

		WebElement CamperslctMake = driver.findElement(By.id("make"));
		drp = new Select(CamperslctMake);
		drp.selectByValue("Toyota");
		driver.findElement(By.id("engineperformance")).sendKeys("1500");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("04/29/2023");
		WebElement CamperslctSeat = driver.findElement(By.id("numberofseats"));
		drp = new Select(CamperslctSeat);
		drp.selectByVisibleText("7");
		WebElement CamperHandDrive = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span"));
		if(!CamperHandDrive.isSelected())
			CamperHandDrive.click();
		WebElement CamperslctFuel = driver.findElement(By.id("fuel"));
		drp = new Select(CamperslctFuel);
		drp.selectByValue("Diesel");
		driver.findElement(By.id("payload")).sendKeys("950");
		driver.findElement(By.id("totalweight")).sendKeys("45000");
		driver.findElement(By.id("listprice")).sendKeys("90000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("OD05AS2983");
		driver.findElement(By.id("annualmileage")).sendKeys("85000");
		driver.findElement(By.id("nextenterinsurantdata")).click();

		//Camper Insurance Data

		driver.findElement(By.id("firstname")).sendKeys("Swagmita");
		driver.findElement(By.id("lastname")).sendKeys("Sahoo");
		driver.findElement(By.id("birthdate")).sendKeys("04/29/1999");
		WebElement CamperslctGender = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
		if(!CamperslctGender.isSelected())
			CamperslctGender.click();
		driver.findElement(By.id("streetaddress")).sendKeys("Bangaluru,Karnatak");
		WebElement CamperslctCountry = driver.findElement(By.id("country"));
		drp = new Select(CamperslctCountry);
		drp.selectByValue("India");
		driver.findElement(By.id("zipcode")).sendKeys("753009");
		driver.findElement(By.id("city")).sendKeys("Bangaluru");
		WebElement CamperslctOccupetion = driver.findElement(By.id("occupation"));
		drp = new Select(CamperslctOccupetion);
		drp.selectByValue("Selfemployed");
		WebElement CamperslctHubbies = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span"));
		if(!CamperslctHubbies.isSelected())
			CamperslctHubbies.click();
		driver.findElement(By.id("website")).sendKeys("www.Instagram.com");
		driver.findElement(By.id("nextenterproductdata")).click();

		//Enter Camper Product Data

		driver.findElement(By.id("startdate")).sendKeys("04/29/2025");
		WebElement CamperslctSum = driver.findElement(By.id("insurancesum"));
		drp =new Select(CamperslctSum);
		drp.selectByValue("35000000");
		WebElement CamperslctDamage = driver.findElement(By.id("damageinsurance"));
		drp = new Select(CamperslctDamage);
		drp.selectByValue("Full Coverage");
		WebElement CamperOptionalPdct = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span"));
		if(!CamperOptionalPdct.isSelected())
			CamperOptionalPdct.click();
		driver.findElement(By.id("nextselectpriceoption")).click();

		//Enter Camper Price Option

		driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
		driver.findElement(By.id("nextsendquote")).click();

		//Enter Camper Send Quote

		driver.findElement(By.id("email")).sendKeys("swagsmita1601@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8917450241");
		driver.findElement(By.id("username")).sendKeys("SwagSmita143");
		driver.findElement(By.id("password")).sendKeys("Swagsmita143");
		driver.findElement(By.id("confirmpassword")).sendKeys("Swagsmita143");
		driver.findElement(By.id("Comments")).sendKeys("I am done my Camper Vehicle Insurance");
		driver.findElement(By.id("sendemail")).click();
		driver.findElement(By.className("confirm")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"finished-sub-container\"]/div[1]/div/div[1]")).click();
		System.out.println(driver.getTitle());





	}

}
