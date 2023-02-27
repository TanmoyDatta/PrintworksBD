package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static utilities.DriverSetUp.getDriver;

public class AllInformationPage extends BasePage{
	
	public By First_Name = By.xpath("//input[@id='billing_first_name']");
	public By Last_Name = By.xpath("//input[@id='billing_last_name']");
	public By Countries = By.xpath("//span[@id='select2-billing_country-container']");
	public By Address = By.xpath("//input[@id='billing_address_1']");
	public By B_address = By.xpath("//input[@id='billing_address_2']");
	public By PostCode = By.xpath("//input[@id='billing_postcode']");
	public By Phone = By.xpath("//input[@id='billing_phone']");
	public By Trems= By.xpath("//input[@id='terms']");
	public By PlaceOrder_BTN = By.xpath("//input[@id='place_order']");
	
	
	public void InformationAll() throws InterruptedException {
		WebElement f_name = getElement(First_Name);
		WebElement l_name = getElement(Last_Name);
		WebElement country = getElement(Countries);
		WebElement address = getElement(Address);
		f_name.sendKeys("Tanmoy");
		l_name.sendKeys("Datta");
		Thread.sleep(2000);
		
		country.sendKeys("Bang");
		Thread.sleep(5000);
		Actions actions = new Actions(getDriver());
		actions.sendKeys(country,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
//		actions.moveToElement(address).build().perform();
//		address.sendKeys("Mirpur-1 , Dhaka");
		
		
		
	}

}
