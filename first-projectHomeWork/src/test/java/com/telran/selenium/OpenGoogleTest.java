package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {
    WebDriver driver;
    @Test
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");
        driver.findElement(By.name("q")).sendKeys("java");
        //driver.navigate().to();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
