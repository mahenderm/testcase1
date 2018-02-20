package com.wipro.openCartPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;
	public MyAccountPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getTittle(){
		return driver.getTitle();
	}
}
