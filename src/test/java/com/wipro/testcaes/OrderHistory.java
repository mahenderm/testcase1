package com.wipro.testcaes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wipro.openCartPOM.LoginPage;
import com.wipro.utilities.ExcelSheet;


public class OrderHistory{
	

	// TODO Auto-generated constructor stub

WebDriver driver;
LoginPage loginPage;


/*@BeforeTest
public void launchBrowser(){
	
	driver=LaunchBrowser.OpenBrowser("chrome");
	
}*/

@Test(dataProvider = "Authentication")
public void login(String username, String password){
	
	loginPage = new LoginPage(driver);
	loginPage.clickLogin();
	loginPage.insertCredentials(username, password);
}

@DataProvider(name="Authentication")
public Object[][] credentials() throws Exception{
	
	ExcelSheet exceldata = new ExcelSheet("D:/Assignments/exceldata/OpenCart.xlsx",1);
	int rows = exceldata.numofRows();
	Object[][] data = new Object[rows][2];
	for(int row=0;row<rows;row++){
		
		data[row][0]= exceldata.getData(row+1, 2);
		data[row][1]= exceldata.getData(row+1, 9);
	}
	return data;
}

}

