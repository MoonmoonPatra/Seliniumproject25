package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://demoqa.com/webtables");
List<WebElement> alltext = driver.findElements(By.xpath("//div[@role='row']"));
for(WebElement text:alltext) {
	String t1=text.getText();
	if(t1.equals("Kierra")) {
		System.out.println("pass");
		break;
	}
	System.out.println(t1);
}
	}

}
