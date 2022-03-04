package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	
	

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	    driver.findElement(By.name("firstname")).sendKeys("Vicky");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9874563210");
		driver.findElement(By.id("password_step_input")).sendKeys("Vic$ky123");
		
		WebElement elementDropdown1 = driver.findElement(By.id("day"));
		Select dd=new Select(elementDropdown1);
		
		dd.selectByVisibleText("17");
		
		WebElement elementDropdown2 = driver.findElement(By.id("month"));
		Select dd1=new Select(elementDropdown2);
		dd1.selectByValue("12");
		
		WebElement elementDropdown3 = driver.findElement(By.id("year"));
		Select dd3=new Select(elementDropdown3);
		dd3.selectByIndex(22);
		
		driver.findElement(By.xpath("(//span[@data-name='gender_wrapper']//input)[1]")).click();
	}
	
}
