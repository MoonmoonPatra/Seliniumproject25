package com.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source,target).perform();
		action.dragAndDrop(target,source).perform();
	}

}
