package com.upgenix.step_definitions;

import com.upgenix.pages.Logout_page;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;

public class Logout_step_definitions {

    Logout_page logout_page=new Logout_page();

    @When("user clicks to {string}")
    public void user_clicks_to(String string) {
      logout_page.topBarNameDropdown.click();
    }

    @When("user clicks to {string} dropdown")
    public void user_clicks_to_dropdown(String string) {

        logout_page.logout.click();


    }


    @And("user click to {string} button")
    public void userClickToButton(String goBack) {
        Driver.getDriver().navigate().back();
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String expiry) {
       logout_page.expiredMessage.getText();
    }
}
