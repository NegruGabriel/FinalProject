package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Utils {

    public static String getMainPageUrl()
    {
        return "C:\\Users\\Admin\\Downloads\\Testing-Env-master\\Testing-Env-master\\index.html";
    }

    //Waits for an element to load for a specified period of time.
    public static void waitForElementToLoad(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Scrolls into view and waits for element to load.
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToLoad(3);
    }


}