package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDEMO {

	
		static WebDriver driver;
		public static void main(String[] args) {
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			WebElement alertButton = driver.findElement(By.id("alertButton"));
			alertButton.click();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
			
			timerAlertButton.click();
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println(alert.getText());
			alert.accept();
			
			WebElement promtButton = driver.findElement(By.id("promtButton"));
			promtButton.click();
			//driver.switchTo().alert();
			alert.sendKeys("abcd");
			alert.accept();
		}
	
	}


