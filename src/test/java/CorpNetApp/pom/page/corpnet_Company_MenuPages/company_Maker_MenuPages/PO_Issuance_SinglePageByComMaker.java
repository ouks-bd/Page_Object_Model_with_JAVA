package CorpNetApp.pom.page.corpnet_Company_MenuPages.company_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PO_Issuance_SinglePageByComMaker extends BaseTest {

    @FindBy(id = "companyAccount")
    WebElement selectComAccEl;
    @FindBy(id = "select2-beneficiaryId-container")
    WebElement selectBeneficiaryEl;
    @FindBy(css = "span ul li.select2-results__option")
    WebElement selectBeneficiaryValueEl;


    @FindBy(id = "select2-beneficiaryId-result-h226-12517")
    WebElement clickBeneficiaryEl;

    @FindBy(id = "select2-bearerId-container")
    WebElement selectComBearerEl;
    @FindBy(id = "payOrderAmount")
    WebElement fillPOAmtEl;
    @FindBy(id = "deliveryLocationOfficeType")
    WebElement selectDeliveryLocationEl;
    @FindBy(id = "trxRemarks")
    WebElement fillTranRemarksEl;

    @FindBy(css = "div button.btn-primary[type='submit']")
    WebElement clickNextBtnEl;
    @FindBy(css = "div button[onclick*='checkAdhocBaneficiary']")
    WebElement clickConfirmBtnEl;


    public PO_Issuance_SinglePageByComMaker() {
        PageFactory.initElements(driver, this);
    }

    public PO_Issuance_SinglePageByComMaker selectComAcc(int index) {
        selectComAccEl.isDisplayed();
        new Select(selectComAccEl).selectByIndex(0);
        return this;
    }

    public PO_Issuance_SinglePageByComMaker selectBeneficiary(int index) throws InterruptedException {
        selectBeneficiaryEl.isDisplayed();
        selectBeneficiaryEl.click();
        driver.findElements(By.cssSelector("span ul li.select2-results__option")).get(index).click();
        Thread.sleep(2000);
        //  new Select(selectBeneficiaryEl).selectByIndex(index);
        return this;
    }

    public PO_Issuance_SinglePageByComMaker selectBearer(int index) throws InterruptedException {
        selectComBearerEl.isDisplayed();
        selectComBearerEl.click();
        driver.findElements(By.cssSelector("span ul li.select2-results__option")).get(index).click();
        Thread.sleep(2000);

        fillPOAmtEl.isDisplayed();
        fillPOAmtEl.sendKeys("40040");
        return this;
    }
    public PO_Issuance_SinglePageByComMaker entryAllBeneficiaryData(int index)
    {

        selectDeliveryLocationEl.isDisplayed();
        new Select(selectDeliveryLocationEl).selectByIndex(index);

        fillTranRemarksEl.isDisplayed();
        fillTranRemarksEl.sendKeys("PO_Beneficiary_Transaction");

        clickNextBtnEl.isDisplayed();
        clickNextBtnEl.click();
        return this;


    }

    public PO_Issuance_SinglePageByComMaker clickConfirmBtn() {
        clickConfirmBtnEl.isDisplayed();
        clickConfirmBtnEl.click();
        return this;
    }
}
