package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("en-US"));

    private String name, email, lastName,currentAddress,
            permanentAddress, extensionName, extensionEmail,
            extensionCurrentAddress, extensionPermanentAddress;

    public String getName() {
        return name;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getExtensionEmail() {
        return extensionEmail;
    }

    public String getExtensionCurrentAddress() {
        return extensionCurrentAddress;
    }

    public String getExtensionPermanentAddress() {
        return extensionPermanentAddress;
    }

    public DataInjection(){
        //dynamic data for text box page
        this.name = faker.name().name();
        this.email = faker.internet().emailAddress();
        this.lastName = faker.name().lastName();
        this.currentAddress = faker.address().secondaryAddress();
        this.permanentAddress = faker.address().fullAddress();
        this.extensionName = "Name:";
        this.extensionEmail = "Email:";
        this.extensionCurrentAddress = "Current Address :";
        this.extensionPermanentAddress = "Permananet Address :";

        // data injection dynamic and static data for practice form

        this.fName = faker.name().firstName();
        this.lastNameF = faker.name().lastName();
        this.emailF = faker.internet().emailAddress();
        this.mobile = "3014042552";
        this.dateBirth = "05 jUN 2021";
        this.subject ="English";
        this.currentAd = faker.address().fullAddress();
        this.imageUpload ="images\\ericaImg.jpg";
    }

    // practice Form dataInjection

    private String fName, lastNameF, emailF, mobile, dateBirth, subject, hobbies, currentAd, imageUpload;
     public String getFName(){ return fName; }
     public String getLastNameF(){ return lastNameF; }
     public String getEmailF(){ return emailF; }
     public String getMobile(){ return mobile; }
     public String getDateBirth(){ return dateBirth; }
     public String getSubject(){ return subject; }
     public String getHobbies(){ return hobbies; }
     public String getCurrentAd(){ return currentAd; }
     public String getImageUpload(){return imageUpload;}
}
