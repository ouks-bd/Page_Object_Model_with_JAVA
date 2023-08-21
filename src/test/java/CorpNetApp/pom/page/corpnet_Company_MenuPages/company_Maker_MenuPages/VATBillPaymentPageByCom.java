package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VATBillPaymentPageByCom extends BaseTest {


    public String DpdcBatchRef;

    @FindBy (id="binSearch")
    WebElement binNumberInputEl;

    @FindBy (css = "button[onclick='callVATFetchAPI()']")
    WebElement searchbinButtonEl;

    @FindBy(id = "taxType")
    WebElement taxTypeEl;

    @FindBy(id="taxPeriodMonth")
    WebElement taxPeriodMonthEl;

    @FindBy(id="taxPeriodYear")
    WebElement taxPeriodYearEl;

    @FindBy(id = "vatAmount")
    WebElement vatAmountEl;

    @FindBy(id = "remarks")
    WebElement remarksAddEl;

    @FindBy(css = "button[type='submit']")
    WebElement submitButtonEl;

    @FindBy (css = "button[name='submit']")
    WebElement confirmButtonEl;

    @FindBy(id = "submitButton")
    WebElement finalSubmitButtonEl;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    WebElement selectBatchEl;

    public VATBillPaymentPageByCom() {
        PageFactory.initElements(driver, this);
    }


    public VATBillPaymentPageByCom binNumberSearch() throws InterruptedException {

        binNumberInputEl.isDisplayed();
        binNumberInputEl.sendKeys("000140806-0503");

        searchbinButtonEl.isDisplayed();
        searchbinButtonEl.click();
        Thread.sleep(5000);

        return this;
    }

    public VATBillPaymentPageByCom taxType()  {

        taxTypeEl.isDisplayed();
        new Select(taxTypeEl).selectByValue("0601|1601");

        return this;
    }

    public VATBillPaymentPageByCom taxMonth()  {

        taxPeriodMonthEl.isDisplayed();
        new Select(taxPeriodMonthEl).selectByValue("10");

        return this;
    }
    public VATBillPaymentPageByCom taxYear()  {

        taxPeriodYearEl.isDisplayed();
        new Select(taxPeriodYearEl).selectByValue("2022");

        return this;
    }


    public VATBillPaymentPageByCom vatAmount()  {

        vatAmountEl.isDisplayed();
        vatAmountEl.sendKeys("500");

        return this;
    }

    public VATBillPaymentPageByCom remarksAdd()  {

        remarksAddEl.isDisplayed();
        remarksAddEl.sendKeys("Test_Remarks");

        return this;
    }


    public VATBillPaymentPageByCom submitButton()  {

        submitButtonEl.isDisplayed();
        submitButtonEl.click();

        return this;
    }

    public VATBillPaymentPageByCom confirmButton() throws InterruptedException {

        selectBatchEl.isDisplayed();
        DpdcBatchRef = selectBatchEl.getText();

        System.out.println("Vat Payment id "+DpdcBatchRef);
        Thread.sleep(3000);

        confirmButtonEl.isDisplayed();
        confirmButtonEl.click();

        return this;
    }

    public VATBillPaymentPageByCom finalSubmitButton()  {

        finalSubmitButtonEl.isDisplayed();
        finalSubmitButtonEl.click();

        return this;
    }


}
