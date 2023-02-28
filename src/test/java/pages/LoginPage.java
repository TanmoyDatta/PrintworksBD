package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	public By UserName = By.xpath("//input[@id='username']");
	public By Password = By.xpath("//input[@id='password']");
	public By RememberMe= By.xpath("//input[@id='rememberme']");
	public By Login_BTN = By.xpath("//input[@name='login']");
	
	
	public void dologin(String username , String password) throws InterruptedException {
		writeTextOnElement(UserName,username);
		writeTextOnElement(Password,password);
		clickOnElement(RememberMe);
		clickOnElement(Login_BTN);
		Thread.sleep(50000);	
	}
}
