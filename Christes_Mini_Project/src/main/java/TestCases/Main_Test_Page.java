package TestCases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import PageClasses.LandingPage;
import PageClasses.Private_Sales;
import PageClasses.Online_shop_page;
import PageClasses.Signin_page;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
import utilities.ConstantValue;

public class Main_Test_Page extends BaseTestClass{
	LandingPage landingPage;
	Signin_page signin;
	Private_Sales privatesale;
	
	@Test
	public void christes_main_method() throws InterruptedException{
		logger = report.createTest("Add Mail: ");
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		Thread.sleep(10000);
		landingPage = pageBase.allowcookies();
		//landingPage = pageBase.ignore();
		//landingPage = pageBase.cancelclick();
		signin = landingPage.clicksigninPage();
		privatesale = signin.doLogin(ConstantValue.userName, ConstantValue.password);
		Thread.sleep(10000);
		
		
	}
	
	

}
