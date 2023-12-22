package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransferPageTest extends TestBase {
    @Test
    @Story("Transfer")
    @Description("Search Text Activity Center")
    public void searchTextActivityCenter() {
        assertEquals("Your transfer is confirmed.",
                new MainPage(context)
                        .toTransferPage()
                        .toBetweenMyAccount()
                        .executionTransfer()
                        .goTransfer()
                        .textResult());
    }

    @Test
    @Story("Activity")
    @Description("Search Activity Energy")
    public void searchEBillEnergy() {
        assertTrue(new MainPage(context)
                .goToAccountsOverview()
                .toPayTransfer()
                .searchBillEnergy()
        );
    }


}
