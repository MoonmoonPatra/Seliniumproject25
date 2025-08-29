package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://gmail.com");
	}

}
