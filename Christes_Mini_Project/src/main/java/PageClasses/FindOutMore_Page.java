package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import baseClasses.PageBaseClass;

public class FindOutMore_Page extends PageBaseClass {

	public FindOutMore_Page(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		
	}
	@FindBy(xpath="//*[@id=\"vjs_video_3\"]/div[1]")
	public WebElement videoClick;
	
	@FindBy(xpath="//h1[contains(text(),'At your service: private sales of whisky with Chri')]")
	public WebElement text;
	
	public void getTextString() {
		
		System.out.println("Heading is : " + text.getText());
	}
	
	public void play(){
		videoClick.click();
		System.out.println("video has played");
		
	}
	
}
