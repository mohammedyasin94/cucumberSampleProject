package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addTobag_Page 
{
	WebDriver driver;
	
	By clickProduct= By.xpath("//img[@alt=\"Sauce Labs Bolt T-Shirt\"]");
	By clickAddToCart= By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	public addTobag_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	public String verifyHomePage()
	{
		String title= driver.getTitle();
		return title;
	}
	public void clickOnAproduct()
	{
		driver.findElement(clickProduct).click();
	}
	public void clickaddtocart()
	{
		driver.findElement(clickAddToCart).click();
	}
}
