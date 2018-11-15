package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
WebDriver driver;
@Test
public void Registration() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\samba.murthy\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		Actions a=new Actions(driver);		
		driver.manage().window().maximize(); 
			
		driver.findElement(By.name("REGISTER")).click();
		
		driver.findElement(By.name("First Name:")).sendKeys(Keys.SHIFT,"Samba");
		driver.findElement(By.name("Last Name:")).sendKeys(Keys.SHIFT,"Murthy");
		driver.findElement(By.name("Phone:")).sendKeys(Keys.SHIFT,"1234567890");
		driver.findElement(By.name("Email:")).sendKeys(Keys.SHIFT,"samba.murthy@accenture.com");
		driver.findElement(By.name("Address:")).sendKeys(Keys.SHIFT,"Ecospace, Bellandur");
		driver.findElement(By.name("City:")).sendKeys(Keys.SHIFT,"Bellandur");
		driver.findElement(By.name("State/Province:")).sendKeys(Keys.SHIFT,"Karnataka");
		driver.findElement(By.name("Postal Code:")).sendKeys(Keys.SHIFT,"560103");
		
		Select drpCountry = new Select (driver.findElement(By.name("Country:")));
		drpCountry.selectByVisibleText("INDIA");		
		
		driver.findElement(By.name("User Name:")).sendKeys(Keys.SHIFT,"samba");
		driver.findElement(By.name("Password:")).sendKeys(Keys.SHIFT,"samba");
		driver.findElement(By.name("Confirm Password:")).sendKeys(Keys.SHIFT,"samba");	

}
}