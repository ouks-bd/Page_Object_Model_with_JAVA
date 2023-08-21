package CorpNetApp.pom.page.operation_Checker_MenuPages;

import CorpNetApp.pom.base.BaseTest;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApproveComAccountPageByChecker extends BaseTest {

    @FindBy(id = "inlineCheckbox3")
    WebElement clickCheckBoxEl;
    @FindBy(css = "div input.form-control-sm")
    WebElement searchCompanyEl;
    @FindBy(css = "div tbody td a[href*='/company/com-details']")
    WebElement clickDetailsBtnEl;
    @FindBy(name = "select_all")
    WebElement clickAllCheckBoxEl;
    @FindBy(name = "submit")
    WebElement clickApproveBtnEl;


    public ApproveComAccountPageByChecker() {

        PageFactory.initElements(driver, this);
    }

    public ApproveComAccountPageByChecker clickCheckBoxForWaitingApprove()
    {
        clickCheckBoxEl.isDisplayed();
        clickCheckBoxEl.click();
        return this;
    }
    public ApproveComAccountPageByChecker searchCompany(String companySearch)
    {
        searchCompanyEl.isDisplayed();
        searchCompanyEl.sendKeys(getCompanyName());
        return this;
    }
    public ApproveComAccountPageByChecker clickDetailBtnAndCheckBoxForAll()
    {
        clickDetailsBtnEl.click();
        clickAllCheckBoxEl.isDisplayed();
        clickAllCheckBoxEl.click();
        return this;
    }public ApproveComAccountPageByChecker clickApproveBtn()
    {

        clickApproveBtnEl.isDisplayed();
        clickApproveBtnEl.click();
        return this;
    }
}
