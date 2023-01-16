package com.vsee.qa.challenge.web.pageobject;

import com.vsee.qa.challenge.web.common.WebElementHelper;
import com.vsee.qa.challenge.web.models.Email;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPage extends WebElementHelper {
    @FindBy(xpath = "//div[text()='Compose']")
    WebElement composeBtn;
    @FindBy(xpath = "//div[@aria-label='Search Field']//input")
    WebElement toTxt;
    @FindBy(name = "subjectbox")
    WebElement subjectTxt;
    @FindBy(xpath = "//div[@aria-label='Message Body']")
    WebElement contentTextArea;
    @FindBy(xpath = "//div[text()='Send']")
    WebElement sendBtn;
    @FindBy(xpath = "//span[text()='Message sent']")
    WebElement confirmSentMess;

    public GmailPage(WebDriver driver) {
        super(driver);
    }

    public GmailPage clickOnComposeButton(){
        waitElementVisibility(composeBtn, 20);
        composeBtn.click();
        return this;
    }

    public GmailPage inputToTextbox(String to){
        waitElementVisibility(toTxt, 5);
        toTxt.clear();
        toTxt.sendKeys(to);
        return this;
    }

    public GmailPage inputSubjectTextbox(String subject){
        waitElementVisibility(subjectTxt, 5);
        subjectTxt.clear();
        subjectTxt.sendKeys(subject);
        return this;
    }

    public GmailPage inputContentTextArea(String content){
        waitElementVisibility(contentTextArea, 5);
        contentTextArea.clear();
        contentTextArea.sendKeys(content);
        return this;
    }

    public GmailPage clickOnSendButton(){
        waitElementVisibility(sendBtn, 5);
        sendBtn.click();
        return this;
    }

    public boolean isConfirmSentMessageDisplayed(){
        waitElementVisibility(confirmSentMess, 5);
        return confirmSentMess.isDisplayed();
    }

    public void inputEmailDetailInfo(Email email){
        inputToTextbox(email.getTo());
        inputSubjectTextbox(email.getSubject());
        inputContentTextArea(email.getContent());
    }
}
