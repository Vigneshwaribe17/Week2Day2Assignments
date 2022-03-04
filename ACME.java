package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACME {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    
	    driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");

	    
	    driver.findElement(By.name("password")).sendKeys("leaf@12");
	    driver.findElement(By.xpath("//button[contains (text(), 'Login')]")).click();
	    
	    Thread.sleep(2000);
	    String Title=driver.getTitle();
	    System.out.println("The Title is" +Title);
	    
	    driver.findElement(By.xpath("//a[contains (text(), 'Log Out')]")).click();
	    Thread.sleep(2000);

	    driver.close();
	    
	    
	}
	
}
