package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class order_Page 
{
	By cartLocator= By.xpath("//span[contains(text(),'1')]");
	By checkoutLocator= By.xpath("//button[@id='checkout']");
	By fNameLocator= By.xpath("//input[@id='first-name']");
	By lNameLocator= By.xpath("//input[@id='last-name']");
	By zipLocator= By.xpath("//input[@id='postal-code']");
	By continueLocator= By.xpath("//input[@id='continue']");
	By finishLocator = By.xpath("//button[@id='finish']");
	
	WebDriver driver;
	public order_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void viewCart()
	{
		driver.findElement(cartLocator).click();
	}
	public void checkout()
	{
		driver.findElement(checkoutLocator).click();
	}
	public void SetInfo(String firstName, String lastName, String zipCode)
	{
		driver.findElement(fNameLocator).sendKeys(firstName);
		driver.findElement(lNameLocator).sendKeys(lastName);
		driver.findElement(zipLocator).sendKeys(zipCode);
		driver.findElement(continueLocator).click();
	}
	public void finish()
	{
		driver.findElement(finishLocator).click();
	}

}
