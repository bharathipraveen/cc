package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Window\\driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	WebElement search = driver.findElement(By.xpath("//input[@type='text']")); 
	search.sendKeys("sanitizer");
	Thread.sleep(3000);
	
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();

	String parantid = driver.getWindowHandle();
	System.out.println(parantid);
	
	Set<String> allid = driver.getWindowHandles();
	System.out.println(allid);
	for (String x : allid) {
		if (!parantid.equals(x)) {
			driver.switchTo().window(x);
			
		}
	}
		
	}
	
	
	}


