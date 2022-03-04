package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	@SuppressWarnings("unlikely-arg-type")
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
	    WebElement elementFindFirstName = driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input"));
	    elementFindFirstName.sendKeys("Test");
	    
	   
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
	    
	    Thread.sleep(3000);

	    WebElement elementFindLink = driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	    elementFindLink.click();
	    
	    Thread.sleep(2000);
	    
	    String Title = driver.getTitle();
	    System.out.println(Title);
	    driver.findElement(By.xpath("//a[contains (text(),'Edit')]")).click();
WebElement elementCompanyNameTest = driver.findElement(By.xpath("(//td[@class='label']/following::input)[1]"));
	    
	    elementCompanyNameTest.clear();
	    elementCompanyNameTest.sendKeys("CTS");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    
	    WebElement elementCompanyNameUpdate = driver.findElement(By.id("viewLead_companyName_sp"));
	
	    if(elementCompanyNameUpdate.equals("CTS"))
	    	System.out.println("Updated Correct");
	}
}
