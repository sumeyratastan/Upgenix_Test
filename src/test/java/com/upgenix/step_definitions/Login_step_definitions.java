package com.upgenix.step_definitions;

import com.upgenix.pages.Login_page;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Login_step_definitions {

    Login_page login_page=new Login_page();

    @Given("user is on the Upgenix login page")
    public void user_is_on_the_upgenix_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String username, String password) {
        login_page.username.sendKeys(username);
        login_page.password.sendKeys(password);
    }
    @When("user clicks to {string} button")
    public void user_clicks_to_button(String login) {
        login_page.submitButton.click();

    }
    @Then("user should see the title is {string}")
    public void user_should_see_the_title_is(String string) {

        Assert.assertEquals(Driver.getDriver().getTitle(),string);

    }

    @When("user enters  {string} and {string}")
    public void user_enters_and(String username, String password) {
        login_page.username.sendKeys(username);
        login_page.password.sendKeys(password);

    }
    @Then("user should see {string} message displayed")
    public void user_should_see_message_displayed(String wrongMessage) {
        login_page.wrongMessage.isDisplayed();

    }

    @When("user enters  {string} or  {string}")
    public void user_enters_or(String username, String password) {
        login_page.username.sendKeys(username);
        login_page.password.sendKeys(password);
    }
    @Then("user should see  {string} message")
    public void user_should_see_message(String Please_fill_out_this_field) {
      String message1 =login_page.username.getAttribute("validationMessage");
      String message2 =login_page.password.getAttribute("validationMessage");

      Assert.assertTrue((message1.equals(Please_fill_out_this_field) || (message2.equals(Please_fill_out_this_field))));


    }
    @When("user clicks to {string} link")
    public void user_clicks_to_link(String string) {
        login_page.resetButton.click();
    }


    @Then("user should see password in bullet sign")
    public void userShouldSeePasswordInBulletSign() {
    login_page.bulletSign.isDisplayed();

    }


    @And("user hit the ‘Enter’ key of the keyboard")
    public void userHitTheEnterKeyOfTheKeyboard() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(login_page.submitButton, Keys.ENTER).perform();


    }
}
