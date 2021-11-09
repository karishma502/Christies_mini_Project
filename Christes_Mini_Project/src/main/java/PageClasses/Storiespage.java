package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class Storiespage extends PageBaseClass {

	public Storiespage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	
	//@FindBy(xpath = "//a[contains(text(),'Stories')]")
	
	//public WebElement textLink;
	
	//public void clickOnLink() {
	//	textLink.click();
	//	System.out.println("text link  clicked");

	//}
	
	@FindBy(xpath = "//a[contains(text(),'Henry Graves Jr: One of the most important watch c')]")
	public WebElement firstpara;
	
	public void firstparagraph() {
		//firstpara.getText();
		System.out.println("first heading: "+ firstpara.getText());
		System.out.println("\n");
	}
	
	@FindBy(xpath = "//a[contains(text(),'Virtual tour: Photographies at Christie’s Paris')]")
	public WebElement secpara;
	
	public void secparagraph() {
		
		System.out.println("second heading: "+ secpara.getText());
		System.out.println("\n");

	}
	
	@FindBy(xpath = "//a[contains(text(),'Cosmically significant')]")
	public WebElement thirdpara;
	
	public void thirdparagraph() {
		
		System.out.println("third heading: "+ thirdpara.getText());
		System.out.println("\n");

	}
	
	@FindBy(xpath = "//a[contains(text(),'The tastemaker: Molly Mahon')]")
	public WebElement fourthpara;
	
	public void fourthparagraph() {
		
		System.out.println("fourth: "+ fourthpara.getText());
		System.out.println("\n");

	}
	
	@FindBy(xpath = "//a[contains(text(),'Lin Fengmian: 10 things to know about his art and ')]")
	public WebElement fifthpara;
	
	public void fifthparagraph() {
		
		System.out.println("fifth heading: "+ fifthpara.getText());
		System.out.println("\n");

	}
}
