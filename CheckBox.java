package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[5]")).click();
		boolean selenium = driver.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected();
		System.out.println("Selenium is checked :" + selenium);
		driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
	}

}
