package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class Auctions extends PageBaseClass {

	public Auctions(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	
	@FindBy(xpath = "//span[@class='chr-checkbox__label chr-body-s']")
	public WebElement charity;
	
	public AuctionSecondPage clickCharity(){
		charity.click();
		logger.log(Status.PASS, "Clicked the clickWatch Button");
		System.out.println("Clicked the clickWatch Button");
		AuctionSecondPage auctionsecondpg = new AuctionSecondPage(driver, logger);
		PageFactory.initElements(driver, auctionsecondpg);
		return auctionsecondpg;
	}
	
}
