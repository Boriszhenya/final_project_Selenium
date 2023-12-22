package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class AlertsPage extends BasePage {


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
        LocalDate newDate = LocalDate.now().minusDays(41);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = newDate.format(formatter);
        for (WebElement al : listDateAlerts) {
            if (al.getText().equals(formattedDate)) {
                return true;
            }
        }
        return false;
    }
}
