package com.pages;

import com.context.TestContext;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TransferPage extends BasePage {
    public static final int NUMBER_ITERATIONS = 6;

    public static String TRANSFER_VALUE = "1000.00";

    public TransferPage(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//div[text()='Between my accounts at Bank of America']/..")
    public WebElement buttonBetweenAccounts;

    @FindBy(id = "payFrom")
    public WebElement fieldTransferMoneyFrom;
    @FindBy(xpath = "//div[@id='payFrom']/div/ul/li")
    public List<WebElement> listTransferMoneyFrom;

    @FindBy(id = "payTo")
    public WebElement fieldTransferMoneyTo;
    @FindBy(xpath = "//div[@id='payTo']/div/ul/li")
    public List<WebElement> listTransferMoneyTo;

    @FindBy(id = "payAmount")
    public WebElement fieldAmount;

    @FindBy(id = "payHowOften")
    public WebElement fieldFrequency;
    @FindBy(xpath = "//div[@id='payHowOften']/div/ul/li")
    public List<WebElement> listFrequency;

    @FindBy(xpath = "//button[text()='Next']")
    public WebElement buttonNext;

    @FindBy(xpath = "//a[text()='Transfer']")
    public WebElement buttonTransfer;

    @FindBy(xpath = "//*[@id='mainContent']//span")
    public WebElement result;

    public TransferPage toBetweenMyAccount() {
        buttonBetweenAccounts.click();
        return new TransferPage(context);
    }

    public TransferPage executionTransfer() {
        fieldTransferMoneyFrom.click();
        listTransferMoneyFrom.getFirst().click();
        fieldTransferMoneyTo.click();
        listTransferMoneyTo.get(1).click();
         for (int i = 0; i <= NUMBER_ITERATIONS; i++) {
            fieldAmount.sendKeys(Keys.BACK_SPACE);
        }
        fieldAmount.sendKeys(TRANSFER_VALUE);
        fieldFrequency.click();
        listFrequency.getFirst().click();
        buttonNext.click();
        return new TransferPage(context);
    }

    public TransferPage goTransfer() {
        buttonTransfer.click();
        return new TransferPage(context);
    }

    public String textResult() {
        return result.getText();
    }
}
