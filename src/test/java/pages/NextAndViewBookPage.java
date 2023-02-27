package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utilities.DriverSetUp.getDriver;
import org.openqa.selenium.interactions.Actions;

public class NextAndViewBookPage extends BasePage{
	
	public By SelectBook = By.xpath("//*[@id=\"content\"]/div[2]/div/ul/li[9]/div[1]/a/div[2]/img");
	
	public void ViewBook() throws InterruptedException {
		WebElement Book = getElement(SelectBook);
		Actions actions = new Actions(getDriver());
		actions.scrollToElement(Book).build().perform();
		Book.click();
		Thread.sleep(2000);
	}
}
