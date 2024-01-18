package Step_Defenation;


//import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.entrata.utils.Screenshot;
import com.entrata.utils.SetupDriver;
//import com.entrata.utils.SetupDriver;
import com.pagefactory.EntrataFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Entrata {
	WebDriver driver = SetupDriver.edgedriver();
	//WebDriver driver= SetupDriver.edgedriver();
	EntrataFactory pf;
	
	
	@Given("User is on the Entrata website")
	public void user_is_on_the_entrata_website() {
		pf=new EntrataFactory(driver);
		pf.launchhome();
	}
	@When("User navigates to the home page")
	public void user_navigates_to_the_home_page() throws InterruptedException {
	    pf.clicklogo();
	}
	@Then("Home Page Title should be Entrata")
	public void home_page_title_should_be_entrata() throws IOException, InterruptedException {
		String actualTitle = driver.getTitle();
	    String expectedTitle = "Entrata";
	    Assert.assertNotEquals("Mismatched", expectedTitle, actualTitle);
	    Thread.sleep(2000);
	    Screenshot.Capture(driver, "homepage");
	   driver.close();
	}

	
	@Given("user is on the home page")
	public void user_is_on_the_home_page1() {
		pf=new EntrataFactory(driver);
		pf.launchproduct();
	}
	@When("user goes to products option")
	public void user_goes_to_products_option() throws InterruptedException, IOException {
	   pf.mouseproducts();
	   Thread.sleep(2000);
	   Screenshot.Capture(driver, "mouseover");
	  // Screenshot.Capture(driver, "products");
	}
	@When("click on the Property Management")
	public void click_on_the_property_management() throws InterruptedException {
	   pf.click_productmanagement();
	   Thread.sleep(2000);
	   WebElement  productsuite=driver.findElement(By.xpath("//div[text()='Product Suite']"));
	   Assert.assertTrue("Property Management link is not navigated successfully",  productsuite.isDisplayed());
	}
	@Then("navigated sucessfully")
	public void navigated_sucessfully() throws InterruptedException {
		Thread.sleep(2000);
	  pf.clickdemo();
	  driver.close();
	}




@Given("user is on the home page of entrata")
public void user_is_on_the_home_page_of_entrata() {
	pf=new EntrataFactory(driver);
	pf.launchhome();
}
@When("scrolled down")
public void scrolled_down() throws InterruptedException {
	Thread.sleep(2000);
    pf.scroll();
}
@When("click on the learn more")
public void click_on_the_learn_more() throws InterruptedException {
	Thread.sleep(2000);
   pf.learnmore();
   Thread.sleep(2000);
  
}
@Then("sucessfully navigated")
public void sucessfully_navigated() throws IOException, InterruptedException {
	String actualTitle = driver.getTitle();
    String expectedTitle = "entrata";
    Assert.assertNotEquals("Mismatched", expectedTitle, actualTitle);
    Thread.sleep(2000);
    Screenshot.Capture(driver, "entratadisplayed");
   driver.close();
}

@Given("user is on home page of entrata")
public void user_is_on_home_page_of_entrata() {
	pf=new EntrataFactory(driver);
	pf.launchhome();
}
@When("click on the resources")
public void click_on_the_resources() throws InterruptedException {
   pf.resources();
}
@And("click on the read more")
public void click_on_the_read_more() throws InterruptedException {
 pf.readmore();
}
@Then("click on the get the guide")
public void click_on_get_the_guide() throws InterruptedException, IOException {
  pf.gettheguide();
  Thread.sleep(2000);
  
  WebElement  text=driver.findElement(By.xpath("//div[text()='Reputation Management Made Simple']"));
  Assert.assertTrue("Reputation Management Made Simple Displayed successfully",  text.isDisplayed());
  Thread.sleep(2000);
  Screenshot.Capture(driver, "textdisplayed");
}

@Given("user is on home page")
public void user_is_on_home_page() {
	pf=new EntrataFactory(driver);
	pf.launchdemo();
}

@When("^user enters  (.*),(.*), (.*),(.*), (.*), (.*), and (.*)$")
public void user_enters_and(String firstName, String lastName, String email, String companyName, String phoneNumber, String unitCount, String jobTitle) throws InterruptedException {
	   //enter(firstName, lastName, email, companyName, phoneNumber, unitCount, jobTitle);
	
	Thread.sleep(3000);
	pf.firstname(firstName);
    Thread.sleep(1000);
    pf.lastname(lastName);
    Thread.sleep(1000);
    pf.email(email);
    Thread.sleep(1000);
    pf.company(companyName);
    Thread.sleep(1000);
    pf.phonenumber(phoneNumber);
    Thread.sleep(1000);
    pf.unitcount(unitCount);
    Thread.sleep(1000);
    pf.jobtitle(jobTitle);
   
}
@Then("user clicks on Watch Demo")
public void user_clicks_on_watch_demo() throws InterruptedException {
	Thread.sleep(2000);
	pf.button();
	driver.close();
}





}
