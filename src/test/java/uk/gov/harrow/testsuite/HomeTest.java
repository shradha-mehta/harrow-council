package uk.gov.harrow.testsuite;

import org.junit.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class HomeTest extends TestBase {
    //object created for home page to call homepage methods here
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToSearchFeature() {
        //below methods calling from pages package
        homePage.clickOnSearchButton();
    }

    @Test
    public void verifyUserShouldNavigateToServicesFeature() {
        //below methods calling from pages package
        homePage.clickOnServiceButton();
    }


}

