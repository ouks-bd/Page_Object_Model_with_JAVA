package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Single_Payroll_TransactionPageByComMaker extends BaseTest {

    public String PayrollTrxRefNo;
    @FindBy(id = "companyAccount")
    WebElement selectComAccEl;

    @FindBy(id = "beneficiary")
    WebElement selectAccBeneficiaryEl;

    @FindBy(id = "trxAmount")
    WebElement fillTrxAmountEl;

    @FindBy(id = "trxRemarks")
    WebElement fillTrxRemarksEl;
    @FindBy(css = "button[class='btn btn-primary'][type='submit']")
    WebElement clickNextBtnEl;

    @FindBy(css = "div form input[name='trxReference']")
    WebElement getPayrollSingleRefEl;


    public Single_Payroll_TransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public Single_Payroll_TransactionPageByComMaker selectComAcc(int index) {
        selectComAccEl.isDisplayed();
        new Select(selectComAccEl).selectByIndex(index);
        return this;
    }

    public Single_Payroll_TransactionPageByComMaker selectBeneficiary(int index) {
        selectAccBeneficiaryEl.isDisplayed();
        new Select(selectAccBeneficiaryEl).selectByIndex(index);
        return this;
    }

    public Single_Payroll_TransactionPageByComMaker fillTrxAmount() {
        fillTrxAmountEl.isDisplayed();
        fillTrxAmountEl.sendKeys("50000.35");
        return this;
    }

    public Single_Payroll_TransactionPageByComMaker fillTrxRemarks() throws InterruptedException {
        fillTrxRemarksEl.isDisplayed();
        fillTrxRemarksEl.sendKeys("Payroll_Single_Transaction");

        Thread.sleep(5000);
        return this;
    }

    public Single_Payroll_TransactionPageByComMaker clickNextBtn() {
        clickNextBtnEl.isDisplayed();
        clickNextBtnEl.click();
        return this;
    }

    public Single_Payroll_TransactionPageByComMaker clickConfirmBtn() throws InterruptedException {

        getPayrollSingleRefEl.isDisplayed();
        //SingleIftBatch=getIftSingleRefEl.getText();
        PayrollTrxRefNo=getPayrollSingleRefEl.getAttribute("value");
        Thread.sleep(3000);
        clickNextBtnEl.isDisplayed();
        clickNextBtnEl.click();

        return this;
    }


}
