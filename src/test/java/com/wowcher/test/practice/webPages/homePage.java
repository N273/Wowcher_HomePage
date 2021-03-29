package com.wowcher.test.practice.webPages;

import com.wowcher.test.practice.driver.DriverManager;
import org.openqa.selenium.By;

public class homePage extends DriverManager {
    public void clickHome(){
        driver.findElement(By.className("navigation__link")).click();
    }
public String getCurrentUrl(){
        return  driver.getCurrentUrl();
}

}


