package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();

	    
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("123@gmail.com");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
	    WebElement elementFirstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	    
	    String firstLead = elementFirstLead.getText();
	    System.out.println(firstLead);
	    elementFirstLead.click();
	     
	    driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
	    
	    Thread.sleep(2000);
	    
	    String title= driver.getTitle();
	    
	    if(title.equals("Duplicate Lead"))
	    	System.out.println("The Title is Duplicate Lead");
	    
	    driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	    
	    WebElement elementFirstDup = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
	    elementFirstDup.getText();
	    
	    if(firstLead.equals(elementFirstDup.getText()))
	    {
	    	System.out.println("Duplicated");
	    }
	    else
	    	System.out.println("Not Duplicated");
	    
	    driver.close();
	    
	}

	
}
