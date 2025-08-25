package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	Actions action = new Actions(driver);
	action.contextClick(rightclick).perform();
}
}
