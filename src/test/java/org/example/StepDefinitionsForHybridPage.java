package org.example;

import PageObjects.HybridPage;
import PageObjects.InPersonPage;
import PageObjects.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionsForHybridPage {
    private final WebDriver driver = new ChromeDriver();
    private HybridPage hybridPage;

    public StepDefinitionsForHybridPage() {
        driver.manage().window().maximize();
        hybridPage = new HybridPage(driver);
    }




    @Given("I am on Hybrid Page")
    public void iAmOnHybridPage() {
        driver.get("file:///C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/routes/hybrid.html");
    }

    @When("I click on return button")
    public void iClickOnReturnButton() {
        hybridPage.clickOnReturnButton();
    }

    @Then("I will be redirected to the Main Page from Hybrid Page")
    public void iWillBeRedirectedToTheMainPageFromHybridPage() {
        Assert.assertEquals(Utils.getMainPageUrl(), driver.getCurrentUrl());
    }
}