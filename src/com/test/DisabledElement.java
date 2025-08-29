package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://selectorshub.com/xpath-practice-page/");
driver.manage().window().maximize();
WebElement disabledElement = driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));
//disabledElement.sendKeys("xcvb");
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].value='moon';",disabledElement);
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,3000)");
Thread.sleep(3000);
driver.close();
	}

}
