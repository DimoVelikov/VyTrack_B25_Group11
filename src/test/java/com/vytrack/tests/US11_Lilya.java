package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


// As a user,
// I want to view car odometer info on the Vehicles Odometers page.
public class US11_Lilya extends TestBase {
    /*
    AC1: Store and Sales managers should see an error message “You do not have permission to perform this action.”
    when they click the “Vehicle Odometer” module.

     */
    @Test
    public void US11_loginAsManager() {
        VytrackUtils.loginAsSalesManager();
        VytrackUtils.waitTillLoaderMaskDisappear();
        VytrackUtils.locateModule("Fleet", "Vehicle Odometer");
        VytrackUtils.waitTillLoaderMaskDisappear();
        WebElement alertElement = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'do not have permission')]"));

        Assert.assertEquals(alertElement.getText(), "You do not have permission to perform this action.");
        BrowserUtils.sleep(5);

    }

    @Test
    /*
AC2: Drivers should see the default page as 1.
     */

    public void US11_loginAsTruckDriver() {
        VytrackUtils.loginAsDriver();
        VytrackUtils.waitTillLoaderMaskDisappear();
        VytrackUtils.locateModule("Fleet", "Vehicle Odometer");
        VytrackUtils.waitTillLoaderMaskDisappear();
        WebElement pageNumberElement = Driver.getDriver().findElement(By.xpath("//input[@type='number']"));

        Assert.assertEquals(pageNumberElement.getAttribute("value"), "1");
        BrowserUtils.sleep(5);

    }

    @Test
    /*
    AC3: Divers should see the View Per Page is 25 by default.
     */

    public void US11_loginAsTruckDriver1() {
        VytrackUtils.loginAsDriver();
        VytrackUtils.waitTillLoaderMaskDisappear();
        VytrackUtils.locateModule("Fleet", "Vehicle Odometer");
        VytrackUtils.waitTillLoaderMaskDisappear();
        WebElement pageSizeElement = Driver.getDriver().findElement(By.xpath("//button[@class='btn dropdown-toggle ']"));

        Assert.assertEquals(pageSizeElement.getText().trim(), "25");
        BrowserUtils.sleep(5);

    }
}