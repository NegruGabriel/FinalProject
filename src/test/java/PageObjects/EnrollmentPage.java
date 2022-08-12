package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement cardHolderNamePlaceHolder;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input" )
    private WebElement cardNumberPlaceHolder;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input" )
    private WebElement cvcPlaceHolder;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private  WebElement  nextButtonForPersonalInformationButton;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButtonForContactInformationButton;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[1]/div[1]/div" )
    private  WebElement firstNameErrorMessage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/div[2]/div")
    private WebElement lastNameErrorMessage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;

    @FindBy(xpath ="//*[@id=\"flexRadioButton1\"]" )
    private WebElement softwareTestingManualTesterCertificateOptionRadioButton;

    @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]" )
    private WebElement softwareTestingAutomationTesterCertificateOptionRadioButton;

    @FindBy(xpath ="//*[@id=\"flexRadioButton3\"]")
    private WebElement softwareTestingAutomationManualTesterCertificateOptionRadioButton;

    @FindBy(xpath ="//*[@id=\"flexRadioButton4\"]")
    private WebElement softwareTestingSecurityTesterCertificateOptionRadioButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]" )
    private  WebElement nextButtonForCourseOptionsButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButtonFromPaymentInformationSectionButton;

    @FindBy(xpath="/html/body/div/div/section/div/form/div[3]")
    private WebElement courseOptionsStep;

    @FindBy(xpath="/html/body/div/div/section/div/form/div[4]/div[4]/button[1]")
    private WebElement previousButtonFromPaymentInformationSectionButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[1]/label")
    private WebElement labelSoftwareTestingManualTesterCertificateLabel;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[3]/div[2]/label" )
    private WebElement labelSoftwareTestingAutomationTesterCertificateLabel;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[3]/label")
    private WebElement labelSoftwareTestingAutomationManualTesterCertificateLabel;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[4]/label")
    private WebElement labelSoftwareTestingSecurityTesterCertificateLabel;

    @FindBy(xpath ="/html/body/div/div/section/div/form/div[4]/h3" )
    private WebElement paymentInformationHeaderVisible;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement successHeaderVisible;

    @FindBy(xpath ="//select[@id=\"month\"]" )
    private WebElement monthOption;

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement yearOption;



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


   public void writeInPostCodePlaceHolder(String postCode){
        postCodePlaceHolder.sendKeys(postCode);
   }
   public  void clickOnSoftwareTestingManualTesterCertificateOption(){
       softwareTestingManualTesterCertificateOptionRadioButton.click();
   }
   public void clickOnSoftwareTestingAutomationTesterCertificateOption(){
       softwareTestingAutomationTesterCertificateOptionRadioButton.click();
   }

    public void clickOnSoftwareTestingAutomationManualTesterCertificateOption(){
        softwareTestingAutomationManualTesterCertificateOptionRadioButton.click();
    }

    public void clickOnSoftwareTestingSecurityTesterCertificateOption(){
        softwareTestingSecurityTesterCertificateOptionRadioButton.click();
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

    public void clickOnNextButtonForPersonalInformation(){
        nextButtonForPersonalInformationButton.click();
    }
    public void clickOnNextButtonForContactInformation(){
        nextButtonForContactInformationButton.click();
    }
    public  void clickOnNextButtonForCourseOptions(){
        nextButtonForCourseOptionsButton.click();
    }
    public void clickOnNextButtonFromPaymentInformationSection(){
        nextButtonFromPaymentInformationSectionButton.click();
    }
    public void clickOnPreviousButtonFromPaymentInformationSection(){
        previousButtonFromPaymentInformationSectionButton.click();
    }

    public void clickOnMonthOptionFromPaymentInformationSection(String month){
        Select select =new Select(monthOption);
        select.selectByVisibleText(month);
    }

    public void clickOnYearFromPaymentInformationSection(String year){
       Select select =new Select(yearOption);
       select.selectByVisibleText(year);
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

    public boolean isSoftwareTestingManualOptionSelected() {
        return softwareTestingAutomationManualTesterCertificateOptionRadioButton.isSelected();
    }
    public boolean isSoftwareTestingAutomationOptionSelected(){
        return softwareTestingAutomationTesterCertificateOptionRadioButton.isSelected();
    }
    public boolean isSoftwareSecurityOptionSelected(){
        return softwareTestingSecurityTesterCertificateOptionRadioButton.isSelected();
    }
    public boolean isSoftwareTestingAutomationManualOptionSelected() {
        return softwareTestingAutomationManualTesterCertificateOptionRadioButton.isSelected();
    }
    public boolean isCourseOptionsStepVisible(){
        return courseOptionsStep.isDisplayed();
    }

    public boolean isLabelSoftwareTestingManualTesterCertificateVisible(){
        return labelSoftwareTestingManualTesterCertificateLabel.isDisplayed();
    }
public boolean isLabelSoftwareTestingAutomationTesterCertificateVisible(){
        return labelSoftwareTestingAutomationTesterCertificateLabel.isDisplayed();

}
public boolean isLabelSoftwareTestingAutomationManualTesterCertificateVisible() {
        return labelSoftwareTestingAutomationManualTesterCertificateLabel.isDisplayed();
    }
    public boolean isLabelSoftwareSecurityTesterCertificateVisible() {
        return labelSoftwareTestingSecurityTesterCertificateLabel.isDisplayed();
    }
 public boolean inPaymentInformationHeaderVisible(){
        return paymentInformationHeaderVisible.isDisplayed();
 }

 public boolean inSuccessHeaderVisible(){
        return successHeaderVisible.isDisplayed();
 }

}

