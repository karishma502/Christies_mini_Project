package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class Shop_by_category extends PageBaseClass {

	public Shop_by_category(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	@FindBy(xpath="/html/body/div[8]/div/div[2]/div/div/div[1]/div/a/img")
	public WebElement imgClick;
	
	public Shop_by_Photographs submit_shop_by_photo(){
		imgClick.click();
		logger.log(Status.PASS, "Clicked the submit_shop_by_photo");
		System.out.println("Clicked the submit_shop_by_photo");
		Shop_by_Photographs shopbyphotographs = new Shop_by_Photographs(driver, logger);
		PageFactory.initElements(driver, shopbyphotographs);
		return shopbyphotographs;
	}
	
}
