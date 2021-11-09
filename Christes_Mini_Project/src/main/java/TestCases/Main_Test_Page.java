package TestCases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import PageClasses.AuctionSecondPage;
import PageClasses.Auctions;
import PageClasses.Departments;
import PageClasses.FeaturePage;
import PageClasses.FindOutMore_Page;
import PageClasses.LandingPage;
import PageClasses.Private_Sales;
import PageClasses.Shop_by_Photographs;
import PageClasses.Shop_by_category;
import PageClasses.Online_shop_page;
import PageClasses.Signin_page;
import PageClasses.Specialist_Dept;
import PageClasses.Storiespage;
import PageClasses.indianarttype;
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
	Departments departobject;
	Specialist_Dept spec_dept;
	indianarttype indianart;
	Storiespage storiespage ;
	
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
	
		
		featurepage = privatesale.clickPrivatesale();
		Thread.sleep(10000);
		featurepage.clickEleFeature();
		Thread.sleep(10000);
		findoutmore =featurepage.submit_Find_out();
		//Thread.sleep(10000);
		findoutmore.getTextString();
		Thread.sleep(10000);
		//findoutmore.play();
		
		
		
		auction =signin.clickAuction(); 
		Thread.sleep(10000);
		auctionsecondpg =auction.clickCharity();
		Thread.sleep(10000);
		
		/*departobject=signin.submitDept();
		//spec_dept = departobject.deptclick();
		Thread.sleep(10000);
		indianart= spec_dept.arttypeclick();
		Thread.sleep(90000);
		*/
		
		//driver.quit();
		
		
		
		storiespage = signin.clickStoriesPage();
		
		Thread.sleep(9000);
		storiespage.firstparagraph();
		storiespage.secparagraph();
		storiespage.thirdparagraph();
		storiespage.fourthparagraph();
		storiespage.fifthparagraph();
	
		
	}
	
	

}
