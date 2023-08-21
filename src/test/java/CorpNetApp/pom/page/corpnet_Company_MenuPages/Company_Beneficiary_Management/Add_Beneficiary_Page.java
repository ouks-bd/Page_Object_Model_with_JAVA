package CorpNetApp.pom.page.corpnet_Company_MenuPages.Company_Beneficiary_Management;

import CorpNetApp.pom.base.BaseTest;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_Beneficiary_Page extends BaseTest {

    @FindBy(id = "beneficiaryNickAccount")
    WebElement fillBeneficiaryNickNameEl;

    @FindBy(id = "beneficiaryAccount")
    WebElement fillBeneficiaryAccountEl;
    @FindBy(id = "beneficiaryName")
    WebElement fillBeneficiaryNameEl;
    @FindBy(id = "beneficiaryDistrict")
    WebElement fillBeneficiaryDistrictEl;
    @FindBy(id = "beneficiaryBank")
    WebElement fillBeneficiaryBankEl;
    @FindBy(id = "beneficiaryBranch")
    WebElement fillBeneficiaryBranchEl;



    @FindBy(id = "fileuploadfrm")
    WebElement clickFormEl;
    @FindBy(id = "beneficiaryMobile")
    WebElement fillBeneficiaryMobEl;
    @FindBy(id = "addBeneficiaryBtn")
    WebElement clickBeneBtnEl;


    public Add_Beneficiary_Page() {
        PageFactory.initElements(driver, this);
    }

    public Add_Beneficiary_Page fillBeneficiaryInfo() throws InterruptedException {


        fillBeneficiaryNickNameEl.isDisplayed();
        fillBeneficiaryNickNameEl.sendKeys(getBeneficiaryPayrollNickName());
        Thread.sleep(1000);
        fillBeneficiaryAccountEl.isDisplayed();
        fillBeneficiaryAccountEl.sendKeys(getBeneficiaryPayroll_Acc());
        Thread.sleep(1000);
        clickFormEl.click();
        fillBeneficiaryMobEl.isDisplayed();

        fillBeneficiaryMobEl.sendKeys("01730796749");
        Thread.sleep(3000);
        return this;


    }

    public Add_Beneficiary_Page fillBRACBankBeneficiaryInfo() throws InterruptedException {


        fillBeneficiaryNickNameEl.isDisplayed();
        fillBeneficiaryNickNameEl.sendKeys("Corp BBL");
        Thread.sleep(1000);
        fillBeneficiaryAccountEl.isDisplayed();
        fillBeneficiaryAccountEl.sendKeys(getBeneficiaryPayroll_Acc());
        Thread.sleep(1000);
        clickFormEl.click();
        fillBeneficiaryMobEl.isDisplayed();

        fillBeneficiaryMobEl.sendKeys("01730796749");
        Thread.sleep(3000);
        return this;


    }
    public Add_Beneficiary_Page fillOthersBeneficiaryInfo() throws InterruptedException {


        fillBeneficiaryNickNameEl.isDisplayed();
        fillBeneficiaryNickNameEl.sendKeys("EFT RTGS");
        Thread.sleep(1000);
        fillBeneficiaryAccountEl.isDisplayed();
        fillBeneficiaryAccountEl.sendKeys(getBeneficiaryPayroll_Acc());

        fillBeneficiaryNameEl.sendKeys("EFT RTGS Tranx");

        fillBeneficiaryDistrictEl.isDisplayed();
        new Select(fillBeneficiaryDistrictEl).selectByVisibleText("DHAKA-NORTH");
        Thread.sleep(1000);

        fillBeneficiaryBankEl.isDisplayed();
        new Select(fillBeneficiaryBankEl).selectByValue("90");
        Thread.sleep(1000);

        fillBeneficiaryBranchEl.isDisplayed();
        new Select(fillBeneficiaryBranchEl).selectByVisibleText("BANANI BAZAR");


        fillBeneficiaryMobEl.isDisplayed();
        fillBeneficiaryMobEl.sendKeys("01730796749");
        Thread.sleep(3000);
        return this;


    }

    public Add_Beneficiary_Page clickBtn() {

        clickBeneBtnEl.isDisplayed();
        clickBeneBtnEl.click();
        return this;

    }
}

