package CorpNetApp.pom.page.Reports.payrollReportPage;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PayrollDownloadPaymentSlip extends BaseTest {

    @FindBy(id = "fromdate")
    WebElement fromDateEl;

    @FindBy(id = "todate")
    WebElement toDateEl;

    @FindBy(id = "transactionType")
    WebElement selectTransactionTypeEl;

    @FindBy(css = "div.main-panel")
    WebElement clickBodyEl;

    @FindBy(css = "button[name='submit']")
    WebElement searchButtonClickEl;

    @FindBy(css = "tbody tr:nth-child(1) td:nth-child(8) a:nth-child(1)")
    WebElement clickonDownloadButtonEl;


    @FindBy(id = "trxRef")
    WebElement blackClickEl;

    @FindBy(css = "td a[href*='/pr-transaction/download-slip']")
    WebElement downloadEl;
    public PayrollDownloadPaymentSlip() {
        PageFactory.initElements(driver, this);
    }


    public PayrollDownloadPaymentSlip selectDateBetweenField() throws InterruptedException {

        fromDateEl.isDisplayed();
        fromDateEl.clear();
        fromDateEl.sendKeys("01-06-2022");
        clickBodyEl.click();

//        toDateEl.isDisplayed();
//        toDateEl.clear();
//        toDateEl.sendKeys("05-12-2022");

        //blackClickEl.isDisplayed();
       // blackClickEl.click();

        Thread.sleep(2000);
        return new PayrollDownloadPaymentSlip ();
    }

    public PayrollDownloadPaymentSlip selectTransaction () throws InterruptedException {

        selectTransactionTypeEl.isDisplayed();
        Thread.sleep(2000);
        new Select(selectTransactionTypeEl).selectByValue("BBL");
        return new PayrollDownloadPaymentSlip();

    }

    public PayrollDownloadPaymentSlip clickSearchButton (){

        searchButtonClickEl.isDisplayed();
        searchButtonClickEl.click();

        return new PayrollDownloadPaymentSlip();

    }    public PayrollDownloadPaymentSlip clickDownloadBtn (){

        downloadEl.isDisplayed();
        downloadEl.click();

        return new PayrollDownloadPaymentSlip();

    }


}
