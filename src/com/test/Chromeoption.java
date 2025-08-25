package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.google.com");
System.out.println(driver.getTitle());
driver.quit();

	}

}
