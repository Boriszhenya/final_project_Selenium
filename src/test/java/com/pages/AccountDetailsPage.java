package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountDetailsPage extends BasePage {
    public AccountDetailsPage(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//*[@href='/AccountDetails/5555/1'][text()='Activity']")
    public WebElement buttonActivity;

    @FindBy(xpath = "//*[@href='/AccountDetails/5555/1'][text()='Statements & Documents']")
    public WebElement buttonStatementsDocuments;

    @FindBy(xpath = "//tbody/tr/td[@style='text-align: right;'][contains(text(),'$')]")
    public List<WebElement> listTransactionsBalance;

    @FindBy(xpath = "//tbody/tr//td[@class='nametext-color']/..")
    public List<WebElement> listDocuments;

    public AccountDetailsPage gotoActivity() {
        buttonActivity.click();
        return new AccountDetailsPage(context);
    }

    public AccountDetailsPage gotoStatementsDocuments() {
        buttonStatementsDocuments.click();
        return new AccountDetailsPage(context);
    }

    public String getTransactionAmount(String summa) {

        for (WebElement w : listTransactionsBalance) {
            if (w.getText().equals(summa)) {
                return w.getText();
            }
        }
        return "error";
    }

    public int getSizeListDocuments() {
        return listDocuments.size();
    }
}
