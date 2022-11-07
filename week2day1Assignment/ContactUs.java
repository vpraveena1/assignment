package week2day1Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*Assignment:3

Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Create Contact
Type First Name
Type Last Name
Click Create Contact Button
Print the first name and browser title 
Close the browser*/
public class ContactUs {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
																			
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
			       
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("PRAVEENA");
		driver.findElement(By.id("lastNameField")).sendKeys("HARI");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("PRAVEENA  "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();
			}

}
