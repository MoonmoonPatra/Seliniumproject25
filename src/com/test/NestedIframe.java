package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		WebElement parframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(parframe);
		WebElement body = driver.findElement(By.tagName("body"));
		System.out.println(body.getText());
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		WebElement body2 = driver.findElement(By.tagName("body"));
		System.out.println(body2.getText());
	}

}
