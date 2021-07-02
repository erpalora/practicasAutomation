package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.PracticeFormPage;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class PracticeFormPageSteps {
    PracticeFormPage practiceFormpage = new PracticeFormPage();
    DataInjection dataInject = new DataInjection();

    @Step
    public void openBrowser(){ practiceFormpage.open(); }

    @Step
    public void fillFieldsInTheFormPage() throws InterruptedException {
        practiceFormpage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // fills fields whit data injection and dynamic data
        practiceFormpage.setFirstNameInput(dataInject.getFName());
        practiceFormpage.setLastNameInput(dataInject.getLastName());
        practiceFormpage.setEmailInput(dataInject.getEmailF());
        practiceFormpage.setGenderRatioInput(1);
        practiceFormpage.setMobileNumberInput(dataInject.getMobileNumber());
        practiceFormpage.setDateOfBirthInput("01 Jun 2020");
        practiceFormpage.setSubjectInput(dataInject.getSubject());
        practiceFormpage.setHobbiesInput(2);
        practiceFormpage.setUploadPicture("C:\\Users\\G525487\\Downloads\\ordenMedica.pdf");
        practiceFormpage.setCurrentAddressInput(dataInject.getCurrentAd());
        practiceFormpage.setStateInput();
        practiceFormpage.setCityInput();
        practiceFormpage.setSubmitButton();
    }
}
