package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;


public class LandingPage extends PageBaseClass {

	public LandingPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	//@FindBy(xpath = "//button[@class='chr-button chr-button--primary chr-button--s chr-button--dark']");
	@FindBy(xpath = "//a[@id ='aLoginScreen']")
	public WebElement signinClick;


	public Signin_page clicksigninPage() {
		logger.log(Status.INFO, "Clicking the Money Link, Present in Header");
		signinClick.click();
		logger.log(Status.PASS, "Clicked the Rediff mail");
		Signin_page signin = new Signin_page(driver, logger);
		PageFactory.initElements(driver, signin);
		return signin;
	}

	
}
