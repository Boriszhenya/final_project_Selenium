package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferActivityHubPage extends BasePage {
    public TransferActivityHubPage(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//h5[text()='Zelle®']/../..")
    public WebElement buttonZelle;

    @FindBy(xpath = "//strong[contains(text(),'Energy')]")
    public WebElement activityEnergy;


    public SendMoneyOutsidePage toZelle() {
        buttonZelle.click();
        return new SendMoneyOutsidePage(context);
    }

    public boolean searchBillEnergy() {
        try {
            if (activityEnergy.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;

        }
    }
}
