package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;

public class Lab001 {

	WebDriver driver;

	@BeforeTest
	public void load(){

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void logic() {
		// Setup WebDriver

		// Step 1: Open Amazon.in
		driver.get("https://www.amazon.in/");

		// Step 2: Search for LG soundbar
		WebElement search_btn = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search_btn.sendKeys("lg soundbar", Keys.ENTER);

		// Step 3: Extract product names and prices
		List<WebElement> tot_List = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));

		//Using a LinkedHashMap to maintain insertion order
		Map<String, Double> products = new LinkedHashMap<>();

		// Extract product names and prices
		for (int i = 0; i < tot_List.size(); i++) {
			String productName = tot_List.get(i).getText();
			double productPrice;

			// Extract price if available, otherwise consider it as 0.0
			try {
				String priceText = prices.get(i).getText().replace(",", "").replace("₹", "").trim();
				productPrice = Double.parseDouble(priceText.replace("\n", "."));
			} catch (Exception e) {
				productPrice = 0.0;
			}

			// Store in map
			products.put(productName, productPrice);
		}

		// Sort products by price
		List<Map.Entry<String, Double>> sortedProducts = new ArrayList<>(products.entrySet());
		sortedProducts.sort(Map.Entry.comparingByValue());

		// Print sorted products by price
		for (Map.Entry<String, Double> entry : sortedProducts) {
			System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
		}
	}

		@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
