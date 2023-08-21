package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;


import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Own_AccountTransferPageByComMaker extends BaseTest {

    public String UnBatchRef;
    public String SpOwnFileUpload, SpThirdFileUpload;

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


    @FindBy(xpath = "/html/body/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[3]")
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


    public Own_AccountTransferPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public Own_AccountTransferPageByComMaker selectAccountNo(int index) {

        accountIdEl.isDisplayed();
        new Select(accountIdEl).selectByIndex(index);
        return this;
    }

    public Own_AccountTransferPageByComMaker uploadIFTFile() {
        SpOwnFileUpload=System.getProperty("user.dir")+getSPWonBulk();
        browseEl.isDisplayed();
        browseEl.sendKeys(SpOwnFileUpload);
        return this;

    }

    public Own_AccountTransferPageByComMaker fillRemarks(String remarks) {

        fillRemarksEl.isDisplayed();
        fillRemarksEl.sendKeys(remarks);
        return this;

    }

    public Own_AccountTransferPageByComMaker clickUploadBtn() throws InterruptedException {

        clickUploadEl.isDisplayed();
        clickUploadEl.click();
        Thread.sleep(10000);
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        return this;

    }

    public Own_AccountTransferPageByComMaker clickConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);

        selectBatchEl.isDisplayed();
        UnBatchRef = selectBatchEl.getText();
        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();

        Thread.sleep(3000);

        return this;

    }

    public Own_AccountTransferPageByComMaker getEftBatchId() {

        selectBatchEl.isDisplayed();
        selectBatchEl.getText();

        return this;

    }


    public Own_AccountTransferPageByComMaker clickRadioMulti() {
        // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        debitModeMultiEl.isDisplayed();
        debitModeMultiEl.click();

        return this;

    }

    public Own_AccountTransferPageByComMaker clickCancel() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        // GeneralUtil.waitForDomStable();
        clickCancelEl.isDisplayed();
        clickCancelEl.click();
        return this;


    }

    public Own_AccountTransferPageByComMaker fillRejectReason(String RejectReason) {

        // GeneralUtil.waitForDomStable();
        fillRejectReasonEl.isDisplayed();
        fillRejectReasonEl.sendKeys(RejectReason);
        return this;


    }

    public Own_AccountTransferPageByComMaker ClickRejectYesButton() {

        // GeneralUtil.waitForDomStable();
        clickYesButtonEl.isDisplayed();
        clickYesButtonEl.click();
        return this;


    }


}
