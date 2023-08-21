package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BulkPayOrderTransactionPageByComMaker extends BaseTest {

    public String PORefNumber;
    public String POSingleFile, POMultiFile;
    @FindBy(css = "select[name='paymentPurpose']")
    WebElement paymentPurposeEl;

    @FindBy(css = "#file")
    WebElement fileUploadEl;

    @FindBy(id = "select2-bearerId-container")
    WebElement selectComBearerEl;

    @FindBy(name = "trxRemarks")
    WebElement fillRemarksEl;

    @FindBy(id = "deliveryLocationOfficeType")
    WebElement selectDeliveryLocationEl;

    @FindBy(id = "uploadBtn")
    WebElement clickUploadEl;

    @FindBy(css = "#table_summery > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
    WebElement getSinglePORefEl;


    @FindBy(css = "div label>input[value='2'][name='debitMode']")
    WebElement debitModeMultiEl;

    @FindBy(xpath = "//*[@id=\"movenextpage\"]")
    WebElement clickConfirmBtnEl;

//    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
//    WebElement selectBatchEl;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
    WebElement selectBatchEl;

    @FindBy(id = "globalAlertOk")
    WebElement sucessOkButtonEl;

    public BulkPayOrderTransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public BulkPayOrderTransactionPageByComMaker fileUpload() {
        POSingleFile = System.getProperty("user.dir") + getPOBulk();
        fileUploadEl.isDisplayed();
        fileUploadEl.sendKeys(POSingleFile);
        return this;

    }


    public BulkPayOrderTransactionPageByComMaker fillRemarks() {

        fillRemarksEl.isDisplayed();
        fillRemarksEl.sendKeys("Single_Bulk_PO");
        return this;
    }

    public BulkPayOrderTransactionPageByComMaker selectBearer(int index) throws InterruptedException {
        selectComBearerEl.isDisplayed();
        selectComBearerEl.click();
        driver.findElements(By.cssSelector("span ul li.select2-results__option")).get(index).click();
        Thread.sleep(2000);
        return this;
    }

    public BulkPayOrderTransactionPageByComMaker selectDeliveryLocation(int index) throws InterruptedException {
        selectDeliveryLocationEl.isDisplayed();
        new Select(selectDeliveryLocationEl).selectByIndex(index);
        return this;
    }


    public BulkPayOrderTransactionPageByComMaker clickDebitModeMultiBtn() {

        debitModeMultiEl.isDisplayed();
        debitModeMultiEl.click();

        return this;
    }

    public BulkPayOrderTransactionPageByComMaker clickUploadBtn() {

        clickUploadEl.isDisplayed();
        clickUploadEl.click();

        return this;
    }


    public BulkPayOrderTransactionPageByComMaker clickConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);

        selectBatchEl.isDisplayed();
        PORefNumber = getSinglePORefEl.getText();
        System.out.println("Successfully upload the PO Transaction, Transaction Batch Id :- " + PORefNumber);

        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();

        Thread.sleep(3000);
        return this;

    }


    public BulkPayOrderTransactionPageByComMaker sucessOkButton() throws InterruptedException {

        sucessOkButtonEl.isDisplayed();
        sucessOkButtonEl.click();

        Thread.sleep(5000);
        return this;

    }

}

