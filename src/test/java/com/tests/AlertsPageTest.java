package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Alerts test")
public class AlertsPageTest extends TestBase {

    @Test
    @Story("Negative test")
    @Description("Login as valid user and checking footer text")
    public void searchAlertDate() {

        assertTrue(new MainPage(context)
                .toAlerts()
                .toAlertHistory()
                .dateLookupInTable());
    }

    @Test
    @Story("Special Offers test")
    @Description(" text")
    public void searchTextActivityCenter() {

        assertEquals("Because you're a valued customer, we've selected some special offers just for you.",
                new MainPage(context)
                        .toAccountsOverview()
                        .toSpecialOffers()
                        .getTextSpecialOffers());

    }
}
