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

	
	public Shop_by_category submit_shop_by_cat(){
		//send.click();
		logger.log(Status.PASS, "Cliecked the Send Button");
		Shop_by_category shopbycategory = new Shop_by_category(driver, logger);
		PageFactory.initElements(driver, shopbycategory);
		return shopbycategory;
	}
	
	

}
