package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
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
	    WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	    elementLeads.click();
	    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	    
	    driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
	    
	    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("11");
	    
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	    Thread.sleep(1000);
	    
	    WebElement elementFirstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	    
	    String firstLead = elementFirstLead.getText();
	    System.out.println(firstLead);
	    
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	    
	    driver.findElement(By.xpath("((//label[@class='x-form-item-label'])[18]/following::input)[1]")).sendKeys(firstLead);
	    
	    driver.findElement(By.xpath("//a[contains (text(),'Find Leads')]")).click();
	    
	    
	    
	    String noRecord = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	    
	    if(noRecord=="No Record to Display")
	    
	    	System.out.println("Successfully Deleted");
	    
	    else
	    	System.out.println("Not successfully Deleted");
	    
	    driver.close();
	    
	    
	}

}
