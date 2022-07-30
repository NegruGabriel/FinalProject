package org.example;

import PageObjects.MainPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();

    private MainPage mainPage;

    public StepDefinitions() {
        // Article: https://www.softwaretestingmaterial.com/implicit-waits-selenium-webdriver/
        // Implicit waits tell to the WebDriver to wait for certain amount of time before it
        // throws an exception. Once we set the time, WebDriver will wait for the element
        // based on the time we set before it throws an exception. The default setting is 0 (zero)
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
    }

    @Given("I am on Main Page")
    public void onTheMainPage() {
        driver.get("C:\\Users\\Admin\\Downloads\\Testing-Env-master\\Testing-Env-master\\index.html");
    }

    @When("I click on Instructors")
    public void clickOnInstructors() {
        mainPage.clickOnInstructors();
    }

    @Then("Our instructors header should appear")
    public void OurInstructorsHeaderShouldAppear() {
        Assert.assertEquals("Our Instructors", mainPage.getInstructorsHeader());
    }

    @After
    public void cleanUp() throws InterruptedException {
        // Wait 2 seconds before closing window
        Thread.sleep(3000);

        // Article about close and quit: https://artoftesting.com/difference-between-driver-close-and-driver-quit-command-in-selenium-webdriver
        driver.quit();
    }

    @When("I click on Start the Enrollment")
    public void iClickOnStartTheEnrollment() {
        mainPage.clickOnStartTheEnrollment();
        ///html/body/section[1]/div/div/div/a
    }

    @Then("I am redirected on the Sign Up Page")
    public void iAmRedirectedOnTheSignUpPage() {
        Assert.assertEquals("Personal information", mainPage.getPersonalInformationHeader());

    }
}