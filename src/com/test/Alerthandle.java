package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerthandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement alertbtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertbtn.click();
	Alert alert1=driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	WebElement wait5 = driver.findElement(By.id("timerAlertButton"));
	wait5.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.alertIsPresent());
	System.out.println(alert1.getText());
	alert1.accept();
	WebElement wait3 = driver.findElement(By.id("confirmButton"));
	wait3.click();
	WebDriverWait wait31=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait31.until(ExpectedConditions.alertIsPresent());
	System.out.println(alert1.getText());
	alert1.dismiss();
	WebElement wait4 = driver.findElement(By.id("promtButton"));
	wait4.click();
	WebDriverWait wait41=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait41.until(ExpectedConditions.alertIsPresent());
	
	System.out.println(alert1.getText());
	
	alert1.accept();
	
	}

}
