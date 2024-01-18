package com.pagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntrataFactory {
	WebDriver driver;
	WebElement element;
    WebDriverWait wait;
	
	@FindBy(xpath="//a[@aria-current='page']")
	WebElement logo;

	@FindBy(xpath="//div[text()='Products']")
	WebElement products;	

	@FindBy(xpath="//a[@href='/products/property-management']")
	WebElement property_management;
	
	@FindBy(xpath="//a[@class='button-default solid-light-button']")
	WebElement watchdemo;	

	@FindBy(xpath="//a[@href='https://go.entrata.com/watchdemo']")
    WebElement learnmore;
	
	@FindBy(xpath="//a[text()='Resources']")
    WebElement resources;
	
	@FindBy(xpath="//a[@href='/resources/reputation-management-guide']")
	WebElement readmore;
	
	@FindBy(xpath="//a[@href='https://go.entrata.com/reputation-management-made-simple.html']")
	WebElement gettheguide;
	
	 @FindBy(id="FirstName")
	//@FindBy(xpath="//input[@aria-labelledby='LblFirstName InstructFirstName']")
	WebElement firstname;
		
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname;

	@FindBy(xpath="//input[@id='Email']")
	WebElement email;	

	@FindBy(xpath="//input[@id='Company']")
	WebElement company;	

	@FindBy(xpath="//input[@id='Phone']")
	WebElement phonenumber;	

	@FindBy(xpath="//select[@id='Unit_Count__c']")
	WebElement unitcount;
		
	@FindBy(xpath="//input[@id='Title']") 
	WebElement jobtitle; 
		
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;

	public EntrataFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		public void launchhome() {
			driver.get("https://www.entrata.com/");
		}
		public void launchproduct() {
			driver.get("https://www.entrata.com/products/property-management");
		}
		public void launchdemo() {
			driver.get("https://go.entrata.com/watch-demo.html");
		}

	
		public void clicklogo() throws InterruptedException {
						 //logo.click();
			 wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
			 wait.until(ExpectedConditions.elementToBeClickable(logo));
		     Actions act = new Actions(driver);
			 Thread.sleep(2000);
			 act.click(logo).build().perform();
			
		}


		public void mouseproducts() throws InterruptedException {
			//Thread.sleep(3000);
		    wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		    wait.until(ExpectedConditions.elementToBeClickable(products));
			Actions act = new Actions(driver);
			//act.moveToElement(stores);
			Thread.sleep(2000);
			act.moveToElement(products).build().perform();
		}

		public void click_productmanagement() throws InterruptedException {
			//property_management.click();
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.click(property_management).build().perform();
			
		}

	
		public void clickdemo() throws InterruptedException {
			//watchdemo.click();
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.click(watchdemo).build().perform();
			
		}
		

		public void scroll() throws InterruptedException {
			 wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		     wait.until(ExpectedConditions.elementToBeClickable(learnmore));
			 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		     js1.executeScript("window.scrollBy(0,2200)");
		     Thread.sleep(2000);
		}

		public void learnmore() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		    wait.until(ExpectedConditions.elementToBeClickable(learnmore));
		    Thread.sleep(2000);
		    learnmore.click();
		    Thread.sleep(3000);
		}

		public void navigated() {
			driver.close();
		}
		
		public void resources() throws InterruptedException {
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.click(resources).build().perform();
			Thread.sleep(1000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
		    js1.executeScript("window.scrollBy(0,500)");
		}

		public void readmore() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		    wait.until(ExpectedConditions.elementToBeClickable(learnmore));
		    Thread.sleep(2000);
		    readmore.click();
		}

		public void gettheguide() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		    wait.until(ExpectedConditions.elementToBeClickable(learnmore));
		    Thread.sleep(2000);
		    JavascriptExecutor js1 = (JavascriptExecutor) driver;
		    js1.executeScript("window.scrollBy(0,500)");
		    gettheguide.click();
		    Thread.sleep(2000);
		}
		public void firstname(String Arti) throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(firstname));
		    //Thread.sleep(2000);
			firstname.sendKeys(Arti);
			Thread.sleep(2000);
			
		}

		public void lastname(String Kunde) throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(lastname));
		    Thread.sleep(2000);
			lastname.sendKeys(Kunde);
			Thread.sleep(2000);
		}

		public void email(String  artikunde2016 ) throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(email));
		    Thread.sleep(2000);
			email.sendKeys( artikunde2016);
			Thread.sleep(2000);
			
		}

		public void company(String Entrata) throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(company));
		    Thread.sleep(2000);
			company.sendKeys(Entrata);
			Thread.sleep(2000);
			
		}
		
		public void phonenumber(String number) throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(phonenumber));
		    Thread.sleep(2000);
			phonenumber.sendKeys(number);
			Thread.sleep(2000);
		
		}

		public void unitcount(String count) throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(unitcount));
		    Thread.sleep(2000);
			unitcount.sendKeys(count);
			Thread.sleep(2000);
			
		}

		public void jobtitle(String SE) throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(jobtitle));
		    Thread.sleep(2000);
			jobtitle.sendKeys(SE);
			Thread.sleep(2000);
			
		}

	
		public void button() throws InterruptedException {
			wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		    wait.until(ExpectedConditions.elementToBeClickable(button));
		    Thread.sleep(2000);
			button.click();

	
	
	}

	

}
