package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    WebElement elementusername = driver.findElement(By.id("username"));
	    elementusername.sendKeys("DemosalesManager");
	    WebElement elementpassword = driver.findElement(By.id("password"));
	    elementpassword.sendKeys("crmsfa");
	    WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	    elementLogin.click();
	    WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	    elementCRMSFA.click();
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Vigneshwari");
	    driver.findElement(By.id("lastNameField")).sendKeys("K");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("vicky");
	    
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
	    
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
	    
	    driver.findElement(By.name("description")).sendKeys("Contact creation");
	    
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("123@gmail.com");

	    WebElement elementDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select dd = new Select(elementDropdown);
	    dd.selectByVisibleText("New York");


	    driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
	    
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateContactForm_description")).clear();
	    
	    driver.findElement(By.name("importantNote")).sendKeys("Learn Testing");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    driver.getTitle();
	    
	    System.out.println("The Title is " +driver.getTitle());
	
	
	}
	
}
