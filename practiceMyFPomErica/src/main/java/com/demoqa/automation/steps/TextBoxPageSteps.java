package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.TextBoxPage;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class TextBoxPageSteps {
    TextBoxPage textBoxPage = new TextBoxPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){
        textBoxPage.open();
    }

    @Step
    public void fillFieldInTheTextBoxPage() throws InterruptedException {
        textBoxPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(5000);
        textBoxPage.sendFullNameInput(dataInjection.getName()+ " " + dataInjection.getLastName());
        textBoxPage.sendEmailInput(dataInjection.getEmail());
        textBoxPage.sendCurrentAddressInput(dataInjection.getCurrentAddress());
        textBoxPage.sendPermanentAddressInput(dataInjection.getPermanentAddress());
        Times.waitFor(1000);
        JavaScript.clickJS(textBoxPage.getDriver(), textBoxPage.submitButton);
    }

}
