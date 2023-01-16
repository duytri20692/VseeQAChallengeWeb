package com.vsee.qa.challenge.web.pageobject;

import com.vsee.qa.challenge.web.common.WebElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends WebElementHelper {
    @FindBy(xpath = "//input[@type='email']")
    WebElement emailTxt;
    @FindBy(xpath = "//span[text()='Next']")
    WebElement nextBtn;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passTxt;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail(String email){
        waitElementVisibility(emailTxt, 5);
        emailTxt.clear();
        emailTxt.sendKeys(email);
    }

    public void inputPass(String pass){
        waitElementVisibility(passTxt, 5);
        passTxt.clear();
        passTxt.sendKeys(pass);
    }

    public void clickNextButton(){
        waitElementVisibility(nextBtn, 5);
        nextBtn.click();
    }

    public void loginWithUserAndPass(String user, String pass){
        inputEmail(user);
        clickNextButton();
        inputPass(pass);
        clickNextButton();
    }
}
