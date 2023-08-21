package CorpNetApp.pom.page.Reports.transectionReportPage;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileSummaryReportBy extends BaseTest {

    @FindBy(id = "fromDate")
    WebElement fromDateEl;

    @FindBy(id = "toDate")
    WebElement toDateEl;

    @FindBy(css = "button[name='submit']")
    WebElement clickonSerachButtonEl;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/a[1]//*[name()='svg']")
    WebElement clickonDeatilsButtonEl;

    @FindBy(id = "idGeneratePDFBtn")
    WebElement clickonGeneratePdfButtonEl;


    @FindBy(id = "downloadMe")
    WebElement clickonGenerateExcelButtonEl;
    public FileSummaryReportBy() {
        PageFactory.initElements(driver, this);
    }


    public FileSummaryReportBy selectDateBetweenField(){

        fromDateEl.isDisplayed();
        fromDateEl.clear();
        fromDateEl.sendKeys("01-01-2023");

        toDateEl.isDisplayed();
        toDateEl.clear();
        toDateEl.sendKeys("10-01-2023");

        return new FileSummaryReportBy();
    }

    public FileSummaryReportBy clickOnSearchButton(){

        clickonSerachButtonEl.isDisplayed();
        clickonSerachButtonEl.click();

        return new FileSummaryReportBy();
    }

    public FileSummaryReportBy clickOnDetailsButton(){

        clickonDeatilsButtonEl.isDisplayed();
        clickonDeatilsButtonEl.click();

        return new FileSummaryReportBy();
    }

    public FileSummaryReportBy clickonGenerateButton() throws InterruptedException {

        clickonGeneratePdfButtonEl.isDisplayed();
        clickonGeneratePdfButtonEl.click();



        Thread.sleep(4000);

        clickonGenerateExcelButtonEl.isDisplayed();
        clickonGenerateExcelButtonEl.click();


        return new FileSummaryReportBy();
    }




}
