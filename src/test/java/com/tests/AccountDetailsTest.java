package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountDetailsTest extends TestBase {
    @Test
    @Story("Account")
    @Description("Account Activity")
    public void verificationTransaction() {

        String summa = "$3,556.39";
        assertEquals(summa,
                new MainPage(context)
                        .goToAccountsOverview()
                        .toCustomizedCashRewardsVisaSignature()
                        .gotoActivity()
                        .getTransactionAmount(summa)
        );
    }

    @Test
    @Story("Account")
    @Description("Statements & Documents")
    public void numberOfDocuments() {

        assertEquals(8,
                new MainPage(context)
                        .goToAccountsOverview()
                        .toCustomizedCashRewardsVisaSignature()
                        .gotoStatementsDocuments()
                        .getSizeListDocuments()
        );
    }
}
