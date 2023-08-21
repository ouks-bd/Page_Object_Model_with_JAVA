package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DPDCBillPaymentPageByComMaker extends BaseTest {

    public String DpdcBatchRef;

    @FindBy(id = "dynamic_customer_number")
    WebElement customerNumberEl;

    @FindBy(id = "dynamic_amount")
    WebElement amountEl;

    @FindBy(id = "dynamic_remarks")
    WebElement remarkEl;

    @FindBy (css = ".btn.btn-primary.inquiry-button")
    WebElement validatebuttonEl;

    @FindBy(css = "button[type='submit']")
    WebElement submitButtonEl;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    WebElement selectBatchEl;

    @FindBy(name = "submit")
    WebElement confirmButtonEl;

    @FindBy(id = "submitButton")
    WebElement finalSubmitButtonEl;

    public DPDCBillPaymentPageByComMaker() {
        PageFactory.initElements(driver, this);
    }


    public DPDCBillPaymentPageByComMaker customerNumber() {

        customerNumberEl.isDisplayed();
        customerNumberEl.sendKeys("27223584");
        return this;
    }


    public DPDCBillPaymentPageByComMaker amount() {

        amountEl.isDisplayed();
        amountEl.sendKeys("5000");
        return this;
    }

    public DPDCBillPaymentPageByComMaker remarks() {

        remarkEl.isDisplayed();
        remarkEl.sendKeys("For_Test");
        return this;
    }

    public DPDCBillPaymentPageByComMaker validatebuttonClick() throws InterruptedException {

        validatebuttonEl.isDisplayed();
        validatebuttonEl.click();
        Thread.sleep(5000);
        return this;
    }

    public DPDCBillPaymentPageByComMaker submitButton() throws InterruptedException {

        submitButtonEl.isDisplayed();
        submitButtonEl.click();
        Thread.sleep(3000);


        return this;
    }

    public DPDCBillPaymentPageByComMaker confirmButton() throws InterruptedException {

        selectBatchEl.isDisplayed();
        DpdcBatchRef = selectBatchEl.getText();

        System.out.println("Payment id "+DpdcBatchRef);
        Thread.sleep(3000);
        confirmButtonEl.isDisplayed();
        confirmButtonEl.click();

        Thread.sleep(8000);

        return this;
    }

    public DPDCBillPaymentPageByComMaker finalsubmitButton() throws InterruptedException {

        finalSubmitButtonEl.isDisplayed();
        finalSubmitButtonEl.click();
        Thread.sleep(3000);


        return this;
    }
}
