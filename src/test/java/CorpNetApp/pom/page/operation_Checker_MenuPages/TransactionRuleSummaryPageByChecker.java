package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionRuleSummaryPageByChecker extends BaseTest {

    @FindBy(id = "inlineCheckbox1")
    WebElement checkUnAuthorizeBoxEl;

    @FindBy(css = "input.form-control-sm")
    WebElement searchCompanyEl;

    @FindBy(css = "div a[href*='/company/signatoryLimitDetails/']")
    WebElement clickDetailsBtnEl;

    @FindBy(css = "button[type='submit']")
    WebElement clickAuthorizeBtnEl;

    public TransactionRuleSummaryPageByChecker() {
        PageFactory.initElements(driver, this);
    }

    public TransactionRuleSummaryPageByChecker checkUnAuthorizeBox() throws InterruptedException {
        checkUnAuthorizeBoxEl.isDisplayed();
        checkUnAuthorizeBoxEl.click();
        Thread.sleep(3000);
        return this;
    }

    public TransactionRuleSummaryPageByChecker searchCompany(String searchCom) {
        searchCompanyEl.isDisplayed();
        searchCompanyEl.sendKeys(searchCom);
        return this;
    }

    public TransactionRuleSummaryPageByChecker clickDetailsBtn() {
        clickDetailsBtnEl.isDisplayed();
        clickDetailsBtnEl.click();
        return this;
    }

    public TransactionRuleSummaryPageByChecker clickAuthorizeBtn() {
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        return this;
    }
}