package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNamePlaceHolder;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNamePlaceHolder;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNamePlaceHolder;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordPlaceHolder;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordPlaceHolder;

    @FindBy(xpath ="//*[@id=\"email\"]")
    private WebElement emailPlaceHolder;

    @FindBy(xpath ="//*[@id=\"phone\"]")
    private WebElement phonePlaceHolder;

    @FindBy(xpath ="//*[@id=\"country\"]")
    private WebElement countryPlaceHolder;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityPlaceHolder;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodePlaceHolder;

    @FindBy(xpath ="//*[@id=\"flexRadioButton1\"]")
    private WebElement softwareTestingManualTesterCertificate;

    @FindBy(xpath ="//*[@id=\"flexRadioButton2\"]")
    private WebElement softwareTestingAutomationTesterCertificate;

    @FindBy(xpath ="//*[@id=\"flexRadioButton3\"]")
    private WebElement softwareTestingAutomationManualTesterCertificate;

    @FindBy(xpath ="//*[@id=\"flexRadioButton4\"]")
    private WebElement softwareTestingSecurityTesterCertificate;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderNamePlaceHolder;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input" )
    private WebElement cardNumberPlaceHolder;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input" )
    private WebElement cvcPlaceHolder;


    public EnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void clickOnFirstNamePlaceHolder() {
        firstNamePlaceHolder.click();
    }

    public void clickOnLastNamePlaceHolder() {
        lastNamePlaceHolder.click();
    }


    public void clickOnUserNamePlaceHolder() {
        userNamePlaceHolder.click();
    }

    public void clickOnPasswordPlaceHolder() {
        passwordPlaceHolder.click();
    }

    public void clickOnConfirmPasswordPlaceHolder() {
        confirmPasswordPlaceHolder.click();
    }

    public void clickOnEmailPlaceHolder (){
        emailPlaceHolder.click();
    }

   public  void clickOnPhonePlaceHolder(){
        phonePlaceHolder.click();
   }

   public void clickOnCountryPlaceHolder(){
        countryPlaceHolder.click();
   }

   public void clickOnCityPlaceHolder(){
        cityPlaceHolder.click();
   }

   public void clickOnPostCodePlaceHolder(){
        postCodePlaceHolder.click();
   }
   public  void clickOnSoftwareTestingManualTesterCertificate(){
       softwareTestingManualTesterCertificate.click();
   }
   public void clickOnSoftwareTestingAutomationTesterCertificate(){
       softwareTestingAutomationTesterCertificate.click();
   }

    public void clickOnSoftwareTestingAutomationManualTesterCertificate(){
        softwareTestingAutomationManualTesterCertificate.click();
    }

    public void clickOnSoftwareTestingSecurityTesterCertificate(){
        softwareTestingSecurityTesterCertificate.click();
    }

    public void clickOnCardHolderNamePlaceHolder(){
        cardHolderNamePlaceHolder.click();
    }

    public void clickOnCardNumberPlaceHolder(){
        cardNumberPlaceHolder.click();
    }
    public void clickOnCvcPlaceHolder(){
        cvcPlaceHolder.click();
    }
}
