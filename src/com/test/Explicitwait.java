package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement search = driver.findElement(By.name("q"));
		//WebElement search = driver.findElement(By.name("2"));if we run this one explicit wait error throws
		wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("selenium");
	}

}
