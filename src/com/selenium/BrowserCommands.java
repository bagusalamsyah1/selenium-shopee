package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {

        String driverExecuttablePath = "C:\\Program Files (x86)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecuttablePath);
        // Create a new instance of the chrome driver
        WebDriver driver= new ChromeDriver();

        // Storing the Application Url in the String variable
        String url = "https://shopee.co.id/";

        //Launch the shopee WebSite
        driver.get(url);

        // Storing Title name in the String variable
        String title = driver.getTitle();

        // Storing Title length in the Int variable
        int titleLength = driver.getTitle().length();

        // Printing Title & Title length in the Console window
        System.out.println("Title of the page is : " + title);
        System.out.println("Length of the title is : " + titleLength);

        // Storing URL in String variable
        String actualUrl = driver.getCurrentUrl();

        if ( actualUrl.equals(url)){
            System.out.println("verification successful - the correct url is opened ");
        } else {
            System.out.println("verification failed = an incorrect url is opened ");

            //In case of Fail, you like to print the actual and expected URL for the record purpose
            System.out.println(" actual url is : " + actualUrl);
            System.out.println(" expected url is : " + url);
        }
        // Storing Page Source in String variable
        String pageSource = driver.getPageSource();

        // Storing Page Source length in Int variable
        int pageSourceLength = pageSource.length();

        // Printing length of the Page Source on console
        System.out.println(" total length of the page source is : " + pageSourceLength);

        //Closing browser
        driver.close();
    }
}
