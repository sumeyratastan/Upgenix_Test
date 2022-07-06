package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page extends BasePage {
    public Logout_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   // @FindBy(xpath = "//span[@class='oe_topbar_name']")
  // public WebElement topBarNameDropdown;

   // @FindBy(xpath = "//a[text()='Log out']")
   // public WebElement logout;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement expiredMessage;



}
