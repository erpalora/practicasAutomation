package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {
    //Created the driver object
    private WebDriver driver;

    // created the constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    //Click Method
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
