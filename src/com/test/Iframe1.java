package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://demoqa.com/frames");
driver.manage().window().maximize();
WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
driver.switchTo().frame(frame1);
WebElement body = driver.findElement(By.tagName("body"));
System.out.println(body.getText());
driver.switchTo().defaultContent();
WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
driver.switchTo().frame(frame2);
WebElement body2 = driver.findElement(By.tagName("body"));
System.out.println(body2.getText());
	}
	

}
