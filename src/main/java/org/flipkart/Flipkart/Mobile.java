package org.flipkart.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mobile {
	

	WebDriver driver;
@Given("^the user in flipkart home page$")
public void the_user_in_flipkart_home_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Flipkart\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
}

@When("^the user search various \"([^\"]*)\" in search box$")
public void the_user_search_various_in_search_box(String Mobilemodels) throws Throwable {
	WebElement click = driver.findElement(By.xpath("//button[text()='✕']"));
    click.click();
    WebElement search = driver.findElement(By.name("q"));
    search.sendKeys(Mobilemodels);
    WebElement click_search = driver.findElement(By.xpath("//button[@type='submit']"));
    click_search.click();
    Thread.sleep(1000);
    WebElement click_mobile= driver.findElement(By.xpath("//div[text()='Samsung Galaxy S9 Plus (Midnight Black, 64 GB)']"));    
    click_mobile.click();
    for (String handle : driver.getWindowHandles()) {
        driver.switchTo().window(handle);
        }
    WebElement click_addcart= driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button/svg"));
    click_addcart.click();
    
    
    
}

@Then("^the user has to verifing the particular mobile added in cart or not$")
public void the_user_has_to_verifing_the_particular_mobile_added_in_cart_or_not() throws Throwable {
    // Write code here that turns the phrase above into concrete actions    
}
}

