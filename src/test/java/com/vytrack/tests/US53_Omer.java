package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//User Story : As a user, I should be accessing all the main modules of the app.


public class US53_Omer extends TestBase {

    //AC #1: store OR sales managers should view 8 module names.
    //Expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System


                       //----------Managers Login---------------
    @Test
    public void test1_expected_Modules(){
        VytrackUtils.loginAsSalesManager();
        BrowserUtils.sleep(2);

        // Storing all the expected module names in the arraylist.
        ArrayList<String> expectedModuleNames = new ArrayList<>();
        expectedModuleNames.addAll(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing","Reports & Segments", "System"));

        //getting all the module web elements as a list with findElements method.
        List<WebElement> actualModuleWebElements = Driver.getDriver().findElements(By.xpath("//li/a/span/i/.."));

        for (int i = 0; i <expectedModuleNames.size(); i++) {

            //comparing each actual module name with expected module name one by one through for each loop.
            Assert.assertEquals(expectedModuleNames.get(i),actualModuleWebElements.get(i).getText());

        }


    }



    //AC #2: drivers should view 4 module names
    //Expected module names: Fleet, Customers, Activities, System

                      //---------Drivers login--------------
    @Test
    public void test2_expected_Modules() {
        VytrackUtils.loginAsDriver();
        BrowserUtils.sleep(2);

        // Storing all the expected module names in the arraylist.
        ArrayList<String> expectedModuleNames = new ArrayList<>();
        expectedModuleNames.addAll(Arrays.asList("Fleet", "Customers", "Activities", "System"));

        //getting all the module web elements as a list with findElements method.
        List<WebElement> actualModuleWebElements = Driver.getDriver().findElements(By.xpath("//li/a/span/i/.."));

        for (int i = 0; i < expectedModuleNames.size(); i++) {

            //comparing each actual module name with expected module name one by one through for each loop.
            Assert.assertEquals(expectedModuleNames.get(i), actualModuleWebElements.get(i).getText());

        }

    }

}
