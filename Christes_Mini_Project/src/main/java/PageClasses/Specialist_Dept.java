package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class Specialist_Dept extends PageBaseClass {

	public Specialist_Dept(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	
		@FindBy(xpath = "//a[contains(text(),'Indian, Himalayan & Southeast Asian Art')]")
		public WebElement indianart;
		
		//@FindBy(xpath = "//li[1]//a[1]//div[1]")
		//public WebElement browseart;
		
		
		public indianarttype arttypeclick(){
			
			indianart.click();
			logger.log(Status.PASS, "Clicked the arttypeclick");
			System.out.println("Clicked the arttypeclick");
			indianarttype indianart = new indianarttype(driver, logger);
			PageFactory.initElements(driver,indianart);
			return indianart;
		}
				
		/*public Stories_page get()
		{
			navigationbar.click();
			indianart.click();
			browseart.click();
			
			Stories_page storiesobj = new Stories_page(driver, logger);
			PageFactory.initElements(driver, storiesobj);
			return storiesobj;
		}*/
}	
		
