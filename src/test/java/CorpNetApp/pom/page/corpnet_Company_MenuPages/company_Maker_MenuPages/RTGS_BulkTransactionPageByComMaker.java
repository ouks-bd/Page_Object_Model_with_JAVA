package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;
import java.time.Duration;

public class RTGS_BulkTransactionPageByComMaker extends BaseTest {
    public String rtgsBatchRef;
    public String RTGSBulkFile,RTGSFutureBulkFile;

    @FindBy(id = "accountId")
    WebElement accountIdEl;

    @FindBy(css = "input#file")
    WebElement browseEl;

    @FindBy(name = "debitRemarks")
    WebElement fillRemarksEl;
    @FindBy(id = "uploadBtn")
    WebElement clickUploadEl;
    @FindBy(css = "button#movenextpage")
    WebElement clickConfirmBtnEl;

    @FindBy(css = "div label>input[value='2'][name='debitMode']")
    WebElement debitModeMultiEl;

    @FindBy(css = "h1.card-title:nth-child(3)")
    WebElement getFileDetailsEl;
    @FindBy(css = "#moveCancelPage")
    WebElement clickCancelEl;

    @FindBy(id = "idRejectionReasonCancleTransactionAll")
    WebElement fillRejectReasonEl;

    @FindBy(id = "messageModalCancleTransactionYesAll")
    WebElement clickYesButtonEl;

//     @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
//     WebElement getTextEl;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
    WebElement gettextFromBatch;

    @FindBy(xpath = "/html/body/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[2]")
    WebElement selectBatchEl;


    public RTGS_BulkTransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public RTGS_BulkTransactionPageByComMaker selectAccountNo(int index) {

        accountIdEl.isDisplayed();
        new Select(accountIdEl).selectByIndex(index);
        return this;
    }

    public RTGS_BulkTransactionPageByComMaker uploadIFTFile() {
        RTGSBulkFile=System.getProperty("user.dir")+getRTGSBulk();
        browseEl.isDisplayed();
        browseEl.sendKeys(RTGSBulkFile);
        return this;

    }

    public RTGS_BulkTransactionPageByComMaker fillRemarks(String remarks) {

        fillRemarksEl.isDisplayed();
        fillRemarksEl.sendKeys(remarks);
        return this;

    }

    public RTGS_BulkTransactionPageByComMaker clickUploadBtn() throws InterruptedException {

        clickUploadEl.isDisplayed();
        clickUploadEl.click();
        Thread.sleep(10000);
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;
    }


    public RTGS_BulkTransactionPageByComMaker clickConfirmBtn() throws FileNotFoundException, InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        selectBatchEl.isDisplayed();
        rtgsBatchRef = selectBatchEl.getText();
        Thread.sleep(3000);
        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();




        return this;
    }

    public RTGS_BulkTransactionPageByComMaker clickRadioMulti() {
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        debitModeMultiEl.isDisplayed();
        debitModeMultiEl.click();

        return this;
    }

    public RTGS_BulkTransactionPageByComMaker clickCancel() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        // GeneralUtil.waitForDomStable();
        clickCancelEl.isDisplayed();
        clickCancelEl.click();
        return this;
    }

    public RTGS_BulkTransactionPageByComMaker fillRejectReason(String RejectReason) {

        // GeneralUtil.waitForDomStable();
        fillRejectReasonEl.isDisplayed();
        fillRejectReasonEl.sendKeys(RejectReason);
        return this;
    }

    public RTGS_BulkTransactionPageByComMaker ClickRejectYesButton() {

        // GeneralUtil.waitForDomStable();
        clickYesButtonEl.isDisplayed();
        clickYesButtonEl.click();
        return this;
    }


}
