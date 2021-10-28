package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;


public class Online_shop_page extends PageBaseClass {

	public Online_shop_page(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}

	@FindBy(xpath = "//a[contains(text(),'ONLINE SHOP')]")
	public WebElement onlineshopClick;
	
	@FindBy(xpath = "//a[contains(text(),'Shop now')]")
	public WebElement shopNowClick;
	
	public void clickEleOnlineShop() {
		onlineshopClick.click();
		System.out.println("Click onlineshopClick Button");
	}
	
	public Shop_by_category submit_shop_by_cat(){
		shopNowClick.click();
		logger.log(Status.PASS, "Clicked the submit_shop_by_cat");
		System.out.println("Clicked the submit_shop_by_cat");
		Shop_by_category shopbycategory = new Shop_by_category(driver, logger);
		PageFactory.initElements(driver, shopbycategory);
		return shopbycategory;
	}
	
	

}
