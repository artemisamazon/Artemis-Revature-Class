package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Artemis/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080");
		
		
		
		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("number1"));
		WebElement addInput2 = driver.findElement(By.id("number2"));
		WebElement addButton = driver.findElement(By.id("addButton"));
		
		addInput1.sendKeys("10.5");
		addInput2.sendKeys("15.3");
		addButton.click();
		

		driver.switchTo().frame("addResult"); // Switch into the inside of the iframe
		
		WebElement addOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of the iframe
		System.out.println("The result of adding 10.5 and 15.3 is " + addOutput.getText()); // print out the text of the output element
		

		driver.switchTo().defaultContent(); // Switch back outside of the iframe
		
	
		//to pause 
				Thread.sleep(10000);
		//quit method
		// whenever we are done with the scripted tasks we will provide to Selenium 
		// WebDriver. You should quit the driver.
		
driver.quit(); 

	}

}