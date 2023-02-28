package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static utilities.DriverSetUp.getDriver;

public class NextAndViewBookPage extends BasePage{
	
	public By SelectBook = By.xpath("//*[@id=\"content\"]/div[2]/div/ul/li[9]/div[1]/a/div[2]/img");
	
	public void ViewBook() throws InterruptedException {
		WebElement Book = getElement(SelectBook);		
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();",Book);
		Thread.sleep(2000);
		Book.click();
		Thread.sleep(1000);
	}
}
