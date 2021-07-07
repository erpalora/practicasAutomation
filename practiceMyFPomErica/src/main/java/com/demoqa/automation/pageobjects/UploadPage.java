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
        //download an image from absolute path
        getDriver().findElement(uploadFile).sendKeys(absolutePath);
    }
    public void setDownLoadFile(){
        //upload a file
        getDriver().findElement(downLoadFile).submit();
    }
}
