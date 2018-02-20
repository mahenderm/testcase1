package com.wipro.openCartPOM;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GalaxyPage {
	
	WebDriver driver;
	
	@FindBy(how=How.TAG_NAME,using="h1")
	public WebElement heading;
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Reviews")
	WebElement reviewTab;
	@FindBy(how=How.NAME,using="name")
	WebElement name;
	@FindBy(how=How.NAME,using="text")
	WebElement inputText;
	@FindBy(how=How.NAME,using="captcha")
	WebElement inputCaptcha;
	@FindBy(how=How.LINK_TEXT,using="Continue")
	WebElement continueButton;
	@FindBy(how=How.XPATH,using="//div[@class='warning']")
	public static WebElement warningToast;
	@FindBy(how=How.XPATH,using="//div[@class='success']")
	public static WebElement successToast;
	@FindBy(how=How.LINK_TEXT,using="Add to Wish List")
	WebElement addToWishlist;
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Wish List")
	WebElement Wishlist;
	@FindBy(how=How.XPATH,using="//img[@class='close']")
	WebElement close;
	public GalaxyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public GalaxyPage productreview(String reviewerName,String reviewComments,String rating) throws InterruptedException{
		reviewTab.click();
		WebElement ratingValue = driver.findElement(By.xpath("//input[@value='"+rating+"']"));
		String a=rating;
		name.clear();
		name.sendKeys(reviewerName);
		inputText.clear();
		inputText.sendKeys(reviewComments);
		ratingValue.click();
		//inputCaptcha.clear();
		
		//To Enter Captcha Manually
		System.out.println("Please enter Captcha:");
		/*Scanner scanner = new Scanner(System.in);
		String captcha = scanner.nextLine();*/
		
		//inputCaptcha.sendKeys(captcha);
		Thread.sleep(10000);
		continueButton.click();
		
		
		return this;
	}
public void clickOnAddToWishlist(){
		
		addToWishlist.click();
	}
	
	public String getSuccessMessage(){
		
		return successToast.getText();
	}
	
	public void closeSuccesstoast(){
		
		close.click();
		
	}
	
	public MyWishlistPage clickOnWishlist(){
		
		Wishlist.click();
		return new MyWishlistPage(driver);
	}
	
}
