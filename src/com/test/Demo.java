package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.google.com");
//WebElement searchbox = driver.findElement(By.name("q"));
//searchbox.sendKeys("selenium");
//driver.findElement(By.name("btnK")).click();
//driver.findElement(By.linkText("Gmail")).click();
//List<WebElement>allLink=driver.findElements(By.tagName("a"));
//int count=allLink.size();
//System.out.println("total no. of links present in google is:"+count);
//String pageTitle = driver.getTitle();
//System.out.println("Page Title: " + pageTitle);
//String currentURL = driver.getCurrentUrl();
//System.out.println("Current URL: " + currentURL);
System.out.println(driver.getTitle());
driver.quit();
	}

}
