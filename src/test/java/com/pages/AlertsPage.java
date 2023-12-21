package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertsPage extends BasePage {

    String date = "11/10/2023";

    public AlertsPage(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//a[text()='Alert history']")
    public WebElement buttonAlertHistory;

    @FindBy(xpath = "//table//tr/td")
    public List<WebElement> listDateAlerts;

    public AlertsPage toAlertHistory() {
        buttonAlertHistory.click();
        return new AlertsPage(context);
    }

    public boolean dateLookupInTable() {
        for (WebElement al : listDateAlerts) {
            if (al.getText().equals(date)) {
                return true;
            }
        }
        return false;
    }
}
