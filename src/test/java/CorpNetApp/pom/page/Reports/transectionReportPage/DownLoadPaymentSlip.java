package CorpNetApp.pom.page.Reports.transectionReportPage;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DownLoadPaymentSlip extends BaseTest {

    @FindBy(id = "fromdate")
    WebElement fromDateEl;

    @FindBy(id = "todate")
    WebElement toDateEl;

    @FindBy(id = "transactinType")
    WebElement selectTransectionTypeEl;

    @FindBy(css = "button[name='submit']")
    WebElement searchButtonClickEl;

    @FindBy(css = "tbody tr:nth-child(1) td:nth-child(8) a:nth-child(1)")
    WebElement clickonDownloadButtonEl;


    @FindBy(id = "trxRef")
    WebElement blackClickEl;
    public DownLoadPaymentSlip() {
        PageFactory.initElements(driver, this);
    }


    public DownLoadPaymentSlip selectDateBetweenField() throws InterruptedException {

        fromDateEl.isDisplayed();
        fromDateEl.clear();
        fromDateEl.sendKeys("01-01-2023");

        toDateEl.isDisplayed();
        toDateEl.clear();
        toDateEl.sendKeys("10-01-2023");

        blackClickEl.isDisplayed();
        blackClickEl.click();

        Thread.sleep(5000);
        return new DownLoadPaymentSlip ();
    }

    public DownLoadPaymentSlip selectTransaction (){

        selectTransectionTypeEl.isDisplayed();
        new Select(selectTransectionTypeEl).selectByValue("BBL");
        return new DownLoadPaymentSlip();

    }

    public DownLoadPaymentSlip selectTransactionEFT (){

        selectTransectionTypeEl.isDisplayed();
        new Select(selectTransectionTypeEl).selectByValue("BEFTN");
        return new DownLoadPaymentSlip();

    }
    public DownLoadPaymentSlip selectTransactionRTGS (){

        selectTransectionTypeEl.isDisplayed();
        new Select(selectTransectionTypeEl).selectByValue("RTGS");
        return new DownLoadPaymentSlip();

    }

    public DownLoadPaymentSlip clickSearchButton (){

        searchButtonClickEl.isDisplayed();
        searchButtonClickEl.click();

        return new DownLoadPaymentSlip();

    }

    public DownLoadPaymentSlip clickOnDownloadButton (){

        clickonDownloadButtonEl.isDisplayed();
        clickonDownloadButtonEl.click();

        return new DownLoadPaymentSlip();

    }

}
