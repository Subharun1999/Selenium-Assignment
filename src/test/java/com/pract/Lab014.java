package com.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lab014 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://omayo.blogspot.com/");

		driver.findElement(By.linkText("Open a popup window")).click();

		String parentWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		Iterator<String> itr = allWin.iterator();
		String parent = itr.next();

		String childWin = itr.next();
		driver.switchTo().window(childWin);
		String text = driver.findElement(By.xpath("//div")).getText();
		System.out.println(text);
	}
}
