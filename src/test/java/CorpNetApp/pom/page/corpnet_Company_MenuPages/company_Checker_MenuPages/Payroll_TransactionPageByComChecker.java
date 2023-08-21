package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Payroll_TransactionPageByComChecker extends BaseTest {


    @FindBy(css = "div label input[aria-controls='dataTable-payroll']")
    WebElement fillPayrollBatchIdEl;

    @FindBy(css = "#dataTable-payroll > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(8) > button:nth-child(1)")
    WebElement clickAuthorizeBtnEl;

    @FindBy(css = ".even > td:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement clickSigRadioBtnEl;
    @FindBy(id = "idSubmitButton")
    WebElement clickSubmitButtonEl;

    @FindBy(id = "idRejectButton")
    WebElement clickRejectBtnEl;

    @FindBy(css = "input#idRejectionReason")
    WebElement fillRejectReasonEl;

    @FindBy(id = "messageModalCancleTransactionYesAll")
    WebElement clickYesButtonEl;


    public Payroll_TransactionPageByComChecker() {
        PageFactory.initElements(driver, this);
    }

    public Payroll_TransactionPageByComChecker searchIFTBatchId(String payrollRef) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        fillPayrollBatchIdEl.isDisplayed();
        //iftBatchId = fillIftBatchIdEl.getText();
        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + payrollRef);
        fillPayrollBatchIdEl.sendKeys(payrollRef);
//        fillIftBatchIdEl.sendKeys();
        Thread.sleep(2000);
        return this;
    }


    public Payroll_TransactionPageByComChecker clickAuthorizeBtn() throws InterruptedException {
        //new Actions(driver).click(clickAuthorizeBtnEl).perform();
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        Thread.sleep(15000);

        return this;

    }

    public Payroll_TransactionPageByComChecker clickSigRadioBtn() {
        clickSigRadioBtnEl.isDisplayed();
        clickSigRadioBtnEl.click();
        return this;

    }

    public Payroll_TransactionPageByComChecker clickSubmitBtn() {
        clickSubmitButtonEl.isDisplayed();
        clickSubmitButtonEl.click();
        return this;

    }
    public Payroll_TransactionPageByComChecker clickRejectBtn() {
        clickRejectBtnEl.isDisplayed();
        clickRejectBtnEl.click();
        return this;

    }
    public Payroll_TransactionPageByComChecker fillRejectReason(String rejectReason) {
        fillRejectReasonEl.isDisplayed();
        clickRejectBtnEl.sendKeys(rejectReason);
        return this;

    }


}




