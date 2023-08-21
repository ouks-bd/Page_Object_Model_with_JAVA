package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class EFT_TransactionPageByComChecker extends BaseTest {
    public String EftBatchRef;



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


    public EFT_TransactionPageByComChecker() {
        PageFactory.initElements(driver, this);
    }

    public EFT_TransactionPageByComChecker searchIFTBatchId(String iftID) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        fillIftBatchIdEl.isDisplayed();
        //iftBatchId = fillIftBatchIdEl.getText();
        System.out.println("Successfully get Transaction Id, Transaction Batch Id :- " + iftID);
        fillIftBatchIdEl.sendKeys(iftID);
//        fillIftBatchIdEl.sendKeys();
        Thread.sleep(2000);
        return this;
    }


    public EFT_TransactionPageByComChecker clickAuthorizeBtn() throws InterruptedException {
        //new Actions(driver).click(clickAuthorizeBtnEl).perform();
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        Thread.sleep(15000);

        return this;

    }

    public EFT_TransactionPageByComChecker clickSubmitBtn() throws InterruptedException {
        Thread.sleep(15000);
        clickSubmitButtonEl.isDisplayed();
        Thread.sleep(10000);
        clickSubmitButtonEl.click();

        return this;

    }
    public EFT_TransactionPageByComChecker clickRejectBtn() {
        clickRejectBtnEl.isDisplayed();
        clickRejectBtnEl.click();
        return this;

    }
    public EFT_TransactionPageByComChecker fillRejectReason(String rejectReason) {
        fillRejectReasonEl.isDisplayed();
        clickRejectBtnEl.sendKeys(rejectReason);
        return this;

    }


}