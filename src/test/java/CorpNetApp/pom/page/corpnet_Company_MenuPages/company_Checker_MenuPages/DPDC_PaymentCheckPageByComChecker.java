package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages;

import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static CorpNetApp.pom.base.BaseTest.driver;

public class DPDC_PaymentCheckPageByComChecker {

    //public String DpdcBatchRef;
    @FindBy (css = "input[aria-controls='dataTables-bill-payment']")
    WebElement searchBoxEl;

    @FindBy(css = "button.btn-success[onclick*='authorizeClickForBillPayment']")
    WebElement authorizeButtonEl;

    @FindBy (id = "idSubmitButton")
    WebElement finalCheckButtonEl;


    public DPDC_PaymentCheckPageByComChecker() {
        PageFactory.initElements(driver, this);
    }

    public DPDC_PaymentCheckPageByComChecker searchDPDCBatchId(String BillRef) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));

        searchBoxEl.isDisplayed();
        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + BillRef);
        searchBoxEl.sendKeys(BillRef);

        Thread.sleep(2000);
        return this;

    }

    public DPDC_PaymentCheckPageByComChecker authorizeButton(){

        authorizeButtonEl.isDisplayed();
        authorizeButtonEl.click();

        return new DPDC_PaymentCheckPageByComChecker();

    }

    public DPDC_PaymentCheckPageByComChecker finalCheckButton() throws InterruptedException {

        finalCheckButtonEl.isDisplayed();
        Thread.sleep(2000);
        finalCheckButtonEl.click();

        Thread.sleep(8000);

        return new DPDC_PaymentCheckPageByComChecker();

    }

}
