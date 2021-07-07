package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.PracticeFormPage;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class PracticeFormPageSteps {
    PracticeFormPage practiceFormpage = new PracticeFormPage();
    DataInjection dataInject = new DataInjection();

    @Step
    public void openBrowser() {
        practiceFormpage.open();
    }

    @Step
    public void fillFieldsInTheFormPage() throws InterruptedException {
        practiceFormpage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // fills fields whit data injection and dynamic data
        practiceFormpage.setFirstNameInput(dataInject.getFName());
        practiceFormpage.setLastNameInput(dataInject.getLastName());
        practiceFormpage.setEmailInput(dataInject.getEmailF());
        JavaScript.clickJS(practiceFormpage.getDriver(), practiceFormpage.genderRatioInput);
        practiceFormpage.setMobileNumberInput(dataInject.getMobile());
        practiceFormpage.setDateOfBirthInput("01 Jun 1988");
        JavaScript.clickJS(practiceFormpage.getDriver(), practiceFormpage.hobbiesInput);
        practiceFormpage.setUploadPicture(dataInject.getImageUpload());
        practiceFormpage.setCurrentAddressInput(dataInject.getCurrentAd());
        practiceFormpage.setStateInput("Haryana");
        practiceFormpage.setCityInput("Panipat");
        JavaScript.clickJS(practiceFormpage.getDriver(), practiceFormpage.submitButton);
        Times.waitFor(5000);
    }

}
