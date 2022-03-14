package com.vytrack.tests;

import com.github.javafaker.Faker;
import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_CY11_61_ErrorMessageInCalendar extends TestBase {

    /*
    CREDENTIALS
Truck Drivers
username:
user172 - user173 - user174 - user175 - user176 - user177
password:
UserUser123

Store Manager
username
storemanager65 - storemanager66 - storemanager67 - storemanager68 - storemanager69
password
UserUser123

Sales Manager
username:
salesmanager141 - salesmanager142 - salesmanager143
password;
UserUser123
     */

        //---1--- Browser set/opened in TestBase

    @Test
    public void errorMessages_in_Calendar(){

        //---2---
        /*
        WebElement username = Driver.getDriver().findElement(By.id("prependedInput"));
        username.sendKeys("user172");

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser123");

        WebElement logInButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        logInButton.click();
         */
        BrowserUtils.sleep(2);
        VytrackUtils.login("user172", "UserUser123");

        //alert
        WebElement alert = Driver.getDriver().findElement(By.xpath("//button[@data-dismiss='alert']"));
        alert.click();

        //---3---
        Actions action = new Actions(Driver.getDriver());


        WebElement activitiesModule = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]"));

        WebElement calendarEventsModule =
                Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span"));

        action.moveToElement(activitiesModule)
                .pause(1000)
                .moveToElement(calendarEventsModule)
                .perform();
        calendarEventsModule.click();

        //---4---
        BrowserUtils.sleep(2);
        WebElement createCalendarEventButton = Driver.getDriver().findElement(By.xpath("//div[@class='btn-group']/a"));
        createCalendarEventButton.click();

        //---5---
        WebElement repeatCheckBox = Driver.getDriver().findElement(By.xpath("//input[@id='recurrence-repeat-view242']"));
        repeatCheckBox.click();

        //---6---
        Faker faker = new Faker();

        WebElement repeatDaysInputBox =
                Driver.getDriver().findElement(By.xpath("(//input[@class='recurrence-subview-control__number'])[1]"));
        repeatDaysInputBox.clear();
        repeatDaysInputBox.sendKeys(faker.numerify("-#"));

        //---7---
        WebElement errormessage1 =
                Driver.getDriver().findElement(By.xpath("//span[@id='temp-validation-name-266-error']"));

        Assert.assertEquals(errormessage1.getText(), "The value have not to be less than 1.");

        //---8---
        BrowserUtils.sleep(1);
        repeatDaysInputBox.clear();
        repeatDaysInputBox.sendKeys(faker.numerify("###"));

        //---9---
        BrowserUtils.sleep(1);
        WebElement errormessage2 =
                Driver.getDriver().findElement(By.xpath("//span[@id='temp-validation-name-266-error']"));

        Assert.assertEquals(errormessage2.getText(), "The value have not to be more than 99.");


    }

}
/*
1- Open browser: https://qa1.vytrack.com/user/login
2- User has logged in and is now on the homepage
3- User hovers mouse over "Activities" module and clicks "Calendar Events"
4- User will click on "Create Calendar Event" button
5- User will click the Repeat checkbox
6- Enter invalid integer(less than 1) in the "Repeat Every day(s)" input box
7- Verify error message
    expected: "The value have not to be less than 1."
8- Enter invalid integer(greater than 99) in the "Repeat Every day(s)" input box
9- verify error message
    expected: "The value have not to be more than 99."
 */