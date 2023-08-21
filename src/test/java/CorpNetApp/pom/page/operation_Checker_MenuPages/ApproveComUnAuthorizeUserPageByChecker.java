package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApproveComUnAuthorizeUserPageByChecker extends BaseTest {


    @FindBy(id = "selectCompanyId")
    WebElement selectCompanyEl;

    @FindBy(id = "inlineCheckbox1")
    WebElement checkUnAuthorizedUserEl;
    @FindBy(css = "div a[href*='/account/details']")
    WebElement clickDetailsBtnEl;
    @FindBy(css = "button[type='submit']")
    WebElement clickAuthorizeBtnEl;


    public ApproveComUnAuthorizeUserPageByChecker() {
        PageFactory.initElements(driver, this);
    }

    public ApproveComUnAuthorizeUserPageByChecker selectCompany() {

        selectCompanyEl.isDisplayed();
        new Select(selectCompanyEl).selectByVisibleText(getCompanyName());
        return this;
    }

    public ApproveComUnAuthorizeUserPageByChecker checkUnAuthorizedCheckBox() {

        checkUnAuthorizedUserEl.isDisplayed();
        checkUnAuthorizedUserEl.click();
        return this;
    }

    public ApproveComUnAuthorizeUserPageByChecker clickDetailsBtn() {

        clickDetailsBtnEl.isDisplayed();
        clickDetailsBtnEl.click();
        return this;
    }

    public ApproveComUnAuthorizeUserPageByChecker clickAuthorizeBtn() {

        clickAuthorizeBtnEl.isDisplayed();
        clickAuthorizeBtnEl.click();
        return this;
    }
}
