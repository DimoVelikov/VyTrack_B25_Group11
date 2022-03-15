package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFilters {
    public ManageFilters(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-0']")
    public WebElement checkedName;

    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-1']")
    public WebElement checkedCade;

    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-2']")
    public WebElement checkedStartDate;

    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-3']")
    public WebElement checkedEndDate;

    @FindBy(xpath = "//input[@id='ui-multiselect-0-0-option-4']")
    public WebElement checkedBudget;




}
