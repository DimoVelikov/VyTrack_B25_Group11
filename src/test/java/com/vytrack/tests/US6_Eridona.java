package com.vytrack.tests;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US6_Eridona {

    /*
  Story6:  As a user, I want to see edit car info icons from the Vehicle page.
    AC #1:  users should see “view, edit, delete” when they hover the mouse to the 3 dots “…”
                  Test cases #1
  Description: users see the car edited options on the Vehicle page
  Environment: https://qa2.vytrack.com/user/login
  Steps:
  Users are on the homepage
  Click the Vehicles under the Fleet
  Verify any car info has 3 dots “...”, and there are “view, edit, delete” icons.
   */
//========================= salesmanager141 ==============================
    @Test
    public void edit_car_info_from_Vehicle_page_SalesManager() {

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

        //System should display 'Fleet' tab / module
        Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        BrowserUtils.sleep(2);

        // Click the Vehicles under the Fleet
        Actions actions = new Actions(Driver.getDriver());

        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span"));
        BrowserUtils.sleep(2);
        actions.moveToElement(fleetTab).perform();
        fleetTab.click();
        // Assert.assertTrue(fleetTab.isDisplayed());

        //Verify any car info has 3 dots “...”, and there are “view, edit, delete” icons.
        WebElement threeDots = Driver.getDriver().findElement(By.xpath("//td[@class='action-cell grid-cell grid-body-cell'][1]"));
        BrowserUtils.sleep(2);
        actions.moveToElement(threeDots).perform();
        threeDots.isSelected();

        Assert.assertTrue(threeDots.isDisplayed());

        // user logout
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();


        ////td[@class='action-cell grid-cell grid-body-cell'][1]
        ////div[@class='more-bar-holder'][1]

        System.out.println("==================== STORE MANAGER   =========================");
    }

    //storemanager65 --- storemanager69
    @Test
    public void edit_car_info_from_Vehicle_page_StoreManager() {

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

        //System should display 'Fleet' tab / module
        Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        BrowserUtils.sleep(2);

        // Click the Vehicles under the Fleet
        Actions actions = new Actions(Driver.getDriver());

        WebElement fleetTab = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span"));
        BrowserUtils.sleep(2);
        actions.moveToElement(fleetTab).perform();
        fleetTab.click();
        // Assert.assertTrue(fleetTab.isDisplayed());

        //Verify any car info has 3 dots “...”, and there are “view, edit, delete” icons.
        WebElement threeDots = Driver.getDriver().findElement(By.xpath("//td[@class='action-cell grid-cell grid-body-cell'][1]"));
        BrowserUtils.sleep(2);
        actions.moveToElement(threeDots).perform();
        threeDots.isSelected();

        Assert.assertTrue(threeDots.isDisplayed());

        // user logout
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();


        System.out.println("==================== TRUCK DRIVER   =========================");
    }

    //user172 --- user177

    @Test
    public void edit_car_info_from_Vehicle_page_TruckDriver() {

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

        //System should display 'Fleet' tab / module
        Driver.getDriver().findElement(By.cssSelector("#main-menu > ul > li:nth-child(1) > a > span")).click();
        BrowserUtils.sleep(2);
        //*[@id="main-menu"]/ul/li[1]/a/span
        ///html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span
        ////span[@class='title title-level-1'][1]
        //*[@id="main-menu"]/ul/li[1]/a/span

        // Click the Vehicles under the Fleet
        Actions actions = new Actions(Driver.getDriver());

        WebElement fleetTabVehiclebutton = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));

        //  WebElement fleetTab = Driver.getDriver().findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span"));
        BrowserUtils.sleep(2);
        actions.moveToElement(fleetTabVehiclebutton).perform();
        fleetTabVehiclebutton.click();
        // Assert.assertTrue(fleetTab.isDisplayed());

        //Verify any car info has 3 dots “...”, and there are “view, edit, delete” icons.
        WebElement threeDots = Driver.getDriver().findElement(By.xpath("//td[@class='action-cell grid-cell grid-body-cell'][1]"));
        BrowserUtils.sleep(2);
        actions.moveToElement(threeDots).perform();
        threeDots.isSelected();

        Assert.assertTrue(threeDots.isDisplayed());

        // user logout
        WebElement logoutButton = Driver.getDriver().findElement(By.xpath("//i[@class='fa-caret-down']"));
        logoutButton.click();

        WebElement logout = Driver.getDriver().findElement(By.xpath("//a[.='Logout']"));
        logout.click();


        ////td[@class='action-cell grid-cell grid-body-cell'][1]
        ////div[@class='more-bar-holder'][1]



    }


}
