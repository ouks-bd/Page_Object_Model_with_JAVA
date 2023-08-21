package CorpNetApp.pom.page.Reports.transectionReportPage;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentReportPage extends BaseTest {

    @FindBy(id = "fromdate")
    WebElement fromDateEl;

    @FindBy(id = "todate")
    WebElement toDateEl;

    @FindBy(id = "transactinType")
    WebElement selectTransectionTypeEl;

    @FindBy(css = "button[name='submit']")
    WebElement searchButtonClickEl;

    @FindBy(id = "idGeneratePdfBtn")
    WebElement clickonGeneratePdfButtonEl;

    @FindBy(id = "idGenerateXlBtn")
    WebElement clickonGenerateExcelButtonEl;

    @FindBy(id = "trxRef")
    WebElement blackClickEl;
    public PaymentReportPage() {
        PageFactory.initElements(driver, this);
    }


    public PaymentReportPage selectDateBetweenField() throws InterruptedException {

        fromDateEl.isDisplayed();
        fromDateEl.clear();
        fromDateEl.sendKeys("01-01-2023");

        toDateEl.isDisplayed();
        toDateEl.clear();
        toDateEl.sendKeys("10-01-2022");

        blackClickEl.isDisplayed();
        blackClickEl.click();

        Thread.sleep(5000);
        return new PaymentReportPage();
    }

        public PaymentReportPage selectTransaction (){

        selectTransectionTypeEl.isDisplayed();
        new Select(selectTransectionTypeEl).selectByValue("1");
        return new PaymentReportPage();

        }

    public PaymentReportPage clickSearchButton (){

        searchButtonClickEl.isDisplayed();
        searchButtonClickEl.click();

        return new PaymentReportPage();

    }
    public PaymentReportPage clickOnGenerateButton() throws InterruptedException {

        clickonGenerateExcelButtonEl.isDisplayed();
        clickonGenerateExcelButtonEl.click();

        Thread.sleep(4000);


        clickonGeneratePdfButtonEl.isDisplayed();
        clickonGeneratePdfButtonEl.click();


        Thread.sleep(4000);



        return new PaymentReportPage();
    }

    }
