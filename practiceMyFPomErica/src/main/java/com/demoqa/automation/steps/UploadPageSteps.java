package com.demoqa.automation.steps;

import com.demoqa.automation.pageobjects.UploadPage;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;

public class UploadPageSteps {
    UploadPage uploadPage = new UploadPage();

    @Step
    public void openBrowser(){
        uploadPage.open();
    }

    @Step
    public void uploadFile() throws InterruptedException {
        uploadPage.setUploadFile("C:\\Users\\G525487\\Downloads\\ordenMedica.pdf");
        Times.waitFor(5000);
    }

    @Step
    public void downLoadFile() throws InterruptedException {
        JavaScript.clickJS(uploadPage.getDriver(), uploadPage.downLoadFile);
        Times.waitFor(5000);
    }
}
