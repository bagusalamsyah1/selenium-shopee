package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        String driverExecuttablePath = "C:\\Program Files (x86)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecuttablePath);
        // Create a new instance of the chrome driver
        WebDriver driver= new ChromeDriver();

        // Storing the Application Url in the String variable
        String appUrl = "https://shopee.co.id/buyer/login?next=https%3A%2F%2Fshopee.co.id%2F";

        //Launch the shopee WebSite
        driver.get(appUrl);

        //max the browser
        driver.manage().window().maximize();

        // enter login username
        driver.findElement(By.name("loginKey")).sendKeys("umpung");

        // enter login password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // verify the URL
        // getCurrentURl()
        String act_url = driver.getCurrentUrl();
        System.out.println(act_url);

        // verify title
        // get title()
        String act_title = driver.getTitle();
        System.out.println(act_title);

        // Close browser
        driver.close();

    }
}
