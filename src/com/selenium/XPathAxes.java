package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XPathAxes {
    public static void main(String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // max the chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://shopee.co.id/");

        //xpath axes
        //self node
        String selfnode=driver.findElement(By.xpath("//div[contains(text(),'Makanan & Minuman')]/self::a")).getText();
        System.out.println("the self node is "+selfnode);

        //parent node
        String parentnode=driver.findElement(By.xpath("//div[contains(text(),'Makanan & Minuman')]/parent::td")).getText();
        System.out.println("the parent node is "+parentnode);

        // child nodes
        List<WebElement> childnode=driver.findElements(By.xpath("//div[contains(text(),'Makanan & Minuman')]/ancestor::tr/child::*"));
        System.out.println("the no of child nodes are "+childnode.size());

        // ancestor node
        String ancestornode=driver.findElement(By.xpath("//div[contains(text(),'Makanan & Minuman')]/ancestor::tr")).getText();
        System.out.println("the no of ancestornode nodes are "+ancestornode);

        driver.close();

    }
}
