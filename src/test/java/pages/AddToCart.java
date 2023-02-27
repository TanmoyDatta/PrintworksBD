package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utilities.DriverSetUp.getDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart extends BasePage{
	public By AddCart = By.xpath("//button[normalize-space()='Add to cart']");
	public By CartItem = By.xpath("//span[@class='cart-items']");
	public By Checkout_BTN = By.xpath("//a[normalize-space()='Checkout']");
	
	
	public void ADD_TO_CART() throws InterruptedException {
		clickOnElement(AddCart);
		Thread.sleep(2000);
		WebElement cartItem = getElement(CartItem);
		Actions actions = new Actions(getDriver());
		actions.clickAndHold(cartItem).build().perform();
		Thread.sleep(2000);
		clickOnElement(Checkout_BTN);
		
		
		
		
	}

}
