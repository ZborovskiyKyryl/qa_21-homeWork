package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWiki extends TestBase {

    @Test
    public void loginToWiki() {
        driver.get("https://en.wikipedia.org");

        click(By.id("pt-login"));
        click(By.name("wpName"));
        driver.findElement(By.name("wpName")).clear();
        driver.findElement(By.name("wpName")).sendKeys("chachacha");

        click(By.name("wpPassword"));
        driver.findElement(By.name("wpPassword")).clear();
        driver.findElement(By.name("wpPassword")).sendKeys("111");

        click(By.name("wpRemember"));
        click(By.name("wploginattempt"));


    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
