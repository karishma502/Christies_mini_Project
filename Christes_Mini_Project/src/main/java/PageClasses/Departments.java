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

public class Departments extends PageBaseClass {

	public Departments(WebDriver driver, ExtentTest logger)
	{
		super(driver, logger);
	}

	
		@FindBy(xpath = "//a[contains(text(),'Departments')]")
		public WebElement clickDept;
	
		
		
				
		public Specialist_Dept deptclick(){
			clickDept.click();
			logger.log(Status.PASS, "Clicked the deptclick");
			System.out.println("click the deptclick");
			Specialist_Dept spec_dept = new Specialist_Dept(driver, logger);
			PageFactory.initElements(driver,spec_dept);
			return spec_dept;
		}
		
}	
		
