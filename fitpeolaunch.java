package com.Fitpeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fitpeolaunch {

	
	WebDriver driver;
	String applicationurladdress="https://www.fitpeo.com/";
	
	@BeforeTest
	public void before() {
		System.setProperty("webdriver.chrome.driver", "./chromedriverlaunch/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(applicationurladdress);
		driver.manage().window().maximize();
		
	}
	//@AfterTest
	public void after() {
		driver.close();
	}
	
	@Test
	public void test () throws Exception {
	
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();

		Thread.sleep(3000);

		WebElement slider = driver.findElement(By.xpath("//h4[text()='Medicare Eligible Patients']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView(true)", slider);

		WebElement sliderbar = driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50']"));

		Actions action = new Actions(driver);

		action.dragAndDropBy(sliderbar,-94,0).perform();

		action.dragAndDropBy(sliderbar,124,0).perform();

		Thread.sleep(3000);
		
		WebElement adjustingslider = driver.findElement(By.xpath("//input[@type='number']"));
		adjustingslider.clear();
		adjustingslider.click();
		adjustingslider.sendKeys("560");
		WebElement slidingdown = driver.findElement(By.xpath("//p[text()='CPT-99091']"));
		js.executeScript("arguments[0].scrollIntoView(true)", slidingdown);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
		WebElement slidingdown2 = driver.findElement(By.xpath("//p[text()='CPT-99454']"));
		js.executeScript("arguments[0].scrollIntoView(true)", slidingdown2);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
		WebElement slidingdown3 = driver.findElement(By.xpath("//p[text()='CPT-99474']"));
		js.executeScript("arguments[0].scrollIntoView(true)", slidingdown3);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input")).click();


	  
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
	
	}	
	
	
	

