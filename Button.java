package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[contains(text(),'Go to Home Page')]")).click();
		
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[2]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Get Position')]")).click();
		System.out.println("The Position is "+driver.findElement(By.xpath("//button[contains(text(),'Get Position')]")).getLocation());
		System.out.println("The Size = "+ driver.findElement(By.id("size")).getSize());

		System.out.println("The Color "+ driver.findElement(By.id("color")).getCssValue("background-color"));
		
	}
}
