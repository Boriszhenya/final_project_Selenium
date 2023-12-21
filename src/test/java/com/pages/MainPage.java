package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//a[text()='Alerts']")
    public WebElement buttonAlerts;

    @FindBy(xpath = "//a[text()='Accounts Overview']")
    public WebElement buttonAccountsOverview;

    @FindBy(xpath = "//a[text()='Transfers']")
    public WebElement buttonTransfers;

    @FindBy(id = "landing_after")
    public WebElement buttonGoToAccountsOverview;

    @FindBy(xpath = "//button[text()='Remind me later']")
    public WebElement buttonCloseWindow;

    public AlertsPage toAlerts() {
        buttonAlerts.click();
        return new AlertsPage(context);
    }

    public AppPage toAccountsOverview() {
        buttonAccountsOverview.click();
        buttonCloseWindow.click();
        return new AppPage(context);
    }

    public TransferPage toTransferPage() {
        buttonTransfers.click();
        return new TransferPage(context);
    }

    public AppPage goToAccountsOverview() {
        buttonGoToAccountsOverview.click();
        buttonCloseWindow.click();
        return new AppPage(context);
    }
}
