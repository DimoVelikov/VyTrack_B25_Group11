package com.vytrack.tests;

import com.vytrack.tests.base.TestBase;
import com.vytrack.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class US59_Select_Vehicle extends TestBase {


    //AC #1:  once the user launched to the Vehicle page, all the checkboxes should be unchecked
    @Test
    public void ac1_truck_driver() {

        //1. Log in with truck driver credentials
        VytrackUtils.loginAsDriver();

        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);

        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Assert all checkboxes are unchecked
        for (WebElement eachCheckbox : checkboxes) {

            Assert.assertFalse(eachCheckbox.isSelected());

        }


    }

    @Test
    public void ac1_sales_manager() {

        //1. Log in with sales manager credentials
        VytrackUtils.loginAsSalesManager();

        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);

        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Assert all checkboxes are unchecked
        for (WebElement eachCheckbox : checkboxes) {

            Assert.assertFalse(eachCheckbox.isSelected());

        }


    }

    @Test
    public void ac1_store_manager() {

        //1. Log in with store manager credentials
        VytrackUtils.loginAsStoreManger();
        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);

        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Assert all checkboxes are unchecked
        for (WebElement eachCheckbox : checkboxes) {

            Assert.assertFalse(eachCheckbox.isSelected());

        }

    }


    //AC #2: user check the first checkbox to check all the cars

    @Test
    public void ac2_truck_driver() {

        //1. Log in with truck driver credentials
        VytrackUtils.loginAsDriver();

        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);

        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//td//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Click on select all checkboxes button
        Driver.getDriver().findElement(By.xpath("(//th//button/input[@type='checkbox'])[1]")).click();
        BrowserUtils.sleep(3);


        //7. Assert all checkboxes are selected

        for (WebElement eachCheckbox : checkboxes) {

            Assert.assertTrue(eachCheckbox.isSelected());

        }


    }

    @Test
    public void ac2_sales_manager() {
        //1. Log in with sales manager credentials
        VytrackUtils.loginAsSalesManager();
        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);

        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//td//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Click on select all checkboxes button
        Driver.getDriver().findElement(By.xpath("(//th//button/input[@type='checkbox'])[1]")).click();
        BrowserUtils.sleep(3);


        //7. Assert all checkboxes are selected

        for (WebElement eachCheckbox : checkboxes) {

            Assert.assertTrue(eachCheckbox.isSelected());

        }


    }

    @Test
    public void ac2_store_manager() {

        //1. Log in with store manager credentials
        VytrackUtils.loginAsStoreManger();
        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);

        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//td//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Click on select all checkboxes button
        Driver.getDriver().findElement(By.xpath("(//th//button/input[@type='checkbox'])[1]")).click();
        BrowserUtils.sleep(3);


        //7. Assert all checkboxes are selected

        for (WebElement eachCheckbox : checkboxes) {

            Assert.assertTrue(eachCheckbox.isSelected());

        }


    }


    //AC #3: users can select any car

    @Test
    public void ac3_truck_driver() {

        //1. Log in with store manager credentials
        VytrackUtils.loginAsDriver();

        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);


        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//td//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Assert any checkbox can be selected

        for (WebElement eachCheckbox : checkboxes) {

            eachCheckbox.click();
            Assert.assertTrue(eachCheckbox.isSelected());

        }


    }

    @Test
    public void ac3_sales_manager() {
        //1. Log in with store manager credentials
        VytrackUtils.loginAsStoreManger();

        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);


        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//td//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Assert any checkbox can be selected

        for (WebElement eachCheckbox : checkboxes) {

            eachCheckbox.click();
            Assert.assertTrue(eachCheckbox.isSelected());

        }


    }

    @Test
    public void ac3_store_manager() {

        //1. Log in with store manager credentials
        VytrackUtils.loginAsStoreManger();
        BrowserUtils.sleep(3);

        //2. Select Fleet module
        Driver.getDriver().findElement(By.xpath("(//li[@class='dropdown dropdown-level-1'])[1]")).click();

        //3. Select Vehicle
        Driver.getDriver().findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();
        BrowserUtils.sleep(3);


        //4. Create a List of Web Elements to contain all the checkboxes
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//td//input[@type='checkbox']"));

        //5. Assert if the checkboxes is not empty
        Assert.assertFalse(checkboxes.isEmpty());

        //6. Assert any checkbox can be selected

        for (WebElement eachCheckbox : checkboxes) {

            eachCheckbox.click();
            Assert.assertTrue(eachCheckbox.isSelected());

        }


    }

}


