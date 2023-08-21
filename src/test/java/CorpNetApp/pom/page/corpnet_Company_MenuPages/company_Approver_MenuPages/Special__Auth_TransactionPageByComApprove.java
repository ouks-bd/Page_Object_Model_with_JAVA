package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Special__Auth_TransactionPageByComApprove extends BaseTest {


    public String SpAuthBatchRef;
    @FindBy(css = "div label input[aria-controls='universalApprover']")
    WebElement fillIftBatchIdEl;

    @FindBy(css = "div table tbody tr td button[class$='btn btn-success'][\\type='button']")
    WebElement clickApproveBtnEl;

    @FindBy(css = "table td div[class='pincode-input-container']")
    WebElement fillOtpEl;
    @FindBy(xpath = "//tbody//tr//div//input[1]")
    WebElement firstTokeNumberEl;

    @FindBy(xpath = "//tbody//tr//div//input[2]")
    WebElement seconedTokeNumberEl;

    @FindBy(xpath = "//tbody//tr//div//input[3]")
    WebElement thirdTokenNumberEl;

    @FindBy(xpath = "//tbody//tr//div//input[4]")
    WebElement fourthTokenNumberEl;

    @FindBy(xpath = "//tbody//tr//input[5]")
    WebElement fifthTokenNumberEl;

    @FindBy(xpath = "//tbody//tr//div//input[6]")
    WebElement sixthTokenNumberEl;

    @FindBy(id = "approveLink")
    WebElement clickApproveTokenBtnEl;

    @FindBy(id = "okModalYes")
    WebElement clickYesBtnEl;


    public Special__Auth_TransactionPageByComApprove() {
        PageFactory.initElements(driver, this);
    }

    public Special__Auth_TransactionPageByComApprove searchIFTBatchId(String spAuthBatchRef) throws InterruptedException {
        Thread.sleep(5000);
        fillIftBatchIdEl.isDisplayed();
        //iftChBatch = fillIftBatchIdEl.getText();
        fillIftBatchIdEl.sendKeys(spAuthBatchRef);
        Thread.sleep(3000);
        return this;
    }

    public Special__Auth_TransactionPageByComApprove clickApproveBtn() throws InterruptedException {
        clickApproveBtnEl.isDisplayed();
        clickApproveBtnEl.click();
        Thread.sleep(5000);
        return this;
    }

    public Special__Auth_TransactionPageByComApprove inputTokenNumber() throws InterruptedException {

        firstTokeNumberEl.isDisplayed();
        firstTokeNumberEl.sendKeys("2");

        seconedTokeNumberEl.isDisplayed();
        seconedTokeNumberEl.sendKeys("3");

        thirdTokenNumberEl.isDisplayed();
        thirdTokenNumberEl.sendKeys("1");

        fourthTokenNumberEl.isDisplayed();
        fourthTokenNumberEl.sendKeys("4");

        fifthTokenNumberEl.isDisplayed();
        fifthTokenNumberEl.sendKeys("6");

        sixthTokenNumberEl.isDisplayed();
        sixthTokenNumberEl.sendKeys("2");

        return this;
    }

    public Special__Auth_TransactionPageByComApprove clickApproveTokenBtn() throws InterruptedException {
        clickApproveTokenBtnEl.isDisplayed();
        clickApproveTokenBtnEl.click();
        Thread.sleep(2000);
        return this;
    }

    public Special__Auth_TransactionPageByComApprove clickYesBtn() throws InterruptedException {
        clickYesBtnEl.isDisplayed();
        clickYesBtnEl.click();
        Thread.sleep(2000);
        return this;
    }


}