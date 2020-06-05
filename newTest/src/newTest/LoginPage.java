package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void testLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		
		//submit without a password
		driver.findElement(By.name("login_admin")).click();
		String at1 = driver.getTitle();
		String et1 = "AVI registration";
		if(at1.equalsIgnoreCase(et1)) {
			System.out.println("Password is required, test passed");
		} else {
			System.out.println("submitting form without the password, failed");
		}
		Thread.sleep(2000);
		
		//submit with the correct password
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		String at2 = driver.getTitle();
		String et2 = "AVI registration home";
		Thread.sleep(2000);
		driver.close();
		if(at2.equalsIgnoreCase(et2)) {
			System.out.println("Login Test Passed");
		} else {
			System.out.println("Login Test Failed");
		}
		
		
	}
}
