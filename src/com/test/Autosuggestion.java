package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		 List<WebElement> alltext = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		 for(WebElement i:alltext) {
			 System.out.println(i.getText());
			 String i1=i.getText();
			 if(i1.equalsIgnoreCase("selenium interview questions")) {
				 i.click();
				 break;
			 }
		 }
	}

}
