package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiclogin {

	public void getlogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php"); 
		
		driver.manage().window().maximize();
		
		WebElement sigInButton = driver.findElement(By.xpath("//*[@class='login']"));
		sigInButton.click();
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("debosreedeb0@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@name='passwd']"));
		password.sendKeys("Deb6440072@");
		
		WebElement singinBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		singinBtn.click();
	}
}
