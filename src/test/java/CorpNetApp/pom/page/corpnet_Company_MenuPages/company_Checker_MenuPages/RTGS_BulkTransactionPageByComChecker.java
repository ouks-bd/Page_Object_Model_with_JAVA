package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RTGS_BulkTransactionPageByComChecker extends BaseTest {


    @FindBy(css = "div label input.form-control-sm")
    WebElement fillIftBatchIdEl;

    @FindBy(css = "tr[class='odd'] button[type='button']")
    WebElement clickAuthorizeBtnEl;

    @FindBy(id = "idSubmitButton")
    WebElement clickSubmitButtonEl;

    @FindBy(id = "idRejectButton")
    WebElement clickRejectBtnEl;

    @FindBy(css = "input#idRejectionReason")
    WebElement fillRejectReasonEl;

    @FindBy(id = "messageModalCancleTransactionYesAll")
    WebElement clickYesButtonEl;


    public RTGS_BulkTransactionPageByComChecker() {
        PageFactory.initElements(driver, this);
    }

    public RTGS_BulkTransactionPageByComChecker searchIFTBatchId(String rtgsRefId) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        fillIftBatchIdEl.isDisplayed();
        //iftBatchId = fillIftBatchIdEl.getText();
        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + rtgsRefId);
        fillIftBatchIdEl.sendKeys(rtgsRefId);
//        fillIftBatchIdEl.sendKeys();
        Thread.sleep(2000);
        return this;
    }


    public RTGS_BulkTransactionPageByComChecker clickAuthorizeBtn() throws InterruptedException {
        //new Actions(driver).click(clickAuthorizeBtnEl).perform();
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        Thread.sleep(15000);

        return this;

    }

    public RTGS_BulkTransactionPageByComChecker clickSubmitBtn() throws InterruptedException {
        Thread.sleep(5000);
        clickSubmitButtonEl.isDisplayed();
        clickSubmitButtonEl.click();
        Thread.sleep(5000);
        return this;

    }

    public RTGS_BulkTransactionPageByComChecker clickRejectBtn() {
        clickRejectBtnEl.isDisplayed();
        clickRejectBtnEl.click();
        return this;

    }

    public RTGS_BulkTransactionPageByComChecker fillRejectReason(String rejectReason) {
        fillRejectReasonEl.isDisplayed();
        clickRejectBtnEl.sendKeys(rejectReason);
        return this;

    }
}

