package com.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Lab_001 {

	//**** To verify all broken links in a webpage ****

	WebDriver driver;

	@Test
	public void logic(){

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for(WebElement link : links){

			String url = link.getAttribute("href");
			System.out.println(url);

			if(url == null || url.isEmpty()){
				System.out.println("URL is empty");
				continue;
			}

			try {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.connect();

				if(huc.getResponseCode() >= 400){
					System.out.println(url +"is broken");
				}
				else {
					System.out.println(url + "is working");
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

	}
}
