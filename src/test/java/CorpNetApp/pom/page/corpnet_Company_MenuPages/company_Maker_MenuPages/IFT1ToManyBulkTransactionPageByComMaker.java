package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;


import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class IFT1ToManyBulkTransactionPageByComMaker extends BaseTest {

    public String iftBatch,iftPayrollBatch;
    public String IftSingleFilepath;
    public String IftPayrollFilePath;
    public String IftMultiFilepath;

    @FindBy(id = "accountId")
    WebElement accountIdEl;

    @FindBy(css = "input#file")
    WebElement browseEl;

    @FindBy(name = "debitRemarks")
    WebElement fillRemarksEl;

    @FindBy(id="#idMessageModalYes")
    WebElement clickOkBtnEl;
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

    //  use for payroll selector
    @FindBy(css = "input[value='Y']")
    WebElement selectPayrollYesEl;

    @FindBy(id = "paymentPurpose")
    WebElement selectPurposeEl;
    @FindBy(id = "selectedMonth")
    WebElement selectMonthEl;
    @FindBy(id = "selectedYear")
    WebElement selectYearEl;


    public IFT1ToManyBulkTransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public IFT1ToManyBulkTransactionPageByComMaker selectAccountNo(int index) {

        accountIdEl.isDisplayed();
        new Select(accountIdEl).selectByIndex(index);
        return this;
    }

    public IFT1ToManyBulkTransactionPageByComMaker uploadIFTFile() {
        IftSingleFilepath= System.getProperty("user.dir")+getIFTSingleBulk();
        System.out.println(IftSingleFilepath);
        browseEl.isDisplayed();
        browseEl.sendKeys(IftSingleFilepath);
        return this;

    }

    public IFT1ToManyBulkTransactionPageByComMaker uploadIFTMultiFile() {
        IftMultiFilepath= System.getProperty("user.dir")+getIFTMultipleBulk();
        System.out.println(IftMultiFilepath);
        browseEl.isDisplayed();
        browseEl.sendKeys(IftMultiFilepath);
        return this;

    }

    public IFT1ToManyBulkTransactionPageByComMaker fillRemarks(String remarks) {

        fillRemarksEl.isDisplayed();
        fillRemarksEl.sendKeys(remarks);
        return this;

    }

    public IFT1ToManyBulkTransactionPageByComMaker clickUploadBtn() throws InterruptedException {

        clickUploadEl.isDisplayed();
        clickUploadEl.click();
        Thread.sleep(10000);
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;

    }

    public IFT1ToManyBulkTransactionPageByComMaker clickConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);

        selectBatchEl.isDisplayed();
        iftBatch = selectBatchEl.getText();
        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();

        Thread.sleep(3000);

        return this;

    }

    public IFT1ToManyBulkTransactionPageByComMaker getIftBatchId() {

        selectBatchEl.isDisplayed();
        selectBatchEl.getText();

        return this;

    }


    public IFT1ToManyBulkTransactionPageByComMaker clickRadioMulti() {
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        debitModeMultiEl.isDisplayed();
        debitModeMultiEl.click();

        return this;

    }

    public IFT1ToManyBulkTransactionPageByComMaker clickCancel() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        // GeneralUtil.waitForDomStable();
        clickCancelEl.isDisplayed();
        clickCancelEl.click();
        return this;


    }

    public IFT1ToManyBulkTransactionPageByComMaker fillRejectReason(String RejectReason) {

        // GeneralUtil.waitForDomStable();
        fillRejectReasonEl.isDisplayed();
        fillRejectReasonEl.sendKeys(RejectReason);
        return this;


    }

    public IFT1ToManyBulkTransactionPageByComMaker ClickRejectYesButton() {

        // GeneralUtil.waitForDomStable();
        clickYesButtonEl.isDisplayed();
        clickYesButtonEl.click();
        return this;

    }
    public IFT1ToManyBulkTransactionPageByComMaker SelectPayrollRedioButton() {

        // GeneralUtil.waitForDomStable();
        selectPayrollYesEl.isDisplayed();
        selectPayrollYesEl.click();
        return this;

    }
    public IFT1ToManyBulkTransactionPageByComMaker SelectPayrollPurpose() throws InterruptedException {

        // GeneralUtil.waitForDomStable();
        selectPurposeEl.isDisplayed();
        Thread.sleep(200);
        new Select(selectPurposeEl).selectByVisibleText("Salary");
             //   electByValue("16");
        selectMonthEl.isDisplayed();
        Thread.sleep(2000);
        new Select(selectMonthEl).selectByVisibleText("June");
        selectYearEl.isDisplayed();
        new Select(selectYearEl).selectByVisibleText("2023");
        return this;

    }
    public IFT1ToManyBulkTransactionPageByComMaker uploadIFTPayrollFile() {
        IftPayrollFilePath= System.getProperty("user.dir")+getPayrollBulk();
        System.out.println(IftPayrollFilePath);
        browseEl.isDisplayed();
        browseEl.sendKeys(IftPayrollFilePath);
        return this;
    }
    public IFT1ToManyBulkTransactionPageByComMaker fillPayrollRemarks(String remarks) {

        fillRemarksEl.isDisplayed();
        fillRemarksEl.sendKeys(remarks);
        return this;

    }

    public IFT1ToManyBulkTransactionPageByComMaker clickPayrollConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);

        selectBatchEl.isDisplayed();
        iftPayrollBatch = selectBatchEl.getText();
        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();

        Thread.sleep(3000);

        return this;

    }




}
