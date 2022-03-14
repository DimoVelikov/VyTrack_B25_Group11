package com.vytrack.tests;

import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import com.vytrack.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(marketingTabElement).perform();
        String campaignsModelModuleLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement campaignsModelElement = Driver.getDriver().findElement(By.xpath(campaignsModelModuleLocator));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        campaignsModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        List<String> actualheadersFromCampaignsModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedheadersFromCampaignsModelTable = new ArrayList<>(Arrays.asList(
                "NAME",
                "CODE",
                "START DATE",
                "END DATE",
                "BUDGET"
        ));

        //verify header columns
        Assert.assertEquals(actualheadersFromCampaignsModelTable, expectedheadersFromCampaignsModelTable);

        Driver.closeDriver();


    }

//    @Test
//    public void AC2_AnyAmountOfBoxesShouldBeUnchecked_CanCheckOnly1_OrMultiple_as_sales_manager(){
//
//
//    }

    @Test
    public void AC1_FiveFilterOptionsAreCheckedByDefault_as_store_manager() {
        //login as sales manager
        VytrackUtils.loginAsStoreManger();
        //go to Marketing tab
        String marketingTabElementLocator = "//span[normalize-space()='Marketing' and contains(@class, 'title title-level-1')]";

        WebElement marketingTabElement = Driver.getDriver().findElement(By.xpath(marketingTabElementLocator));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(marketingTabElement).perform();
        String campaignsModelModuleLocator = "//span[normalize-space()='Campaigns' and contains(@class, 'title title-level-2')]";
        WebElement campaignsModelElement = Driver.getDriver().findElement(By.xpath(campaignsModelModuleLocator));
        //we are using for waiting until loader mask disappearing
        VytrackUtils.waitTillLoaderMaskDisappear();
        campaignsModelElement.click();
        VytrackUtils.waitTillLoaderMaskDisappear();
        List<String> actualheadersFromCampaignsModelTable = WebTableUtils.getHeadersFromVehicleModelTable();
        List<String> expectedheadersFromCampaignsModelTable = new ArrayList<>(Arrays.asList(
                "NAME",
                "CODE",
                "START DATE",
                "END DATE",
                "BUDGET"
        ));

        //verify header columns
        Assert.assertEquals(actualheadersFromCampaignsModelTable, expectedheadersFromCampaignsModelTable);


        Driver.closeDriver();
    }

//    @Test
//    public void AC2_AnyAmountOfBoxesShouldBeUnchecked_CanCheckOnly1_OrMultiple_as_store_manager(){
//
//
//    }


}
