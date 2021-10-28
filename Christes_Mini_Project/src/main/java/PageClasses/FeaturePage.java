package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;


public class FeaturePage extends PageBaseClass {

	public FeaturePage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}

	@FindBy(xpath = "//a[contains(text(),'FEATURES')]")
	public WebElement featureClick;
	
	@FindBy(xpath = "//*[@id=\"atyourservice_Nav\"]/div/div[1]/div/div/a")
	public WebElement FindMoreClick;
	
	public void clickEleFeature() {
		featureClick.click();
		System.out.println("Click clickEleFeature Button");
	}
	
	public FindOutMore_Page submit_Find_out(){
		FindMoreClick.click();
		logger.log(Status.PASS, "Clicked the submit_Find_out");
		System.out.println("Clicked the submit_Find_out");
		FindOutMore_Page findoutmore = new FindOutMore_Page(driver, logger);
		PageFactory.initElements(driver, findoutmore);
		return findoutmore;
	}
	
	

}
