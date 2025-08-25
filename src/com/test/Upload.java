package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadFile"));
		upload.sendKeys("C:\\Users\\arun8\\OneDrive\\Desktop\\pics");
		
	}

}
