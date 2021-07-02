package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.pageobjects.UploadPage;
import com.demoqa.automation.steps.UploadPageSteps;
import com.demoqa.automation.utils.Times;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UploadStepDefinitions {
    @Steps
    UploadPageSteps uploadPageSteps;

    @Given("^The user needs upload a document in demoqa$")
    public void theUserNeedsUploadADocumentInDemoqa() {
        uploadPageSteps.openBrowser();

    }

    @When("^he selected the file to upload$")
    public void heSelectedTheFileToUpload() throws InterruptedException {
        uploadPageSteps.uploadFile();
        uploadPageSteps.downLoadFile();
    }

    @Then("^he can see the name of file in the page$")
    public void heCanSeeTheNameOfFileInThePage() {

    }

}
