package com.demoqa.automation.pageobjects;

import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.*;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")

public class PracticeFormPage extends PageObject {
    //Mapeo de los campos del formulario
    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By emailInput = By.id("userEmail");
    public By genderRatioInput = By.id("genterWrapper");
    public By mobileNumberInput = By.id("userNumber");
    public By dateOfBirthInput = By.id("dateOfBirthInput");
    public By dataPickerMonth = By.xpath("//*[@class='react-datepicker__month-select']");
    public By dataPickerDay = By.xpath("//*[@class='react-datepicker__month']");
    public By dataPickerYear = By.xpath("//*[@class='react-datepicker__year-select']");
    public By subjectInput = By.id("subjectsContainer");
    public By hobbiesInput = By.id("hobbiesWrapper");
    public By uploadPicture = By.id("uploadPicture");
    public By currentAddressInput = By.id("currentAddress");
    public By stateInput = By.id("state");
    public By cityInput = By.id("city");
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
   /* public void setGenderRatioInput(int option) { }
   public void setGenderRatioInput(int option) throws InterruptedException {
       List<WebElement> radios = getDriver().findElements(genderRatioInput);
       if (option > 0 && option <= radios.size()) {
           radios.get(option - 1).click();
           Times.waitFor(5000);
       } else {
           throw new NotFoundException("option " + option + " not found");
       }
   }*/

    public void setMobileNumberInput(String mobileN){
        getDriver().findElement(mobileNumberInput).sendKeys(mobileN);

    }
    public void setDateOfBirthInput(String birthDay){
     getDriver().findElement(dateOfBirthInput).sendKeys(Keys.chord(Keys.CONTROL, "a"),birthDay,Keys.ENTER);
    }
    public void setSubjectInput(String subjectI){
        getDriver().findElement(subjectInput).sendKeys(Keys.chord(Keys.CONTROL, "a"),subjectI,Keys.ENTER);
    }
    /*public void setHobbiesInput(int rbutton) throws InterruptedException {
        List<WebElement> ratio = getDriver().findElements(genderRatioInput);
        if (rbutton > 0 && rbutton <= ratio.size()) {
            ratio.get(rbutton - 1);
            Times.waitFor(5000);
        } else {
            throw new NotFoundException("option " + rbutton + " not found");
        }
        getDriver().findElement(hobbiesInput).click();
    }*/
    public void setUploadPicture(String absolutePath) throws InterruptedException {
        getDriver().findElement(uploadPicture).sendKeys(absolutePath);
        Times.waitFor(2000);
    }
    public void setCurrentAddressInput(String currentA) throws InterruptedException {
        getDriver().findElement(currentAddressInput).sendKeys(currentA);
        Times.waitFor(2000);
    }
    public  void setStateInput(String state){
        getDriver().findElement(stateInput).sendKeys(Keys.chord(Keys.CONTROL, "a"),state,Keys.TAB);
    }
    public  void setCityInput(String city){
        getDriver().findElement(cityInput).sendKeys(city,Keys.TAB);
    }
    public void setSubmitButton(){
    }

}
