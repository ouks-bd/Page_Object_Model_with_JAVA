package CorpNetApp.pom.page.Reports.payrollReportPage;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransactionReport extends BaseTest {

    @FindBy(id = "fromdate")
    WebElement fromDateEl;

    @FindBy(id = "todate")
    WebElement toDateEl;

    @FindBy(id = "transactionType")
    WebElement selectTransactionTypeEl;

    @FindBy(css = "button[name='submit']")
    WebElement searchButtonClickEl;

    @FindBy(id = "idGeneratePdfBtn")
    WebElement clickOnGeneratePdfButtonEl;

    @FindBy(id = "idGenerateXlBtn")
    WebElement clickOnGenerateExcelButtonEl;

    @FindBy(id = "trxRef")
    WebElement blackClickEl;

    public TransactionReport() {
        PageFactory.initElements(driver, this);
    }


    public TransactionReport selectDateBetweenField() throws InterruptedException {

        fromDateEl.isDisplayed();
        fromDateEl.clear();
        fromDateEl.sendKeys("01-10-2022");

//        toDateEl.isDisplayed();
//        toDateEl.clear();
//        toDateEl.sendKeys("05-12-2022");

        blackClickEl.isDisplayed();
        blackClickEl.click();

        Thread.sleep(5000);
        return new TransactionReport();
    }

    public TransactionReport selectTransaction (int index){

        selectTransactionTypeEl.isDisplayed();
        new Select(selectTransactionTypeEl).selectByIndex(1);
        return new TransactionReport();

    }

    public TransactionReport clickSearchButton (){

        searchButtonClickEl.isDisplayed();
        searchButtonClickEl.click();

        return new TransactionReport();

    }


}
