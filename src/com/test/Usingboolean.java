package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingboolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://google.com");
WebElement gmail= driver.findElement(By.xpath("//a[.='Gmail']"));
boolean flag = gmail.isDisplayed();
//boolean flag = gmail.isSelected();
//boolean flag = gmail.isEnabled();
System.out.println(flag);
	}
	

}
