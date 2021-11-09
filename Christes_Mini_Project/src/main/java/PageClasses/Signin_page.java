package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;
import baseClasses.TopMenuClass;

public class Signin_page extends PageBaseClass {

	public TopMenuClass topmenu;

	public Signin_page(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topmenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topmenu);
	}

	@FindBy(xpath = "//input[@id='username']")
	public WebElement useremail_TextBox;

	

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password_TextBox;

	@FindBy(xpath = "//button[@class='chr-button chr-button--primary chr-button--dark chr-button--block']")
	public WebElement submitLogin_button;
	
	@FindBy(xpath = "//a[contains(text(),'Auctions')]")
	public WebElement auctionclick;

	
	@FindBy(xpath = "//a[contains(text(),'Departments')]")
	public WebElement clickDept;
	

	@FindBy(xpath = "//a[contains(text(),'Stories')]")
		//@FindBy(linkText ="Stories")
	public WebElement storiesbutton;
	
	
	public Private_Sales doLogin(String userName, String password) {
		
		useremail_TextBox.sendKeys(userName);
		logger.log(Status.PASS, "Entered the UserName : " + userName);
		
		logger.log(Status.PASS, "Clicked the UserName Submit Buttton");
		System.out.println("Entered Username");
		password_TextBox.sendKeys(password);
		logger.log(Status.PASS, "Entered the Password : " + password);
		System.out.println("Entered password");
		submitLogin_button.click();
		System.out.println("Click to submit");
		//waitForPageLoad();
		logger.log(Status.PASS, "Cliecked the Submit Login Button");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String currentPageTitle = driver.getTitle();
		/*
		if (currentPageTitle.equals("Rediffmail")){
			reportFail("Login is failed on Email Login Page");
			Assert.fail("Login Failed");
		}
		*/
		Private_Sales privatesale = new Private_Sales(driver, logger);
		PageFactory.initElements(driver, privatesale);
		return privatesale;
	}
	
	public void enterUser(String userName){
		useremail_TextBox.sendKeys(userName);
		logger.log(Status.PASS, "Entered the UserName : " + userName);
	}
	
	/*public void submitUserName(){
		emailSubmit_button.click();
		logger.log(Status.PASS, "Clicked the UserName Submit Buttton");
	}*/
	
	public void enterPassword(String password){
		password_TextBox.sendKeys(password);
		logger.log(Status.PASS, "Entered the Password : " + password);
	}
	
	public Private_Sales submitLogin(){
		submitLogin_button.click();
		logger.log(Status.PASS, "Cliecked the Submit Login Button");
		Private_Sales privatesale = new Private_Sales(driver, logger);
		PageFactory.initElements(driver, privatesale);
		return privatesale;
	}
	
	public Auctions clickAuction(){
		auctionclick.click();
		logger.log(Status.PASS, "Clicked the clickAuction Button");
		System.out.println("Clicked the clickAuction Button");
		Auctions auction = new Auctions(driver, logger);
		PageFactory.initElements(driver, auction);
		return auction;
	}
	
	public Departments submitDept(){
		
		clickDept.click();
		logger.log(Status.PASS, "Cliecked the Submit Login Button");
		Departments departobject = new Departments(driver, logger);
		PageFactory.initElements(driver, departobject);
		return departobject;
	}


	public Storiespage clickStoriesPage() {
		storiesbutton.click();
		System.out.println("stories button on signin page");
		//return new Storiespage(driver, logger);
		
		Storiespage storiespage = new Storiespage(driver, logger);
		PageFactory.initElements(driver, storiespage);
		return storiespage;
	}
	
	
	public void verifyPasswordField(){
		veriyElementIsDisplayed(password_TextBox);
	}

}
