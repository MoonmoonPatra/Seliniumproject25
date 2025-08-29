package com.test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		Util u=new Util();
		String browserName=u.getProperty("browser");
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "ff":
			driver=new FirefoxDriver();
			break;
			
		case "safari":
			driver=new SafariDriver();
			break;
			
		case "ie":
			driver=new EdgeDriver();
			break;
			
			default:
				throw new RuntimeException("browser not supported "+ browserName);
				
			
		
	}
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
}
}
