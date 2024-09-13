package com.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class lab015 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		int count = 0;

		List<WebElement> tags = driver.findElements(By.tagName("a"));
		for(WebElement tg : tags){

			String url =  tg.getAttribute("href");

			System.out.println("Normal printing: "+url);
			if(url == null || url.isEmpty()){
				System.out.println("URL is empty");
				continue;
			}

			HttpURLConnection huc =(HttpURLConnection) (new URL(url).openConnection());
			huc.connect();
			if(huc.getResponseCode() >= 400 ){
				System.out.println("URL is broken: " +url);
			}
			else{
				System.out.println("URL is valid: "+url);
				count++;
				System.out.println(count);
			}
		}

		driver.close();

	}
}
