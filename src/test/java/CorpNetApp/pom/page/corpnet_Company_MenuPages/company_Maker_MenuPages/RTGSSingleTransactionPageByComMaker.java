package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import CorpNetApp.pom.util.GeneralUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;

public class RTGSSingleTransactionPageByComMaker extends BaseTest {

    public String SingleIftBatch;
    @FindBy(id = "beneficiary")
    WebElement beneficiaryEl;

    @FindBy(id = "trxAmount")
    WebElement trxAmountEl;

    @FindBy(id = "trxRemarks")
    WebElement trxRemarksREl;

    @FindBy(css = "button[type='submit']")
    WebElement nextButtonEl;

    @FindBy(css = "button[name='submit']")
    WebElement confirmButtonEl;

    @FindBy(css = "/html/body/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[2]")
    WebElement gettextFromBatch;

    @FindBy(id = "transactionReference")
    WebElement getIftSingleRefEl;
    public RTGSSingleTransactionPageByComMaker() {
        PageFactory.initElements(driver, this);
    }


    public RTGSSingleTransactionPageByComMaker selectBeneficiary(int index) {

        beneficiaryEl.isDisplayed();
        new Select(beneficiaryEl).selectByIndex(index);
        return this;
    }

    public RTGSSingleTransactionPageByComMaker fillAmount(String remarks) {

        trxAmountEl.isDisplayed();
        trxAmountEl.sendKeys(remarks);
        return this;

    }

    public RTGSSingleTransactionPageByComMaker fillRemarks(String remarks) {

        trxRemarksREl.isDisplayed();
        trxRemarksREl.sendKeys(remarks);
        GeneralUtil.waitForDomStable();
        return this;

    }

    public RTGSSingleTransactionPageByComMaker nextButton() {

        nextButtonEl.isDisplayed();
        nextButtonEl.click();
        return this;
    }

    public RTGSSingleTransactionPageByComMaker confirmButton() throws FileNotFoundException {

        getIftSingleRefEl.isDisplayed();
        SingleIftBatch=getIftSingleRefEl.getAttribute("value");
        confirmButtonEl.isDisplayed();
        confirmButtonEl.click();
        return this;
    }




}

