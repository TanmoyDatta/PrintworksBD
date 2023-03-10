package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
	
	@Test(priority = 0,description = "Visit this site and show the Homepages")
	public void HomePage() throws InterruptedException {
		getDriver().get(homePage.Home_URL);
		assertEquals(homePage.Home_Title, "Printworks BD- The Best Place to Shop Books Online in Bangladesh");	
	
	}
	
	@Test(priority = 1,description = "Click on the Login pages")
	public void LoginPage() throws InterruptedException {
		getDriver().get(homePage.Home_URL);
		homePage.clickOnElement(homePage.Login);
		assertEquals(homePage.getElementText(homePage.Login),"LOG IN");
		System.out.print(homePage.getElementText(homePage.Login));
	}
	
	@Test(priority = 2,description = "Enter a valid email and valid password in LogIn pages",dataProvider = "ValidCredensial",dataProviderClass = Dataset.class)
	public void testLogInValidCredentialsUsingDataprovider(String username, String password) throws InterruptedException {
		getDriver().get(loginPage.Login_URL);
		assertEquals(loginPage.Login_Title,"My Account - Printworks BD");
		loginPage.dologin(username,password);
		Thread.sleep(2000);
	}
	
	@Test(priority = 3,description = "Hover Story Book and click on the Friction")
	public void AfterLogInHomePages() throws InterruptedException {
		getDriver().get(loginPage.Login_URL);
		accountPage.home_Button();
		assertEquals(accountPage.getElementText(accountPage.Home_BTN),"HOME");
		afterLoginHome.scrollMenu();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(afterLoginHome.getElementText(afterLoginHome.StroyBook),"STORY BOOKS");
		softAssert.assertEquals(afterLoginHome.getElementText(afterLoginHome.Fiction),"Fiction");
		assertEquals(afterLoginHome.Fiction_Title,"Fiction & Fantasy Archives - Printworks BD");
	}
	
	@Test(priority = 4,description = "Scroll Down And Go to the Next Page")
	public void NextPage() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/product-category/story-books/fiction-fantasy/page/2/");
		nextAndViewBookPage.ViewBook(); 
	}
	@Test(priority = 5,description = "View any book, Add to Cart And Hover Cart Icon and Click Checkout")
	public void ADDTOCART() throws InterruptedException {
	
		addToCart.ADD_TO_CART();		
	}
	@Test(priority = 6,description = "Provide all information on this page And Place Order")
	public void OrderPlace() throws InterruptedException {
		assertEquals(allInformationPage.INfo_Title,"Checkout - Printworks BD");
		allInformationPage.InformationAll();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(allInformationPage.getElementText(allInformationPage.PlaceOrder_BTN),"Place order");
		Thread.sleep(5000);
	}
}