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
// US: As a user, I want to write the “Description” when I create a calendar event. (Iframe)
//AC: users should be able to write messages in the Description field on the calendar event page.
    @BeforeMethod
    public void setUp() throws InterruptedException {
           VytrackUtils.loginAsDriver(); // pass
        // VytrackUtils.loginAsSalesManager(); //pass
        // VytrackUtils.loginAsStoreManger(); // pass
        BrowserUtils.sleep(2);
    }

    @Test
    public void calendar_event_page() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());
        WebElement activities = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Activities' and @class='title title-level-1']"));
        BrowserUtils.sleep(1);
        actions.moveToElement(activities).perform();

        BrowserUtils.sleep(2);
        WebElement activities_calendarEvent = Driver.getDriver().findElement(By.xpath("//span[.='Calendar Events' and @class='title title-level-2']"));
        BrowserUtils.sleep(1);
        activities_calendarEvent.click();

        BrowserUtils.sleep(3);
        WebElement create_calendarEventBtn = Driver.getDriver().findElement(By.xpath("//a[@title='Create Calendar event']"));//not cliclable
        BrowserUtils.sleep(2);
        create_calendarEventBtn.click();
        BrowserUtils.sleep(2);


        //option3--locate as webElement of iframe
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@title='Rich Text Area. Press ALT-F9 for menu. Press ALT-F10 for toolbar. Press ALT-0 for help']")));
        BrowserUtils.sleep(3);
        //locate p tag
        WebElement userInput = Driver.getDriver().findElement(By.xpath("//p"));
        userInput.sendKeys("user input message");
        BrowserUtils.sleep(2);

        Assert.assertTrue(userInput.isDisplayed());
        //   System.out.println("userInput.isDisplayed() = " + userInput.isDisplayed());

        Driver.closeDriver();

    }
}
