package com.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("http://www.google.com");
driver.switchTo().activeElement().sendKeys("java");
Actions act=new Actions(driver);
act.sendKeys(Keys.ENTER).perform();
	}

}
