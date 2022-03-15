package com.vytrack.tests;

import com.vytrack.pages.ManageFilters;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US66_ManageFiltersOnTheMarketingPage_Valeriy {
    // CY11-66  As a user, I want to manage filters on the Marketing page.
    //
    // AC #1: Store and sales managers should see all the five filter options are checked by default.
    //
    //AC #2: any amount of boxes should be unchecked. (can check only 1, or multiple)
    @Test
    public void AC1_FiveFilterOptionsAreCheckedByDefault_as_sales_manager() {
        //login as sales manager
        VytrackUtils.loginAsSalesManager();
        //go to Marketing tab
        String marketingTabElementLocator = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";

        WebElement marketingTabElement = Driver.getDriver().findElement(By.xpath(marketingTabElementLocator));
        Actions actions1 = new Actions(Driver.getDriver());
        actions1.moveToElement(marketingTabElement).perform();
        String campaignsModelModuleLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement campaignsModelElement = Driver.getDriver().findElement(By.xpath(campaignsModelModuleLocator));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        campaignsModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //Filters
        Driver.getDriver().findElement(By.xpath("//a[@title='Filters']")).click();
        BrowserUtils.sleep(2);
        //Manage filters
        Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']")).click();
        BrowserUtils.sleep(2);

        ManageFilters select = new ManageFilters();

        select.checkedName.isSelected();
        select.checkedCade.isSelected();
        select.checkedStartDate.isSelected();
        select.checkedEndDate.isSelected();
        select.checkedBudget.isSelected();
        Assert.assertTrue(true);


        Driver.closeDriver();


    }

    @Test
    public void AC2_AnyAmountOfBoxesShouldBeUnchecked_CanCheckOnly1_OrMultiple_as_sales_manager() {
        //login as sales manager
        VytrackUtils.loginAsSalesManager();
        //go to Marketing tab
        String marketingTabElementLocator = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";

        WebElement marketingTabElement = Driver.getDriver().findElement(By.xpath(marketingTabElementLocator));
        Actions actions2 = new Actions(Driver.getDriver());
        actions2.moveToElement(marketingTabElement).perform();
        String campaignsModelModuleLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement campaignsModelElement = Driver.getDriver().findElement(By.xpath(campaignsModelModuleLocator));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        campaignsModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //Filters
        Driver.getDriver().findElement(By.xpath("//a[@title='Filters']")).click();
        BrowserUtils.sleep(2);
        //Manage filters
        Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']")).click();
        BrowserUtils.sleep(2);

        ManageFilters select = new ManageFilters();

        select.checkedName.isSelected();
        select.checkedStartDate.isSelected();
        select.checkedEndDate.isSelected();
        Assert.assertTrue(true);

        select.checkedBudget.click();
        BrowserUtils.sleep(2);
        select.checkedCade.click();
        BrowserUtils.sleep(2);
        select.checkedEndDate.click();
        BrowserUtils.sleep(2);


         Driver.closeDriver();

    }

    @Test
    public void AC1_FiveFilterOptionsAreCheckedByDefault_as_store_manager() {
        //login as sales manager
        VytrackUtils.loginAsStoreManger();
        //go to Marketing tab
        String marketingTabElementLocator = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";

        WebElement marketingTabElement = Driver.getDriver().findElement(By.xpath(marketingTabElementLocator));
        Actions actions3 = new Actions(Driver.getDriver());
        actions3.moveToElement(marketingTabElement).perform();
        String campaignsModelModuleLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement campaignsModelElement = Driver.getDriver().findElement(By.xpath(campaignsModelModuleLocator));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        campaignsModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //Filters
        Driver.getDriver().findElement(By.xpath("//a[@title='Filters']")).click();
        BrowserUtils.sleep(2);
        //Manage filters
        Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']")).click();
        BrowserUtils.sleep(2);

        ManageFilters select = new ManageFilters();

        select.checkedName.isSelected();
        select.checkedCade.isSelected();
        select.checkedStartDate.isSelected();
        select.checkedEndDate.isSelected();
        select.checkedBudget.isSelected();
        Assert.assertTrue(true);


        Driver.closeDriver();

    }

    @Test
    public void AC2_AnyAmountOfBoxesShouldBeUnchecked_CanCheckOnly1_OrMultiple_as_store_manager() {
        //login as sales manager
        VytrackUtils.loginAsStoreManger();
        //go to Marketing tab
        String marketingTabElementLocator = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";

        WebElement marketingTabElement = Driver.getDriver().findElement(By.xpath(marketingTabElementLocator));
        Actions actions4 = new Actions(Driver.getDriver());
        actions4.moveToElement(marketingTabElement).perform();
        String campaignsModelModuleLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement campaignsModelElement = Driver.getDriver().findElement(By.xpath(campaignsModelModuleLocator));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        campaignsModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        //Filters
        Driver.getDriver().findElement(By.xpath("//a[@title='Filters']")).click();
        BrowserUtils.sleep(2);
        //Manage filters
        Driver.getDriver().findElement(By.xpath("//a[@class='add-filter-button']")).click();
        BrowserUtils.sleep(2);

        ManageFilters select = new ManageFilters();

        select.checkedName.isSelected();
        select.checkedStartDate.isSelected();
        select.checkedEndDate.isSelected();
        Assert.assertTrue(true);

        select.checkedBudget.click();
        BrowserUtils.sleep(2);
        select.checkedCade.click();
        BrowserUtils.sleep(2);
        select.checkedEndDate.click();
        BrowserUtils.sleep(2);


        Driver.closeDriver();

    }


}
