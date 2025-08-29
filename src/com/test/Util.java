package com.test;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Util {
Properties prop;
	public void listbox(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void mousehover(WebDriver driver,WebElement element){
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement element1,WebElement element2) {
		Actions action=new Actions((WebDriver) driver);
		action.dragAndDrop(element1, element2).perform();
	}
	public  Properties properties () throws IOException
	{
	  prop = new Properties();
		FileInputStream fis1=new FileInputStream("C:\\java examples\\SeliniumPractice\\src\\config\\config.properties");
		prop.load(fis1);
		//prop.getProperty(key);
		return prop;
		
	}
	public String getProperty(String key) {
		return prop.getProperty(key);
		
	}
	public Util() throws IOException {
		this.properties();
	}
		 
}
	

