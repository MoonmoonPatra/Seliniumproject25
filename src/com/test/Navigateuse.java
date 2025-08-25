package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateuse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/text-box");
		WebElement userName=driver.findElement(By.id("userName"));
		WebElement userEmail=driver.findElement(By.id("userEmail"));
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		WebElement submit=driver.findElement(By.id("submit"));
		userName.sendKeys("moonmoon");
		userEmail.sendKeys("abc@gmail.com");
		currentAddress.sendKeys("abcxyz");
		permanentAddress.sendKeys("abcmno");
		submit.click();
		List<WebElement> alltext = driver.findElements(By.xpath("//div[@class=\"border col-md-12 col-sm-12\"]"));
		for(WebElement text:alltext) {
			String t1 = text.getText();
			System.out.println(t1);
			
		}
		

	}

}
