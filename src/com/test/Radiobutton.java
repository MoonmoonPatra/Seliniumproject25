package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
	}

}
