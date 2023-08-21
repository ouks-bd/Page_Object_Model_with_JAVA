package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingleIFTTransactionPageByComMaker extends BaseTest {

    public String SingleIftBatch;
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
    WebElement getIftSingleRefEl;


    public SingleIFTTransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public SingleIFTTransactionPageByComMaker selectComAcc(int index) {
        selectComAccEl.isDisplayed();
        new Select(selectComAccEl).selectByIndex(index);
        return this;
    }

    public SingleIFTTransactionPageByComMaker selectBeneficiary(int index) {
        selectAccBeneficiaryEl.isDisplayed();
        new Select(selectAccBeneficiaryEl).selectByIndex(index);
        return this;
    }

    public SingleIFTTransactionPageByComMaker fillTrxAmount() {
        fillTrxAmountEl.isDisplayed();
        fillTrxAmountEl.sendKeys("50000.35");
        return this;
    }

    public SingleIFTTransactionPageByComMaker fillTrxRemarks() throws InterruptedException {
        fillTrxRemarksEl.isDisplayed();
        fillTrxRemarksEl.sendKeys("IFT_Single_Transaction");

        Thread.sleep(5000);
        return this;
    }

    public SingleIFTTransactionPageByComMaker clickNextBtn() {
        clickNextBtnEl.isDisplayed();
        clickNextBtnEl.click();
        return this;
    }

    public SingleIFTTransactionPageByComMaker clickConfirmBtn() throws InterruptedException {

        getIftSingleRefEl.isDisplayed();
        //SingleIftBatch=getIftSingleRefEl.getText();
        SingleIftBatch=getIftSingleRefEl.getAttribute("value");
        Thread.sleep(3000);
        clickNextBtnEl.isDisplayed();
        clickNextBtnEl.click();

        return this;
    }


}
