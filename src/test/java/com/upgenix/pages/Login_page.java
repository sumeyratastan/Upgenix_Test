package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page extends BasePage{
    public Login_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


   // @FindBy(id="login")
   // public WebElement username;

   // @FindBy(id="password")
    //public WebElement password;

    //@FindBy(xpath = "//button[@type='submit']")
   // public WebElement submitButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongMessage;

    @FindBy(xpath = "//input[@type='hidden'][1]")
    public WebElement fieldMessage;

    @FindBy(xpath = "//a[.='Reset Password']")
    public WebElement resetButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement bulletSign;





}
