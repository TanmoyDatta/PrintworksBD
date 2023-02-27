package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static utilities.DriverSetUp.getDriver;
public class AfterLoginHome extends BasePage {
	
	public By StroyBook = By.xpath("//li[@id='nav-menu-item-720']//a[normalize-space()='Story Books']");
	public By Fiction = By.cssSelector("li[id='nav-menu-item-2584'] a");
	public By NextPage = By.xpath("//div[@class='shop-loop-after clearfix']//a[@class='next page-numbers']");
	
	public void scrollMenu() throws InterruptedException {
		
		WebElement manu = getElement(StroyBook);
		WebElement fiction = getElement(Fiction);
		Actions actions = new Actions(getDriver());
		actions.clickAndHold(manu).build().perform();
		Thread.sleep(2000);
		fiction.click();
		WebElement Next = getElement(NextPage);
		actions.moveToElement(Next).build().perform();
		Thread.sleep(2000);
		Next.click();
		Thread.sleep(2000);
		
		
	}

}
