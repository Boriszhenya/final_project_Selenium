package com.tests;

import com.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecurityDashboardPageText extends TestBase {
    @Test
    @Story("Security Center")
    @Description("text verification")
    public void verificationText() {

        assertEquals("Strengthen your Password now to help maximize defense against hackers.",
                new MainPage(context)
                        .goToAccountsOverview()
                        .toSecurityCenter()
                        .getTextSlider()
        );
    }
}
