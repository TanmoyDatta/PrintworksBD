package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;


public class MyAccountPage extends BasePage{
	public By Home_BTN = By.xpath("//li[@id='nav-menu-item-10759']");
	
	public void home_Button() throws InterruptedException {
		clickOnElement(Home_BTN);
	
	}

}
