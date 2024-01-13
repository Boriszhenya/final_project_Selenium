package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackDealsPageTest extends TestBase {

    @Test
    @Story("CashBackDeals")
    @Description("checking the Rewards & Deals selection option")
    public void checkPrimaryEmail() {
        assertEquals("Ready to use",
                new MainPage(context)
                        .goToAccountsOverview()
                        .toRewardsDeals()
                        .markBayside()
                        .getTextResultBayside()
        );
    }
}
