package PageObjects;

import org.example.Utils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class MainPage {
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructors;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsHeader;

    @FindBy(xpath ="html/body/section[1]/div/div/div/a" )
    private  WebElement enrollmentButton;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;

    @FindBy(xpath ="/html/body/section[2]/div/div/div/input")
    private WebElement newsletterTextBox;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath ="/html/body/section[3]/div/div/div[3]/div/div/a" )
    private WebElement readMoreForInPersonLink;

    @FindBy(xpath ="//section[@class='p-5'][1]" )
    private WebElement coursesTypesSection;

    @FindBy(xpath ="//section[@id='learn-selenium']" )
    private WebElement learnSeleniumSection;

    @FindBy(xpath = "/html/body/h1")
    private  WebElement courseTypeHeader;

    @FindBy(xpath ="/html/body/section[3]/div/div/div[2]/div/div/a" )
    private WebElement readMoreForHybridLink;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private  WebElement readMoreForVirtualLink;

    @FindBy(xpath = "/html/body/a")
    private  WebElement mainPageLink;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private  WebElement readMoreForLearnSeleniumLink;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement clickOnQuestionsLink;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private  WebElement howDoISignUpButton;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement whereIsYourInstitutionLocatedButton;

    @FindBy(xpath = "//div[@id=\"question-four\"]")
    private WebElement howDoISignUpText;

   @FindBy(xpath = "//div[@id=\"question-one\"]")
    private WebElement whereIsYourInstitutionLocatedText;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement questionsSection;

    @FindBy(xpath ="//*[@id=\"instructors\"]/div/div/div[1]/div/div/a[1]" )


    private WebDriver driver;



    public MainPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnInstructors() {
        instructors.click();
    }

    public String getInstructorsHeader(){
        return this.instructorsHeader.getText();
    }

    public void clickOnStartTheEnrollment() {
        this.enrollmentButton.click();
    }

    public String getPersonalInformationHeader() {
        return this.personalInformationHeader.getText();
    }

    public void writeEmailInNewsletterTextBox(String email){
        newsletterTextBox.sendKeys(email);
    }

    public void clickOnSubmit(){
        submitButton.click();
    }

    public boolean isNewsletterTextBoxWithError() {
        String classCss = getCssClassForElement(newsletterTextBox);
        return "form-control error".equals(classCss);
    }

    private String getCssClassForElement(WebElement element)
    {
        return element.getAttribute("class");
    }

    public boolean popUpAppears() {
        try{
            this.driver.switchTo().alert();
            // If it reaches here, it found a popup
            return true;
        } catch(NoAlertPresentException e){
            return false;
        }
    }

    public void clickOnReadMoreForInPerson() {
        Utils.scrollToElement(driver, coursesTypesSection);
        readMoreForInPersonLink.click();
    }

    public String getCourseTypeHeader() {
        return this.courseTypeHeader.getText();
    }
    public boolean isVisibleHowDoISignUpText(){
        String CssClass=getCssClassForElement(howDoISignUpText);
        return "accordion-collapse collapse show".equals(CssClass);
    }
    public boolean isVisibleWhereIsYourInstitutionLocatedText(){
        String CssClass=getCssClassForElement(whereIsYourInstitutionLocatedText);
        return "accordion-collapse collapse show".equals(CssClass);

    }

    public void clickOnReadMoreForHybrid() {
        Utils.scrollToElement(driver,coursesTypesSection);
        readMoreForHybridLink.click();
    }

    public void clickOnReadMoreForVirtual() {
        Utils.scrollToElement(driver,coursesTypesSection);
        readMoreForVirtualLink.click();
    }

    public void clickOnReadMoreForLearnSelenium() {
        Utils.scrollToElement(driver,learnSeleniumSection);
        readMoreForLearnSeleniumLink.click();
    }

    public void iClickOnTheQuestionsButton() {
        clickOnQuestionsLink.click();
    }

    public void iClickOnHowDoISignUp (){
        Utils.scrollToElement(driver,questionsSection);
        howDoISignUpButton.click();
    }

    public void iClickOnWhereIsYourInstitutionLocated (){
        Utils.scrollToElement(driver,questionsSection);
        whereIsYourInstitutionLocatedButton.click();
    }

}
