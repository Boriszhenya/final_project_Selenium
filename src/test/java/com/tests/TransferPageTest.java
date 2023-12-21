package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
