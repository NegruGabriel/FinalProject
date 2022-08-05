package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();

    private MainPage mainPage;
    private HybridPage hybridPage;
    private InPersonPage inPersonPage;
    private VirtualPage virtualPage;
    private LearnSeleniumPage learnSeleniumPage;



    public StepDefinitions() {


        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        hybridPage = new HybridPage(driver);
        inPersonPage = new InPersonPage(driver);
        virtualPage = new VirtualPage(driver);
        learnSeleniumPage = new LearnSeleniumPage(driver);
    }

    @Given("I am on Main Page")
    public void onTheMainPage() {
        driver.get(Utils.getMainPageUrl());
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

    }

    @Then("I am redirected on the Sign Up Page")
    public void iAmRedirectedOnTheSignUpPage() {
        Assert.assertEquals("Personal information", mainPage.getPersonalInformationHeader());
    }

    @When("I enter an invalid mail")
    public void iEnterAnInvalidMail() {
        mainPage.writeEmailInNewsletterTextBox("asdg@.com");
    }

    @And("click on Submit")
    public void clickOnSubmit() {
        mainPage.clickOnSubmit();
    }

    @Then("a red border will be shown")
    public void aRedBorderWillBeShown() {
      Assert.assertEquals(true, mainPage.isNewsletterTextBoxWithError());
    }

    @When("I enter a valid mail")
    public void iEnterAValidMail() {
        mainPage.writeEmailInNewsletterTextBox("asdf@yahoo.com");
    }

    @Then("a confirmation message appears")
    public void aConfirmationMessageAppears() {
     Assert.assertEquals(true,  mainPage.popUpAppears());
    }

    @When("I click on the Read More button from the In Person section")
    public void iClickOnTheReadMoreButtonFromTheInPersonSection() {
        mainPage.clickOnReadMoreForInPerson();
    }

    @Then("I will be redirected to the In Person Page")
    public void iWillBeRedirectedToTheInPersonPage() {
        Assert.assertEquals("In Person", mainPage.getCourseTypeHeader());
    }


    @When("I click on the Read More button from the Hybrid section")
    public void iClickOnTheReadMoreButtonFromTheHybridSection() {
        mainPage.clickOnReadMoreForHybrid();
    }

    @Then("I will be redirected to the Hybrid Page")
    public void iWillBeRedirectedToTheHybridPage() {
        Assert.assertEquals("Hybrid",mainPage.getCourseTypeHeader());
    }

    @When("I click on the Read More button from the Virtual section")
    public void iClickOnTheReadMoreButtonFromTheVirtualSection() {

        mainPage.clickOnReadMoreForVirtual();
    }

    @Then("I will be redirected to the Virtual Page")
    public void iWillBeRedirectedToTheVirtualPage() {
        Assert.assertEquals("Virtual",mainPage.getCourseTypeHeader());
    }


    @When("I click on the Read More from Learn Selenium")
    public void iClickOnTheReadMoreFromLearnSelenium() {
        mainPage.clickOnReadMoreForLearnSelenium();
    }

    @Then("I will redirected to Fundamentals page")
    public void iWillRedirectedToFundamentalsPage() {
        Assert.assertEquals("Fundamentals page", mainPage.getCourseTypeHeader());
    }

    @When("I click on the Questions Button")
    public void iClickOnTheQuestionsButton() {
        mainPage.iClickOnTheQuestionsButton();
    }
    
    @And("I click on {string}")
    public void iClickOn(String question) {
        if (question.equals("How do I sign up?")) {
            mainPage.iClickOnHowDoISignUp();
    }else if (question.equals("Where is your institution located?")) {
            mainPage.iClickOnWhereIsYourInstitutionLocated();
        }
    }


    @Then("the Sign Up answer will appear")
    public void theSignUpAnswerWillAppear() {
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(true,mainPage.isVisibleHowDoISignUpText());

    }
    @Then("the institution answer will appear")
    public void theInstitutionAnswerWillAppear() {
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(true,mainPage.isVisibleWhereIsYourInstitutionLocatedText());

    }

    @Given("I am on Hybrid Page")
    public void iAmOnHybridPage() {
        driver.get("file:///C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/routes/hybrid.html");
    }

    @When("I click on the Return button from Hybrid")
    public void iClickOnReturnButton() {
        hybridPage.clickOnReturnButton();
    }

    @Then("I will be redirected to the Main Page")
    public void iWillBeRedirectedToTheMainPage() {
        Assert.assertEquals("file:///C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/index.html", driver.getCurrentUrl());
    }

    @Given("I am on the In Person Page")
    public void iAmOnTheInPersonPage() {
        driver.get("C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/routes/in_person.html");
    }

    @When("I click on the Return button from In Person")
    public void iClickOnTheReturnButtonFromInPerson() {
        inPersonPage.clickOnReturnButton();
    }

    @Given("I am on Virtual Page")
    public void iAmOnVirtualPage() {
        driver.get("file:///C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/routes/virtual.html");
    }

    @When("I click on the Return button from Virtual")
    public void iClickOnReturnButtonFromVirtualPage() {

        virtualPage.clickOnReturnButton();
    }

    @Given("I am on Instructors Page")
    public void iAmOnInstructorsPage() {
        driver.get("C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/index.html#instructors");

    }



    @When("I click on John Doe Twitter page")
    public void iClickOnJohnDoeTwitterPage() {
        mainPage.clickOnJohnDoeTwitterLink();
    }

    @Then("I will redirected to Twitter page")
    public void iWillRedirectedToTwitterPage() {
        Assert.assertEquals("https://twitter.com/", driver.getCurrentUrl());
    }

    @And("I click on Jane Doe LinkedIn page")
    public void iClickOnJaneDoeLinkedInPage() {
        mainPage.clickOnJaneDoeLinkedInLink();
    }

    @Then("I will redirected to LinkedIn page")
    public void iWillRedirectedToLinkedInPage() {
        Assert.assertEquals("https://www.linkedin.com/feed/",driver.getCurrentUrl() );
    }

    @And("I click on Sara Smith Instagram page")
    public void iClickOnSaraSmithInstagramPage() {
        mainPage.clickOnSaraSmithInstagramPage();
    }

    @Then("I will redirected to Instagram page")
    public void iWillRedirectedToInstagramPage() {
        Assert.assertEquals("https://www.instagram.com/",driver.getCurrentUrl());
    }

    @And("I click on Steve Smith FB page")
    public void iClickOnSteveSmithFBPage() {
        mainPage.clickOnSteveSmithFbPage();
    }

    @Then("I will redirected to FB page")
    public void iWillRedirectedToFBPage() {
        Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());
    }

    @Given("I am on Fundamentals page from Learn Selenium")
    public void iAmOnFundamentalsPageFromLearnSelenium() {
        driver.get("file:///C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/routes/fundamentals.html");
    }


    @When("I click on Return from Learn Selenium")
    public void iClickOnReturnFromLearnSelenium() {
        learnSeleniumPage.clickOnReturnButton();

    }

    @Then("I will redirected to Main page")
    public void iWillRedirectedToMainPage() {
        Assert.assertEquals("file:///C:/Users/Admin/Downloads/Testing-Env-master/Testing-Env-master/index.html", driver.getCurrentUrl());
    }
}