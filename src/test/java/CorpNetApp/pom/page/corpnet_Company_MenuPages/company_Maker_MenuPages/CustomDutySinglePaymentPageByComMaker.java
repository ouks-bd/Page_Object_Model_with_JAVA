package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomDutySinglePaymentPageByComMaker extends BaseTest {

    public String DpdcBatchRef;

    @FindBy(id = "dynamic_customsOfficeCode")
    WebElement customOfiiceCodeEl;

    @FindBy(id="dynamic_registrationNumber")
    WebElement registrationNumberEl;

    @FindBy(id = "dynamic_registrationYear")
    WebElement registrationYearEl;

    @FindBy(id = "dynamic_declarantCode")
    WebElement declarantCodeEl;

    @FindBy(id = "dynamic_mobileNumber")
    WebElement mobileNumberEl;

    @FindBy(id="dynamic_amount")
    WebElement amountEl;

    @FindBy(id = "dynamic_documentType")
    WebElement documentTypeEl;

    @FindBy(id = "dynamic_documentRefNo")
    WebElement documentRefNoEl;

    @FindBy(id = "dynamic_remarks")
    WebElement remarksEl;

    @FindBy(css = "button[type='submit']")
    WebElement submitButtonEl;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    WebElement selectBatchEl;

    @FindBy(name = "submit")
    WebElement confirmButtonEl;

    @FindBy(id = "submitButton")
    WebElement finalSubmitButtonEl;


    public CustomDutySinglePaymentPageByComMaker() {
        PageFactory.initElements(driver, this);
    }


    public CustomDutySinglePaymentPageByComMaker customOfiiceCode() {

        customOfiiceCodeEl.isDisplayed();
        new Select(customOfiiceCodeEl).selectByValue("101|101 : Dhaka Customs House");
        return this;
    }


    public CustomDutySinglePaymentPageByComMaker registrationNumber() {

        registrationNumberEl.isDisplayed();
        registrationNumberEl.sendKeys("567878484");
        return this;
    }

    public CustomDutySinglePaymentPageByComMaker registrationYear() {

        registrationYearEl.isDisplayed();
        new Select(registrationYearEl).selectByValue("2023|2023");
        return this;
    }

    public CustomDutySinglePaymentPageByComMaker declarantCode() {

        declarantCodeEl.isDisplayed();
        declarantCodeEl.sendKeys("567878484");
        return this;
    }
    public CustomDutySinglePaymentPageByComMaker mobileNumber() {

        mobileNumberEl.isDisplayed();
        mobileNumberEl.sendKeys("01789090989");
        return this;
    }
    public CustomDutySinglePaymentPageByComMaker amount() {

        amountEl.isDisplayed();
        amountEl.sendKeys("1000");
        return this;
    }

    public CustomDutySinglePaymentPageByComMaker documentType() {

        documentTypeEl.isDisplayed();
        new Select(documentTypeEl).selectByValue("LC|LC");
        return this;
    }

    public CustomDutySinglePaymentPageByComMaker documentref() {

        documentRefNoEl.isDisplayed();
        documentRefNoEl.sendKeys("7867");
        return this;
    }

    public CustomDutySinglePaymentPageByComMaker remarks() {

        remarksEl.isDisplayed();
        remarksEl.sendKeys("Test");
        return this;
    }

    public CustomDutySinglePaymentPageByComMaker submitButton() {

        submitButtonEl.isDisplayed();
        submitButtonEl.click();
        return this;
    }

    public CustomDutySinglePaymentPageByComMaker confirmButton() throws InterruptedException {

        selectBatchEl.isDisplayed();
        DpdcBatchRef = selectBatchEl.getText();

        System.out.println("Payment id "+DpdcBatchRef);
        Thread.sleep(3000);
        confirmButtonEl.isDisplayed();
        confirmButtonEl.click();

        Thread.sleep(8000);

        return this;
    }

    public CustomDutySinglePaymentPageByComMaker finalsubmitButton() throws InterruptedException {

        finalSubmitButtonEl.isDisplayed();
        finalSubmitButtonEl.click();
        Thread.sleep(3000);


        return this;
    }
}
