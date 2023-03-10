package pages;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	public String Login_URL = "https://www.printworksbd.com/my-account/";
	public By UserName = By.xpath("//input[@id='username']");
	public By Password = By.xpath("//input[@id='password']");
	public By RememberMe= By.xpath("//input[@id='rememberme']");
	public By Login_BTN = By.xpath("//input[@value='Login']");
	public String Login_Title ="My Account - Printworks BD";
	
	public void dologin(String username , String password) throws InterruptedException {
		
		writeTextOnElement(UserName,username);
		writeTextOnElement(Password,password);
		
		clickOnElement(RememberMe);
		clickOnElement(Login_BTN);

		Thread.sleep(5000);	
	}
}
