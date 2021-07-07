package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.pageobjects.TextBoxPage;
import com.demoqa.automation.steps.TextBoxPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticeTextBoxStepDefinitions {

    @Steps
    TextBoxPageSteps textBoxPageSteps;

    @Given("^that a web user wants to practice text box in demoqa$")
    public void thatAWebUserWantsToPracticeTextBoxInDemoqa() {
        textBoxPageSteps.openBrowser();

    }


    @When("^he fills all the requested fields in the text box section$")
    public void heFillsAllTheRequestedFieldsInTheTextBoxSection() throws InterruptedException {
        textBoxPageSteps.fillFieldInTheTextBoxPage();

    }

    @Then("^he should see hin data down$")
    public void heShouldSeeHinDataDown() {
        textBoxPageSteps.validationsTextBox();

    }
}
