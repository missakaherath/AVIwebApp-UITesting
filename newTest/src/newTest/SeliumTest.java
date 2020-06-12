package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AddAdminsPage addAdminPage = new AddAdminsPage();
		LoginPage loginPage = new LoginPage();
		AddGeneralUserPage addGeneralUserPage = new AddGeneralUserPage();
		BlacklistedVehiclesPage blacklistedVehiclesPage = new BlacklistedVehiclesPage();
		ReleasedVehiclePage releasedVehiclePage = new ReleasedVehiclePage();
		AdminListPage adminListPage = new AdminListPage();
		GeneralUsersListPage generalUsersListPage = new GeneralUsersListPage();
		IndexPage indexPage = new IndexPage();
		
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\new selenium\\exefiles\\chromedriver.exe");

		//test add admin page
//		addAdminPage.testAddAdmin(); 
		
		//test the login page
//		loginPage.testLogin();
		
		//test add general user page
//		addGeneralUserPage.testAddGenUser();
		
		//test blocked vehicles page
		//searching a blocked vehicle
//		blacklistedVehiclesPage.testSearchABlockedVehicle(); 
		//unblock a blocked vehicle
//		blacklistedVehiclesPage.testUnblockingAVehicle();
		
		//test released vehicles page
		//test search released vehicle
		releasedVehiclePage.testSearchReleasedVehicles();
		
		//test admin list page
		//test search admin
//		adminListPage.testSearchAdmin();
		//test edit admin
//		adminListPage.testEditAdmin();
		//test change state
//		adminListPage.testChangeState();
		
		//test general userpage
		//test search a general user
//		generalUsersListPage.testSearchGeneralUser();
		//test edit gen user
//		generalUsersListPage.testEditGenUser();
		//test general user change state
//		generalUsersListPage.testGenUserChangeState();
		
		//test index page
		//test logging out functionality
//		indexPage.testLogout();
		
	}
}
