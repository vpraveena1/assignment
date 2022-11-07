package week2day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
			WebDriverManager.edgedriver().setup();// set up the path
			EdgeDriver driver=new EdgeDriver();// launching browser(edge)
		   	//launch the browser(edge)
			driver.get("http://leaftaps.com/opentaps/control/main");//url will open
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//wait
			driver.manage().window().maximize();// window maximise
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
																				//enter username, password send keys will enter the values
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();// click login button
				                                         					
						//click crmsfa
			driver.findElement(By.linkText("CRM/SFA")).click();
			System.out.println(driver.getTitle());//get title of the page
			driver.findElement(By.linkText("Leads")).click();//click lead
			driver.findElement(By.linkText("Create Lead")).click();// click create lead
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");//enter company name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("praveena");//enter first name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("hari");//enter last name
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("praveena");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("hari");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium is a automation tool");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vpraveena1@gmail.com");			
			driver.findElement(By.name("submitButton")).click();//click submit button
			String title = driver.getTitle();//ctrl+2+l
			System.out.println(driver.getTitle());
		

	}

}
