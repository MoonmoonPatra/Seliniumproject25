package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.google.com");
				//TakesScreenshot ts=(TakesScreenshot)driver;
				//File src=ts.getScreenshotAs(OutputType.FILE);
				//WebElement srch = driver.findElement(By.linkText("Gmail"));
				WebElement srch = driver.findElement(By.xpath("//input[contains(@data-ved,'0ahUKEwjm-fm8naCPAxWw3TgGHT-bNMcQ4dUDCCA')]"));
				File src = srch.getScreenshotAs(OutputType.FILE);
				try {
					//String path="C:\\Users\\arun8\\OneDrive\\Desktop";
					FileUtils.copyFile(src,new File("C:\\Users\\arun8\\OneDrive\\Desktop\\"+"google.png"));
				}catch(IOException e) {
					e.printStackTrace();
				}
	}

}
