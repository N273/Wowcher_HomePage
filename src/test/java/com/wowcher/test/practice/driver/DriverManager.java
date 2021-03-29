package com.wowcher.test.practice.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public WebDriver driver;
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wowcher.co.uk/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
        public void HandleCookies(){
            driver.findElement(By.id("didomi-notice-agree-button")).click();// accept cookies
        }
        public void deleteLogIn(){
         driver.findElement(By.className("subscribe-form__cta--is-floating")).click();// delete the login

    }
    public void closeBrowser(){
        driver.quit();
    }
}
