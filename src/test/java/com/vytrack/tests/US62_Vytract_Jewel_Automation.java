package com.vytrack.tests;

import com.vytrack.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US62_Vytract_Jewel_Automation {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        //driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //driver.get("https://qa1.vytrack.com/user/login");
        //simply use Driver.getDriver().get in one line
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
/*1st way
        //log in
        WebElement InputUserName = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        // InputUserName.sendKeys("user1"); //
        InputUserName.sendKeys("salesmanager120"); //
        // InputUserName.sendKeys("storemanager85"); //

        WebElement InputPassword = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        InputPassword.sendKeys("UserUser123");

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[text()='Log in']"));
        loginButton.click();
        //----------------------------------------
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
 */
/*2nd way
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        // pass username
        // Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        //pass password
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        //click login button
        Driver.getDriver().findElement(By.xpath("//button[text()='Log in']")).click();
 */
        //3rd way: most concise way to login
        VytrackUtils.loginAsDriver(); // pass
        // VytrackUtils.loginAsSalesManager(); //pass
        // VytrackUtils.loginAsStoreManger();
        BrowserUtils.sleep(3);
    }

    @Test
    public void calendar_event_page() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        WebElement activities = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Activities' and @class='title title-level-1']"));
        actions.moveToElement(activities).perform();

        BrowserUtils.sleep(3);
        WebElement activities_calendarEvent = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events' and @class='title title-level-2']"));
        activities_calendarEvent.click();

        BrowserUtils.sleep(3);
        WebElement create_calendarEventBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));//not cliclable
        create_calendarEventBtn.click();


    }


}
