package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountDetailsTest extends TestBase {
     public static final String SUMMA = "$3,556.39";

    @Test
    @Story("Account")
    @Description("Account Activity")
    public void verificationTransaction() {


        assertEquals(SUMMA,
                new MainPage(context)
                        .goToAccountsOverview()
                        .toCustomizedCashRewardsVisaSignature()
                        .gotoActivity()
                        .getTransactionAmount(SUMMA)
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
