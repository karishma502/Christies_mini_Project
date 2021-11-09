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

public class indianarttype extends PageBaseClass {

	public indianarttype(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	
		
		@FindBy(xpath = "//li[1]//a[1]//div[1]")
		public WebElement browseart;
		
				
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
		
