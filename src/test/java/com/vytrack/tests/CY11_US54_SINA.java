package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class CY11_US54_SINA extends TestBase {

    /*
     AC #1: users access the Oronic Documentation page by clicking the question icon.
     The page URL: https://doc.oroinc.com/
    */

    @Test
    public void US_54_LoginAsSalesManager(){

        //log in as the Sales Manager
        VytrackUtils.loginAsSalesManager();

        //locate the question mark button
        WebElement questionButton = Driver.getDriver().findElement(By.xpath("//ul[@class='nav pull-right user-menu']/li/a/i"));

        BrowserUtils.sleep(2);

        questionButton.click();

        BrowserUtils.sleep(2);

        //We set the main window handle and the next window handle after we click
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        //We declare a for loop in order to get the url of both window handles respectively
        for (String windowHandle : windowHandles) {

            System.out.println("Driver.getDriver().switchTo().window(windowHandle).getCurrentUrl() = "
                    + Driver.getDriver().switchTo().window(windowHandle).getCurrentUrl());
        }

    }

    @Test
    public void US54_loginAsDriver(){

        //log in as the Driver
        VytrackUtils.loginAsDriver();

        //locate the question mark button
        WebElement questionButton = Driver.getDriver().findElement(By.xpath("//ul[@class='nav pull-right user-menu']/li/a/i"));

        BrowserUtils.sleep(2);

        questionButton.click();

        BrowserUtils.sleep(2);

        //We set the main window handle and the next window handle after we click
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        //We declare a for loop in order to get the url of both window handles respectively
        for (String windowHandle : windowHandles) {

            System.out.println("Driver.getDriver().switchTo().window(windowHandle).getCurrentUrl() = "
                    + Driver.getDriver().switchTo().window(windowHandle).getCurrentUrl());
        }
    }

    @Test
    public void US_54_loginAsStoreManager() {

        //log in as the Store Manager
        VytrackUtils.loginAsStoreManger();

        //locate the question mark button
        WebElement questionButton = Driver.getDriver().findElement(By.xpath("//ul[@class='nav pull-right user-menu']/li/a/i"));

        BrowserUtils.sleep(2);

        questionButton.click();

        BrowserUtils.sleep(2);

        //We set the main window handle and the next window handle after we click
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();

        //We declare a for loop in order to get the url of both window handles respectively
        for (String windowHandle : windowHandles) {

            System.out.println("Driver.getDriver().switchTo().window(windowHandle).getCurrentUrl() = "
                    + Driver.getDriver().switchTo().window(windowHandle).getCurrentUrl());


        }
    }

    @AfterMethod
    @Override
    public void tearDown() {
        super.tearDown();
    }
}
