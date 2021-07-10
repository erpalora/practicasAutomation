package com.demoqa.automation.pageobjects;


import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.*;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;


@DefaultUrl("https://www.demoqa.com/automation-practice-form")

public class PracticeFormPage extends PageObject {
    //Mapeo de los campos del formulario
    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By emailInput = By.id("userEmail");
    public By genderRatioInput = By.id("gender-radio-1");
    public By mobileNumberInput = By.id("userNumber");
    public By dateOfBirthInput = By.id("dateOfBirthInput");
    public By subjectInput = By.id("subjectsContainer");
    public By hobbiesInput = By.id("hobbies-checkbox-1");
    public By uploadPicture = By.id("uploadPicture");
    public By currentAddressInput = By.id("currentAddress");
    public By stateInput = By.id("react-select-3-input");
    public By cityInput = By.id("react-select-4-input");
    public By submitButton = By.id("submit");

    public void setFirstNameInput(String fName){
        getDriver().findElement(firstNameInput).sendKeys(fName);
    }
    public void setLastNameInput(String lName){
        getDriver().findElement(lastNameInput).sendKeys(lName);
    }
    public void setEmailInput(String email){
        getDriver().findElement(emailInput).sendKeys(email);
    }

    public void setMobileNumberInput(String mobileN){
        getDriver().findElement(mobileNumberInput).sendKeys(mobileN);
    }

    public void setDateOfBirthInput(String birthDay){
     getDriver().findElement(dateOfBirthInput).sendKeys(Keys.chord(Keys.CONTROL, "a"),birthDay,Keys.ENTER);
    }

    public void setSubjectInput(String subjectI){
        getDriver().findElement(subjectInput).sendKeys(Keys.chord(Keys.CONTROL, "a"),subjectI,Keys.TAB);
    }

    public void setUploadPicture(String absolutePath) throws InterruptedException {
        //loading image from a project folder
        URL url = getClass().getClassLoader().getResource(absolutePath);
        File file = null;
        try {
            file = new File(url.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        getDriver().findElement(uploadPicture).sendKeys(file.getAbsolutePath());
        Times.waitFor(2000);
    }
    public void setCurrentAddressInput(String currentA) {
        getDriver().findElement(currentAddressInput).sendKeys(currentA);
    }
    public  void setStateInput(String state){
    getDriver().findElement(stateInput).sendKeys(state,Keys.TAB);
    }
    public  void setCityInput(String city){
        getDriver().findElement(stateInput).sendKeys(city,Keys.TAB);
    }
    public void validationsForm(){
    }
}


