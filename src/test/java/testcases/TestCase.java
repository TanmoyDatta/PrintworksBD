package testcases;

import org.testng.annotations.Test;

import pages.AddToCart;
import pages.AfterLoginHome;
import pages.AllInformationPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.NextAndViewBookPage;
import utilities.DriverSetUp;

public class TestCase extends DriverSetUp{
	
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	MyAccountPage accountPage = new MyAccountPage();
	AfterLoginHome afterLoginHome = new AfterLoginHome();
	NextAndViewBookPage nextAndViewBookPage = new NextAndViewBookPage();
	AddToCart addToCart = new AddToCart();
	AllInformationPage allInformationPage = new AllInformationPage();
	
	@Test
	public void AllTest() throws InterruptedException {
		getDriver().get(homePage.Home_URL);
		homePage.clickOnElement(homePage.Login);
		Thread.sleep(3000);
		loginPage.dologin("tanmoycse3@gmail.com","pass123#");
		accountPage.home_Button();
		afterLoginHome.scrollMenu();
		nextAndViewBookPage.ViewBook();
		addToCart.ADD_TO_CART();
		allInformationPage.InformationAll();
		
		
	}
	

}
