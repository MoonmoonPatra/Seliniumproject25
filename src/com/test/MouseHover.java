package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.geeksforgeeks.org/java/java/");
		driver.manage().window().maximize();
		//Actions action=new Actions(driver);
		Util u=new Util();
		
		WebElement courses = driver.findElement(By.xpath("//span[.='Courses']"));
		//action.moveToElement(courses).perform();
		u.mousehover(driver, courses);
		WebElement subcourse = driver.findElement(By.xpath("//span[.='For Students']"));
		//action.moveToElement(subcourse).perform();
		u.mousehover(driver, subcourse);
	}
	
}//action keyword is used for doublecliuck,right click,mouseover
