package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SendMoneyOutsidePage extends BasePage {
    public SendMoneyOutsidePage(TestContext context) {
        super(context);
    }

    @FindBy(id = "payFrom")
    public WebElement fieldFrom;

    @FindBy(id = "payTo")
    public WebElement fieldTo;

    @FindBy(id = "payAmount")
    public WebElement fieldAmount;

    @FindBy(id = "payNote")
    public WebElement fieldNote;

    @FindBy(xpath = "//button[text()='Continue transfer']")
    public WebElement buttonContinueTransfer;

    @FindBy(xpath = "//a[text()='Make Transfer']")
    public WebElement buttonMakeTransfer;

    @FindBy(xpath = "//strong[text()='From:']/../span")
    public WebElement fieldFromRez;


    public SendMoneyOutsidePage formFilling() {
        Select select = new Select(fieldFrom);
        fieldFrom.click();
        select.selectByIndex(1);
        fieldTo.click();
        fieldAmount.click();
        fieldNote.sendKeys("test");
        buttonContinueTransfer.click();
        return new SendMoneyOutsidePage(context);
    }

    public SendMoneyOutsidePage makeTransfer() {
        buttonMakeTransfer.click();
        return new SendMoneyOutsidePage(context);
    }

    public String getTextFieldFrom() {
        return fieldFromRez.getText();
    }
}
