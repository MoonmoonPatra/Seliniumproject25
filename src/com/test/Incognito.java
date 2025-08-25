package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {
static ChromeDriver  driver;
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--Incognito");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
