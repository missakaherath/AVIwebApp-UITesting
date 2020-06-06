package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexPage {
	public void testLogout() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("logoutLink")).click();
		String at = driver.getTitle();
		String et = "AVI registration home";
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Logged out successfully, test passed");
		} else {
			System.out.println("Logout test failed");
		}
	}
}
