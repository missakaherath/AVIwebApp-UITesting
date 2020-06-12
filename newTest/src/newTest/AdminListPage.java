package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminListPage {
	public void testSearchAdmin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Missaka");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewAdminLink")).click();
		Thread.sleep(2000);
		
		//search with search an empty search field
		driver.findElement(By.name("submit-admin-search")).click();
		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "Admin List";
		if(at.equalsIgnoreCase(et)) {
				System.out.println("didnt proceed with an empty search field, test passed");
			} else {
				System.out.println("test failed");
			}
		
		//search with a string
		driver.findElement(By.name("search")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.name("submit-admin-search")).click();
		Thread.sleep(2000);
		String at2 = driver.getTitle();
		String et2 = "Search Results";
		if(at2.equalsIgnoreCase(et2)) {
			System.out.println("search admin test passed");
		} else {
			System.out.println("test failed");
		}
		driver.close();
	}
	
	public void testEditAdmin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Missaka");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewAdminLink")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("EDregNo:1389ABcd")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("fullName")).clear();
		driver.findElement(By.name("fullName")).sendKeys("testEdit");
		
		driver.findElement(By.name("regNo")).clear();
		driver.findElement(By.name("regNo")).sendKeys("testEdit2");
		
		Select drpBranch = new Select(driver.findElement(By.id("categorylist")));
		drpBranch.selectByVisibleText("Moratuwa");
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("testEdit");
		Thread.sleep(2000);
		
		driver.findElement(By.name("update_admin")).click();
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		String et = "Admin List";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Edit admin details test passed");
		} else {
			System.out.println("Edit admin details test failed");
		}
	}
	
	public void testChangeState() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/AVI_registration_system/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Missaka");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("login_admin")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("viewAdminLink")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("CSregNo:1838ABcd")).click();
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		String et = "Admin List";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Change State test passed");
		} else {
			System.out.println("Change State test failed");
		}
	}
}
