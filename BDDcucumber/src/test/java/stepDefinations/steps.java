package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.addTobag_Page;
import PageObject.loginPage;
import PageObject.order_Page;
import PageObject.priceLowToHigh_Page;
import io.cucumber.java.en.*;


public class steps{
	
	public WebDriver driver;
	public loginPage lp;
	public addTobag_Page addp;
	public priceLowToHigh_Page plohi;
	public order_Page op;
	@Given("Open browser with {string}")
	public void open_browser_with(String url)
	{
		System.setProperty("webdriver.chrome.driver","/Users/apple/BDDcucumberProject/BDDcucumber/drivers/chromedriver 2");
		driver=new ChromeDriver();
		lp=new loginPage(driver);
		driver.get(url);   
		driver.manage().window().maximize();
	}

	@When("I input {string} and {string}")
	public void i_input_and(String userName, String password) throws Exception 
	{
		lp.setuserName(userName);
		lp.setPassword(password);
		Thread.sleep(3000);
		lp.clickLogin();
	}

	@Then("Driver Close")
	public void driver_Close() 
	{
	  driver.close();
	}
	//-----------------------------------------
	@Given("User login to homepage to verify homepage as {string}")
	public void user_login_to_homepage_to_verify_homepage_as(String Expectedtitle) throws Exception 
	{
		addp = new addTobag_Page(driver);
		//addp.verifyHomePage();
		Thread.sleep(3000);
		Assert.assertTrue(addp.verifyHomePage().equalsIgnoreCase(Expectedtitle));


	}
	@When("User click on a product")
	public void user_click_on_a_product() throws Exception 
	{
	   addp.clickOnAproduct();
	   Thread.sleep(2000);
	}

	@When("User click on add to cart")
	public void user_click_on_add_to_cart() throws Exception 
	{
	    addp.clickaddtocart();
	    Thread.sleep(2000);
	}
	//-----------------------------------------
	@When("User click on sort by option")
	public void user_click_on_sort_by_option() throws Exception 
	{
		plohi = new priceLowToHigh_Page(driver);
		plohi.clickOnSort();
	    
	}
	@When("get all present valuess")
	public void get_all_present_valuess() 
	{
	   System.out.println(plohi.getAllValues());
	}

	@When("User select price low to high")
	public void user_select_price_low_to_high() throws Exception 
	{
	   plohi.selectPriceLowtoHigh();
	}
	//-----------------------------------------
	@Then("user view the cart")
	public void user_view_the_cart() throws Exception {
	   op= new order_Page(driver);
	   op.viewCart();
	   Thread.sleep(2000);
	}

	@Then("user click on checkout")
	public void user_click_on_checkout() throws Exception {
	   op.checkout();
	   Thread.sleep(2000);
	}

	@Then("user fillout the info as firstName {string} lastName {string} and zip {string}")
	public void user_fillout_the_info_as_firstName_lastName_and_zip(String firstName, String lastName, String zipCode) throws Exception {
	   op.SetInfo(firstName, lastName, zipCode);
	   Thread.sleep(2000);
	}

	@Then("user click on finish")
	public void user_click_on_finish() throws Exception {
	   op.finish();
	   Thread.sleep(2000);
	}

}
