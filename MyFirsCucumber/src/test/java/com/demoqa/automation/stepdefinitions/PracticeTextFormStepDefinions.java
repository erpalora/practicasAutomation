package com.demoqa.automation.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PracticeTextFormStepDefinions {
    public WebDriver driver;

    @Given("^that a web user wants to fills fields in the text box page$")
    public void thatAWebUserWantsToFillsFieldsInTheTextBoxPage() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoqa.com/text-box");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() {
        assertEquals(driver.findElement(By.xpath("//div[text()='Text Box']")).getText(),"Text Box");
        driver.findElement(By.id("userName")).sendKeys("Erica Paola Lozano");
        driver.findElement(By.id("userEmail")).sendKeys("erpalora@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Calle 44#23-65");
        driver.findElement(By.id("permanentAddress")).sendKeys("Calle 44#23-65 apto 201");
        driver.findElement(By.id("submit")).submit();
    }

    @Then("^he should see him data down$")
    public void heShouldSeeHimDataDown() {
        driver.quit();
    }

}
