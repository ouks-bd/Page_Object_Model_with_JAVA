package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChargePageByChecker extends BaseTest {
    @FindBy(css = "tr.odd:nth-child(1) > td:nth-child(7) > a:nth-child(1)")
    WebElement clickAuthorizeBtnEl;
    @FindBy(css = "div label input.form-control-sm")
    WebElement searchComEl;
    @FindBy(css = "div button.btn-success")
    WebElement clickSubmitBtnEl;


    public ChargePageByChecker() {
        PageFactory.initElements(driver, this);
    }

    public ChargePageByChecker searchCompany() {
        searchComEl.isDisplayed();
        searchComEl.sendKeys(getCompanyName());
        return this;
    }    public ChargePageByChecker clickAuthorizeBtn() {
        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        return this;
    }

    public ChargePageByChecker clickSubmitBtn() {
        clickSubmitBtnEl.isDisplayed();
        clickSubmitBtnEl.click();
        return this;
    }
}

