package com.wipro.browser;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	static WebDriver driver;
	
	public static WebDriver openBrowser(String browser){
		String url;
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://10.207.182.108:81/opencart/");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			/*url = "http://10.159.34.90:4444/wd/hub";
			try {
		           // DesiredCapabilities capabilities = new DesiredCapabilities().internetExplorer();
		        	DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
		          //  capabilities.setBrowserName("chrome");
		            capabilities.setPlatform(Platform.WINDOWS);
		            driver = new RemoteWebDriver(new URL(url), capabilities);
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		        driver.manage().window().maximize();
				driver.get("http://10.207.182.108:81/opencart/");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);*/
		}
		
		
        
		return driver;
		
	}
}