package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages;

import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static CorpNetApp.pom.base.BaseTest.driver;

public class DPDCBillPaymentPageByComApprover {

    @FindBy(css = "input[aria-controls='dataTables-billPayment']")
    WebElement searchBoxEl;

    @FindBy (css = "button.btn-success[onclick*='approveClickForBillPayment']")
    WebElement authorizeButtonEl;

    @FindBy (id = "okModalYes")
    WebElement finalconfirmEl;

    @FindBy(xpath = "//tbody//tr//input[1]")
    WebElement firstOtpEl;

    @FindBy(xpath = "//tbody//tr//input[2]")
    WebElement seconedtOtpEl;

    @FindBy(xpath = "//tbody//tr//input[3]")
    WebElement thirdOtpEl;

    @FindBy(xpath = "//tbody//tr//input[4]")
    WebElement fourthOtpEl;

    @FindBy(xpath = "//tbody//tr//input[5]")
    WebElement fifthOtpEl;

    @FindBy(xpath = "//tbody//tr//input[6]")
    WebElement sixthOtpEl;

    @FindBy(id="approveLink")
    WebElement confirmButtonEl;



    public DPDCBillPaymentPageByComApprover() {
        PageFactory.initElements(driver, this);
    }

    public DPDCBillPaymentPageByComApprover searchDPDCBatchId(String dpdcRef) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));

        searchBoxEl.isDisplayed();
        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + dpdcRef);
        searchBoxEl.sendKeys(dpdcRef);

        Thread.sleep(2000);
        return this;

    }

    public DPDCBillPaymentPageByComApprover authorizeButton(){

        authorizeButtonEl.isDisplayed();
        authorizeButtonEl.click();

        return new DPDCBillPaymentPageByComApprover();

    }

    public DPDCBillPaymentPageByComApprover otpNumber() throws InterruptedException {

        firstOtpEl.sendKeys("1");
        Thread.sleep(1000);
        seconedtOtpEl.sendKeys("3");
        Thread.sleep(1000);
        thirdOtpEl.sendKeys("4");
        Thread.sleep(1000);
        fourthOtpEl.sendKeys("5");
        Thread.sleep(1000);
        fifthOtpEl.sendKeys("1");
        Thread.sleep(1000);
        sixthOtpEl.sendKeys("9");

        return new DPDCBillPaymentPageByComApprover();

    }

    public DPDCBillPaymentPageByComApprover approveButton() throws InterruptedException {

        confirmButtonEl.isDisplayed();
        confirmButtonEl.click();

        Thread.sleep(7000);
        return new DPDCBillPaymentPageByComApprover();

    }


    public DPDCBillPaymentPageByComApprover finalApproveButton() throws InterruptedException {

        finalconfirmEl.isDisplayed();
        finalconfirmEl.click();

        Thread.sleep(7000);
        return new DPDCBillPaymentPageByComApprover();

    }
}
