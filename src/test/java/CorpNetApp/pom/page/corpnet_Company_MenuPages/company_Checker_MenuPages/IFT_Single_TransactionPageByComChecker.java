package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class IFT_Single_TransactionPageByComChecker extends BaseTest {


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


    public IFT_Single_TransactionPageByComChecker() {
        PageFactory.initElements(driver, this);
    }

    public IFT_Single_TransactionPageByComChecker searchIFTSingleBatchId(String iftSingleBatchID) throws InterruptedException {
        Thread.sleep(3000);
        fillIftBatchIdEl.isDisplayed();
        //iftBatchId = fillIftBatchIdEl.getText();
        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + iftSingleBatchID);
        fillIftBatchIdEl.sendKeys(iftSingleBatchID);
//        fillIftBatchIdEl.sendKeys();
        Thread.sleep(3000);
        return this;
    }


    public IFT_Single_TransactionPageByComChecker clickAuthorizeBtn() throws InterruptedException {
        //new Actions(driver).click(clickAuthorizeBtnEl).perform();
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        Thread.sleep(20000);

        return this;

    }

    public IFT_Single_TransactionPageByComChecker clickSubmitBtn() throws InterruptedException {
        Thread.sleep(15000);
      //  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        clickSubmitButtonEl.isDisplayed();
        Thread.sleep(5000);
        clickSubmitButtonEl.click();
        Thread.sleep(5000);
        return this;

    }

    public IFT_Single_TransactionPageByComChecker clickRejectBtn() {
        clickRejectBtnEl.isDisplayed();
        clickRejectBtnEl.click();
        return this;

    }

    public IFT_Single_TransactionPageByComChecker fillRejectReason(String rejectReason) {
        fillRejectReasonEl.isDisplayed();
        clickRejectBtnEl.sendKeys(rejectReason);
        return this;

    }


}

