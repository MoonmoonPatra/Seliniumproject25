package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		WebElement tabButton=driver.findElement(By.id("tabButton"));
		tabButton.click();
		Set<String> allwindows = driver.getWindowHandles();//all windows including parengt n child
		for(String window:allwindows) {
			if(!window.equals(parent)) {
				driver.switchTo().window(window);
				System.out.println(driver.getCurrentUrl());
				WebElement sampleHeading = driver.findElement(By.id("sampleHeading"));
				System.out.println(sampleHeading.getText());
				
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement windowButton=driver.findElement(By.id("windowButton"));
		js.executeScript("arguments[0].scrollIntoView(true)",windowButton);
		windowButton.click();
		Set<String> alltab = driver.getWindowHandles();
		for(String tab:alltab) {
			if(!tab.equals(parent)) {
				driver.switchTo().window(tab);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(2000);
				driver.quit();
			}
		}
		
			}
	}


