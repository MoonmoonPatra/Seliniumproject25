package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Proper {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
Properties prop = new Properties();
FileInputStream fis=new FileInputStream("C:\\java examples\\SeliniumPractice\\src\\config\\config.properties");

prop.load(fis);
//Object url = prop.get("url");
//System.out.println(url);
System.out.println(prop.getProperty("username"));
System.out.println(prop.getProperty("password"));
//System.out.println(prop.getProperty("browser"));
String browserName=prop.getProperty("browser");
if(browserName.equals("safari")) {
	 driver=new SafariDriver();
}
else if(browserName.equals("chrome")) {
driver=new ChromeDriver();
}
else if(browserName.equals("firefox")) {
	driver=new FirefoxDriver();
}

driver.get(prop.getProperty("url"));
driver.findElement(By.name("q")).sendKeys(prop.getProperty("username"));

	}

}
//C:\java examples\SeliniumPractice\src\config\config.properties