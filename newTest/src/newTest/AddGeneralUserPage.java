package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddGeneralUserPage {
	public void testAddGenUser() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Missaka");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("registerGenUser")).click();
		Thread.sleep(2000);
		
		//submit without data
		driver.findElement(By.name("add_general_user")).click();
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		String et = "Add General User";
		if(at.equalsIgnoreCase(et)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}
	}
}