package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactManagementPage extends BasePage {
    public ContactManagementPage(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//strong[text()='Primary email']/../../td[2]")
    public WebElement primaryEmail;

    public String getPrimaryEmail() {
        return primaryEmail.getText();
    }
}
