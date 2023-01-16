package com.vsee.qa.challenge.web.stepdefinitions;

import com.vsee.qa.challenge.web.common.BasePage;
import com.vsee.qa.challenge.web.models.Email;
import com.vsee.qa.challenge.web.pageobject.GmailPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GmailSteps extends BasePage {
    GmailPage gmailPage = new GmailPage(driver);

    @When("User click on Compose button")
    public void userClickOnComposeButton() {
        gmailPage.clickOnComposeButton();
    }

    @And("User input the following info:")
    public void userInputTheFollowingInfo(DataTable dataTable) {
        Email email = new Email(dataTable.cell(1, 1), dataTable.cell(2, 1),
                dataTable.cell(3, 1));
        gmailPage.inputEmailDetailInfo(email);
    }

    @And("User click on Send button")
    public void userClickOnSendButton() {
        gmailPage.clickOnSendButton();
    }

    @Then("User should see the success message")
    public void userShouldSeeTheSuccessMessage() {
        Assert.assertTrue(gmailPage.isConfirmSentMessageDisplayed(), "Confirm sent message not displayed!!!");
    }
}
