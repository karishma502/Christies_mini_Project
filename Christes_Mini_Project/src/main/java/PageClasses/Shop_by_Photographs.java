package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class Shop_by_Photographs extends PageBaseClass {

	public Shop_by_Photographs(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	
	
	public Shop_by_Photographs submit_shop_by_photo(){
		//send.click();
		logger.log(Status.PASS, "Clicked the Send Button");
		Shop_by_Photographs shopbyphotographs = new Shop_by_Photographs(driver, logger);
		PageFactory.initElements(driver, shopbyphotographs);
		return shopbyphotographs;
	}
	
}
