package com.pages;

import com.context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppPage extends BasePage {
    public AppPage(TestContext context) {
        super(context);
    }

    @FindBy(id = "dealsTab")
    public WebElement buttonSpecialOffers;

    @FindBy(xpath = "//button[@id='activity_process-bill-pay_special-offers']/../p")
    public WebElement specialOffersText;

    @FindBy(xpath = "//*[@id='creditcard']/../a")
    public WebElement buttonCustomizedCash;

    @FindBy(id = "account_update-profile")
    public WebElement buttonUpdateProfile;

    @FindBy(xpath = "//span[text()='Pay & Transfer']/../..")
    public WebElement buttonPayTransfer;

    @FindBy(xpath = "//span[text()='Rewards & Deals']/../..")
    public WebElement buttonRewardsDeals;

    @FindBy(xpath = "//a[text()='Choose your deals']")
    public WebElement buttonChooserYourDeals;

    public AppPage toSpecialOffers() {
        buttonSpecialOffers.click();
        return new AppPage(context);
    }

    public String getTextSpecialOffers() {
        return specialOffersText.getText();
    }

    public AccountDetailsPage toCustomizedCashRewardsVisaSignature() {
        buttonCustomizedCash.click();
        return new AccountDetailsPage(context);
    }

    public ContactManagementPage toUpdateProfile() {
        buttonUpdateProfile.click();
        return new ContactManagementPage(context);
    }

    public TransferActivityHubPage toPayTransfer() {
        buttonPayTransfer.click();
        return new TransferActivityHubPage(context);
    }

    public CashBackDealsPage toRewardsDeals() {
        buttonRewardsDeals.click();
        buttonChooserYourDeals.click();
        return new CashBackDealsPage(context);
    }
}
