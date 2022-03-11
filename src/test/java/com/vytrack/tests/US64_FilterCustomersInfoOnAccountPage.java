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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US64_FilterCustomersInfoOnAccountPage extends TestBase {
    /*
     Story12:  As a user, I want to filter customers’ info on the Account page.
     AC1: users should see 8 filter items on the Accounts page
     Expected filter names:  Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At

     Test case #1
     Description:  users see 8 account name filter options
     Environment: https://qa1.vytrack.com/user/login
     Steps:
     Log in as store or sales managers
     Click the “Accounts” under the Customers
     Verify there are 8 filter options
     Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At

  */
        //testing modules for sales manager
        @Test
        public void filteringCustomersInfoForSalesManager() {

        /*
    Story12:  As a user, I want to filter customers’ info on the Account page.
    AC1: users should see 8 filter items on the Accounts page
    Expected filter names:  Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At

    Test cases #1
    Description:  users see 8 account name filter options
    Environment: https://qa1.vytrack.com/user/login
    Steps:
    Log in as store or sales managers
    Click the “Accounts” under the Customers
    Verify there are 8 filter options
    Account Name, Contact Name, Contact Email, Contact Phone, Owner,  Business Unit, Created At, Updated At

 */

            //Step1.login as sales manager
            VytrackUtils.loginAsSalesManager();
            WebElement customerModule = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));

            Actions actions = new Actions(Driver.getDriver());


            //Step2. Hover over to Customer module
            BrowserUtils.sleep(2);
            actions.moveToElement(customerModule).perform();

            //click Account option
            WebElement AccountsOption = Driver.getDriver().findElement(By.xpath("//span[.='Accounts']"));
            AccountsOption.click();
            BrowserUtils.sleep(2);

            //Step3.locating actual Options
            WebElement fistModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[1]"));
            String fistModuleText = fistModule.getText();

            WebElement secondModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[2]"));
            String secondModuleText = secondModule.getText();

            WebElement thirdModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[3]"));
            String thirdModuleText = thirdModule.getText();

            WebElement forthModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[4]"));
            String fourthModuleText = forthModule.getText();

            WebElement fifthModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[5]"));
            String fifthModuleText = fifthModule.getText();

            WebElement sixthModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[6]"));
            String sixthModuleText = sixthModule.getText();

            WebElement seventhModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[7]"));
            String seventhModuleText = seventhModule.getText();

            List<String> actualModuleTexts = new ArrayList<>(Arrays.asList(fistModuleText, secondModuleText, thirdModuleText, fourthModuleText, fifthModuleText, sixthModuleText, seventhModuleText));
            System.out.println("actualModuleTexts = " + actualModuleTexts);

            //Verify actual module texts with expacted module texts
            List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                    "Account Name",
                    "Contact Name",
                    "Contact Email",
                    "Contact Phone",
                    "Owner",
                    "Business Unit",
                    "Created At",
                    "Updated At"));

            Assert.assertEquals(actualModuleTexts, expectedModuleTexts);

        }

        //testing modules for stores manager
        @Test
        public void filteringCustomersInfoForStoreManager() {
            //Step1.login as Store Manager
            VytrackUtils.loginAsStoreManger();
            WebElement customerModule = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[3]"));

            Actions actions = new Actions(Driver.getDriver());


            //Step2. Hover over to Customer module
            BrowserUtils.sleep(2);
            actions.moveToElement(customerModule).perform();

            //click Account option
            WebElement AccountsOption = Driver.getDriver().findElement(By.xpath("//span[.='Accounts']"));
            AccountsOption.click();
            BrowserUtils.sleep(2);

            //Step3.locating actual Options
            WebElement fistModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[1]"));
            String fistModuleText = fistModule.getText();

            WebElement secondModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[2]"));
            String secondModuleText = secondModule.getText();

            WebElement thirdModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[3]"));
            String thirdModuleText = thirdModule.getText();

            WebElement forthModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[4]"));
            String fourthModuleText = forthModule.getText();

            WebElement fifthModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[5]"));
            String fifthModuleText = fifthModule.getText();

            WebElement sixthModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[6]"));
            String sixthModuleText = sixthModule.getText();

            WebElement seventhModule = Driver.getDriver().findElement(By.xpath("(//span[@class='grid-header-cell__label'])[7]"));
            String seventhModuleText = seventhModule.getText();

            List<String> actualModuleTexts = new ArrayList<>(Arrays.asList(fistModuleText, secondModuleText, thirdModuleText, fourthModuleText, fifthModuleText, sixthModuleText, seventhModuleText));
            System.out.println("actualModuleTexts = " + actualModuleTexts);

            //Verify actual module texts with expacted module texts
            List<String> expectedModuleTexts = new ArrayList<>(Arrays.asList(
                    "Account Name",
                    "Contact Name",
                    "Contact Email",
                    "Contact Phone",
                    "Owner",
                    "Business Unit",
                    "Created At",
                    "Updated At"));

            System.out.println("expectedModuleTexts = " + expectedModuleTexts);

            Assert.assertEquals(actualModuleTexts, expectedModuleTexts);

        }

    }
