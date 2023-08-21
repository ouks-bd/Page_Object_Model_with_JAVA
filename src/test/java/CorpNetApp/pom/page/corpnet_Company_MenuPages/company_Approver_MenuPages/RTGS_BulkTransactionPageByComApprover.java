package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Approver_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RTGS_BulkTransactionPageByComApprover extends BaseTest {
    @FindBy(css = "div label input.form-control-sm")
    WebElement fillIftBatchIdEl;


    @FindBy(css = "div table tbody tr td button[class$='btn btn-success'][\\type='button']")
    WebElement clickApproveBtnEl;

    @FindBy(id = "approveLink")
    WebElement submitButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[1]")
    WebElement firstTokeNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[2]")
    WebElement seconedTokeNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[3]")
    WebElement thirdTokenNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[4]")
    WebElement fourthTokenNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[5]")
    WebElement fifthTokenNumberEl;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div/div/div[1]/div/form[1]/div[2]/table/tbody/tr[2]/td[2]/div/input[6]")
    WebElement sixthTokenNumberEl;

    @FindBy(id = "approveLink")
    WebElement clickapproveBtnEl;

    @FindBy(id = "okModalYes")
    WebElement finalOk;

    @FindBy(id = "globalAlertOk")
    WebElement finalOkButton;

    public RTGS_BulkTransactionPageByComApprover() {
        PageFactory.initElements(driver, this);
    }

    public RTGS_BulkTransactionPageByComApprover searchIFTBatchId(String RtgsRegID) throws InterruptedException {
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(GeneralUtil.PAGE_LOAD_TIME));
        Thread.sleep(10000);
        fillIftBatchIdEl.isDisplayed();
        // iftChBatch = fillIftBatchIdEl.getText();
        fillIftBatchIdEl.sendKeys(RtgsRegID);
        Thread.sleep(5000);
        return this;
    }

    public RTGS_BulkTransactionPageByComApprover clickAuthorised() throws InterruptedException {

        clickApproveBtnEl.isDisplayed();
        clickApproveBtnEl.click();
        Thread.sleep(10000);
        return this;
    }

    public RTGS_BulkTransactionPageByComApprover inputTokenNumber() {

        firstTokeNumberEl.isDisplayed();
        firstTokeNumberEl.sendKeys("2");

        seconedTokeNumberEl.isDisplayed();
        seconedTokeNumberEl.sendKeys("3");

        thirdTokenNumberEl.isDisplayed();
        thirdTokenNumberEl.sendKeys("1");

        fourthTokenNumberEl.isDisplayed();
        fourthTokenNumberEl.sendKeys("4");

        fifthTokenNumberEl.isDisplayed();
        fifthTokenNumberEl.sendKeys("0");

        sixthTokenNumberEl.isDisplayed();
        sixthTokenNumberEl.sendKeys("2");

        return this;
    }

    public RTGS_BulkTransactionPageByComApprover clickApproveButton() {

        submitButton.isDisplayed();
        submitButton.click();
        return this;
    }

    public RTGS_BulkTransactionPageByComApprover clickApproveBtn() throws InterruptedException {

        Thread.sleep(8000);
        clickapproveBtnEl.isDisplayed();
        clickapproveBtnEl.click();
        Thread.sleep(2000);
        return this;
    }


    public RTGS_BulkTransactionPageByComApprover clickOkButton() throws InterruptedException {

        Thread.sleep(5000);

        finalOk.isDisplayed();
        finalOk.click();

//        Thread.sleep(10000);
//
//        finalOkButton.isDisplayed();
//        finalOkButton.click();

        Thread.sleep(10000);
        return this;

    }


}
