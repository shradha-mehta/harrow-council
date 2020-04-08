package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {
    //below locators for elements on home page
    By loginLink = By.className("icon-fallback");
    By searchSymbolLink = By.xpath("//span[@class='icon toggle-icon toggle-icon--search']");
    By servicesButton = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");
    By councilTaxButton = By.xpath("//div[@class='widget-row widget-row--flush widget-row--full-width']//a[2]");


    //below method creation for web elements and doing action on elements
    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchSymbolLink);
    }

    public void clickOnServiceButton() {
        clickOnElement(servicesButton);
    }

    public void clickOnCouncilTaxFeature() {
        clickOnElement(councilTaxButton);
    }


}

