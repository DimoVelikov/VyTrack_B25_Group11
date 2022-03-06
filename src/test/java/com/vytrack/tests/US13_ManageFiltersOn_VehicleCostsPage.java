package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class US13_ManageFiltersOn_VehicleCostsPage {


    /*
    USER STORY:
    As a user, I want to manage filters on the Vehicle Costs page. (Web-table and checkbox)


    AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE

    AC #2: users check the first checkbox to check all the Vehicle Costs
     */


    //-------------------------SALES MANAGER able to see 3 COLUMNS--------------------------------------------------
    @Test
    public void US13_AC1_Salesmanager_able_to_see_3columns() {

          /*
         AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("salesmanager141");
        BrowserUtils.sleep(2);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123");
        BrowserUtils.sleep(2);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(2);


        // STEP 2: System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 3: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(4);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);
        BrowserUtils.sleep(3);


        // STEP 3:

        // Click Vehicles Model tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(3);

        // System should see three columns on the Vehicle Cost page.

        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();


    }

    //-------------------------STORE MANAGER able to see 3 COLUMNS--------------------------------------------------
    @Test
    public void US13_AC1_Storemanager_able_to_see_3columns() {

          /*
         AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("storemanager65");
        BrowserUtils.sleep(2);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123");
        BrowserUtils.sleep(2);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(2);


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

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);



        // STEP 3:

        // Click Vehicles Model tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // System should see three columns on the Vehicle Cost page.

        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();


    }

    //-------------------------TRUCK DRIVER able to see 3 columns--------------------------------
    @Test
    public void US13_AC1_TruckDriver_able_to_see_3columns() {


          /*
         AC #1: Users should see three columns on the Vehicle Cost page.
               Expected Column names:
               TYPE, TOTAL PRICE, DATE
*/

        // STEP 1: User go to homepage
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");

        // User enters username
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("user177");
        BrowserUtils.sleep(2);
        // User enters password
        Driver.getDriver().findElement(By.xpath("//input[@type='password']")).sendKeys("UserUser123");
        BrowserUtils.sleep(2);
        // User clicks SIGN IN button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(2);


        // STEP 2: System should display 'Fleet' tab / module

        // Locate 'Fleet' tab/module
        WebElement moduleTab = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));

        String expectedModuleName = "Fleet";
        String actualModuleName = moduleTab.getText();

        // Assert system displays 'Fleet' tab/module
        Assert.assertEquals(actualModuleName, expectedModuleName);


        // STEP 3: Click Fleet tab/module

        moduleTab.click();
        BrowserUtils.sleep(2);

        // System should show dropdown with Vehicle Costs tab/module

        // Verify system shows Vehicle Costs tab/module
        WebElement vehicleCostsTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicle Costs']"));

        String expectedVehiclesModelTab = "Vehicle Costs";
        String actualVehiclesModelTab = vehicleCostsTab.getText();

        // Assert system displays 'Vehicles Costs' tab/module
        Assert.assertEquals(actualVehiclesModelTab, expectedVehiclesModelTab);


        // STEP 3:

        // Click Vehicles Model tab / module

        vehicleCostsTab.click();
        BrowserUtils.sleep(2);

        // System should see three columns on the Vehicle Cost page.

        // Expected Column name: TYPE, TOTAL PRICE, DATE

        WebElement type = Driver.getDriver().findElement(By.xpath("//span[.='Type']"));
        type.isDisplayed();

        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[.='Total Price']"));
        totalPrice.isDisplayed();

        WebElement date = Driver.getDriver().findElement(By.xpath("//span[.='Date']"));
        date.isDisplayed();


    }

}

