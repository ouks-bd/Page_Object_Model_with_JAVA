package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BulkPayrollTransactionPageByComMaker extends BaseTest {

    public String payrollBatch;
    public String PayrollFillPath;
    @FindBy(css = "select[name='paymentPurpose']")
    WebElement paymentPurposeEl;

    @FindBy(css = "select[name='selectedMonth']")
    WebElement selectMonthEl;

    @FindBy(css = "select[name='selectedYear']")
    WebElement selectYearEl;

    @FindBy(css = "#file")
    WebElement fileUploadEl;

    @FindBy(id = "uploadBtn")
    WebElement clickUploadEl;

    @FindBy(xpath = "//*[@id=\"movenextpage\"]")
    WebElement clickConfirmBtnEl;

//    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
//    WebElement selectBatchEl;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2)")
    WebElement selectBatchEl;

    @FindBy(id = "globalAlertOk")
    WebElement sucessOkButtonEl;

    public BulkPayrollTransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }


    public BulkPayrollTransactionPageByComMaker paymentPurpose(int index) {


        new Select(paymentPurposeEl).selectByIndex(index);
        return this;
    }

    public BulkPayrollTransactionPageByComMaker selectMonth(int index) {

        selectMonthEl.isDisplayed();
        new Select(selectMonthEl).selectByIndex(index);
        return this;
    }

    public BulkPayrollTransactionPageByComMaker selectYear(int index) {

        selectYearEl.isDisplayed();
        new Select(selectYearEl).selectByIndex(index);
        return this;
    }

    public BulkPayrollTransactionPageByComMaker fileUpload() {
        PayrollFillPath=System.getProperty("user.dir")+getPayrollBulk();
        fileUploadEl.isDisplayed();
        fileUploadEl.sendKeys(PayrollFillPath);
        return this;

    }

    public BulkPayrollTransactionPageByComMaker clickUploadBtn() {

        clickUploadEl.isDisplayed();
        clickUploadEl.click();

        return this;
    }


    public BulkPayrollTransactionPageByComMaker clickConfirmBtn() throws InterruptedException {
        Thread.sleep(5000);

        selectBatchEl.isDisplayed();
        payrollBatch = selectBatchEl.getText();
        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();

        Thread.sleep(3000);
        return this;

    }


    public BulkPayrollTransactionPageByComMaker sucessOkButton() throws InterruptedException {

        sucessOkButtonEl.isDisplayed();
        sucessOkButtonEl.click();

        Thread.sleep(5000);
        return this;

    }

}

