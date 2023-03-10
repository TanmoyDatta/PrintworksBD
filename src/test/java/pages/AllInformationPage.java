package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;
import static utilities.DriverSetUp.getDriver;

public class AllInformationPage extends BasePage{
	
	public By First_Name = By.xpath("//input[@id='billing_first_name']");
	public By Last_Name = By.xpath("//input[@id='billing_last_name']");
	public By Countries = By.xpath("(//span[@id='select2-billing_country-container'])[1]");
	public By County_select = By.xpath("//input[@role='combobox']");
	public By Address = By.xpath("//input[@id='billing_address_1']");
	public By B_address = By.xpath("//input[@id='billing_address_2']");
	public By PostCode = By.xpath("//input[@id='billing_postcode']");
	public By Phone = By.xpath("//input[@id='billing_phone']");
	public By Email = By.xpath("//input[@id='billing_email']");
	public By Order_Note = By.xpath("//textarea[@id='order_comments']");
	public By Trems= By.xpath("//input[@id='terms']");
	public By PlaceOrder_BTN = By.xpath("//input[@id='place_order']");
	public String INfo_Title = "Checkout - Printworks BD";
	
	public void InformationAll() throws InterruptedException {
		WebElement country = getElement(Countries);
		WebElement b_address = getElement(B_address);
	    WebElement mail = getElement(Email);
	    WebElement address = getElement(Address);
	    WebElement postCode = getElement(PostCode);
	    WebElement phone = getElement(Phone);
		
		writeTextOnElement(First_Name,"Tanmoy");
		writeTextOnElement(Last_Name,"Datta");
		
	
		
		Thread.sleep(1000);
		country.click();
		writeTextOnElement(County_select,"Bangla");
		Thread.sleep(2000);
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		address.clear();
		address.sendKeys("Mirpur-1 , Dhaka");
		Thread.sleep(1000);
		
		b_address.clear();
		b_address.sendKeys("Sukhrabad, Dhanmondhi 32, Dhaka");
		Thread.sleep(1000);
		
		postCode.clear();
		postCode.sendKeys("Dhaka 1216");
		Thread.sleep(1000);
		
		phone.clear();
		phone.sendKeys("01712345678");
		Thread.sleep(2000);
		
		mail.clear();
		mail.sendKeys("tanmoycse3.gmail.com");
		writeTextOnElement(Order_Note,"I need the product urgently, so early delivery would be helpful. Advance Thanks");
		
		clickOnElement(Trems);
		Thread.sleep(2000);
		
		WebElement placeOrder_BTN = getElement(PlaceOrder_BTN);

		actions.scrollToElement(placeOrder_BTN).build().perform();
		placeOrder_BTN.click();
		Thread.sleep(2000);
		
	}

}
