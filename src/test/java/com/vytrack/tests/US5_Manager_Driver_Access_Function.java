package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class US5_Manager_Driver_Access_Function {

    /*
    USER STORY: As a user, I want to view columns on the Vehicle models page.(web-table).

    AC:
        AC #1: The store manager and sales manager should see 10 columns on the Vehicle Model page.

        Expected Column names:
        MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
        TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS

         AC #2: Drivers should not able to access the Vehicle Model page,
         users should see “You do not have permission to perform this action.”
     */

    // -----------------------------SALES MANAGER ACCESS---------------------------------------
    @Test
    public void US5_AC1_SalesManager_Access_To_VehiclesModel_Tab() {


        /*
        AC #1: The store manager and sales manager should see 10 columns on the Vehicle Model page.

        Expected Column names:
        MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
                TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // STEP 2: System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 3: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicles Model tab/module

        // Verify system shows Vehicles Model tab/module
        WebElement vehiclesModelTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));

        String expectedVehiclesModelTab = "Vehicles Model";
        String actualVehiclesModelTab = vehiclesModelTab.getText();

        // Assert system displays 'Vehicles Model' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3:

        // Click Vehicles Model tab / module

        vehiclesModelTab.click();
        BrowserUtils.sleep(2);

        //System should display 10 columns on the Vehicle Model page
        //Expected Column names:
        //MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
        // TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS

        WebElement modelNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Model Name']"));
        modelNameColumn.isDisplayed();

        WebElement makeColumn = Driver.getDriver().findElement(By.xpath("//span[.='Make']"));
        modelNameColumn.isDisplayed();

        WebElement canBeRequestedColumn = Driver.getDriver().findElement(By.xpath("//span[.='Can be requested']"));
        modelNameColumn.isDisplayed();

        WebElement cvviColumn = Driver.getDriver().findElement(By.xpath("//span[.='CVVI']"));
        modelNameColumn.isDisplayed();

        WebElement co2FeeColumn = Driver.getDriver().findElement(By.xpath("//span[.='CO2 Fee (/month)']"));
        modelNameColumn.isDisplayed();

        WebElement costNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Cost (Depreciated)']"));
        modelNameColumn.isDisplayed();

        WebElement totalCostNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Total Cost (Depreciated)']"));
        modelNameColumn.isDisplayed();

        WebElement co2EmissionsNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='CO2 Emissions']"));
        modelNameColumn.isDisplayed();

        WebElement fuelTypeNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Fuel Type']"));
        modelNameColumn.isDisplayed();

        WebElement vendorsColumn = Driver.getDriver().findElement(By.xpath("//span[.='Vendors']"));
        modelNameColumn.isDisplayed();
        BrowserUtils.sleep(2);

        // user logout from homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();


    }

    // -----------------------------STORE MANAGER ACCESS---------------------------------------
    @Test
    public void US5_AC1_StoreManager_Access_To_VehiclesModel_Tab() {


        /*
        AC #1: The store manager and sales manager should see 10 columns on the Vehicle Model page.

        Expected Column names:
        MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
                TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // STEP 2: System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 3: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicles Model tab/module

        // Verify system shows Vehicles Model tab/module
        WebElement vehiclesModelTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));

        String expectedVehiclesModelTab = "Vehicles Model";
        String actualVehiclesModelTab = vehiclesModelTab.getText();

        // Assert system displays 'Vehicles Model' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3:

        // Click Vehicles Model tab / module

        vehiclesModelTab.click();
        BrowserUtils.sleep(2);

        //System should display 10 columns on the Vehicle Model page
        //Expected Column names:
        //MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
        // TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS

        WebElement modelNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Model Name']"));
        modelNameColumn.isDisplayed();

        WebElement makeColumn = Driver.getDriver().findElement(By.xpath("//span[.='Make']"));
        modelNameColumn.isDisplayed();

        WebElement canBeRequestedColumn = Driver.getDriver().findElement(By.xpath("//span[.='Can be requested']"));
        modelNameColumn.isDisplayed();

        WebElement cvviColumn = Driver.getDriver().findElement(By.xpath("//span[.='CVVI']"));
        modelNameColumn.isDisplayed();

        WebElement co2FeeColumn = Driver.getDriver().findElement(By.xpath("//span[.='CO2 Fee (/month)']"));
        modelNameColumn.isDisplayed();

        WebElement costNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Cost (Depreciated)']"));
        modelNameColumn.isDisplayed();

        WebElement totalCostNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Total Cost (Depreciated)']"));
        modelNameColumn.isDisplayed();

        WebElement co2EmissionsNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='CO2 Emissions']"));
        modelNameColumn.isDisplayed();

        WebElement fuelTypeNameColumn = Driver.getDriver().findElement(By.xpath("//span[.='Fuel Type']"));
        modelNameColumn.isDisplayed();

        WebElement vendorsColumn = Driver.getDriver().findElement(By.xpath("//span[.='Vendors']"));
        modelNameColumn.isDisplayed();
        BrowserUtils.sleep(2);

        // user logout from homepage
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();

    }

    @Test
    public void US5_AC2_Drivers_access() {

        /*
        AC #2: Drivers should NOT able to access the Vehicle Model page,
        users should see “You do not have permission to perform this action.”
         */


        // STEP 1: User go to homepage
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        BrowserUtils.sleep(1);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        BrowserUtils.sleep(1);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(1);


        // STEP 2: System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("((//span[@class='title title-level-1'])[1])"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 3: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicles Model tab/module

        // Verify system shows Vehicles Model tab/module
        WebElement vehiclesModelTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));

        String expectedVehiclesModelTab = "Vehicles Model";
        String actualVehiclesModelTab = vehiclesModelTab.getText();

        // Assert system displays 'Vehicles Model' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3:

        // Click Vehicles Model tab / module

        vehiclesModelTab.click();
        BrowserUtils.sleep(2);

        // System should show error message:
        //“You do not have permission to perform this action.”

        WebElement errorMessage = Driver.getDriver().findElement(By.xpath("(//div[@class='alert alert-error fade in top-messages '])[1]"));

        String expectedErrorMessage = "You do not have permission to perform this action.";
        String actualErrorMessage = errorMessage.getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }


}

