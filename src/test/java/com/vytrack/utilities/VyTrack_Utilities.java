package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VyTrack_Utilities {


    public static void loginTruckDriver(WebDriver driver){
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user172");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
    }

    public static void loginTruckDriver(WebDriver driver,String username,String password){
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
    }

    public static void loginStoreManager(WebDriver driver){
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("storemanager201");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
    }

    public static void loginStoreManager(WebDriver driver,String username,String password){
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
    }

    public static void loginSalesManager(WebDriver driver){
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("salesmanager141");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
    }

    public static void loginSalesManager(WebDriver driver,String username,String password){
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id='_submit']")).click();
    }





}
