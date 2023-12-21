package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SendMoneyOutsidePageTest extends TestBase {

    @Test
    @Story("SendMoney")
    @Description("sendMoneyLaura")
    public void sendMoneyLaura() {

        assertEquals("    Adv Plus Banking 2322.56",
                new MainPage(context)
                        .goToAccountsOverview()
                        .toPayTransfer()
                        .toZelle()
                        .formFilling()
                        .makeTransfer()
                        .getTextFieldFrom()
        );
    }
}
