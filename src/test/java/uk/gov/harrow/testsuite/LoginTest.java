package uk.gov.harrow.testsuite;

import org.junit.Test;
import org.testng.Assert;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;
import uk.gov.harrow.testbase.TestBase;

public class LoginTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldNotNavigateToLoginPage() {
        //below methods calling from pages package
        homePage.clickOnLoginLink();

        //compare expected with actual result
        String expectedResult = "Log in";
        String actualResult = loginPage.loginWelcomeText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}

