package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class US56_User_Access_Vehicle_Contract_Page {
    /*
    User story:
    As a user, I want to access to Vehicle contracts page
AC1:
Store managers and Sales managers access the Vehicle contracts page.
Expected URL: https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract
Expected title: All - Vehicle Contract - Entities - System - Car - Entities - System.

AC2:
 Drivers should NOT able to access the Vehicle contracts page, the app should display “You do not have permission to perform this action.”
     */


    @Test
    public void store_manager_access_vehicle_contract_page_test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        VytrackUtils.loginAsStoreManger();

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            WebElement loadingBar = Driver.getDriver().findElement(By.xpath("//div[@class='bar']"));
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loadingBar));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // user go to Fleet tab and hover over

        WebElement tabElement = Driver.getDriver().findElement(By.xpath("(//span[normalize-space()='Fleet'])[1]"));
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(tabElement).perform();

        // user click the "Vehicle Contracts" button
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Contracts']")).click();
        BrowserUtils.sleep(3);

        //verify the "Vehicle Contracts" page url
        //Expected URL: https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract
        String actualCurrentUrl = Driver.getDriver().getCurrentUrl();
        String expectedCurrentUrl = "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract";
        Assert.assertEquals(actualCurrentUrl, expectedCurrentUrl);

        // verify the " Vehicle Contracts " page title
        //Expected title: All - Vehicle Contract - Entities - System - Car - Entities - System.
        String actualVehicleContractsPageTitle = Driver.getDriver().getTitle();
        String expectedVehicleContractsPageTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System.";
        Assert.assertEquals(actualVehicleContractsPageTitle, expectedVehicleContractsPageTitle);

        Driver.closeDriver();

    }




}
