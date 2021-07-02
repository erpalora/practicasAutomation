package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.pageobjects.PracticeFormPage;
import com.demoqa.automation.steps.PracticeFormPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticeFormStepDefinitions {

    @Steps
    PracticeFormPageSteps  practiceFormPageSteps;

    @Given("^That the web user wants to practice the student registration form in demosqa$")
    public void thatTheWebUserWantsToPracticeTheStudentRegistrationFormInDemosqa() {
    practiceFormPageSteps.openBrowser();
    }


    @When("^he fills all the requested fields in the practice form$")
    public void heFillsAllTheRequestedFieldsInThePracticeForm() throws InterruptedException {
    practiceFormPageSteps.fillFieldsInTheFormPage();
    }

    @Then("^He can see the data result in a final table$")
    public void heCanSeeTheDataResultInAFinalTable() {

    }
}
