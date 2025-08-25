package com.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Util {

	public void listbox(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void mousehover(WebDriver driver,WebElement element){
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
	}
}
