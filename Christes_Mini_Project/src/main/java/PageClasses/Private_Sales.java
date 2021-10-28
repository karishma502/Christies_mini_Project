package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;


public class Private_Sales extends PageBaseClass {

	
	public Private_Sales(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Private Sales')]")
	public WebElement privateSalesClick;



	public FeaturePage clickPrivatesale() {
		logger.log(Status.INFO, "Clicking the clickPrivatesale");
		privateSalesClick.click();
		logger.log(Status.PASS, "Clicked the clickPrivatesale");
		System.out.println("Click the Private Sale");
		FeaturePage featurepage = new FeaturePage(driver, logger);
		PageFactory.initElements(driver, featurepage);
		return featurepage;
		
	}
	
	/*public Online_shop_page clickOnlineShop() {
		logger.log(Status.INFO, "Clicking the clickOnlineShop");
		privateSalesClick.click();
		logger.log(Status.PASS, "Clicked the clickOnlineShop");
		System.out.println("Click the Private Sale");
		Online_shop_page onlineshopPage = new Online_shop_page(driver, logger);
		PageFactory.initElements(driver, onlineshopPage);
		return onlineshopPage;
		
	}*/

}
