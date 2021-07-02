package com.demoqa.automation.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoqa.com/upload-download")
public class UploadPage extends PageObject {
    //Mapeo botones
    public By uploadFile = By.id("uploadFile");
    public By downLoadFile = By.id("downloadButton");

    public void setUploadFile(String absolutePath){
        getDriver().findElement(uploadFile).sendKeys(absolutePath);
    }
    public void setDownLoadFile(){
        getDriver().findElement(downLoadFile).submit();
    }
}
