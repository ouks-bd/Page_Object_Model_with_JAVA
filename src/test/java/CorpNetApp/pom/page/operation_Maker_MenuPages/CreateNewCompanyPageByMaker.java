package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class CreateNewCompanyPageByMaker extends BaseTest {

    public String company;


    @FindBy(id = "company_name")
    WebElement FillCompanyEl;

    @FindBy(id = "company_phone")
    WebElement FillPhoneEl;

    @FindBy(id = "company_code")
    WebElement FillCompanyCodeEl;

    @FindBy(id = "company_email")
    WebElement FillCompanyEmailEl;


    @FindBy(id = "company_address")
    WebElement FillAddressEl;

    @FindBy(id = "employerCIF")
    WebElement FillEmpCifEl;

    @FindBy(id = "contactPerson")
    WebElement FillContactPersonEl;

    @FindBy(id = "contactNumber")
    WebElement FillContactPerNoEl;

    @FindBy(css = "label.radio-inline:nth-child(4) > input:nth-child(1)")
    WebElement ClickBothComRadioEl;

    @FindBy(name = "employerId")
    WebElement fillEmpIdEl;

    @FindBy(id = "rm")
    WebElement fillRmEl;
    @FindBy(id = "createCompanyButton")
    WebElement ClickCreateBtnEl;

    @FindBy(css = "h1.card-title > label")
    WebElement getMessage;
    // public static String ActualTitle  =driver.findElement(By.cssSelector("h1.card-title > label")).getText();
    //String ActualTitle = driver.findElement(By.cssSelector("h1.card-title > label")).getText();

    public CreateNewCompanyPageByMaker() {
        PageFactory.initElements(driver, this);
    }


    public CreateNewCompanyPageByMaker fillCompanyName() {

        //String generatedString = RandomStringUtils.randomNumeric(2);
        String company = getCompanyName();
        FillCompanyEl.isDisplayed();
        FillCompanyEl.clear();
        FillCompanyEl.sendKeys(getCompanyName());

        System.out.println("Company Name :- " + company);
        return this;
    }

    public CreateNewCompanyPageByMaker fillCompanyPhone(String phn) {
        FillPhoneEl.isDisplayed();
        FillPhoneEl.clear();
        FillPhoneEl.sendKeys(phn);
        return this;

    }

    public CreateNewCompanyPageByMaker fillCompanyCode() {
        // int generatedNumber=Random
        Random random = new Random();
        int randomInt = random.nextInt(7896);
        //int randomNumber=randomNum;
        FillCompanyCodeEl.isDisplayed();
        FillCompanyCodeEl.clear();
        FillCompanyCodeEl.sendKeys(String.valueOf(randomInt));
        return this;
    }

    public CreateNewCompanyPageByMaker fillCompanyEmail(String email) {
        FillCompanyEmailEl.isDisplayed();
        FillCompanyEmailEl.clear();
        FillCompanyEmailEl.sendKeys(getComEmail());
        return this;
    }

    public CreateNewCompanyPageByMaker fillAddress(String address) {
        FillAddressEl.isDisplayed();
        FillAddressEl.clear();
        FillAddressEl.sendKeys(address);
        return this;
    }

    public CreateNewCompanyPageByMaker fillCompanyCif(String comCif) {
        FillEmpCifEl.isDisplayed();
        FillEmpCifEl.clear();
        FillEmpCifEl.sendKeys(comCif);
        return this;
    }

    public CreateNewCompanyPageByMaker fillContactPerson(String contactPerson) {
        FillContactPersonEl.isDisplayed();
        FillContactPersonEl.clear();
        FillContactPersonEl.sendKeys(contactPerson);
        return this;
    }

    public CreateNewCompanyPageByMaker fillContactPhn(String contactPersonPhn) {
        FillContactPerNoEl.isDisplayed();
        FillContactPerNoEl.clear();
        FillContactPerNoEl.sendKeys(contactPersonPhn);
        return this;
    }

    public CreateNewCompanyPageByMaker ClickRadioButton() {
        ClickBothComRadioEl.isDisplayed();
        ClickBothComRadioEl.click();
        return this;
    }

    public CreateNewCompanyPageByMaker FillEmpId() {

        Random random = new Random();
        int EmpId = random.nextInt(7865);
        fillEmpIdEl.isDisplayed();
        fillEmpIdEl.clear();
        fillEmpIdEl.sendKeys(String.valueOf(EmpId));
        return this;
    }

    public CreateNewCompanyPageByMaker fillRm(String rm) {
        fillRmEl.isDisplayed();
        fillRmEl.clear();
        fillRmEl.sendKeys(rm);
        return this;
    }

    public CreateNewCompanyPageByMaker ClickCreateBtn() {
        ClickCreateBtnEl.isDisplayed();
        ClickCreateBtnEl.click();

        return this;
    }


}
