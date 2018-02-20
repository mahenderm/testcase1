package com.wipro.openCartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver;
	@FindBy(how=How.TAG_NAME,using="h1")
	 WebElement heading;
	 public LogOutPage(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 }
	 public String getlogoutMsg(){
		return heading.getText();
		 
	 }
}
