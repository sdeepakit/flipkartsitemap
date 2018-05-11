package org.flipkart.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Category {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Flipkart\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement click_close_login = driver.findElement(By.xpath("//button[text()='✕']"));
    click_close_login.click();
    WebElement click_electronic = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
    click_electronic.click();
    //Actions click = new Actions(driver);
    //click.moveToElement(click_electronic).build().perform();
    WebElement click_electronic_mobile = driver.findElement(By.xpath("//span[text()='Television']"));
    Actions click_child = new Actions(driver);
    click_child.moveToElement(click_electronic_mobile).build().perform();
    click_electronic_mobile.click();
    
    
}
}