package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int a=alllinks.size();
		System.out.println(a);
		for(WebElement links:alllinks) {
			String text = links.getText();
			System.out.println(text);
		}
	}

}
