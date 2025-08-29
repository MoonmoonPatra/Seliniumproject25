package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookutil {
public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	WebElement month = driver.findElement(By.id("month"));
	Util u=new Util();
	u.listbox(month,"Sep");
	WebElement day = driver.findElement(By.id("day"));
	u.listbox(day, "7");
}

}
