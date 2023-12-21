package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactManagementTest extends TestBase {

    @Test
    @Story("ContactManagement")
    @Description("check the value of the primary email parameter")
    public void checkPrimaryEmail() {
        assertEquals("Robin.Smith@bankofamerica.com",
                new MainPage(context)
                        .goToAccountsOverview()
                        .toUpdateProfile()
                        .getPrimaryEmail()
        );
    }
}
