package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import static org.junit.Assert.*;

@DefaultUrl("https://www.demoqa.com/text-box")
public class TextBoxPage extends PageObject {
    //Mapeo de campos
    public By fullNameInput = By.id("userName");
    public By emailInput = By.id("userEmail");
    public By currentAddressInput = By.id("currentAddress");
    public By permanentAddressInput = By.id("permanentAddress");
    public By submitButton = By.id("submit");
    public By fullNameValidation = By.id("name");
    public By emailValidation = By.id("email");
    public By currentAddressValidation = By.xpath("//p[@id='currentAddress' and @class='mb-1']");
    public By permanentAddressValidation = By.xpath("//p[@id='permanentAddress' and @class='mb-1']");

    public void sendFullNameInput(String fName){
        getDriver().findElement(fullNameInput).sendKeys(fName);
    }
    public void sendEmailInput(String usEmail){
        getDriver().findElement(emailInput).sendKeys(usEmail);
    }
    public void sendCurrentAddressInput(String cAddress){
        getDriver().findElement(currentAddressInput).sendKeys(cAddress);
    }
    public void sendPermanentAddressInput(String pAddress) {
        getDriver().findElement(permanentAddressInput).sendKeys(pAddress);
    }
    public void clickSubmitButton(){
        getDriver().findElement(submitButton).submit();
    }

    public void validations( String expectedName, String expectedEmail, String expectedCurrentAddress, String expectedParentAddress){
        assertEquals(getDriver().findElement(fullNameValidation).getText(), expectedName);
        assertEquals(getDriver().findElement(emailValidation).getText(), expectedEmail);
        assertEquals(getDriver().findElement(currentAddressValidation).getText(), expectedCurrentAddress);
        assertEquals(getDriver().findElement(permanentAddressValidation).getText(), expectedParentAddress);
    }
}
