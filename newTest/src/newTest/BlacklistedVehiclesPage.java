package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlacklistedVehiclesPage {
	
	public void testSearchABlockedVehicle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Missaka");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewBlockedLink")).click();
		Thread.sleep(2000);
		
		//search with search an empty search field
		driver.findElement(By.name("submit-search")).click();
		String at = driver.getTitle();
		String et = "Blocked Vehicles List";
		if(at.equalsIgnoreCase(et)) {
			System.out.println("didnt proceed with an empty search field, test passed");
		} else {
			System.out.println("test failed");
		}
		
		driver.close();
	}
	
	public void testUnblockingAVehicle() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Missaka");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewBlockedLink")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("46")).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "Released Vehicles List";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Unblocking a blocked vehicle test passed");
		} else {
			System.out.println("Unblocking a blocked vehicle test failed");
		}
	}
}
