package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CashBackDealsPage extends BasePage {
    public CashBackDealsPage(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//span[text()='Hide Deal']/..")
    public WebElement buttonBaysidePlus;

    @FindBy(xpath = "//div[@class='ready-to-use']/p[3]")
    public WebElement textBaysidePlus;

    public CashBackDealsPage markBayside() {

        buttonBaysidePlus.click();
        return new CashBackDealsPage(context);
    }

    public String getTextResultBayside() {
        return textBaysidePlus.getText();
    }
}
