package TestCases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import PageClasses.AuctionSecondPage;
import PageClasses.Auctions;
import PageClasses.FeaturePage;
import PageClasses.FindOutMore_Page;
import PageClasses.LandingPage;
import PageClasses.Private_Sales;
import PageClasses.Shop_by_Photographs;
import PageClasses.Shop_by_category;
import PageClasses.Online_shop_page;
import PageClasses.Signin_page;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass;
import utilities.ConstantValue;

public class Main_Test_Page extends BaseTestClass{
	LandingPage landingPage;
	Signin_page signin;
	Private_Sales privatesale;
	Online_shop_page onlineshopPage;
	Shop_by_category shopbycategory;
	Shop_by_Photographs shopbyphotographs;
	FeaturePage featurepage;
	FindOutMore_Page findoutmore;
	Auctions auction;
	AuctionSecondPage auctionsecondpg;
	
	@Test
	public void christes_main_method() throws InterruptedException{
		logger = report.createTest("Add Mail: ");
		
		invokeBrowser("chrome");
		PageBaseClass pageBase = new PageBaseClass(driver, logger);
		PageFactory.initElements(driver, pageBase);
		landingPage = pageBase.OpenApplication();
		Thread.sleep(10000);
		landingPage = pageBase.allowcookies();
		Thread.sleep(10000);
		//landingPage = pageBase.ignore();
		
		signin = landingPage.clicksigninPage();
		Thread.sleep(50000);
		privatesale = signin.doLogin(ConstantValue.userName, ConstantValue.password);
		Thread.sleep(10000);
		/* onlineshopPage = privatesale.clickOnlineShop();
		Thread.sleep(10000);
		onlineshopPage.clickEleOnlineShop();
		Thread.sleep(10000);
		shopbycategory = onlineshopPage.submit_shop_by_cat();
		Thread.sleep(10000);
		//landingPage = pageBase.cancelclick();
		Thread.sleep(10000);
		shopbyphotographs = shopbycategory.submit_shop_by_photo(); 
		Thread.sleep(10000); */
		
/*		featurepage = privatesale.clickPrivatesale();
		Thread.sleep(10000);
		featurepage.clickEleFeature();
		Thread.sleep(10000);
		findoutmore =featurepage.submit_Find_out();
		//Thread.sleep(10000);
		findoutmore.getTextString();
		Thread.sleep(10000);
		//findoutmore.play();
		//Thread.sleep(10000);*/
		
		
		auction =signin.clickAuction(); 
		Thread.sleep(10000);
		auctionsecondpg =auction.clickWatch();
		Thread.sleep(10000);
		
		
		
		//driver.quit();
		
		
	}
	
	

}
