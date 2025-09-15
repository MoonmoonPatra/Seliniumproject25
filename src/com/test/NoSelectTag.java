package com.test;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NoSelectTag {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']/option"));
			for(WebElement m:month) {
				System.out.println(m.getText());
				if(m.getText().equals("May")) {
					m.click();
				}
				
			}
		}
	}

