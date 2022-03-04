package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement element1 = driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(element1);
		dd1.selectByIndex(1);
		WebElement element2 = driver.findElement(By.name("dropdown2"));
		Select dd2=new Select(element2);
		dd2.selectByValue("3");
		
		WebElement element3 = driver.findElement(By.id("dropdown3"));
		Select dd3=new Select(element3);
		dd3.selectByVisibleText("Loadrunner");
		WebElement element4=driver.findElement(By.className("dropdown"));
		System.out.println("The get test - " +element4.getText());
	
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Loadrunner");
		driver.findElement(By.xpath("(//div[@class='example']/select)[6]")).sendKeys("UFT/QTP");
		
		
		
	}
}
