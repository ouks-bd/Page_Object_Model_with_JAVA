package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemberSummaryPageForApproveByChecker extends BaseTest {

    @FindBy(name = "submit")
    WebElement clickSearchBtnEl;
    @FindBy(id = "inlineCheckbox1")
    WebElement checkCheckBoxEl;
    @FindBy(css = "div tbody td a[href*='/company/memberDetails']")
    WebElement clickDetailsBtnEl;
    @FindBy(id = "checkAll")
    WebElement clickCheckAllBoxEl;

    @FindBy(css = "div button.btn-primary[type='submit']")
    WebElement clickSubmitBtnEl;



    public MemberSummaryPageForApproveByChecker(){
        PageFactory.initElements(driver, this);
    }

    public MemberSummaryPageForApproveByChecker clickSearchBtn(){
        clickSearchBtnEl.isDisplayed();
        clickSearchBtnEl.click();
        return this;
    }    public MemberSummaryPageForApproveByChecker clickUnAuthorizeCheckBox(){
        checkCheckBoxEl.isDisplayed();
        checkCheckBoxEl.click();
        return this;
    }    public MemberSummaryPageForApproveByChecker clickDetailsBtn(){
        clickDetailsBtnEl.isDisplayed();
        clickDetailsBtnEl.click();
        return this;
    }    public MemberSummaryPageForApproveByChecker checkAllCompany(){
        clickCheckAllBoxEl.isDisplayed();
        clickCheckAllBoxEl.click();
        return this;
    }    public MemberSummaryPageForApproveByChecker clickSubBtn(){
        clickSubmitBtnEl.isDisplayed();
        clickSubmitBtnEl.click();
        return this;
    }
}
