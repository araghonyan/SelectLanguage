package com.carina.pages;

import com.carina.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{


    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBar;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchGoButton;

    @FindBy(xpath = "//a[@id='icp-nav-flyout']//span[@class='nav-icon nav-arrow']")
    //@FindBy(xpath = "//div[text()='ES']")
    public WebElement languageSelect;

    @FindBy(xpath = "//div[@id='nav-flyout-icp']//i[@class='icp-radio']")
    public WebElement espaniolButton;

    @FindBy(xpath = "//span[.='Hola, Identifícate']")
    public WebElement holaIdentification;
}
