package com.wipro.openCartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how=How.LINK_TEXT,using="create an account")
	WebElement createAccount;//This is Common Action
	
	@FindBy(how=How.XPATH,using="//div[@id='slideshow0']/a")
	WebElement galaxyTab_adv;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 35);
	}
	
	public RegistraionPageOC clickCreateAccount(){
		createAccount.click();
		System.out.println("my page");
		return new RegistraionPageOC(driver);
	}
	
	public GalaxyPage clickOnGalaxyAdvTab(){

		galaxyTab_adv.click();
		return new GalaxyPage(driver);
	}
	
	

}
