package org.example;

import PageObjects.InPersonPage;
import PageObjects.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionsForInPersonPage {
    private final WebDriver driver = new ChromeDriver();
    private InPersonPage inPersonPage;

    public StepDefinitionsForInPersonPage() {
        driver.manage().window().maximize();
        inPersonPage = new InPersonPage(driver);
    }

    @Given("I am on the In Person Page")
    public void iAmOnTheInPersonPage() {
        driver.get("C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/routes/in_person.html");
    }

    @When("I click on the Return button")
    public void iClickOnTheReturnButton() {
        inPersonPage.clickOnReturnButton();
    }

    @Then("I will be redirected to the Main Page from In Person Page")
    public void iWillBeRedirectedToTheMainPageFromInPersonPage() {
       Assert.assertEquals(Utils.getMainPageUrl(), driver.getCurrentUrl());
    }
}
