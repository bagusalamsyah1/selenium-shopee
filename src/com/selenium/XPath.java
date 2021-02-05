package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathFunctionsOperators {
    public static void main(String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // max the chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://shopee.co.id/");

        // absolute xpath
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).sendKeys("Baju");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();

        // relative xpath
        driver.findElement(By.xpath("//input[@placeholder='Hobi, Koleksi, & Otomotif Sale Diskon S/D 90%']")).sendKeys("Baju");
        driver.findElement(By.xpath("//input[@placeholder='Hobi, Koleksi, & Otomotif Sale Diskon S/D 90%']")).click();

    }
}
