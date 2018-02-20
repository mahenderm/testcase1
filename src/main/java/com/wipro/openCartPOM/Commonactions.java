package com.wipro.openCartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Commonactions {
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="login")
	WebElement login;
	
	public Commonactions(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);		
	}
	public LoginPage clickLogin(){
		login.click();
		return new LoginPage(driver);
	}
}
