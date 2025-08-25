package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LIstbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
				WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		 Select select = new Select(month);
		select.selectByVisibleText("Jan");
		Thread.sleep(2000);
		Select select1 = new Select(day);
		select1.selectByValue("3");
		Thread.sleep(2000);
		Select select2 = new Select(year);
		select2.selectByIndex(3);
		Thread.sleep(2000);
		
	}

	

}
