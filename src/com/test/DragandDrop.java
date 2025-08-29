package com.test;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().window().maximize();
		Util u=new Util();
		WebElement source = driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='div2']"));
		//Actions action=new Actions(driver);
		//action.dragAndDrop(source,target).perform();
		u.dragAndDrop(driver,source, target);
		//action.dragAndDrop(target,source).perform();
		u.dragAndDrop(driver,target, source);
	}

}
