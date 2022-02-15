package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {

    static WebDriver driver;
    //setting up the driver
    public static void createDriver(){
        //setting path to the driver
        System.setProperty("webDriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        //open the browser
        driver= new ChromeDriver();
        driver.get(PropertyReader.getProperty("app.url"));
        driver.manage().window().maximize();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
