package com.vsee.qa.challenge.web.stepdefinitions;

import com.vsee.qa.challenge.web.common.BasePage;
import com.vsee.qa.challenge.web.pageobject.LoginPage;
import io.cucumber.java.en.Given;

public class LoginSteps extends BasePage {
    LoginPage loginPage = new LoginPage(driver);

    @Given("User Login to Gmail page with Username and Password")
    public void userLoginToGmailPageWithUsernameAndPassword() {
        loginPage.loginWithUserAndPass(loginUser,loginPass);
    }
}
