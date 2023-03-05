package pages;

import org.openqa.selenium.By;


public class HomePage extends BasePage{
	public String Home_URL = "https://www.printworksbd.com/";
	public By Login = By.xpath("//ul[@id='menu-top-navigation']//a[normalize-space()='Log In']");
	public String Home_Title = "Printworks BD- The Best Place to Shop Books Online in Bangladesh";
	public By LoginBTN_Title = By.linkText("Log In");


}
