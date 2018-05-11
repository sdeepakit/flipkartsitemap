package org.flipkart.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sitemap {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Flipkart\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement click_close_login_pop = driver.findElement(By.xpath("//button[text()='✕']"));
    click_close_login_pop.click();
    WebElement click_sitemap = driver.findElement(By.xpath("//a[text()='Sitemap']"));
    click_sitemap.click();
}
}