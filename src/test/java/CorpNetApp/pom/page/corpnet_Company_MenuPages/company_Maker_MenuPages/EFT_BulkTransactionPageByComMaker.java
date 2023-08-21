package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;


import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class EFT_BulkTransactionPageByComMaker extends BaseTest {

    public String EftBatchRef;
    public String EFTSingleFile,EFTMultiFIle;

    @FindBy(id = "accountId")
    WebElement accountIdEl;

    @FindBy(css = "input#file")
    WebElement browseEl;

    @FindBy(name = "debitRemarks")
    WebElement fillRemarksEl;
    @FindBy(id = "uploadBtn")
    WebElement clickUploadEl;
    @FindBy(xpath = "//*[@id=\"movenextpage\"]")
    WebElement clickConfirmBtnEl;


    @FindBy(xpath = "/html/body/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[2]")
    WebElement selectBatchEl;
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


    public EFT_BulkTransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public EFT_BulkTransactionPageByComMaker selectAccountNo(int index) {

        accountIdEl.isDisplayed();
        new Select(accountIdEl).selectByIndex(index);
        return this;
    }

    public EFT_BulkTransactionPageByComMaker uploadIFTFile() {
        EFTSingleFile=System.getProperty("user.dir")+getEFTSingleBulk();
        browseEl.isDisplayed();
        browseEl.sendKeys(EFTSingleFile);
        return this;

    }

    public EFT_BulkTransactionPageByComMaker uploadIFTMultiFile() {
        EFTMultiFIle=System.getProperty("user.dir")+getEFTMultipleBulk();
        browseEl.isDisplayed();
        browseEl.sendKeys(EFTMultiFIle);
        return this;

    }

    public EFT_BulkTransactionPageByComMaker fillRemarks(String remarks) {

        fillRemarksEl.isDisplayed();
        fillRemarksEl.sendKeys(remarks);
        return this;

    }

    public EFT_BulkTransactionPageByComMaker clickUploadBtn() throws InterruptedException {

        clickUploadEl.isDisplayed();
        clickUploadEl.click();
        Thread.sleep(10000);
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;

    }

    public EFT_BulkTransactionPageByComMaker clickConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);

        selectBatchEl.isDisplayed();
        EftBatchRef = selectBatchEl.getText();
        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();

        Thread.sleep(3000);

        return this;

    }

    public EFT_BulkTransactionPageByComMaker getEftBatchId() {

        selectBatchEl.isDisplayed();
        selectBatchEl.getText();

        return this;

    }


    public EFT_BulkTransactionPageByComMaker clickRadioMulti() {
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        debitModeMultiEl.isDisplayed();
        debitModeMultiEl.click();

        return this;

    }

    public EFT_BulkTransactionPageByComMaker clickCancel() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        // GeneralUtil.waitForDomStable();
        clickCancelEl.isDisplayed();
        clickCancelEl.click();
        return this;


    }

    public EFT_BulkTransactionPageByComMaker fillRejectReason(String RejectReason) {

        // GeneralUtil.waitForDomStable();
        fillRejectReasonEl.isDisplayed();
        fillRejectReasonEl.sendKeys(RejectReason);
        return this;


    }

    public EFT_BulkTransactionPageByComMaker ClickRejectYesButton() {

        // GeneralUtil.waitForDomStable();
        clickYesButtonEl.isDisplayed();
        clickYesButtonEl.click();
        return this;


    }


}
