package uk.gov.harrow.pages;


import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

//login page class extends utility class to use utilities property
public class LoginPage extends Utility {

    //locators for element
    By loginFeatureWelComeText = By.xpath("//h2[contains(text(),'Log in')]");


    //below return type method to compare expected and actual result
    public String loginWelcomeText() {
        return getTextFromElement(loginFeatureWelComeText);
    }
}


