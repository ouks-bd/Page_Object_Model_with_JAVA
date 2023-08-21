package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingleEFT_TransactionPageByComMaker extends BaseTest {
    public String SingleEftBatch;
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

    @FindBy(id = "transactionReference")
    WebElement getEftSingleRefEl;


    public SingleEFT_TransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public SingleEFT_TransactionPageByComMaker selectComAcc(int index) {
        selectComAccEl.isDisplayed();
        new Select(selectComAccEl).selectByIndex(index);
        return this;
    }

    public SingleEFT_TransactionPageByComMaker selectBeneficiary(int index) {
        selectAccBeneficiaryEl.isDisplayed();
        new Select(selectAccBeneficiaryEl).selectByIndex(index);
        return this;
    }

    public SingleEFT_TransactionPageByComMaker fillTrxAmount() {
        fillTrxAmountEl.isDisplayed();
        fillTrxAmountEl.sendKeys("50000.35");
        return this;
    }

    public SingleEFT_TransactionPageByComMaker fillTrxRemarks() throws InterruptedException {
        fillTrxRemarksEl.isDisplayed();
        fillTrxRemarksEl.sendKeys("IFT_Single_Transaction");

        Thread.sleep(5000);
        return this;
    }

    public SingleEFT_TransactionPageByComMaker clickNextBtn() {
        clickNextBtnEl.isDisplayed();
        clickNextBtnEl.click();
        return this;
    }

    public SingleEFT_TransactionPageByComMaker clickConfirmBtn() throws InterruptedException {

        getEftSingleRefEl.isDisplayed();
        //SingleIftBatch=getIftSingleRefEl.getText();
        SingleEftBatch=getEftSingleRefEl.getAttribute("value");
        Thread.sleep(3000);
        clickNextBtnEl.isDisplayed();
        clickNextBtnEl.click();

        return this;
    }


}
