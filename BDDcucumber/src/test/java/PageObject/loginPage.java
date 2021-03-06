package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	By userNameLocator= By.xpath("//input[@id='user-name']");
	By passwordLocator= By.xpath("//input[@id='password']");
	By loginLocator=By.xpath("//input[@id='login-button']");
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setuserName(String userName)
	{

        driver.findElement(userNameLocator).sendKeys(userName);

    }
	public void setPassword(String password)
	{

        driver.findElement(passwordLocator).sendKeys(password);

   }

   public void clickLogin()
   {
        driver.findElement(loginLocator).click();
   }

}
