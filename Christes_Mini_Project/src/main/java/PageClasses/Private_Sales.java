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



	public Online_shop_page clickwritemail() {
		logger.log(Status.INFO, "Clicking the  write mail link");
		//writemail.click();
		logger.log(Status.PASS, "Clicked the Write Mail Link");
		Online_shop_page mailwritepage = new Online_shop_page(driver, logger);
		PageFactory.initElements(driver, mailwritepage);
		return mailwritepage;
		
	}

}
