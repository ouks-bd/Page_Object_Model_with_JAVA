package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionRuleSummaryPageForPayrollByChecker extends BaseTest {

    @FindBy(id = "inlineCheckbox1")
    WebElement checkUnAuthorizeBoxEl;

    @FindBy(css = "input.form-control-sm")
    WebElement searchCompanyEl;

    @FindBy(css = "div a[href*='/pr-company/signatoryLimitDetails']")
    WebElement clickDetailsBtnEl;

    @FindBy(css = "button[type='submit']")
    WebElement clickAuthorizeBtnEl;

    public TransactionRuleSummaryPageForPayrollByChecker() {
        PageFactory.initElements(driver, this);
    }

    public TransactionRuleSummaryPageForPayrollByChecker checkUnAuthorizeBox() {
        checkUnAuthorizeBoxEl.isDisplayed();
        checkUnAuthorizeBoxEl.click();
        return this;
    }

    public TransactionRuleSummaryPageForPayrollByChecker searchCompany(String searchCom) {
        searchCompanyEl.isDisplayed();
        searchCompanyEl.sendKeys(searchCom);
        return this;
    }

    public TransactionRuleSummaryPageForPayrollByChecker clickDetailsBtn() {
        clickDetailsBtnEl.isDisplayed();
        clickDetailsBtnEl.click();
        return this;
    }

    public TransactionRuleSummaryPageForPayrollByChecker clickAuthorizeBtn() {
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        return this;
    }
}