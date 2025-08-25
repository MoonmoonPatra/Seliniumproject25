package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowdomCSSselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://practice.expandtesting.com/shadowdom");
WebElement shadowhost = driver.findElement(By.cssSelector("#shadow-host"));

SearchContext shadowroot = shadowhost.getShadowRoot();
WebElement shadowbtn = shadowroot.findElement(By.cssSelector("#my-btn"));
System.out.println(shadowbtn.getText());
	}

}
