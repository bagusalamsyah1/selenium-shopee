package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {
    public static void main(String[] args) {
        String driverExecuttablePath = "C:\\Program Files (x86)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecuttablePath);
        // Create a new instance of the chrome driver
        WebDriver driver= new ChromeDriver();

        // Storing the Application Url in the String variable
        String appUrl = "https://shopee.co.id/";

        //Launch the shopee WebSite
        driver.get(appUrl);

        // Go back to Home Page
        driver.navigate().back();

        // Go forward to Registration page
        driver.navigate().forward();

        // Go back to Home page
        driver.navigate().to(appUrl);

        // Refresh browser
        driver.navigate().refresh();

        // Close browser
        driver.close();


    }
}
