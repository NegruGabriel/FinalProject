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

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private  WebElement  nextButton;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[1]/div[1]/div" )
    private  WebElement firstNameErrorMessage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[2]/div")
    private WebElement lastNameErrorMessage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;



    public EnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void writeInFirstNamePlaceHolder(String firstName) {
        firstNamePlaceHolder.sendKeys(firstName);
    }

    public void writeInLastNamePlaceHolder(String lastName) {
        lastNamePlaceHolder.sendKeys(lastName);
    }


    public void writeInUserNamePlaceHolder(String userName) {
        userNamePlaceHolder.sendKeys( userName);
    }

    public void writeInPasswordPlaceHolder(String password) {
        passwordPlaceHolder.sendKeys(password);
    }

    public void writeInConfirmPasswordPlaceHolder(String confirmPassword) {
        confirmPasswordPlaceHolder.sendKeys(confirmPassword);
    }

    public void writeInEmailPlaceHolder (String email){
        emailPlaceHolder.sendKeys(email);
    }

   public  void writeInPhonePlaceHolder(String phone){
        phonePlaceHolder.sendKeys(phone);
   }

   public void writeInCountryPlaceHolder(String country){
        countryPlaceHolder.sendKeys(country);
   }

   public void writeInCityPlaceHolder(String city){
        cityPlaceHolder.sendKeys(city);
   }

   public void clickOnPostCodePlaceHolder(String postCode){
        postCodePlaceHolder.sendKeys(postCode);
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

    public void writeInCardHolderNamePlaceHolder(String cardHolderName){
        cardHolderNamePlaceHolder.sendKeys(cardHolderName);
    }

    public void writeInCardNumberPlaceHolder(String cardNumber ){
        cardNumberPlaceHolder.sendKeys( cardNumber);
    }
    public void writeInCvcPlaceHolder(String cvc){
        cvcPlaceHolder.sendKeys(cvc);
    }

    public void clickOnNextButton(){
        nextButton.click();
    }

    public boolean isFirstNameErrorVisible() {
        String classCss = firstNameErrorMessage.getAttribute("class");
        return classCss.equals("error-message");

    }

    public boolean isFirstNameErrorCorrect() {
        String errorMessage = firstNameErrorMessage.getText();
        return errorMessage.equals("Your first name is required");
    }

    public boolean isLastNameErrorVisible() {
        String classCss = lastNameErrorMessage.getAttribute("class");
        return classCss.equals("error-message");

    }
    public boolean isLastNameErrorCorrect() {
        String errorMessage = lastNameErrorMessage.getText();
        return errorMessage.equals("Your last name is required");
    }

    public boolean isPersonalInformationHeaderVisible() {
        return personalInformationHeader.isDisplayed();
    }

    public boolean contactInformationHeader() {
        return contactInformationHeader.isDisplayed();
    }
}
