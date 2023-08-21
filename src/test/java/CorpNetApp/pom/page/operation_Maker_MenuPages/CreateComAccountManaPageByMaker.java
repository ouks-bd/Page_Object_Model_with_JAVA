package CorpNetApp.pom.page.operation_Maker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateComAccountManaPageByMaker extends BaseTest {
    @FindBy(id = "backButton")
    WebElement CamEl;

    @FindBy(css = "div tr td a[href#='/company/com-details']")
    WebElement CamDetailEl;

    @FindBy(css = "div tbody td a[href*='/company/company_account/']")
    WebElement clickAccBtnEl;

    @FindBy(css = "div tbody tr td input[name*='id'][value='1501101613623002']")
    WebElement clickCheckAccEl1;

    @FindBy(css = "div tbody tr td input[name*='id'][value='1501201806446003']")
    WebElement clickCheckAccEl2;
    @FindBy(css = "div tbody tr td input[name*='id'][value='1501201806446005']")
    WebElement clickCheckAccEl3;
    @FindBy(css = "div tbody tr td input[name*='id'][value='1503101687517001']")
    WebElement clickCheckAccEl4;
    @FindBy(css = "div tbody tr td input[name*='id'][value='1539203428897001']")
    WebElement clickCheckAccEl5;
    @FindBy(css = "div tbody tr td input[name*='id'][value='1501101613623001']")
    WebElement clickCheckAccEl6;
    @FindBy(css = "div tbody tr td input[name*='id'][value='2018064460016']")
    WebElement clickCheckAccEl7;

    @FindBy(css = "div tbody tr td select[name*='trustCumAccount']>option[value$='6446005AC1']")
    WebElement selectTCSAEl;
    @FindBy(name = "submit")
    WebElement clickSubmitBtnEl;


    @FindBy(css = "div label select[name='dataTables-example_length']")
    WebElement SelectCountEl;

    @FindBy(css = "input.form-control-sm")
    WebElement FillSearchComEl;
    @FindBy(id = "inlineCheckbox1")
    WebElement clickRadioBtnEl;

    public CreateComAccountManaPageByMaker() {
        PageFactory.initElements(driver, this);
    }

    public CreateComAccountManaPageByMaker searchCompany(String company) {
        FillSearchComEl.isDisplayed();
        FillSearchComEl.clear();
        FillSearchComEl.sendKeys(company);
        return this;
    }

    public CreateComAccountManaPageByMaker clickRadioBtn() {
        clickRadioBtnEl.isDisplayed();
        clickRadioBtnEl.click();
        return this;
    }    public CreateComAccountManaPageByMaker clickBackButton() {
        CamEl.isDisplayed();
        CamEl.click();
        return this;
    }

    public CreateComAccountManaPageByMaker ClickCompanyAccountBtn() {
        clickAccBtnEl.isDisplayed();
        // CamDetailEl.clear();
        clickAccBtnEl.click();
        return this;
    }

    public CreateComAccountManaPageByMaker clickCheckBoxCompanyAccount() {
        clickCheckAccEl1.click();
        clickCheckAccEl2.click();
        clickCheckAccEl3.click();
        clickCheckAccEl4.click();
        clickCheckAccEl5.click();
        clickCheckAccEl7.click();
        clickCheckAccEl6.click();
        return this;
    }

    public CreateComAccountManaPageByMaker selectTCSAAcc() {
        selectTCSAEl.isDisplayed();
        selectTCSAEl.click();
        return this;
    }
    public CreateComAccountManaPageByMaker clickSubmitBtn() {
        clickSubmitBtnEl.isDisplayed();
        clickSubmitBtnEl.click();
        return this;
    }

    public CreateComAccountManaPageByMaker selectDetailsCount(int index) {
        new Select(SelectCountEl).selectByIndex(index);
        return this;
    }
}
