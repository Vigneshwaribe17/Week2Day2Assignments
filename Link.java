package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]")).click();
  
	driver.findElement(By.xpath("(//ul[@class='wp-categories-list']//a)[3]")).click();
	System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
	driver.findElement(By.xpath("//a[contains(text(),'Verify am I broken?')]"));
	 String text="HTTP Status 404 – Not Found";
	 if(driver.getPageSource().contains(text))
		 System.out.println("The Page is Broken");
	 else
		 System.out.println("The Page is not Broken");

	 driver.get("http://leafground.com/pages/Link.html");
	 
	}
	
}
