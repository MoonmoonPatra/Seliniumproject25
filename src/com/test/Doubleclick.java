package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleclick).perform();
		
	}

}
