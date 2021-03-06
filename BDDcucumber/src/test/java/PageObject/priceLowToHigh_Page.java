package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class priceLowToHigh_Page 
{
	WebDriver driver;
	By sortByLocator= By.xpath("//select[@class=\"product_sort_container\"]");
	By selectText= By.xpath("//option[@value=\"lohi\"]");
	public priceLowToHigh_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnSort() throws Exception
	{
		driver.findElement(sortByLocator).click();
		Thread.sleep(3000);
	}
	public String getAllValues()
	{
		WebElement el=driver.findElement(sortByLocator);
		return el.getText();
	}
	public void selectPriceLowtoHigh() throws Exception
	{
		Select drop= new Select(driver.findElement(sortByLocator));
		drop.selectByVisibleText("Price (low to high)");
		Thread.sleep(3000);
	}

}
